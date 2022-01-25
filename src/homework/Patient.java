package homework;

public class Patient extends Doctor{
    String patientname;

    void name(){
        try {
            System.out.println("Enter the Patient Name");
            patientname = "P.Ram";
            if(patientname.startsWith("P"))
            {
                System.out.println("Patient Name is :"+patientname);
            }
            else {
                throw new InsufficientName("Enter the name do not start with 'P'");
            }
        } catch (InsufficientName e) {
            System.out.println("Invalid name ");
        }

    }
}

