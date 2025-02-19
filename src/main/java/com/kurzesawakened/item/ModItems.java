package com.kurzesawakened.item;

import com.kurzesawakened.KurzesAwakened;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //------------------------------ITEMS---------------------
    public static final Item KURZARITE_CLUSTER = registerItem("kurzarite_cluster", new Item(new Item.Settings()));

    public static final Item SCULK_DUST = registerItem("sculk_dust", new Item(new Item.Settings()));

    public static final Item SCULK_INGOT = registerItem("sculk_ingot", new Item(new Item.Settings()));

    public static final Item UNREFINED_SCULK_INGOT = registerItem("unrefined_sculk_ingot", new Item(new Item.Settings()));

    public static final Item UNREFINED_KURZARITE_INGOT = registerItem("unrefined_kurzarite_ingot", new Item(new Item.Settings()));

    public static final Item UNREFINED_KURZARITE_INGOT_BV = registerItem("unrefined_kurzarite_ingot_bv", new Item(new Item.Settings()));


    //------------------------------METHODS---------------------
    private static Item registerItem(String name, Item item){ //Builder preset used for out items
        return Registry.register(Registries.ITEM, Identifier.of(KurzesAwakened.MOD_ID, name), item);
    }
    public static void registerModItems(){ //Method used for registering our items
        KurzesAwakened.LOGGER.info("Registering Mod Items for " + KurzesAwakened.MOD_ID);
    }
}
