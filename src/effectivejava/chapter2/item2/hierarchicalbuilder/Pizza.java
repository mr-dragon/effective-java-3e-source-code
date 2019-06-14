package effectivejava.chapter2.item2.hierarchicalbuilder;
import java.util.*;

/**
 * ���νṹ�Ĺ�����ģʽ��ҳ14��
 * ��ע�⣬�ײ�ġ�ģ���������͡�ϰ���������������νṹ�����������ǹ�����
 *
 * ����
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

        // ���������д�˷��������� "this"
        protected abstract T self();
    }
    
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }
}
