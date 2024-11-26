import java.util.*;

public class Positive_Negative {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        String res = num > 0 ? "Number is positive"
                : num < 0 ? "Number is Negative "
                        : "Number is Zero ";
        System.out.println(res);
        
    }
}
