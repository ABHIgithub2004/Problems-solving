public class substring{
    public static void main(String[] args){
        String s = "sak";

        // Nested for loops are used to iterate and get the range to print
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                System.out.println(s.substring(i,j)); // This method prints the elements from the range of i to j
            }
        }
    }
}
