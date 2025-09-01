package com.beatless.firstmod.item;

import com.beatless.firstmod.FirstMod;
import com.beatless.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    // Registries 是原版注册表，而ForgeRegistries 是Forge额外添加的注册表

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ACCESSORY_TAB =
            CREATIVE_MODE_TABS.register("accessory", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.Copper_Ring.get()))
                    .title(Component.translatable("itemGroup.accessory_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Copper_Ring.get());
                        pOutput.accept(ModItems.Iron_Ring.get());
                        pOutput.accept(ModItems.Gold_Ring.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> ORE_TAB =
            CREATIVE_MODE_TABS.register("ore", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.ICE_SHARD_BLOCK.get()))
                    .title(Component.translatable("itemGroup.ore_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ICE_SHARD_BLOCK.get());
                        pOutput.accept(ModBlocks.LAVA_SHARD_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
