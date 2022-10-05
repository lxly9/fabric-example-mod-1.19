package com.lily.mystic.arts.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SapphireItem extends Item {

    public SapphireItem() {
        super(new FabricItemSettings().group(ItemGroup.MATERIALS));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return super.use(world, user, hand);
    }

    @Override



    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block block = world.getBlockState(context.getBlockPos()).getBlock();
        if (block == Blocks.GRASS_BLOCK) {
            if (!world.isClient()) {
                //Update block and item
                world.setBlockState(context.getBlockPos(), Blocks.LAPIS_BLOCK.getDefaultState());
                context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            } else {
                //Play a sound on client
                context.getPlayer().playSound(SoundEvents.BLOCK_WOOL_PLACE, 1.0f, 1.0f);
            }

        }
        return super.useOnBlock(context);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        //Server: giving/removing items, affects entities/blocks
        //Client: rendering, particle effects, music/sound

        if (!user.getWorld().isClient() && hand == Hand.MAIN_HAND) {
            //Runs on Serverside only
            if (entity.getType() == EntityType.SHEEP) {
                //set color to blue
                SheepEntity sheep = (SheepEntity) entity;
                sheep.setColor(DyeColor.BLUE);
                if (!user.isCreative()) {
                    user.getStackInHand(hand).decrement(1);
                }
            } else {user.sendMessage(Text.literal("Bruh, thats for sheep"));
            }
        }

        return super.useOnEntity(stack, user, entity, hand);
    }
}
