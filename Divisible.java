import java.util.Scanner;

public class Divisible{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt(); 
        int div = in.nextInt();

        // if the number  divisible by div gives remainder 0, then it is divisible
        if(num % div == 0){
            System.out.println(num + " is divisible by " + div);
        }
          // if it did'n divisible by div and gives rem more then 0 , then it is not divisible by div
        else{
            System.out.println(num + " is not divisible by " + div);

        }
        in.close();
    }
}
