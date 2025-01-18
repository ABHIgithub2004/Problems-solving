import java.util.Scanner;  // Import Scanner class for user input

class Main {

  // Main method 
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner in = new Scanner(System.in);

        // Input the number of rows and columns of the matrix
        int rows = in.nextInt();
        int cols = in.nextInt();
        // Create the matrix
        int[][] matrix = new int[rows][cols];
        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // Input the target value
        int target = in.nextInt();
        // Call the searchMatrix method with the user input
        boolean result = searchMatrix(matrix, target);
        // Print the result
        System.out.println(result);
        // Close the scanner to avoid resource leak
        in.close();
    }
  
    // Method to search for a target in a 2D matrix
    static boolean searchMatrix(int[][] matrix, int target) {
        // Initialize row and column pointers
        int row = 0;
        int col = matrix[row].length - 1;

        // Traverse the matrix using Binary search method
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true; //If Target found
            } else if (target > matrix[row][col]) {
                row++; // Move down if the target is greater then the value
            } else {
                col--; // Move left if the target is smaller than the value
            }
        }
        return false; //  if target not found
    }
}
