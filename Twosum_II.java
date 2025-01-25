import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] nums = new int[n];

      for(int i = 0; i < n; i++){
        nums[i] = in.nextInt();
      }
      int target = in.nextInt();
      //calling the function and printing the array using Arrays.toString.
      System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        //Intializing two pointers, ie one at starting of the array and other at end
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            if(nums[i] + nums[j] > target){ //If sum greater than target , decrease j pointer because, as the array is sorted nums[j-1] will be less then nums[j]. So the number decreases.
                j--;                          
            }
            else if(nums[i] + nums[j] < target){//If sum lesser than target , increase i pointer because, as the array is sorted nums[i] will be less then nums[i+1]. So the number increases.
                i++;
            }
            else{
                return new int[] {i+1 , j+1}; // else the number will be equal to the target value. return its index + 1 .
            }
        }
        return new int[] {-1,-1}; // If the pair didn't fount in the array.
    }
}
