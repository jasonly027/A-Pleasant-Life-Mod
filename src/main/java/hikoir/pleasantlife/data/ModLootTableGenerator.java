package hikoir.pleasantlife.data;

import hikoir.pleasantlife.block.ModBlocks;
import hikoir.pleasantlife.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ORANGE_LOG);
        addDrop(ModBlocks.ORANGE_WOOD);
        addDrop(ModBlocks.STRIPPED_ORANGE_LOG);
        addDrop(ModBlocks.STRIPPED_ORANGE_WOOD);
        addDrop(ModBlocks.ORANGE_PLANKS);
        addDrop(ModBlocks.ORANGE_LEAVES, fruitLeavesDrops(ModBlocks.ORANGE_LEAVES, ModBlocks.ORANGE_SAPLING, ModItems.ORANGE, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.ORANGE_SAPLING);
        addDrop(ModBlocks.ORANGE_BUTTON);
        addDrop(ModBlocks.ORANGE_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_FENCE);
        addDrop(ModBlocks.ORANGE_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_SLAB);
        addDrop(ModBlocks.ORANGE_STAIRS);

        addDrop(ModBlocks.KIWI_LOG);
        addDrop(ModBlocks.KIWI_WOOD);
        addDrop(ModBlocks.STRIPPED_KIWI_LOG);
        addDrop(ModBlocks.STRIPPED_KIWI_WOOD);
        addDrop(ModBlocks.KIWI_PLANKS);
        addDrop(ModBlocks.KIWI_LEAVES, fruitLeavesDrops(ModBlocks.KIWI_LEAVES, ModBlocks.KIWI_SAPLING, ModItems.KIWI, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.KIWI_SAPLING);
        addDrop(ModBlocks.KIWI_BUTTON);
        addDrop(ModBlocks.KIWI_PRESSURE_PLATE);
        addDrop(ModBlocks.KIWI_FENCE);
        addDrop(ModBlocks.KIWI_FENCE_GATE);
        addDrop(ModBlocks.KIWI_SLAB);
        addDrop(ModBlocks.KIWI_STAIRS);
    }

    private static final LootCondition.Builder WITH_SILK_TOUCH = MatchToolLootCondition.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1))));
    private static final LootCondition.Builder WITHOUT_SILK_TOUCH = WITH_SILK_TOUCH.invert();
    private static final LootCondition.Builder WITH_SHEARS = MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.SHEARS));
    private static final LootCondition.Builder WITH_SILK_TOUCH_OR_SHEARS = WITH_SHEARS.or(WITH_SILK_TOUCH);
    private static final LootCondition.Builder WITHOUT_SILK_TOUCH_NOR_SHEARS = WITH_SILK_TOUCH_OR_SHEARS.invert();

    public LootTable.Builder fruitLeavesDrops(Block leaves, Block drop, Item fruit, float ... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with((LootPoolEntry.Builder<?>)((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(fruit))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.005f, 0.0055555557f, 0.00625f, 0.008333334f, 0.025f))));
    }
}
