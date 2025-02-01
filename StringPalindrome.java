import java.util.Scanner;

public class StringPalindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

      // Removes all non-alphabetical characters and spaces from the sentence. And converts into single string
        String str1 = str.replaceAll("[^a-zA-z]" , "");
      //converting the string to lowercase
        String str2 = str1.toLowerCase();

        //If the function returned true , it is palindrome
        if(palindrome(str2)){
            System.out.println("true");
        }
          // not palindrome
        else{
            System.out.println("false");
        }
        in.close();
    }
  //Two pointer method
    public static boolean palindrome(String str){

        if(str.length() == 0){
            return true;
        }

        int i = 0; 
        int j = str.length()-1;

        while( i <= j){
          //If first character and second character is same i will be incremented and j will be decreased
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
              // If not same it return's false
            else{
                return false;
            }
        }
      //If it equal till last , return's true
        return true;
    }
}
