import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
      //calling the Goodpair function
        System.out.println(GoodPair(arr));
    }
    static int GoodPair(int[] nums) {
      //initializing count to  0
        int count = 0;
      //nested for loops for iterating the array
        for(int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j<nums.length; j++){
              //Checking the condition
                if(nums[i] == nums[j]){
                    count++; // if true increament the count
                }
            }
        }
      // return the count value
        return count;
    }
}
