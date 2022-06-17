
package net.mcreator.pizzaandguns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.pizzaandguns.PizzaAndGunsModElements;

@PizzaAndGunsModElements.ModElement.Tag
public class DeathscythItem extends PizzaAndGunsModElements.ModElement {
	@ObjectHolder("pizza_and_guns:deathscyth")
	public static final Item block = null;
	public DeathscythItem(PizzaAndGunsModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 100f;
			}

			public float getAttackDamage() {
				return 98f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.NETHERITE_INGOT, (int) (1)));
			}
		}, 1, 96f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("deathscyth"));
	}
}
