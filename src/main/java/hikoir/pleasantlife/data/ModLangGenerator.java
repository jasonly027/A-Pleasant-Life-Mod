package hikoir.pleasantlife.data;

import hikoir.pleasantlife.block.ModBlocks;
import hikoir.pleasantlife.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ORANGE, "Orange");
        translationBuilder.add(ModItems.ORANGE_SLICE, "Orange Slice");
        translationBuilder.add(ModItems.WOODEN_KNIFE, "Wooden Knife");
        translationBuilder.add(ModItems.STONE_KNIFE, "Stone Knife");
        translationBuilder.add(ModItems.IRON_KNIFE, "Iron Knife");
        translationBuilder.add(ModItems.GOLDEN_KNIFE, "Golden Knife");
        translationBuilder.add(ModItems.DIAMOND_KNIFE, "Diamond Knife");
        translationBuilder.add(ModItems.NETHERITE_KNIFE, "Netherite Knife");
        translationBuilder.add(ModItems.STRAWBERRY, "Strawberry");
        translationBuilder.add(ModItems.STRAWBERRY_SEEDS, "Strawberry Seeds");
        translationBuilder.add(ModItems.KIWI, "Kiwi");
        translationBuilder.add(ModItems.KIWI_SLICE, "Kiwi slice");
        translationBuilder.add(ModItems.STRAWBERRY_SANDWICH, "Strawberry Sandwich");
        translationBuilder.add(ModItems.SLICE_OF_BREAD, "Slice of Bread");
        translationBuilder.add(ModItems.FRUIT_SANDWICH, "Fruit Sandwich");

        translationBuilder.add(ModBlocks.ORANGE_TREE_LOG, "Orange Tree Log");
        translationBuilder.add(ModBlocks.ORANGE_TREE_WOOD, "Orange Tree Wood");
        translationBuilder.add(ModBlocks.STRIPPED_ORANGE_TREE_LOG, "Stripped Orange Tree Log");
        translationBuilder.add(ModBlocks.STRIPPED_ORANGE_TREE_WOOD, "Stripped Orange Tree Wood");
        translationBuilder.add(ModBlocks.ORANGE_TREE_PLANKS, "Orange Tree Planks");
        translationBuilder.add(ModBlocks.ORANGE_TREE_LEAVES, "Orange Tree Leaves");
        translationBuilder.add(ModBlocks.ORANGE_TREE_SAPLING, "Orange Tree Sapling");
    }
}
