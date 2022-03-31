package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MysqlDemo2 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java";
        String username = "aditya";
        String password = "Aditya@02";
        String QUERY = "insert into emp1 values (? ?)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement ps = con.prepareStatement(QUERY);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id ");
            ps.setInt(1,sc.nextInt());
            System.out.println("Enter name ");
            ps.setString(2,sc.next());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");

        } catch (Exception e) {
            System.out.println(e);
        }
        }

}

