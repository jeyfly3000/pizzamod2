
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
public class BaconItem extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:bacon")
	public static final Item block = null;
	public BaconItem(PizzaAndGunsModElements instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(0.3f).build()));
			setRegistryName("bacon");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
