package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        Deque<Integer> value = new ArrayDeque<>();
        value.addFirst(10);
        System.out.println("Head First:"+value);
        value.offerFirst(20);
        System.out.println("Offer First:"+value);
        value.addLast(30);
        System.out.println("Tall Last:"+value);
        value.offerLast(40);
        System.out.println("Offer Tall"+value);

        Deque<String> alphabets = new ArrayDeque<>();
        alphabets.addFirst("A");
        alphabets.offerFirst("B");
        alphabets.addLast("C");
        alphabets.offerLast("D");
        System.out.println(":-"+alphabets);

        System.out.println("Remove First:-"+alphabets.removeFirst());
        System.out.println("Poll First:-"+alphabets.pollFirst());
    }
}
