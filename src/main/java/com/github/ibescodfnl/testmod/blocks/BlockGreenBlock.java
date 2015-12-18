package com.github.ibescodfnl.testmod.blocks;

import com.github.ibescodfnl.tabs.ModTabs;
import com.github.ibescodfnl.testmod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGreenBlock extends Block {
	public BlockGreenBlock() {
		super(Material.iron);
        setBlockName("greenBlock");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(ModTabs.tabTestMod);
	}
}
