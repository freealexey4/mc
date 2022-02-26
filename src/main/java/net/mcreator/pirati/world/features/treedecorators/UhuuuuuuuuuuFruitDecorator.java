package net.mcreator.pirati.world.features.treedecorators;

public class UhuuuuuuuuuuFruitDecorator extends CocoaDecorator {

    public static final UhuuuuuuuuuuFruitDecorator INSTANCE = new UhuuuuuuuuuuFruitDecorator();

    public static com.mojang.serialization.Codec<UhuuuuuuuuuuFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        tdt.setRegistryName("uhuuuuuuuuuu_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public UhuuuuuuuuuuFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
