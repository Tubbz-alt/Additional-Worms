package com.bioast.addworms.utils.helpers;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SoundHelper {

    public static void playSimpleSound(World worldIn, BlockPos pos, SoundEvent soundEvent,float vol){
        worldIn.playSound((PlayerEntity)null, pos.getX(), pos.getY(), pos.getZ(),
                soundEvent, SoundCategory.PLAYERS, vol, worldIn.rand.nextFloat() * 0.1F + 0.9F);
    }
}
