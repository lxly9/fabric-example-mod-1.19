package com.lily.mystic.arts.blocks;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.AbstractCandleBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CandleBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Util;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;

import java.util.List;
import java.util.function.ToIntFunction;

public class CustomCandleBlock extends AbstractCandleBlock {
        public static final int field_31050 = 1;
        public static final int MAX_CANDLE_AMOUNT = 4;
        public static final IntProperty CANDLES = Properties.CANDLES;
        public static final BooleanProperty LIT = AbstractCandleBlock.LIT;
        public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
        public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE = state -> state.get(LIT) != false ? 3 * state.get(CANDLES) : 0;
        private static final Int2ObjectMap<List<Vec3d>> CANDLES_TO_PARTICLE_OFFSETS = Util.make(() -> {
            Int2ObjectOpenHashMap int2ObjectMap = new Int2ObjectOpenHashMap();
            int2ObjectMap.defaultReturnValue(ImmutableList.of());
            int2ObjectMap.put(1, ImmutableList.of(new Vec3d(0.5, 0.5, 0.5)));
            int2ObjectMap.put(2, ImmutableList.of(new Vec3d(0.375, 0.44, 0.5), new Vec3d(0.625, 0.5, 0.44)));
            int2ObjectMap.put(3, ImmutableList.of(new Vec3d(0.5, 0.313, 0.625), new Vec3d(0.375, 0.44, 0.5), new Vec3d(0.56, 0.5, 0.44)));
            int2ObjectMap.put(4, ImmutableList.of(new Vec3d(0.44, 0.313, 0.56), new Vec3d(0.625, 0.44, 0.56), new Vec3d(0.375, 0.44, 0.375), new Vec3d(0.56, 0.5, 0.375)));
            return Int2ObjectMaps.unmodifiable(int2ObjectMap);
        });
        private static final VoxelShape ONE_CANDLE_SHAPE = Block.createCuboidShape(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
        private static final VoxelShape TWO_CANDLES_SHAPE = Block.createCuboidShape(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
        private static final VoxelShape THREE_CANDLES_SHAPE = Block.createCuboidShape(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
        private static final VoxelShape FOUR_CANDLES_SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

    public CustomCandleBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Iterable<Vec3d> getParticleOffsets(BlockState state) {
        return null;
    }
}