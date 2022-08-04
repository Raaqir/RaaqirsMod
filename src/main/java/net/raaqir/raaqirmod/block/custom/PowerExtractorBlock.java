package net.raaqir.raaqirmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class PowerExtractorBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public PowerExtractorBlock(Settings settings) {

        super(settings);
    }
private static final VoxelShape SHAPE = Stream.of(
        Block.createCuboidShape(0, 0, 0, 16, 10, 16),
        Block.createCuboidShape(14.5, 12, 6, 15.25, 15, 10),
        Block.createCuboidShape(6, 14, 10, 10, 15, 14.05),
        Block.createCuboidShape(1.5, 14, 6, 2.5, 15, 10),
        Block.createCuboidShape(13.5, 14, 6, 14.5, 15, 10),
        Block.createCuboidShape(6, 14, 1.95, 10, 15, 6),
        Block.createCuboidShape(6, 12, 14.05, 10, 15, 15.05),
        Block.createCuboidShape(6, 12, 0.95, 10, 15, 1.95),
        Block.createCuboidShape(0.75, 12, 6, 1.5, 15, 10),
        Block.createCuboidShape(2.5, 12, 6, 13.5, 16, 10),
        Block.createCuboidShape(0, 10, 4, 16, 11, 12),
        Block.createCuboidShape(4, 10, 0, 12, 11, 16),
        Block.createCuboidShape(5, 11, 0.5, 11, 12, 15.5),
        Block.createCuboidShape(0.5, 11, 5, 15.5, 12, 11)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return super.getOutlineShape(state, world, pos, context);
    }



    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING,ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
