
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.trollmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TrollmodModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(TrollmodModItems.URANITEM.get()), new ItemStack(TrollmodModBlocks.NUKE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(TrollmodModItems.FLASHBANG.get()),

					new ItemStack(TrollmodModItems.URANITEM.get(), 32), 10, 5, 0.05f));
		}
	}
}
