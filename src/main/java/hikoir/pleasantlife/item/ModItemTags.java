package hikoir.pleasantlife.item;

import hikoir.pleasantlife.PleasantLife;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> ORANGE_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier(PleasantLife.MOD_ID, "orange_logs"));
    public static final TagKey<Item> KIWI_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier(PleasantLife.MOD_ID, "kiwi_logs"));

}
