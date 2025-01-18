import java.util.Scanner;  // Importing Scanner class for taking user input
import java.util.Arrays;   // Importing Arrays class for printing array

class Main {
    // Main method to test the twoSum 
    public static void main(String[] args) {
        // Create a Scanner object for getting user input
        Scanner in = new Scanner(System.in);
        
        // Number of elements in the array
        int n = in.nextInt();
        
        // Create an array to store user inputs
        int[] nums = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        
        // Input the target value
        int target = in.nextInt();
        
        // Call the twoSum method 
        int[] result = twoSum(nums, target);
        
        // Print the result
        System.out.println(Arrays.toString(result));
        
        // Close the scanner to avoid resource leak
        in.close();
    }

    // Static method to find two indices whose elements sum up to the target
    static int[] twoSum(int[] nums, int target) {

        // Variable to store the sum of two elements
        int sum = 0;
        
        // Outer loop to iterate  each element in the array
        for (int i = 0; i < nums.length - 1; i++) {
            // Inner loop to find the second number that sums to the target
            for (int j = i + 1; j < nums.length; j++) {
                // Calculate the sum of the current pair of numbers
                sum = nums[i] + nums[j];
                
                // If the sum equals the target, return the indices of the numbers
                if (sum == target) {
                    return new int[] {i, j}; 
                } else {
                    // Reset sum to 0 
                    sum = 0;
                }
            }
        }
        
        // Return -1,-1 if no solution is found
        return new int[] {-1, -1};
    }
}
