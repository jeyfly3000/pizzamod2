
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
public class PankaceItem extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:pankace")
	public static final Item block = null;
	public PankaceItem(PizzaAndGunsModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(15).saturation(1.1f).setAlwaysEdible().build()));
			setRegistryName("pankace");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 10;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
