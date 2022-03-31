package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Litchi");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println(fruits);
        fruits.addFirst("Guava");

        System.out.println(fruits);
        fruits.addLast("Orange");

        System.out.println(fruits);
        fruits.offer("Strawberry");

        System.out.println(fruits);
        System.out.println("First"+fruits.peek());

        Iterator<String> stringIterator = fruits.descendingIterator();
        System.out.println("Reverse order");

        while (stringIterator.hasNext()){
            System.out.println("fruits"+stringIterator.next());
        }
        fruits.sort(String::compareToIgnoreCase);
        System.out.println("Sort"+fruits);
    }
}
