package hikoir.pleasantlife.block;

import hikoir.pleasantlife.PleasantLife;
import hikoir.pleasantlife.block.custom.SkilletBlock;
import hikoir.pleasantlife.block.custom.StrawberryBushBlock;
import hikoir.pleasantlife.item.ModItemGroup;
import hikoir.pleasantlife.world.tree.KiwiSaplingGenerator;
import hikoir.pleasantlife.world.tree.OrangeSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block STRAWBERRY_BUSH = registerBlockWithoutItem("strawberry_bush",
            new StrawberryBushBlock(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    public static final Block ORANGE_LOG = registerBlock("orange_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_WOOD = registerBlock("orange_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), ModItemGroup.PLEASANTLIFE);
    public static final Block STRIPPED_ORANGE_LOG = registerBlock("stripped_orange_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.PLEASANTLIFE);
    public static final Block STRIPPED_ORANGE_WOOD = registerBlock("stripped_orange_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_LEAVES = registerBlock("orange_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_SAPLING = registerBlock("orange_sapling",
            new SaplingBlock(new OrangeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_BUTTON = registerBlock("orange_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), 30, true, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_PRESSURE_PLATE = registerBlock("orange_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_FENCE = registerBlock("orange_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_FENCE_GATE = registerBlock("orange_fence_gate",
            new FenceGateBlock((FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_SLAB = registerBlock("orange_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), ModItemGroup.PLEASANTLIFE);
    public static final Block ORANGE_STAIRS = registerBlock("orange_stairs",
            new StairsBlock(ModBlocks.ORANGE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), ModItemGroup.PLEASANTLIFE);

    public static final Block KIWI_LOG = registerBlock("kiwi_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_WOOD = registerBlock("kiwi_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), ModItemGroup.PLEASANTLIFE);
    public static final Block STRIPPED_KIWI_LOG = registerBlock("stripped_kiwi_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.PLEASANTLIFE);
    public static final Block STRIPPED_KIWI_WOOD = registerBlock("stripped_kiwi_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_PLANKS = registerBlock("kiwi_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_LEAVES = registerBlock("kiwi_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_SAPLING = registerBlock("kiwi_sapling",
            new SaplingBlock(new KiwiSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_BUTTON = registerBlock("kiwi_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), 30, true, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_PRESSURE_PLATE = registerBlock("kiwi_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_FENCE = registerBlock("kiwi_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_FENCE_GATE = registerBlock("kiwi_fence_gate",
            new FenceGateBlock((FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_SLAB = registerBlock("kiwi_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), ModItemGroup.PLEASANTLIFE);
    public static final Block KIWI_STAIRS = registerBlock("kiwi_stairs",
            new StairsBlock(ModBlocks.KIWI_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), ModItemGroup.PLEASANTLIFE);

    public static final Block SKILLET = registerBlock("skillet",
            new SkilletBlock(FabricBlockSettings.of(Material.METAL).strength(1.5f).nonOpaque().noBlockBreakParticles()), ModItemGroup.PLEASANTLIFE);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(PleasantLife.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(PleasantLife.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(PleasantLife.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        PleasantLife.LOGGER.info("Registering ModBlocks for " + PleasantLife.MOD_ID);
    }
}
