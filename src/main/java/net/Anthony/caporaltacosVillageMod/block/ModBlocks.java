package net.Anthony.caporaltacosVillageMod.block;

import net.Anthony.caporaltacosVillageMod.block.custom.AppleBasketBlock;
import net.Anthony.caporaltacosVillageMod.block.custom.SculptedStatueBlock;
import net.Anthony.caporaltacosVillageMod.caporaltacos_village_mod;
import net.Anthony.caporaltacosVillageMod.item.ModItems;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, caporaltacos_village_mod.MOD_ID);

    public static final RegistryObject<Block> SCULPTED_STATUE = registerBlock("sculpted_statue",
            () -> new SculptedStatueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));


    public static final RegistryObject<Block> APPLE_BASKET = registerBlock("apple_basket",
            () -> new AppleBasketBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).noOcclusion()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }












    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
