
package net.mcreator.pirati.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class UuuuuItem extends SwordItem {
	public UuuuuItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		},

				3, 96f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

		setRegistryName("uuuuu");
	}

}
