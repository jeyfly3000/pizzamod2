
package net.mcreator.pizzaandguns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.pizzaandguns.PizzaAndGunsModElements;

@PizzaAndGunsModElements.ModElement.Tag
public class SpiderpickaxeItem extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:spiderpickaxe")
	public static final Item block = null;
	public SpiderpickaxeItem(PizzaAndGunsModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3333;
			}

			public float getEfficiency() {
				return 12.5f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 40;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SpidersaacItem.block, (int) (1)));
			}
		}, 1, -3.9f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("spiderpickaxe"));
	}
}
