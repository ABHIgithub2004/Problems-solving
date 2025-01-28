import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        // if the year is divisible by 4 and not divisible by 100 it is leap year (condition 1)
        // if the year is divisible by 4 and divisible by 400 it is leap year(condition 2)
        // if a year is divisible by 4 and divisible by 100 and divisible by 400 it is also a leap year(condition 3)
       
        if(year % 4 == 0  && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " is a leap year");
        }

          // if the year is not divisible by 4 it is not a leap year(condition 1)
          // if the year is divisible by 4 and divisible by 100 and not divisible 400 it is also not a leap year.
        else{
            System.out.println(year + " is not a leap year");
        }
        in.close();

    }
}
