package com.toregeldi.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.toregeldi.PlantsVsMonsters;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
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
            int x = (drawContext.getScaledWindowWidth() / 2);
            int y = 0;
            int textX = x - (client.textRenderer.getWidth(String.valueOf(sunAmount)) / 2);
            int textY = y + 12;

            drawContext.drawTexture(SUN_ICON, x - 16, y, 0, 0, 32, 32, 32, 32);
            drawContext.drawTextWithShadow(client.textRenderer, String.valueOf(sunAmount), textX, textY, 0xffffff);
            RenderSystem.setShader(GameRenderer::getPositionTexProgram);
            drawContext.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public static void getSunAmountFromServer(int value) {
        sunAmount = value;
    }
}
