
package net.mcreator.pizzaandguns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.pizzaandguns.PizzaAndGunsModElements;

@PizzaAndGunsModElements.ModElement.Tag
public class RatpickaxeItem extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:ratpickaxe")
	public static final Item block = null;
	public RatpickaxeItem(PizzaAndGunsModElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2034;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 998f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 1234;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ratpickaxe"));
	}
}
