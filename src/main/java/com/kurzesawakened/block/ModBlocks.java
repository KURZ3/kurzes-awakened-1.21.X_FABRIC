package com.kurzesawakened.block;

import com.kurzesawakened.KurzesAwakened;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    //------------------------------BLOCKS----------------------------------
    public static final Block SCULK_DECO = registerBlock("sculk_deco",
            new Block(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block SCULK_BRICKS = registerBlock("sculk_bricks",
            new Block(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block DARK_PURPLE_PLANKS = registerBlock("dark_purple_planks",
            new Block(AbstractBlock.Settings.create().strength(5f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block KURZARITE_ORE = registerBlock("kurzarite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(10f).requiresTool()));

    public static final Block KURZARITE_DEEPSLATE_ORE = registerBlock("kurzarite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create().strength(10f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block KURZARITE_ORE_NEW = registerBlock("kurzarite_ore_new",
            new Block(AbstractBlock.Settings.create().strength(8f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WHITERINE = registerBlock("whiterine",
            new Block(AbstractBlock.Settings.create().strength(8f)
                    .requiresTool().sounds(BlockSoundGroup.ANVIL)));



    //------------------------------REGISTERING METHODS---------------------

    private static Block registerBlock(String name, Block block){ //Method used for creating and registering the block
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(KurzesAwakened.MOD_ID,name), block);
    }

    private static void registerBlockItem(String name, Block block){ //Method used for assigning a BlockItem to the registered block
        Registry.register(Registries.ITEM, Identifier.of(KurzesAwakened.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBLocks(){
        KurzesAwakened.LOGGER.info("Registering Mod Blocks for " + KurzesAwakened.MOD_ID);
    }
}