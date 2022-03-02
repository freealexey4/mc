
package net.mcreator.pirati.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class QqqqItem extends SwordItem {
	public QqqqItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 100f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				3, 96f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());

		setRegistryName("qqqq");
	}

}
