package com.github.ibescodfnl.init;

import com.github.ibescodfnl.testmod.help.RegisterHelper;
import com.github.ibescodfnl.testmod.items.TestModItem;

import net.minecraft.item.Item;

public class ModItems {
	public static Item greenIngot = new TestModItem().setUnlocalizedName("greenIngot");
	public static Item greenNugget = new TestModItem().setUnlocalizedName("greenNugget");
	public static void init() {
		RegisterHelper.registerItem(greenIngot);
		RegisterHelper.registerItem(greenNugget);
	}
}
