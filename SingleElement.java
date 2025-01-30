import java.util.Arrays;
public class SingleElement{
    public static void main(String[] args){
        int[] arr = {2,2,1,3,3,1,4};
        System.out.println(single(arr));
    }
    static int single(int[] arr){
        Arrays.sort(arr); // Sort the array
      
      //iterates till the length -1, because comparision is between i and i+1
        for(int i = 0; i < arr.length-1; i+=2){
          
            //If i th element is not equal to i+1 th element return  the element
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
      
      // if the unique element is at the end of the array, return it.
        return arr[arr.length-1];
    }
}
