package accociation;

public class Collage extends Institute {
    private String  name;
    private  Address address;
    private Department department;


}
class Address{
    private String streetName;
    private String postalCode;
    private String landMark;
    private String city;
    private String flatNO;

}
class Department{
    private String deptName;
    private int room;
    private Labs labs;
    private Professor professor;
    private Student student;

}
class Labs{
    private  String labName;
    private Professor professor;
    private Student student;
}
class Professor{
    private String proName;
    private String address;
}
class Student{


}
