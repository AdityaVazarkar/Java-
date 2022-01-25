package stringdemo;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Pune";
        String str2 = new String("Pune");
        String str3 = "PUNE";
        String str4 = "Mumbai";
        String str5 = "Thane";
        String str6 = "";

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.compareTo(str2)); // 0
        System.out.println(str1.compareTo(str4)); // 3
        System.out.println(str4.compareTo(str5)); //-7
        System.out.println(str5.compareTo(str6)); //5

    }
}
