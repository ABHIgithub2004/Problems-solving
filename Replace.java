import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        String str = in.nextLine();

        System.out.println(str.replaceAll("[^a-zA-Z]", "")); //Replaces all the numerical and special characters with empty string, except the alphabets all the characters will be removed
      
        
        in.close();
    }
}
