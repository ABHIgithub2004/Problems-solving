import java.util.Scanner;  

class Main {

 
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

       
        int target = in.nextInt();
      //calling the function searchMatrix
        boolean result = searchMatrix(matrix, target);
        System.out.println(result);
        in.close();
    }
  
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
