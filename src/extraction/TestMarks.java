package extraction;

public class TestMarks {
    public static void main(String[] args){
        Student1 student1 = new Mathe();
        student1.Subject_Name();
        System.out.println(student1.getMarks());

        Student1 student2 = new Science();
        student2.Subject_Name();
        System.out.println(student2.getMarks());

        Student1 student3 = new History();
        student3.Subject_Name();
        System.out.println(student3.getMarks());
        float pct = (((student1.getMarks()+student2.getMarks()+student3.getMarks())*100)/300);
        System.out.println("Percentage ="+pct);
    }
}
