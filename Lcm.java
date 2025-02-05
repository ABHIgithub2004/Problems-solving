import java.util.Scanner;

public class Lcm{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println(lcm(n1, n2));
        in.close();
    }
    static int lcm(int n1, int n2){
        //To get the max element 
        int max = Math.max(n1,n2);
        //Iterates till max element
        for(int i = 1; i<= max; i++){
            int res = max * i;
            //if the multiples of max is divisble by both n1 andd n2, then res is the lcm of two numbers
            if(res % n1 == 0 && res % n2 == 0){
                return res;
            }
        }
        return -1;
    }
}