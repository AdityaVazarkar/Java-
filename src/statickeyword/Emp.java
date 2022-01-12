package statickeyword;

public class Emp {
    private int empId;
    private String eName;
    static private String cname = "CodeKul";

    public Emp(int empId , String eName){
        this.empId = empId;
        this.eName = eName;
    }

    void show(){
        System.out.println("EmpID:"+empId+"EmpName:"+eName+"Company Name:"+cname);
    }

    public static void main(String[] args) {
    Emp emp1 = new Emp(1,"emp1");
    emp1.show();
    Emp emp2 = new Emp(2,"emp2");
    emp2.show();
    Emp emp3 = new Emp(3,"emp3");
    Emp.cname ="FB";
    emp3.show();
    }
}
