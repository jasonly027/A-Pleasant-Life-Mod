package hikoir.pleasantlife.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandler {
    public static ScreenHandlerType<SkilletScreenHandler> SKILLET_HANDLER;

    public static void registerAllScreenHandlers() {
        SKILLET_HANDLER = new ScreenHandlerType<>(SkilletScreenHandler::new);
    }
}
