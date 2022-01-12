package pkg2;

import pkg1.User;

public class Userlmpl extends User{
    public static void main(String[] args) {
        Userlmpl user = new Userlmpl();
        user.displayProtected();
    }
}