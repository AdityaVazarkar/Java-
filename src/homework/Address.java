package homework;

public class Address extends Patient{
    String flatno;
    void add(){
        try{
            System.out.println("Enter the address");
            flatno = "14";
            String Integer = null ;
            if(flatno == Integer) {
                throw new InsufficientNumber("Enter flat no is not Int");
            }
            else
            {
                System.out.println("Flat no is : "+flatno);
            }
        } catch (InsufficientNumber e) {
            System.out.println("Invalid Flat No");
        }finally {
            String city,country,state;
            city = "Pune";
            country = "India";
            state = "Maharashtra";
            System.out.println("City name:"+city+"Country name:"+country+"State name"+state);
        }
    }

    public static void main(String[] args) {
        Person pe = new Person();
        Doctor de = new Doctor();
        Patient pa = new Patient();
        Address ad = new Address();

        pe.accept();
        pe.display();
        de.FirstMiddleLast();
        pa.name();
        ad.add();


    }
}
