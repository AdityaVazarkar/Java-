package collection;

import java.util.Deque;
import java.util.LinkedList;

public class LinkListQueueDemo {
    public static void main(String[] args) {
        Deque<String> name = new LinkedList<>();
        name.addFirst("Aditya");
        System.out.println("Head To Add:-"+name);
        name.offerFirst("Ram");
        System.out.println("Offer First:-"+name);
        name.addLast("Shreya");
        System.out.println("Add Last:-"+name);
        name.offerLast("Rohit");
        System.out.println("Offer Last:-"+name);
        System.out.println("Remove Last:-"+name.removeFirst());

    }
}
