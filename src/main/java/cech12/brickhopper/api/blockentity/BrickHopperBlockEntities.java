package cech12.brickhopper.api.blockentity;

import cech12.brickhopper.BrickHopperMod;
import cech12.brickhopper.api.block.BrickHopperBlocks;
import cech12.brickhopper.tileentity.BrickHopperBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrickHopperBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, BrickHopperMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<BrickHopperBlockEntity>> BRICK_HOPPER = BLOCK_ENTITIES.register("brick_hopper", () -> BlockEntityType.Builder.of(BrickHopperBlockEntity::new, BrickHopperBlocks.BRICK_HOPPER.get()).build(null));

}