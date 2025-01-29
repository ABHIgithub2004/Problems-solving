import java.util.Scanner;
import java.lang.String;

public class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str = str1.toLowerCase();
        System.out.println(str);

      // If true it prints String is palindrome
        if(ispalindrome(str)){
            System.out.println(str + " is a palindrome");
        }
          // If false it prints string is not palindrome
        else{
            System.out.println(str + " is not a palindrome");
        }
        in.close();
        
       
    }
    static boolean ispalindrome(String str){
       // Two pointer method
      // one at starting of the string and other at end of the string
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
          // If character at i is equal to character at j , then increase i by 1 amd decrease j by 1
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
              // if not equal the print false, means not palindrome
            else{
                return false;
            }
        } 
      // return true if all the characters of i and j are equal
        return true;
        
    }
}
