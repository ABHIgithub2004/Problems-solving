import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
    
            }
        }
      // calling the function
        System.out.println(Richestcustomerwealth(arr));
        in.close();
    }
    static int Richestcustomerwealth(int[][] acc) {
        int max = 0; // initializing with zero

      // outer loop for iterating the rows
        for(int i = 0; i < acc.length; i++){
            int sum = 0;
          // inner loop is used to iterate the columns of the particular row
            for(int j = 0; j < acc[i].length; j++){
                sum += acc[i][j]; // adding up the row values
            }
          // if sum is greater max becomes sum value
            if(sum > max)
                max = sum;
        }
      //returning the maximum value of the matrix
        return max;

    }
}
