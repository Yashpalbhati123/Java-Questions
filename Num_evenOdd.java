import java.util.*;

class Num_evenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter a number");
        num = sc.nextInt();

        String evenOdd = (num % 2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(evenOdd);
    }
}