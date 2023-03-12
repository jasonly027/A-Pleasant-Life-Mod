package hikoir.pleasantlife.block.entity;

import hikoir.pleasantlife.PleasantLife;
import hikoir.pleasantlife.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<SkilletBlockEntity> SKILLET;

    public static void registerBlockEntities() {
        SKILLET = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(PleasantLife.MOD_ID, "skillet"),
                FabricBlockEntityTypeBuilder.create(SkilletBlockEntity::new,
                        ModBlocks.SKILLET).build(null));
    }
}
