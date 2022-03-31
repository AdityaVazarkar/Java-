package homework;

import java.util.Scanner;

public class MyData {
    int day,month,year;
    int flag;
    void Accept(int dd,int mm,int yy){
       day=dd;
       month=mm;
       year=yy;
    }
    void display(){
        System.out.println("Day"+day+"Month"+month+"Year"+year);
    }
    static class Ex1{
        public static void main(String[] args) {
            MyData myData = new MyData();

            System.out.println("Enter the Date:- dd mm yy");

            Scanner scanner = new Scanner(System.in);
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            int flag = 0;
            try {

                if (month <= 0 || month > 12)
                    throw new InvaliedDataException();
                else {
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

                        if (day >= 1 && day <= 31)
                            flag = 1;
                        else
                            throw new InvaliedDataException();
                    } else if (month == 2) {
                        if (year % 4 == 0) {
                            if (day >= 1 && day <= 29)
                                flag = 1;
                            else
                                throw new InvaliedDataException();
                        } else {
                            if (month == 4 || month == 6 || month == 9 || month == 11) {
                                if (day >= 1 && day <= 30)
                                    flag = 1;
                                else
                                    throw new InvaliedDataException();
                            }
                          //  System.out.println("Date is"+day+month+year);
                        }
                        if (flag == 1) ;
                        {
                            MyData dt = new MyData();
                            dt.Accept(day, month, year);
                            dt.display();
                        }

                    }
                }

            } catch (InvaliedDataException e) {
                System.out.println("Invalid date ");
            }
        }
    }
}




