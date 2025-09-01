package com.beatless.firstmod.item;

import com.beatless.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // 物品注册
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> Copper_Ring = Items.register("accessory/copper_ring", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Iron_Ring = Items.register("accessory/iron_ring", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gold_Ring = Items.register("accessory/gold_ring", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        Items.register(eventBus);
    }
}
