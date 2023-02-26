package hikoir.pleasantlife.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent ORANGE_SLICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
}
