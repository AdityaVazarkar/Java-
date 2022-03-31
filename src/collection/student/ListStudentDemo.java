package collection.student;

import collection.StudentServer;
import person.entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ListStudentDemo implements StudentServer {
    String url = "jdbc:mysql://localhost:3306/java";
    String username = "aditya";
    String password = "Aditya@02";
    private int student;

    @Override
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    @Override
    public void insert(List<Person> person) {
        try {
            String QUERY = "insert into person values(?,?,?,?,?);";
            PreparedStatement ps = getConnection().prepareStatement(QUERY);
            for(int i=0;i<student;i++){
                System.out.println(student);
            }

            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        collection.Student s1 = new collection.Student();
        s1.RollNo = 1;
        s1.StuName = "Aditya";
        s1.Section = "Java";
        s1.Address = "Pune";

        collection.Student s2 = new collection.Student();
        s2.RollNo = 2;
        s2.StuName = "Shreya";
        s2.Section = "HR";
        s2.Address = "Pune";

        collection.Student s3 = new collection.Student();
        s3.RollNo = 3;
        s3.StuName = "Rohit";
        s3.Section = "Food Tech";
        s3.Address = "Pune";
    }
}
class Student{
    Integer RollNo;
    String StuName;
    String Section;
    String Address;

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", StuName='" + StuName + '\'' +
                ", Section='" + Section + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }




}
