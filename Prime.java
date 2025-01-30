import java.util.Scanner;
import java.lang.Math;

public class Prime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        prime1(num);
        System.out.println(prime2(num));
        System.out.println(prime3(num));
        in.close();
    }

  
    // Method 1 using count
    public static void prime1(int num){
        int count = 0;
        //If a number is divisible by i then count will be increased by 1
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
      //For prime numbers the dvisiblity should by 2 (1 and by itself) 
      //If the count is more than 2 it is not a prime number
        if(count > 2){
            System.out.println(num + " is not a prime number");
        }
        else{
            System.out.println(num + " is a prime number");
        }
    }

  
    //Method 2 using Square root. It is used to iterate till  the square root of the number .
    public static boolean prime2(int num){
      //If the number is less than 2 it is  not a prime number
        if(num < 2){
            return false;
        }
        //Iteration starts from 2 and ends in sqart of the number. This reduces the time of execution for larger numbers
        for(int i = 2; i < Math.sqrt(num); i++){
          // If a number is divisible by i between 2 and end it is not a prime number
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

  
    //Method 3 
    public static boolean prime3(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i <= num * 0.5 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
