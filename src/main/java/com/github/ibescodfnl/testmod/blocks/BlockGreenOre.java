package com.github.ibescodfnl.testmod.blocks;

import com.github.ibescodfnl.testmod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGreenOre extends Block {
	public BlockGreenOre()
    {
            super(Material.iron);
            setBlockName("greenOre");
    		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
            setCreativeTab(CreativeTabs.tabBlock);
    }
}
