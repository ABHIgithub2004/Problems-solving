
public class Methods{
    public static void main(String[] args){
        String name = "abhi";
        int n = 23;
        display1();
        System.out.println(display2());
        display3(name);
        System.out.println(display4(n));
    }
    //without return type , without parameter
    static void display1(){
        System.out.println("Hello");
    }
    //with return type , without parameter
    static int display2(){
        return 1;
    }

    //without return type, with parameter
    static void display3(String name){
        System.out.println(name);
    }

    //with return type, with parameter
    static int display4(int n){
        return n;
    }
}