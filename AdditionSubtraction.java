import java.util.Scanner;
import java.lang.Math;

public class AdditionSubtraction{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int sum = n1 + n2;
        int sub = n1 - n2;

        if(sum < 0 || sub < 0){
           sum =  Math.abs(sum);
           sub =  Math.abs(sub);
        }
        System.out.println("Addition of two numbers : " + sum);
        System.out.println("Subtraction of two numbers : " + sub);

        in.close();
    }
}