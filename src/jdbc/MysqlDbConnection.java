package jdbc;

import java.sql.*;

/**
 * 1. import - java.sql
 * 2. Load & Register the Driver -mysql
 * 3. Create the Connection
 * 4. Create a Statement
 * 5. Execute the Queery
 * 6. Get the Result
 * 7. close the connection
 */

public class MysqlDbConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/student";
        String username = "aditya";
        String password = "Aditya@02";

        Connection con = null;
        Statement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student1");
            while (rs.next()){
                String Name = rs.getString(1);
                Integer RollNo = rs.getInt(2);
                String Class = rs.getString(3);
                String Division = rs.getString(4);
                Integer Birthdate = rs.getInt(5);
                System.out.println("Name:-"+ Name+" \t RollNo:-"+RollNo+"\t Class:-"+Class+"\t Division:-"+Division+"\t Birthdate:-"+Birthdate);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            st.close();
            con.close();
        }
    }
}

class MyClass1 {
    static {
        System.out.println("in static clock");
    }
    {
        System.out.println("in instance block");
    }
}

