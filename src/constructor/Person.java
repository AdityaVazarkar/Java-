package constructor;

import java.sql.SQLOutput;

/**
 * note:
 * 1. name of constructor is same as class name
 * 2. it donot have return type
 * 3. you can specify access specifiers to constructure
 * 4. consturctor
*/




public class Person {
    private int id;
    private String name;
    Person(){
        System.out.println("in constructor");
    }
    Person(int id){
        this.id = id;
    }
    Person(int i,String nm){
        id = i;
        name = nm;
    }
    public static void main(String[] args) {
        System.out.println("B4 obj creation");
        Person person = new Person(5,"abc");
        System.out.println("Id: "+person.id);
        System.out.println("Name: "+person.name);

        person = new Person(7,"xyz");
        System.out.println("After obj created");
        System.out.println("Id: "+person.id);
        System.out.println("Name: "+person.name);
    }
}