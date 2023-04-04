
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trollmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.trollmod.enchantment.AtominteswordEnchantment;
import net.mcreator.trollmod.TrollmodMod;

public class TrollmodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TrollmodMod.MODID);
	public static final RegistryObject<Enchantment> ATOMINTESWORD = REGISTRY.register("atomintesword", () -> new AtominteswordEnchantment());
}
