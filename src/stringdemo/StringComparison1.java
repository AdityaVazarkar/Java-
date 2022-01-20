package stringdemo;

import java.util.Locale;

public class StringComparison1 {
    public static void main(String[] args) {
        //charAt:-return the character at the specified index in string
        String str = "aditya";
        char result = str.charAt(0);
        System.out.println(result);

        //toUpperCase():- convert string in capital
        System.out.println(str.toUpperCase());

        //toLowerCase():-convert string in small letter
        System.out.println(str.toLowerCase());

        //isEmpty():-check string is empty or not
        System.out.println(str.isEmpty());

        //concat():-It is used for concatenate two string
        str=str.concat("Vazarkar");
        System.out.println(str);

        //length():- it is use to find length of string
        System.out.println(str.length());

        //replace():-
        System.out.println(str.replace("aditya","shreya"));

        //replaceAll()
        System.out.println(str.replaceAll("aditya","vazarkar"));

        //indexOf():-
        System.out.println(str.indexOf("a"));

        //startsWith():
        System.out.println(str.startsWith("a"));

        //endsWith();
        System.out.println(str.endsWith("r"));

    }

}
/**
 * Homework
 * 1. charAt()
 * 2. toUpperCase()
 * 3. toLowerCase()
 * 4. isEmpty()
 * 5. concat()
 * 6. length()
 * 7. replace()
 * 8. replaceAll()
 * 9. indexOf()
 * 10. startsWith()
 * 11. endsWith()
 */