package hikoir.pleasantlife;

import hikoir.pleasantlife.block.ModBlocks;
import hikoir.pleasantlife.screen.ModScreenHandler;
import hikoir.pleasantlife.screen.SkilletScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class PleasantLifeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KIWI_SAPLING, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandler.SKILLET_HANDLER, SkilletScreen::new);
    }
}
