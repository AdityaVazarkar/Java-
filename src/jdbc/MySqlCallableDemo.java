package jdbc;

import java.lang.reflect.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

/**
 * mysql> delimiter //
 * mysql> create procedure getEmpCount(OUT count INT)
 *     -> begin
 *     -> select count(*) into count from emp;
 *     -> end
 *     -> //
 * call getEmpCount(@count);
 * select @count;
 *
 * select * from person where mobileNo = ?
 */

public class MySqlCallableDemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/java";
        String username = "aditya";
        String password = "Aditya@02";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            CallableStatement callableStatement = con.prepareCall("{call getPersonCount2(?)}");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.executeUpdate();
            System.out.println(callableStatement.getInt(1));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
