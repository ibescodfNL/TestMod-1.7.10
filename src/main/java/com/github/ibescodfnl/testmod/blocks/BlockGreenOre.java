package com.github.ibescodfnl.testmod.blocks;

import com.github.ibescodfnl.tabs.ModTabs;
import com.github.ibescodfnl.testmod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGreenOre extends Block {
	public BlockGreenOre()
    {
            super(Material.iron);
            setBlockName("greenOre");
    		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
            setCreativeTab(ModTabs.tabTestMod);
            //block properties
            setStepSound(soundTypeStone);
  		  	setHardness(2.5F);
  		  	setResistance(10.0F);
  		  	setHarvestLevel("pickaxe", 3);
    }
}
