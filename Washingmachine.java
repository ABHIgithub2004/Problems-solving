import java.util.Scanner;

public class Washingmachine{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        char waterlevel = in.next().charAt(0);
        

        // If else statement is used to check the conditions
        if(weight >= 0){
          //if the weight is 0 it does not take time to wash
            if(weight == 0){
                System.out.println("Time Estimated : 0 Minutes");
            }
              //if the weight is more then 1 and less than 2000 and the water level is low it takes 25 minutes for washing
            else if(weight <= 2000 && waterlevel == 'l'){
                System.out.println("Time Estimated : 25 Minutes");
            }
              //if the weight is more then 2000 and less than 4000 and the water level is medium it takes 35 minutes for washing
            else if(weight > 2000 && weight <= 4000 && waterlevel == 'm'){
                System.out.println("Time Estimated : 30 Minutes");
            } 
              //if the weight is more then 4000 and less than 7000 and the water level is high it takes 45 minutes for washing
            else if(weight > 4000 && weight <= 7000 && waterlevel == 'h'){
                System.out.println("Time Estimated : 45 Minutes");
            }
              // if the weight is more it prints "weight overloaded"
            else{
                System.out.println("WEIGHT OVERLOADED");
            }
        }
          // if the weight value is negative it prints "Invalid input".
        else{
           
            System.out.println("INVALID INTPUT");
           
        }
        in.close();


    }
}
