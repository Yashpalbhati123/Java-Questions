import java.util.*;
public class Cal_SI {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);    
    int P,R,T;    
    System.out.println("Enter the principal amount");
    P = sc.nextInt();
    System.out.println("Enter the rate of interest");
    R = sc.nextInt();
    System.out.println("Enter the time");
    T = sc.nextInt();
    double SI = (P*R*T)/100;
    System.out.println("Simple Interest is "+SI);

}
}