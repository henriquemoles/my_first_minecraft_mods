package org.hfm.hfmmod.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.hfm.hfmmod.Hfmmod;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Hfmmod.MODID);
    public static final RegistryObject<Block> MOD_BLOCK = BLOCKS.register("mod_block", () -> new Block(BlockBehaviour.Properties.of()));
}
