
package net.mcreator.trollmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.trollmod.init.TrollmodModTabs;
import net.mcreator.trollmod.init.TrollmodModSounds;

public class FlashbangedItem extends RecordItem {
	public FlashbangedItem() {
		super(0, TrollmodModSounds.REGISTRY.get(new ResourceLocation("trollmod:flasbanged")), new Item.Properties().tab(TrollmodModTabs.TAB_MTNTIB).stacksTo(1).rarity(Rarity.RARE));
	}
}
