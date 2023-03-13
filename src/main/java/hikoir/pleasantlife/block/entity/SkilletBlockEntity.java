package hikoir.pleasantlife.block.entity;

import hikoir.pleasantlife.block.custom.SkilletBlock;
import hikoir.pleasantlife.item.ModItems;
import hikoir.pleasantlife.screen.SkilletScreenHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SkilletBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(11, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;
    private int burning = 0;
    private int maxBurning = 100;

    public SkilletBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SKILLET, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> SkilletBlockEntity.this.progress;
                    case 1 -> SkilletBlockEntity.this.maxProgress;
                    case 2 -> SkilletBlockEntity.this.burning;
                    case 3 -> SkilletBlockEntity.this.maxBurning;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> SkilletBlockEntity.this.progress = value;
                    case 1 -> SkilletBlockEntity.this.maxProgress = value;
                    case 2 -> SkilletBlockEntity.this.burning = value;
                    case 3 -> SkilletBlockEntity.this.maxBurning = value;
                }
            }

            public int size() {
                return 4;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Skillet");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new SkilletScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("skillet.progress", progress);
        nbt.putInt("skillet.burning", burning);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("skillet.progress");
        burning = nbt.getInt("skillet.burning");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void decrementProgress() {
        if (this.progress > 0) {
            --this.progress;
        }
    }

    private void maxOutBurning() {
        this.burning = this.maxBurning;
    }

    private void decrementBurning() {
        if (this.burning > 0) {
            --this.burning;
        }
    }

    public static void tick(World world, BlockPos blockPos, BlockState blockState, SkilletBlockEntity entity) {
        if (world.isClient) {
            return;
        }

        boolean isHeated = isHeated(world, blockPos);

        if (isHeated) {
            entity.maxOutBurning();
        }
        else {
            entity.decrementBurning();
        }

        BlockState newState = blockState.with(SkilletBlock.LIT, isHeated);
        world.setBlockState(blockPos, newState, Block.NOTIFY_ALL);

        if (hasRecipe(entity))
        {
            if (entity.burning > 0)
            {
                entity.progress++;
                markDirty(world,blockPos, blockState);
                if (entity.progress >= entity.maxProgress)
                {
                    craftItem(entity);
                }
            }
            else
            {
                entity.decrementProgress();
            }
        }
        else
        {
            entity.resetProgress();
            markDirty(world, blockPos, blockState);
        }
    }

    private static boolean isHeated(World world, BlockPos blockPos) {
        BlockState underBlock = world.getBlockState(blockPos.down());
        Material underBlockMaterial = underBlock.getMaterial();

        return underBlock.isIn(BlockTags.FIRE) || underBlock.isIn(BlockTags.CAMPFIRES) ||
                underBlockMaterial == Material.LAVA || underBlock.isOf(Blocks.MAGMA_BLOCK);
    }

    private static void craftItem(SkilletBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        if (hasRecipe(entity))
        {
            entity.removeStack(1,1);
            entity.setStack(2, new ItemStack(ModItems.ORANGE, entity.getStack(2).getCount() + 1));
            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(SkilletBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        boolean hasKiwiInFirstSlot = entity.getStack(1).getItem() == ModItems.KIWI;

        return hasKiwiInFirstSlot && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, ModItems.ORANGE);
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getCount() < inventory.getStack(2).getMaxCount();
    }
}
