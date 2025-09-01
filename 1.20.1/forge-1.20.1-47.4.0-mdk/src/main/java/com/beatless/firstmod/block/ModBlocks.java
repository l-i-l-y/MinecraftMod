package com.beatless.firstmod.block;

import com.beatless.firstmod.FirstMod;
import com.beatless.firstmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static final RegistryObject<Block> LAVA_SHARD_BLOCK =
            registerBlock("lava_shard_block", () -> new Block(BlockBehaviour.Properties.of().strength(1.5f, 8f)));
    public static final RegistryObject<Block> ICE_SHARD_BLOCK =
            registerBlock("ice_shard_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE)));

    // 为方块注册物品的函数
    private static <T extends Block> void registerBlockItems(String name, RegistryObject<T> block){
        ModItems.Items.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // 为方块注册可放置的函数
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
