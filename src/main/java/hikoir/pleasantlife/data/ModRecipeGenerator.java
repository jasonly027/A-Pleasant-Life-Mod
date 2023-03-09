package hikoir.pleasantlife.data;

import hikoir.pleasantlife.block.ModBlocks;
import hikoir.pleasantlife.item.ModItemTags;
import hikoir.pleasantlife.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.STRAWBERRY_SEEDS)
                .input(ModItems.STRAWBERRY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STRAWBERRY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STRAWBERRY))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModItems.STRAWBERRY_SEEDS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.STRAWBERRY_SANDWICH)
                .pattern(" B ")
                .pattern("SSS")
                .pattern(" B ")
                .input('B', ModItems.SLICE_OF_BREAD)
                .input('S', ModItems.STRAWBERRY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STRAWBERRY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STRAWBERRY))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SLICE_OF_BREAD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SLICE_OF_BREAD))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModItems.STRAWBERRY_SANDWICH));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FRUIT_SANDWICH)
                .pattern(" B ")
                .pattern("SOK")
                .pattern(" B ")
                .input('B', ModItems.SLICE_OF_BREAD)
                .input('S', ModItems.STRAWBERRY)
                .input('O', ModItems.ORANGE_SLICE)
                .input('K', ModItems.KIWI_SLICE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.STRAWBERRY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.STRAWBERRY))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SLICE_OF_BREAD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.SLICE_OF_BREAD))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ORANGE_SLICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ORANGE_SLICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.KIWI_SLICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.KIWI_SLICE))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModItems.FRUIT_SANDWICH));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_PLANKS, 4)
                .input(ModItemTags.ORANGE_LOGS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_LOG),
                        FabricRecipeProvider.conditionsFromTag(ModItemTags.ORANGE_LOGS))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_PLANKS));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOD, 3)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.ORANGE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ORANGE_LOG))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_WOOD));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ORANGE_WOOD, 3)
                .pattern("LL")
                .pattern("LL")
                .input('L', ModBlocks.STRIPPED_ORANGE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_ORANGE_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_ORANGE_LOG))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_ORANGE_WOOD));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BUTTON, 1)
                .input(ModBlocks.ORANGE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_BUTTON));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_PRESSURE_PLATE, 1)
                .pattern("PP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_PRESSURE_PLATE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_FENCE, 3)
                .pattern("PSP")
                .pattern("PSP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_FENCE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_FENCE_GATE, 1)
                .pattern("SPS")
                .pattern("SPS")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_FENCE_GATE));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SLAB, 6)
                .pattern("PPP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_SLAB));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_STAIRS, 4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .input('P', ModBlocks.ORANGE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORANGE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ORANGE_PLANKS))
                .offerTo(exporter, FabricRecipeProvider.getRecipeName(ModBlocks.ORANGE_STAIRS));
    }
}
