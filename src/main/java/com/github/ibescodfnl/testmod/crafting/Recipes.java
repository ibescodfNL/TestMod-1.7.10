package com.github.ibescodfnl.testmod.crafting;

import com.github.ibescodfnl.init.ModBlocks;
import com.github.ibescodfnl.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {
	public static void init() {
		// ModItems = ModItems.Item | MCItems = Items.Item
		//-------SHAPED-RECIPE--------------------------------------------------------
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.greenBlock), new Object[] {
				"AAA", 
				"AAA", 
				"AAA", 
				'A', ModItems.greenIngot});
		 
		//-------SHAPELESS-RECIPE--------------------------------------------------------
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.greenNugget), new Object[] {
				new ItemStack(ModItems.greenIngot)
				});
	
		//-------SMELTING-RECIPE--------------------------------------------------------
	
		GameRegistry.addSmelting(ModBlocks.greenOre, new ItemStack(ModItems.greenIngot), 0.8F);
	}
}
