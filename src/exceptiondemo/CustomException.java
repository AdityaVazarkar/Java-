package exceptiondemo;

public class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}

class TestException{
    public static void main(String[] args) {
        try{
            throw new CustomException("Custom Exception");
        }catch (CustomException e){
            System.out.println(e.getMessage());

        }
    }
}