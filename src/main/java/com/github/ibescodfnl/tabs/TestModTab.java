package com.github.ibescodfnl.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestModTab extends CreativeTabs {
	String name;
	
	public TestModTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		/* Only For More Tabs
		if (this.name == "tabTestMod") {
			return ModItems.omega;
		} else if (this.name == "tabTestModTest") {
			return ModStructureItems.spawnAbandonedHouse;
		}
		*/
		return null;
	}

}
