
public class Swap {
    public static void main(String []args){
        int a = 10;
        int b = 20;
        System.out.println("Before swapping");
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        //swapping using third variable
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }    
}
