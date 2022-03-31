package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> value1 = new LinkedHashSet<>();
        value1.add(87);
        value1.add(67);
        value1.add(77);
        value1.add(97);
        value1.add(57);
        System.out.println("Hash Set"+value1);
    }
}
