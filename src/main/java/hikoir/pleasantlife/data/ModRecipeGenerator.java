package hikoir.pleasantlife.data;

import hikoir.pleasantlife.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

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
    }
}
