package hikoir.pleasantlife.data;

import hikoir.pleasantlife.block.ModBlocks;
import hikoir.pleasantlife.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.ORANGE_TREE_LOG).log(ModBlocks.ORANGE_TREE_LOG).wood(ModBlocks.ORANGE_TREE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ORANGE_TREE_LOG).log(ModBlocks.STRIPPED_ORANGE_TREE_LOG).wood(ModBlocks.STRIPPED_ORANGE_TREE_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_TREE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_TREE_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ORANGE_TREE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOODEN_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIWI, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIWI_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLICE_OF_BREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRUIT_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_TREE_SAPLING, Models.GENERATED);

    }
}
