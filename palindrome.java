import java.util.Scanner;  // Import Scanner class for user input

class Main {
   // Main method 
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        // Input the number 
        int number = in.nextInt();
        // Call the isPalindrome method 
        boolean result = isPalindrome(number);
        // Print the result
        System.out.println(result);
        // Close the scanner to avoid resource leak
        in.close();
    }

  
    // Method to check if a number is a palindrome
    static boolean isPalindrome(int x) {
        // Copy the input number to a new variable for comparing at last
        int r = x;
        // Intializing ans with zero
        int ans = 0;

        // Reverse the number
        while (x > 0) {
            int a = x % 10; // Gets the remainder of the number
            ans = ans * 10 + a; //Calculates and adds it to ans
            x = x / 10; // Removing the last digit of the number
        }

        // Check if the reversed number is equal to the original number
        if(ans == r){
          return true;
        }
        return false;
    }
}
