import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++){
      nums[i] = in.nextInt();
    }
    //Calling the function
    System.out.println(findDuplicates(nums));
  }
    static ArrayList<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> List = new ArrayList<>();    //ArrayList to add the duplicate elements
       
        // sorting the array using cyclic sort
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;

            if(nums[correct] == nums[i]){    
                i++;
            }
            else{                     
              //if value is not in the correct place , swap..
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            
        }
        // As Array is continuous array value not in its place is the duplicate value
        // Add those elements into the List
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                List.add(nums[j]);
            }
        }
        // return the List
        return List;
       
    } 
}
