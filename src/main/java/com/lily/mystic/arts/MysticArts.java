package com.lily.mystic.arts;

import com.lily.mystic.arts.registry.ModBlocks;
import com.lily.mystic.arts.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class MysticArts implements ModInitializer {

    public static final String MOD_ID = "mysticarts";

    @Override
    public void onInitialize() {
        ModItems.registeritems();
        ModBlocks.registerBlocks();

    }
}
