import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
      // calling the function
        int[] ans = leftRightDifference(arr);
      //Arrays.to String method is used to print the output int he form of array
        System.out.println(Arrays.toString(ans));
        in.close();
    }
  
    static int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];      // To store the differenced elements
 
        for(int i = 0; i < nums.length; i++){
         int leftvalue = Leftsum(nums,i);     // calling leftsum to calculate leftsuum
         int rightvalue = Rightsum(nums,i);   // calling rightsum to calculate rigthtsuum
         ans[i] = Math.abs(leftvalue - rightvalue);         // Adding the absolute value of leftsum and rightsum to the array
        } 
        return ans;
     }
    // Adds all the leftside elements of the element
     static int Leftsum(int[] nums, int n){
         int sum = 0;
         if(n == 0){
             return 0;
         }
 
         for(int i = 0; i < n; i++){
             sum += nums[i];
         }
         return sum;
     } 
    // Adds all the rightside elements of the element
    static int Rightsum(int[] nums, int n){
         int sum = 0;
         if(n == nums.length - 1){
             return 0;
         }
 
         for(int i = n+1; i < nums.length;i++){
             sum += nums[i];
         }
         return sum;
     }
}
