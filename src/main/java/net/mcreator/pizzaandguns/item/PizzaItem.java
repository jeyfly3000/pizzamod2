
package net.mcreator.pizzaandguns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.pizzaandguns.PizzaAndGunsModElements;

@PizzaAndGunsModElements.ModElement.Tag
public class PizzaItem extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:pizza")
	public static final Item block = null;
	public PizzaItem(PizzaAndGunsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(8).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(15).saturation(3.9999999999999996f).setAlwaysEdible().build()));
			setRegistryName("pizza");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 52;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
