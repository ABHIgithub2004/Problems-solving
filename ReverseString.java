public class ReverseString{
    public static void main(String[] args){
        String s1 = "abcd";
       
        // Empty string to store the reverse string
        String res = "";
       
        //iterating from last index of the string
        for(int i = s1.length()-1; i >= 0; i--){
            res += s1.charAt(i); // Add  each character from the string at each iteration
        }
        //Printing the reversed string
        System.out.println(res);
    }
}
