package hikoir.pleasantlife.item;

import hikoir.pleasantlife.PleasantLife;
import hikoir.pleasantlife.block.ModBlocks;
import hikoir.pleasantlife.item.custom.KnifeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item ORANGE_SLICE = registerItem("orange_slice", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE_SLICE)));
    public static final Item WOODEN_KNIFE = registerItem("wooden_knife", new KnifeItem(ToolMaterials.WOOD, 1, -2.2f, new Item.Settings()));
    public static final Item STONE_KNIFE = registerItem("stone_knife", new KnifeItem(ToolMaterials.STONE, 1, -2.2f, new Item.Settings()));
    public static final Item IRON_KNIFE = registerItem("iron_knife", new KnifeItem(ToolMaterials.IRON, 1, -2.2f, new Item.Settings()));
    public static final Item GOLDEN_KNIFE = registerItem("golden_knife", new KnifeItem(ToolMaterials.GOLD, 1, -2.2f, new Item.Settings()));
    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife", new KnifeItem(ToolMaterials.DIAMOND, 1, -2.2f, new Item.Settings()));
    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife", new KnifeItem(ToolMaterials.NETHERITE, 1, -2.2f, new Item.Settings()));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds", new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new FabricItemSettings()));
    public static final Item KIWI = registerItem("kiwi", new Item(new FabricItemSettings().food(ModFoodComponents.KIWI)));
    public static final Item KIWI_SLICE = registerItem("kiwi_slice", new Item(new FabricItemSettings().food(ModFoodComponents.KIWI_SLICE)));
    public static final Item STRAWBERRY_SANDWICH = registerItem("strawberry_sandwich", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_SANDWICH)));
    public static final Item SLICE_OF_BREAD = registerItem("slice_of_bread", new Item(new FabricItemSettings().food(ModFoodComponents.SLICE_OF_BREAD)));
    public static final Item FRUIT_SANDWICH = registerItem("fruit_sandwich", new Item(new FabricItemSettings().food(ModFoodComponents.FRUIT_SANDWICH)));
//    public static final Item ORANGE_TREE_SAPLING = Registry.register(Registries.ITEM, new Identifier(PleasantLife.MOD_ID, "orange_tree_sapling"), new BlockItem(ModBlocks.ORANGE_TREE_SAPLING, new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PleasantLife.MOD_ID, name), item);
    }

//    TODO: FIX
    private static Item registerBlockItem(Block block) {
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
        Block splitBlock = blockItem.getBlock();
        Identifier blockID = Registries.BLOCK.getId(splitBlock);
        Item splitItem = (Item)blockItem;

        return Registry.register(Registries.ITEM, blockID, splitItem);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.PLEASANTLIFE, ORANGE);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, ORANGE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, ORANGE_SLICE);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, ORANGE_SLICE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, WOODEN_KNIFE);
        addToItemGroup(ItemGroups.TOOLS, WOODEN_KNIFE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, STONE_KNIFE);
        addToItemGroup(ItemGroups.TOOLS, STONE_KNIFE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, IRON_KNIFE);
        addToItemGroup(ItemGroups.TOOLS, IRON_KNIFE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, GOLDEN_KNIFE);
        addToItemGroup(ItemGroups.TOOLS, GOLDEN_KNIFE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, DIAMOND_KNIFE);
        addToItemGroup(ItemGroups.TOOLS, DIAMOND_KNIFE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, NETHERITE_KNIFE);
        addToItemGroup(ItemGroups.TOOLS, NETHERITE_KNIFE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, STRAWBERRY);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, STRAWBERRY);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, STRAWBERRY_SEEDS);
        addToItemGroup(ItemGroups.NATURAL, STRAWBERRY_SEEDS);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, KIWI);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, KIWI);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, KIWI_SLICE);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, KIWI_SLICE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, STRAWBERRY_SANDWICH);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, STRAWBERRY_SANDWICH);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, SLICE_OF_BREAD);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, SLICE_OF_BREAD);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, FRUIT_SANDWICH);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, FRUIT_SANDWICH);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        PleasantLife.LOGGER.info("Registering Mod Items for " + PleasantLife.MOD_ID);

        addItemsToItemGroup();
    }
}
