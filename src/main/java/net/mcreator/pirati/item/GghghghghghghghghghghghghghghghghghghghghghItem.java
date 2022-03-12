
package net.mcreator.pirati.item;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class GghghghghghghghghghghghghghghghghghghghghghItem extends Item {

	public GghghghghghghghghghghghghghghghghghghghghghItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(100));
		setRegistryName("gghghghghghghghghghghghghghghghghghghghghgh");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == Blocks.OAK_BUTTON.asItem());

				if (stack == ItemStack.EMPTY) {
					for (int i = 0; i < entity.getInventory().items.size(); i++) {
						ItemStack teststack = entity.getInventory().items.get(i);
						if (teststack != null && teststack.getItem() == Blocks.OAK_BUTTON.asItem()) {
							stack = teststack;
							break;
						}
					}
				}

				if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {

					GghghghghghghghghghghghghghghghghghghghghghEntity entityarrow = GghghghghghghghghghghghghghghghghghghghghghEntity.shoot(world,
							entity, world.getRandom(), 100f, 25, 15);

					itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));

					if (entity.getAbilities().instabuild) {
						entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					} else {
						if (new ItemStack(Blocks.OAK_BUTTON).isDamageableItem()) {
							if (stack.hurt(1, world.getRandom(), entity)) {
								stack.shrink(1);
								stack.setDamageValue(0);
								if (stack.isEmpty())
									entity.getInventory().removeItem(stack);
							}
						} else {
							stack.shrink(1);
							if (stack.isEmpty())
								entity.getInventory().removeItem(stack);
						}
					}

				}
			}
		}
	}

}