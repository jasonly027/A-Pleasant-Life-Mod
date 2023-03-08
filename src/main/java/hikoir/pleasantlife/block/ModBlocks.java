package hikoir.pleasantlife.block;

import hikoir.pleasantlife.PleasantLife;
import hikoir.pleasantlife.block.custom.StrawberryBushBlock;
import hikoir.pleasantlife.item.ModItemGroup;
import hikoir.pleasantlife.item.ModItems;
import hikoir.pleasantlife.world.tree.OrangeTreeSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block STRAWBERRY_BUSH = registerBlockWithoutItem("strawberry_bush",
            new StrawberryBushBlock(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));
    public static final Block ORANGE_TREE_LOG = registerBlock("orange_tree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_TREE_WOOD = registerBlock("orange_tree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), ModItemGroup.PLEASANTLIFE);
    public static final Block STRIPPED_ORANGE_TREE_LOG = registerBlock("stripped_orange_tree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.PLEASANTLIFE);
    public static final Block STRIPPED_ORANGE_TREE_WOOD = registerBlock("stripped_orange_tree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_TREE_PLANKS = registerBlock("orange_tree_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_TREE_LEAVES = registerBlock("orange_tree_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_TREE_SAPLING = registerBlock("orange_tree_sapling",
            new SaplingBlock(new OrangeTreeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ModItemGroup.PLEASANTLIFE);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(PleasantLife.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(PleasantLife.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(PleasantLife.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        PleasantLife.LOGGER.info("Registering ModBlocks for " + PleasantLife.MOD_ID);
    }
}
