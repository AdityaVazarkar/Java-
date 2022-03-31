package person.entity;

import person.entity.server.PersonService;
import person.entity.server.PersonServiceImp;

import java.util.Scanner;

public class Person {
    private Integer Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String MobileNo;

    public Person(){}
    public Person(Integer Id, String FirstName, String LastName, String Email, String MobileNo) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.MobileNo = MobileNo;
    }
    public Integer getId(){
        return Id;
    }
    public void setId(Integer Id){
        this.Id = Id ;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }



    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }


    public String getEmail() {
        return Email;
    }

        public void setEmail(String Email) {
        this.Email = Email;
    }
}
