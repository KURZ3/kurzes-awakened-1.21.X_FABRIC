package com.kurzesawakened.item;

import com.kurzesawakened.KurzesAwakened;
import com.kurzesawakened.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup KURZARITE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KurzesAwakened.MOD_ID, "kurzarite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KURZARITE_CLUSTER))
                    .displayName(Text.translatable("itemgroup.kurzesawakened.ka_items"))
                    .entries((displayContext, entries) -> {
                        //----------------ITEMS-------------

                        entries.add(ModItems.KURZARITE_CLUSTER);
                        entries.add(ModItems.SCULK_DUST);
                        entries.add(ModItems.UNREFINED_SCULK_INGOT);
                        entries.add(ModItems.SCULK_INGOT);
                        entries.add(ModItems.UNREFINED_KURZARITE_INGOT);
                        entries.add(ModItems.UNREFINED_KURZARITE_INGOT_BV);

                        //----------------BLOCKS-------------
                        entries.add(ModBlocks.KURZARITE_ORE_NEW);
                        entries.add(ModBlocks.KURZARITE_ORE);
                        entries.add(ModBlocks.KURZARITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.SCULK_BRICKS);
                        entries.add(ModBlocks.SCULK_DECO);
                        entries.add(ModBlocks.DARK_PURPLE_PLANKS);

                    }).build());


    public static void registerItemGroups(){
        KurzesAwakened.LOGGER.info("Registering Item Groups for " + KurzesAwakened.MOD_ID);
    }
}
