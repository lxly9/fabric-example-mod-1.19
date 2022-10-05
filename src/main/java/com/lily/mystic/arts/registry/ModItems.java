package com.lily.mystic.arts.registry;

import com.lily.mystic.arts.MysticArts;
import com.lily.mystic.arts.blocks.BlessedCandleBlock;
import com.lily.mystic.arts.blocks.CursedCandleBlock;
import com.lily.mystic.arts.items.SapphireItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items from Tutorial, to be deleted
    public static final Item Wand = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.EPIC).maxCount(1));
    public static final SapphireItem Sapphire = new SapphireItem();

    //Items in use
    public static final Item Amethyst_Powder = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
    public static final Item Echo_Powder = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));


    //Block items
    public static final BlockItem Sapphire_Block = new BlockItem(ModBlocks.Sapphire_Block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem Blessed_Candle = new BlockItem(ModBlocks.Blessed_Candle_Block, new FabricItemSettings().group(ItemGroup.MISC));
    public static final BlockItem Cursed_Candle = new BlockItem(ModBlocks.Cursed_Candle_Block, new FabricItemSettings().group(ItemGroup.MISC));

    //mysticarts:item_name
    public static void registeritems(){
        //Tutorial Item names
        Registry.register(Registry.ITEM, new Identifier(MysticArts.MOD_ID, "wand"), Wand);
        Registry.register(Registry.ITEM, new Identifier(MysticArts.MOD_ID, "sapphire"), Sapphire);
        Registry.register(Registry.ITEM, new Identifier(MysticArts.MOD_ID, "sapphire_block"), Sapphire_Block);
        //Actual Item names
        Registry.register(Registry.ITEM, new Identifier(MysticArts.MOD_ID, "amethyst_powder"), Amethyst_Powder);
        Registry.register(Registry.ITEM, new Identifier(MysticArts.MOD_ID, "echo_powder"), Echo_Powder);
        Registry.register(Registry.ITEM, new Identifier(MysticArts.MOD_ID, "blessed_candle"), Blessed_Candle);
        Registry.register(Registry.ITEM, new Identifier(MysticArts.MOD_ID, "cursed_candle"), Cursed_Candle);
    }
}
