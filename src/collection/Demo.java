package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class Demo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("The patient should be informed of his therapeutic options.");
        strings.add("It wouldn't be as if the lone astronaut would be completely by himself.");
        strings.add("Now, a writer is entitled to have a Roget on his desk.");
        strings.add("Somebody should let you borrow their book");
        strings.add("From the earliest times until about the 1960s");
        strings.add("whether we may not, nay ought not, to use a neutral pronoun relative");
        strings.add("phone 9280018281");
        strings.add("Notional plurality");
        strings.add("A starting point would be to give more support");
        strings.add("abc@gmail.com");

        List<String> regex = new ArrayList<>();
        regex.add(".*\\.$");
        regex.add(".*\\d{10}.*");
        regex.add(".*@.*");
        regex.add("\\w+");
        regex.add(".*\\s.*");

        strings.forEach(s -> {
            regex.forEach(r ->{
                if(Pattern.matches(r,s)){
                    System.out.println("Regex "+(regex.indexOf(r)+1) + " matches String "+(strings.indexOf(s)+1));
                }
            });
        });
    }

    }
