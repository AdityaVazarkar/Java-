package encapsulation;

public class Student {
    private int rollNo = 1;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String studName = "Codekul";

    public String getPassword() {
        return password;
    }

    private String password;

}
