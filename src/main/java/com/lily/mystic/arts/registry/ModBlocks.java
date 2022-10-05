package com.lily.mystic.arts.registry;

import com.lily.mystic.arts.MysticArts;
import com.lily.mystic.arts.blocks.BlessedCandleBlock;
import com.lily.mystic.arts.blocks.CursedCandleBlock;
import com.lily.mystic.arts.blocks.CustomCandleBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block Sapphire_Block = new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLUE)
            .requiresTool()
            .strength(5.0f, 6.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final BlessedCandleBlock Blessed_Candle_Block = new BlessedCandleBlock(FabricBlockSettings.of(Material.DECORATION)
            .strength(1.0f, 1.0f)
            .sounds(BlockSoundGroup.CANDLE));

    public static final CursedCandleBlock Cursed_Candle_Block = new CursedCandleBlock(FabricBlockSettings.of(Material.DECORATION)
            .strength(1.0f, 1.0f)
            .sounds(BlockSoundGroup.CANDLE));
    public static final CustomCandleBlock CUSTOM_CANDLE_BLOCK = new CustomCandleBlock(FabricBlockSettings.of(Material.DECORATION)
            .strength(1.0f, 1.0f)
            .sounds(BlockSoundGroup.CANDLE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MysticArts.MOD_ID, "sapphire_block"), Sapphire_Block);
        Registry.register(Registry.BLOCK, new Identifier(MysticArts.MOD_ID, "blessed_candle"), Blessed_Candle_Block);
        Registry.register(Registry.BLOCK, new Identifier(MysticArts.MOD_ID, "cursed_candle"), Cursed_Candle_Block);
        Registry.register(Registry.BLOCK, new Identifier(MysticArts.MOD_ID, "custom_candle"), CUSTOM_CANDLE_BLOCK);
    }


}
