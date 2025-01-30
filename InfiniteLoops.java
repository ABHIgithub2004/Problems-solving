public class InfiniteLoops{
    public static void main(String[] args){
        int i = 0;
        forLoop(i);
        whileLoop(i);
        
    }
    //for loop printing infinite numbers
    static void forLoop(int i){
        // No condition to break the loop
        for(i = 0; ; i++){
            System.out.println(i);
        }

    }

    //while loop printing infinite numbers
    static void whileLoop(int i){
        // There id no condition to break the loop, if there is a value the condition is true.
        while(true){
            System.out.println(i);
            i++;
        }
    }

}
