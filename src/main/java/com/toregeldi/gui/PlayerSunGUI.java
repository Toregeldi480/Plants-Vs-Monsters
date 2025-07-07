package com.toregeldi.gui;

import com.toregeldi.PlantsVsMonsters;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class PlayerSunGUI implements HudRenderCallback {
    private static final Identifier SUN_ICON = Identifier.of(PlantsVsMonsters.MOD_ID, "textures/gui/sun_icon.png");
    private static int sunAmount = 0;

    @Override
    public void onHudRender(DrawContext drawContext, RenderTickCounter renderTickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();
        if(client.player != null) {
            int x = (drawContext.getScaledWindowWidth() / 2) - (client.textRenderer.getWidth(String.valueOf(sunAmount)) / 2);
            int y = 0;

            drawContext.drawTexture(SUN_ICON, 0, 0, 0, 0, 16, 16);
            drawContext.drawTextWithShadow(client.textRenderer, String.valueOf(sunAmount), x, y, 0xffffff);
        }
    }

    public static void getSunAmountFromServer(int value) {
        sunAmount = value;
    }
}
