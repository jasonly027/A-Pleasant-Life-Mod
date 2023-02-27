package hikoir.pleasantlife.item;

import hikoir.pleasantlife.PleasantLife;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));

    public static final Item ORANGE_SLICE = registerItem("orange_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE_SLICE)));

    public static final Item WOODEN_KNIFE = registerItem("wooden_knife",
            new KnifeItem(ToolMaterials.WOOD, 1, -2.2f, new Item.Settings()));

    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new KnifeItem(ToolMaterials.STONE, 1, -2.2f, new Item.Settings()));

    public static final Item IRON_KNIFE = registerItem("iron_knife",
            new KnifeItem(ToolMaterials.IRON, 1, -2.2f, new Item.Settings()));

    public static final Item GOLDEN_KNIFE = registerItem("golden_knife",
            new KnifeItem(ToolMaterials.GOLD, 1, -2.2f, new Item.Settings()));

    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife",
            new KnifeItem(ToolMaterials.DIAMOND, 1, -2.2f, new Item.Settings()));

    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife",
            new KnifeItem(ToolMaterials.NETHERITE, 1, -2.2f, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PleasantLife.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.PLEASANTLIFE, ORANGE);
        addToItemGroup(ItemGroups.INGREDIENTS, ORANGE);

        addToItemGroup(ModItemGroup.PLEASANTLIFE, ORANGE_SLICE);
        addToItemGroup(ItemGroups.INGREDIENTS, ORANGE_SLICE);

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
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        PleasantLife.LOGGER.info("Registering Mod Items for " + PleasantLife.MOD_ID);

        addItemsToItemGroup();
    }
}
