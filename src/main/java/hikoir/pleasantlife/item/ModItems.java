package hikoir.pleasantlife.item;

import hikoir.pleasantlife.PleasantLife;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings()));

    public static final Item ORANGE_SLICE = registerItem("orange_slice",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PleasantLife.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, ORANGE);
        addToItemGroup(ModItemGroup.PLEASANTLIFE, ORANGE);

        addToItemGroup(ItemGroups.INGREDIENTS, ORANGE_SLICE);
        addToItemGroup(ModItemGroup.PLEASANTLIFE, ORANGE_SLICE);

    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        PleasantLife.LOGGER.info("Registering Mod Items for " + PleasantLife.MOD_ID);

        addItemsToItemGroup();
    }
}
