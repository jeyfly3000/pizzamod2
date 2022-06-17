
package net.mcreator.pizzaandguns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.pizzaandguns.PizzaAndGunsModElements;

@PizzaAndGunsModElements.ModElement.Tag
public class RubyPickaxeItem extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:ruby_pickaxe")
	public static final Item block = null;
	public RubyPickaxeItem(PizzaAndGunsModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 400;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 80;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ruby_pickaxe"));
	}
}
