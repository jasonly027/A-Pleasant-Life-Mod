package hikoir.pleasantlife.recipe;

import hikoir.pleasantlife.PleasantLife;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
	public static void registerRecipes() {
		Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(PleasantLife.MOD_ID, SkilletRecipe.Serializer.ID),
				SkilletRecipe.Serializer.INSTANCE);
		Registry.register(Registries.RECIPE_TYPE, new Identifier(PleasantLife.MOD_ID, SkilletRecipe.Type.ID),
				SkilletRecipe.Type.INSTANCE);
	}
}
