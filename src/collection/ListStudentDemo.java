package collection;

import person.entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public  class ListStudentDemo implements StudentServer {
    String url = "jdbc:mysql://localhost:3306/java";
    String username = "aditya";
    String password = "Aditya@02";

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
    public void insert(Person person) {
        try {
            String QUERY = "insert into person values(?,?,?,?,?);";
            PreparedStatement ps = getConnection().prepareStatement(QUERY);
            ps.setInt(1, person.getId());
            ps.setString(2, person.getFirstName());
            ps.setString(3, person.getLastName());
            ps.setString(4, person.getMobileNo());
            ps.setString(5, person.getEmail());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.RollNo = 1;
        s1.StuName = "Aditya";
        s1.Section = "Java";
        s1.Address = "Pune";

        Student s2 = new Student();
        s2.RollNo = 2;
        s2.StuName = "Shreya";
        s2.Section = "HR";
        s2.Address = "Pune";

        Student s3 = new Student();
        s3.RollNo = 3;
        s3.StuName = "Rohit";
        s3.Section = "Food Tech";
        s3.Address = "Pune";
    }
}
public class Student{
    public Integer RollNo;
    public String StuName;
    public String Section;
    public String Address;

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", StuName='" + StuName + '\'' +
                ", Section='" + Section + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
