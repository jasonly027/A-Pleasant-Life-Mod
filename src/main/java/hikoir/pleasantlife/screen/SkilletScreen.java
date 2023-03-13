package hikoir.pleasantlife.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import hikoir.pleasantlife.PleasantLife;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SkilletScreen extends HandledScreen<SkilletScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(PleasantLife.MOD_ID, "textures/gui/skillet_gui.png");

    public SkilletScreen(SkilletScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);

        renderFlames(matrices, x , y);

        renderProgressArrow(matrices, x, y);
    }

    private void renderProgressArrow(MatrixStack matrices, int x, int y) {
        if(handler.isCrafting()) {
            drawTexture(matrices, x + 96, y + 36, 176, 14, handler.getScaledProgress(), 17);
        }
    }

    private void renderFlames(MatrixStack matrices, int x, int y) {
        int k = handler.getScaledBurning();
        drawTexture(matrices, x + 101, y + 55 + 12 - k, 176, 12 - k, 14, k);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}
