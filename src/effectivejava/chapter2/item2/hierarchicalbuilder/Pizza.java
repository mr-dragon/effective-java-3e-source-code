package effectivejava.chapter2.item2.hierarchicalbuilder;
import java.util.*;

/**
 * 类层次结构的构建器模式（页14）
 * 请注意，底层的“模拟自我类型”习语允许任意流体层次结构，而不仅仅是构建器
 *
 * 披萨
 */
public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // 子类必须重写此方法，返回 "this"
        protected abstract T self();
    }
    
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }
}
