package com.kurzesawakened;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KurzesAwakened implements ModInitializer {
	public static final String MOD_ID = "kurzesawakened";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Is someone there?");
	}
}