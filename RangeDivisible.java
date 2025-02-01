import java.util.Scanner;
import java.util.Arrays;

public class RangeDivisible{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
      //Resultant array (String)
        String[] res = new String[n];

      //iterates untill the number
        for(int i = 0; i < res.length; i++){
            int num = i+1; 
          //If the number is divisible by both 3 & 5, print FizzBuzz instead of the number in the array
            if(num % 3 == 0 && num % 5 == 0){
                res[i] = "FizzBuzz";
            }

            //If the number is divisible by only 3, print Fizz instead of the number in the array
            else if(num % 3 == 0){
                res[i] = "Fizz";
            }

         //If the number is divisible by only 5, print Buzz instead of the number in the array
            else if(num % 5 == 0){
                res[i] = "Buzz";
            }
            // If the number is neither divisible by 3 nor 5. print the number.
            else{
                res[i] = Integer.toString(i+1);
            }

        }
      //print the result array
        System.out.println(Arrays.toString(res));
        
        in.close();
    }
}
