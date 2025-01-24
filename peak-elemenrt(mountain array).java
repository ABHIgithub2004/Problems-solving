import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++){
      arr[i] = in.nextInt();
    }
    //calling the function
    System.out.println(peakIndexInMountainArray(arr));
  }
  //  Binary search method
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;  // Initializing start and end pointers
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2; //calculating the mid index of the array

            if(arr[mid] > arr[mid+1]){
                end = mid; //if condition satisifies end pointer will move to the index of mid
            }
            else {
                start = mid + 1; //else start pointer will move to the next index of mid
            }
        }
      // At end the start pointer will be at the peak element, return to the main function
        return start;
    }
}
