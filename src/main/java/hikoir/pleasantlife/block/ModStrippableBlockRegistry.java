package hikoir.pleasantlife.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBLock() {
        StrippableBlockRegistry.register(ModBlocks.ORANGE_TREE_LOG, ModBlocks.STRIPPED_ORANGE_TREE_LOG);
        StrippableBlockRegistry.register(ModBlocks.ORANGE_TREE_WOOD, ModBlocks.STRIPPED_ORANGE_TREE_WOOD);
    }
}
