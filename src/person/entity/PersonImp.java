package person.entity;

import person.entity.server.PersonService;
import person.entity.server.PersonServiceImp;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import static java.sql.DriverManager.getConnection;

public class PersonImp {
    public static void main(String[] args) {
        int ch ;
        Scanner sc = new Scanner(System.in);
        PersonService personService = new PersonServiceImp();
        do {
            System.out.println("1:- Insert");
            System.out.println("2:- Update");
            System.out.println("3:- Delete");
            System.out.println("4:- Display");
            System.out.println("5:- Exit");
            System.out.println("Enter your Choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Insert");
                    Person person = new Person();
                    System.out.println("Enter Id");
                    person.setId(sc.nextInt());
                    System.out.println("Enter First Name");
                    person.setFirstName(sc.next());
                    System.out.println("Enter Last Name");
                    person.setLastName(sc.next());
                    System.out.println("Enter Mobile Number");
                    person.setMobileNo(sc.next());
                    System.out.println("Enter EmailId");
                    person.setEmail(sc.next());
                    personService.insert(person);
                    break;
                case 2:
                    System.out.println("Choose below option for updateFirstName");
                    System.out.println("1.First Name");
                    System.out.println("2.Last Name");
                    System.out.println("3.EMail");
                    System.out.println("4.Mobile");
                    int option = sc.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Enter person id for updating record");
                            Integer id = sc.nextInt();
                            System.out.println("Enter person FirstName for updating record");
                            String firstName = sc.next();
                            personService.updateFirstName(id,firstName);
                            break;
                        case 2:
                            System.out.println("Enter person id for updating record");
                             id = sc.nextInt();
                            System.out.println("Enter person LastName for updating record");
                            String lastName = sc.next();
                            personService.updateLastName(id,lastName);
                            break;
                        case 3:
                            System.out.println("Enter person id for updating record");
                             id = sc.nextInt();
                            System.out.println("Enter person Email for updating record");
                            String email  = sc.next();
                            personService.updateEmail(id,email);
                            break;
                        case 4:
                            System.out.println("Enter person id for updating record");
                             id = sc.nextInt();
                            System.out.println("Enter person Mobile Number for updating record");
                            String mobile = sc.next();
                            personService.updateMobile(id,mobile);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Delete");
                    System.out.println("Enter Id");
                   Integer id= sc.nextInt();
                    personService.delete(id);
                    break;
                case 4:
                    System.out.println("Display");
                    personService.display();
                    break;
                case 5:
                  System.exit(0);
                    break;
                default:
                    System.out.println("Invalied choice");
                    break;
            }
        }while(ch < 6);
    }
}
