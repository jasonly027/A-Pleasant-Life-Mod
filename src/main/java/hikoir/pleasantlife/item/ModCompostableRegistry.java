package hikoir.pleasantlife.item;

import hikoir.pleasantlife.block.ModBlocks;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class ModCompostableRegistry {
    public static void registerCompostableBlock() {
        CompostingChanceRegistry registry = CompostingChanceRegistry.INSTANCE;

        registry.add(ModItems.ORANGE, 0.65f);
        registry.add(ModItems.ORANGE_SLICE, 0.5f);
        registry.add(ModBlocks.STRAWBERRY_BUSH.asItem(), 0.3f);
        registry.add(ModItems.STRAWBERRY, 0.65f);
        registry.add(ModItems.STRAWBERRY_SEEDS, 0.3f);
        registry.add(ModItems.KIWI, 0.65f);
        registry.add(ModItems.KIWI_SLICE, 0.5f);
        registry.add(ModBlocks.ORANGE_TREE_SAPLING.asItem(), 0.3f);
        registry.add(ModItems.FRUIT_SANDWICH, 0.85f);
        registry.add(ModItems.STRAWBERRY_SANDWICH, 0.85f);
        registry.add(ModItems.SLICE_OF_BREAD, 0.65f);
    }
}
