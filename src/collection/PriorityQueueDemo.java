package collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> flowers = new PriorityQueue<>();
        flowers.add("c");
        flowers.add("d");
        flowers.add("e");
        flowers.add("a");
        flowers.add("b");
        System.out.println("Priority Queue List:-"+flowers);
        System.out.println("Head:-"+flowers.peek());
        System.out.println("Head:-"+flowers.element());
        System.out.println("Offer:-"+flowers.offer("f"));
        System.out.println("After Offer:-"+flowers);
        System.out.println("Poll:-"+flowers.poll());
        System.out.println("After polling:-"+flowers);
    }
}