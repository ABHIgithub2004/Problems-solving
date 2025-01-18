import java.util.Scanner;  // Import Scanner class for user input

class Main {

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        // Input the number of elements in the array
        int n = in.nextInt();
        // Create the array
        int[] arr = new int[n];
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Call the bubbleSort method 
        bubbleSort(arr);
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Close the scanner to avoid resource leak
        in.close();
    }

  
    // Method to perform Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Traverse through all elements in the array
        for (int i = 0; i <=n ; i++) {
            // Last i elements are already sorted
            for (int j = 0; j <= n - i ; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
