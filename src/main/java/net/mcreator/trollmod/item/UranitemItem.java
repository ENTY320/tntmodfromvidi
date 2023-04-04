
package net.mcreator.trollmod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.trollmod.init.TrollmodModTabs;

public class UranitemItem extends Item {
	public UranitemItem() {
		super(new Item.Properties().tab(TrollmodModTabs.TAB_MTNTIB).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
