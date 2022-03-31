package collection;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<String> countries = new Stack<>();
        countries.add("India");
        countries.add("Germane");
        countries.add("USA");
        countries.add("Japan");
        countries.add("England");
        System.out.println(countries);
        countries.pop();
        System.out.println(countries);
        System.out.println("Peek element:-"+countries.peek());
        System.out.println("Search element:-"+countries.search("India"));
        System.out.println("Stack is  empty:-"+countries.empty());
        System.out.println("check existence:-"+countries.contains("India"));

    }
}
