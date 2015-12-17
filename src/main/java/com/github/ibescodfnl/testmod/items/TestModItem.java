package com.github.ibescodfnl.testmod.items;

import com.github.ibescodfnl.tabs.ModTabs;
import com.github.ibescodfnl.testmod.help.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class TestModItem extends Item {
	public TestModItem() {
		super();
		setCreativeTab(ModTabs.tabTestMod);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
