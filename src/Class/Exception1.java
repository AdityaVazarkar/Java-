package Class;

 class NameOutOfRangException1 extends Exception{
    private String name;

    public void NameOutOfRangeException(String name){
        this.name = name;
    }
 }

 class Student {
     String Name;

     Student(String name) {
         try {
             Name = name;
             if (Name == String.valueOf(name.matches("[A-Z][a-z]")))
                 throw new NameOutOfRangException();
                Name = name;
                printData();


         } catch (NameOutOfRangException ae) {
             System.out.println("Name:" + Name);
         }
     }

     public void printData() {
         System.out.println("Name:" + Name);
     }
         public static void main(String[] args) {
             Student s1 = new Student("Aditya");
             Student s2 = new Student("2Aditya");
             Student s3 = new Student("Aditya5");
     }
 }

