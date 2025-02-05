import java.util.Scanner;

public class Gcd{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        //System.out.println(gcdmethod1(n1, n2));
        System.out.println(gcdmethod2(n1, n2));
        in.close();
    }
    // 1st Method
    static int gcdmethod1(int n1, int n2){
        int min = Math.min(n1,n2);
        //starts from min vlaue till 1
        for(int i = min; i >= 1; i--) {
            //if both the numbers are divisible by i , then i is GCD or HCF
            if(n1%i == 0 && n2%i == 0){
                return i;
            }
        }
        return -1;
    }

    //2nd Method (Recursion method)
    static int gcdmethod2(int n1, int n2){
        //if any of the number is 0 then the other number is GCD
        if(n2 == 0){
            return n1;
        }
        //else modulo the number to get the GCD using Euclid algorithm
        else{
            return gcdmethod2(n2, n1%n2);
        }
    }
}