package collection;
/**
 * Hash set unordered
 * tree set is asendingorder
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> vegetable = new HashSet<>();

        System.out.println(vegetable.add("Tomato"));
        System.out.println(vegetable.add("Broccoli"));
        System.out.println(vegetable.add("BabyCorn"));
        System.out.println(vegetable.add("Spinach"));

        Set<Integer> value = new TreeSet<>();
        value.add(87);
        value.add(67);
        value.add(77);
        value.add(97);
        value.add(57);
        System.out.println("Tree Set"+value);

        Set<Integer> value1 = new HashSet<>();
        value1.add(87);
        value1.add(67);
        value1.add(77);
        value1.add(97);
        value1.add(57);
        System.out.println("Hash Set"+value1);
    }
}
