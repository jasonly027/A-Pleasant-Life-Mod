package hikoir.pleasantlife.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlock() {
        StrippableBlockRegistry.register(ModBlocks.ORANGE_LOG, ModBlocks.STRIPPED_ORANGE_LOG);
        StrippableBlockRegistry.register(ModBlocks.ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_WOOD);
        StrippableBlockRegistry.register(ModBlocks.KIWI_LOG, ModBlocks.STRIPPED_KIWI_LOG);
        StrippableBlockRegistry.register(ModBlocks.KIWI_WOOD, ModBlocks.STRIPPED_KIWI_WOOD);
    }
}
