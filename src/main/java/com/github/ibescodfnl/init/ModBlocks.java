package com.github.ibescodfnl.init;

import com.github.ibescodfnl.testmod.blocks.BlockGreenBlock;
import com.github.ibescodfnl.testmod.blocks.BlockGreenOre;
import com.github.ibescodfnl.testmod.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	public static Block greenOre = new BlockGreenOre();
	public static Block greenBlock = new BlockGreenBlock();
	public static void init() {
		RegisterHelper.registerBlock(greenOre);
		RegisterHelper.registerBlock(greenBlock);
    }
}
