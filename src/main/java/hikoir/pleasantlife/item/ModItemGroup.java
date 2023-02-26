package hikoir.pleasantlife.item;

import hikoir.pleasantlife.PleasantLife;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup PLEASANTLIFE;

    public static void registerItemGroups() {
        PLEASANTLIFE = FabricItemGroup.builder(new Identifier(PleasantLife.MOD_ID, "orange"))
                .displayName(Text.literal("A Pleasant Life"))
                .icon(() -> new ItemStack(ModItems.ORANGE))
                .build();
    }
}
