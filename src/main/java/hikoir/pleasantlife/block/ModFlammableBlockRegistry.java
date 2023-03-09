package hikoir.pleasantlife.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlock() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.STRAWBERRY_BUSH, 60, 100);

        registry.add(ModBlocks.ORANGE_LOG, 5, 20);
        registry.add(ModBlocks.ORANGE_WOOD, 5, 20);
        registry.add(ModBlocks.STRIPPED_ORANGE_LOG, 5, 20);
        registry.add(ModBlocks.STRIPPED_ORANGE_WOOD, 5, 20);
        registry.add(ModBlocks.ORANGE_PLANKS, 5, 20);
        registry.add(ModBlocks.ORANGE_LEAVES, 30, 60);
        registry.add(ModBlocks.ORANGE_FENCE, 5, 20);
        registry.add(ModBlocks.ORANGE_FENCE_GATE, 5, 20);
        registry.add(ModBlocks.ORANGE_SLAB, 5, 20);
        registry.add(ModBlocks.ORANGE_STAIRS, 5, 20);

        registry.add(ModBlocks.KIWI_LOG, 5, 20);
        registry.add(ModBlocks.KIWI_WOOD, 5, 20);
        registry.add(ModBlocks.STRIPPED_KIWI_LOG, 5, 20);
        registry.add(ModBlocks.STRIPPED_KIWI_WOOD, 5, 20);
        registry.add(ModBlocks.KIWI_PLANKS, 5, 20);
        registry.add(ModBlocks.KIWI_LEAVES, 30, 60);
        registry.add(ModBlocks.KIWI_FENCE, 5, 20);
        registry.add(ModBlocks.KIWI_FENCE_GATE, 5, 20);
        registry.add(ModBlocks.KIWI_SLAB, 5, 20);
        registry.add(ModBlocks.KIWI_STAIRS, 5, 20);

    }
}
