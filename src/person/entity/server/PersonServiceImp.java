package person.entity.server;

import person.entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonServiceImp implements PersonService {
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

    @Override
    public void updateFirstName(Integer id, String firstName){

        try {
            String QUERY = "update person set FirstNeme=?  where id = ?;";
            PreparedStatement ps = getConnection().prepareStatement(QUERY);
            ps.setString(1,firstName);
            ps.setInt(2,id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void updateLastName(Integer id, String lastName) {
        try {
            String QUERY = "update person set lastName=?  where id = ?;";
            PreparedStatement ps = getConnection().prepareStatement(QUERY);
            ps.setString(1,lastName);
            ps.setInt(2,id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void updateEmail( Integer id,String email){
        try{
        String QUERY = "update person set Email=?  where id = ?;";
        PreparedStatement ps = getConnection().prepareStatement(QUERY);
        ps.setString(1,email);
        ps.setInt(2,id);
        int rows = ps.executeUpdate();
        System.out.println(rows + " row/s are affected");
    }catch (Exception e){
        System.out.println(e);
    }

    }

    @Override
    public void updateMobile(Integer id, String mobile) {
        try{
            String QUERY = "update person set Email=?  where id = ?;";
            PreparedStatement ps = getConnection().prepareStatement(QUERY);
            ps.setString(1,mobile);
            ps.setInt(2,id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");
        }catch (Exception e){
            System.out.println(e);
        }
    }


    @Override
   public void delete(Integer id) {
        try{
        String QUERY = "delete from person where id = ?;";
        PreparedStatement ps = getConnection().prepareStatement(QUERY);
        ps.setInt(1,id);
        int rows = ps.executeUpdate();
        System.out.println(rows + " row/s are affected");
    }catch (Exception e){
        System.out.println(e);
    }
    }



    @Override
    public List<Person> display() {
        List<Person> personList = new ArrayList<>();
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from person");
            while (rs.next()) {

                Integer id = rs.getInt(1);
               String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String mobile =rs.getString(4);
                String email = rs.getString(5);

                System.out.println("Id : " + id + " | FirstName : " + firstName + " | LastName : " + lastName + " | Mobile : " + mobile + " | Email : " + email);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return personList;
    }
}
