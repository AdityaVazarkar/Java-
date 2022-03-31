package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlBatchQuery {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java";
        String username = "aditya";
        String password = "Aditya@02";

        String QUERY1 = "update person set FirstNeme = 'aditya123' where ID = 1;";
        String QUERY2 = "update person set FirstNeme = 'rahul123' where ID = 2;";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            stmt.addBatch(QUERY1);
            stmt.addBatch(QUERY2);
            stmt.executeBatch();
        }catch (Exception e){
            System.out.println("Name Update"+e);
        }
    }
}
