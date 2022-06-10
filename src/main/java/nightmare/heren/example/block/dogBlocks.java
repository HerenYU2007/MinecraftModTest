package nightmare.heren.example.block;

import nightmare.heren.example.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class dogBlocks {

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){
        registerBlockItem(name ,block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(ExampleMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup) {
        return Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }
    public static void DogBlockRegister() {
        Block DOG_BLOCK = registerBlock("dog_block", new Block(FabricBlockSettings.of(Material.METAL)), ItemGroup.MISC);
    }
}