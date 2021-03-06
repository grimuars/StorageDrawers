package com.jaquadro.minecraft.storagedrawers.core;

import com.jaquadro.minecraft.storagedrawers.block.tile.TileEntityDrawersComp;
import com.jaquadro.minecraft.storagedrawers.block.tile.TileEntityDrawersStandard;
import com.jaquadro.minecraft.storagedrawers.client.renderer.DrawersRenderer;
import com.jaquadro.minecraft.storagedrawers.client.renderer.TileEntityDrawersRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers () {
        drawersRenderID = RenderingRegistry.getNextAvailableRenderId();

        RenderingRegistry.registerBlockHandler(drawersRenderID, new DrawersRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDrawersStandard.class, new TileEntityDrawersRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDrawersComp.class, new TileEntityDrawersRenderer());
    }
}
