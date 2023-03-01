package hikoir.pleasantlife.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlock() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.STRAWBERRY_BUSH, 60, 100);

        registry.add(ModBlocks.ORANGE_TREE_LOG, 5, 20);
        registry.add(ModBlocks.ORANGE_TREE_WOOD, 5, 20);
        registry.add(ModBlocks.STRIPPED_ORANGE_TREE_LOG, 5, 20);
        registry.add(ModBlocks.STRIPPED_ORANGE_TREE_WOOD, 5, 20);

        registry.add(ModBlocks.ORANGE_TREE_LEAVES, 30, 60);
        registry.add(ModBlocks.ORANGE_TREE_PLANKS, 5, 20);
    }
}
