package exceptiondemo;

public class TestAgeForVaccine {
    static void validateAge(int age) throws InvalideAgeForVaccine {
        if(age <45 && age >60){
            throw new InvalideAgeForVaccine("you are not eligible for vaccine");
            
        }
    }

    public static void main(String[] args) {
        try{
            TestAgeForVaccine.validateAge(44);
        }catch (InvalideAgeForVaccine v){
            System.out.println("Exception"+v);
        }
    }
}
