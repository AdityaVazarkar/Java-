package encapsulation;

public class TestStudent {
    public static void main(String[] args){
        Student student = new Student();
        student.setStudName("Aditya");
        student.setRollNo(2);
        student.setPassword("codekul#987");


        System.out.println("RollNo"+student.getRollNo());
        System.out.println("Name"+student.getStudName());
        System.out.println("Password"+student.getPassword());
    }
}
