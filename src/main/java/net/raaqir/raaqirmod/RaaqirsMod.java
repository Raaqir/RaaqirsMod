package net.raaqir.raaqirmod;

import net.fabricmc.api.ModInitializer;
import net.raaqir.raaqirmod.block.ModBlocks;
import net.raaqir.raaqirmod.item.ModItems;
import net.raaqir.raaqirmod.util.ModLootTableModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaaqirsMod implements ModInitializer {
	public static final String MOD_ID = "raaqirmod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifier.modifyLootTables();

	}
}
