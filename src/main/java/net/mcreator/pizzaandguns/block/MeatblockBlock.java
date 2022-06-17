
package net.mcreator.pizzaandguns.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.pizzaandguns.PizzaAndGunsModElements;

import java.util.List;
import java.util.Collections;

@PizzaAndGunsModElements.ModElement.Tag
public class MeatblockBlock extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:meatblock")
	public static final Block block = null;
	public MeatblockBlock(PizzaAndGunsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.SPONGE).sound(SoundType.SLIME).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("meatblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
