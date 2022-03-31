import java.sql.*;

public class Emp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/java";
        String username = "aditya";
        String password = "Aditya@02";

        Connection con = null;
        Statement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp1");
            while (rs.next()){

                Integer Id = rs.getInt(1);
                String Name = rs.getString(2);


                System.out.println("ID:-"+ Id+" \t Name:-"+Name);
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

class MyClass{
    static {
        System.out.println("in static clock");
    }
    {
        System.out.println("in instance block");
    }
}
