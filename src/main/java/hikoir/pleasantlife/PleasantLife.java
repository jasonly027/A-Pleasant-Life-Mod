package hikoir.pleasantlife;

import hikoir.pleasantlife.block.ModBlocks;
import hikoir.pleasantlife.block.ModFlammableBlockRegistry;
import hikoir.pleasantlife.block.ModStrippableBlockRegistry;
import hikoir.pleasantlife.item.ModItemGroup;
import hikoir.pleasantlife.item.ModItems;
import hikoir.pleasantlife.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PleasantLife implements ModInitializer {
	public static final String MOD_ID = "pleasant-life";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlock();
		ModStrippableBlockRegistry.registerStrippableBLock();
	}
}