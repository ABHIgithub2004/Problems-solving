import java.util.Scanner;

public class Perfectnumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = perfectnumber(n);
        
      // If sum of divisors of a number is equal to the number , then it is a perfectnumber
        if(sum == n){
            System.out.println("true");
        }
      // else not a perfect number
        else{
            System.out.println("false");
        }
        in.close();

    }

    static int perfectnumber(int n){
        int sum = 0; // initializing  sum to 0

      // iterates until the given number
        for(int i = 1; i < n; i++){
          //if number is divisible by i , i will be added to the sum
            if(n % i == 0){
                sum += i;
            }
        } 
     // returns the sum to the function call
        return sum;
    }
    
}
