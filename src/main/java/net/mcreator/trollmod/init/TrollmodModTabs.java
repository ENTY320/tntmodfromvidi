
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trollmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TrollmodModTabs {
	public static CreativeModeTab TAB_MTNTIB;

	public static void load() {
		TAB_MTNTIB = new CreativeModeTab("tabmtntib") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TrollmodModBlocks.NUKE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
