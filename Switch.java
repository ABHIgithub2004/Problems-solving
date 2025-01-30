import java.util.Scanner;

public class vowels{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
      //Converting the string to lowercase.
        String lower = str.toLowerCase();

      // for loop is used to iterate through the string
        for(int i = 0; i < str.length(); i++){
            char ch = lower.charAt(i); //character at the i th index
            
            switch(ch){
                case 'a': //if ch == a goes into this case and prints the value
                System.out.print(ch + " ");
                break;   // After printing break the switch case.
                
                case 'e'://if ch == e goes into this case and prints the value
                System.out.print(ch + " ");
                break;
                
                case 'i'://if ch == i goes into this case and prints the value
                System.out.print(ch + " ");
                break;
                
                case 'o'://if ch == o goes into this case and prints the value
                System.out.print(ch + " ");
                break;
                
                case 'u'://if ch == u goes into this case and prints the value
                System.out.print(ch + " ");
                break;

            }
        }
        in.close();

        

    }
}
