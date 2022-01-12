package encapsulation1;

import jdk.jshell.spi.ExecutionControl;

public class TestUser {
    public static void main(String[] args){
        User user =new User();
        user.setUserid(":8796126858");
        user.setUserName(":Aditya");
        user.setPassword(":Aditya@02");
        user.setAddress(":Maratha Mahasangh Society Near Sai baba mandir Kothrud");
        user.setAge(":21");
        user.setBirthdate(":02/08/2001");


        System.out.println("UserId"+user.getUserid());
        System.out.println("UserName"+user.getUserName());
        System.out.println("Userpassword"+user.getPassword());
        System.out.println("UserAddress"+user.getAddress());
        System.out.println("UserAge"+user.getAge());
        System.out.println("UseBirthdate"+user.getBirthdate());
    }
}
