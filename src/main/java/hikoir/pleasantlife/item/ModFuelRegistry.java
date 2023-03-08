package hikoir.pleasantlife.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelRegistry {
    public static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.WOODEN_KNIFE, 200);
    }
}
