package collection;

public class Student {
    public Integer RollNo;
    public String StuName;
    public String Section;
    public String Address;

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", StuName='" + StuName + '\'' +
                ", Section='" + Section + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
