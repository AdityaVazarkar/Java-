package homework;

public class Doctor extends Person {
    String doctor;
    String number ;
    String docternem;

    void FirstMiddleLast() {
        doctor = ("Aditya,Rahul,Vazarkar");
        String[] StrOfArray = doctor.split(",", 3);
        for (String a : StrOfArray)
            System.out.println("String" + a);

        System.out.println("Enter the mobile number");
        number ="5065464656";
        int len=number.length();

        try {
            if (len == 10) {
                System.out.println("Number is :" + number);

            } else {
                throw new InsufficientNumber("Enter number are less or greater than 10");
            }
        } catch (InsufficientNumber ae) {
            System.out.println("Invalid number");
        }
            try {
                System.out.println("Enter the Doctor name ");
                docternem = "Dr.Sonu";

               if(docternem.startsWith("Dr"))
               {
                   System.out.println("Doctor Name: "+docternem);
               }
                else
               {
                   throw new InsufficientName("Enter name is not start with 'Dr'");
               }

            } catch (InsufficientName e) {
                System.out.println("Invalid Name");
            }


        }


    }



