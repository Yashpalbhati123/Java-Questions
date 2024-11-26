import java.util.*;

public class Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three subject marks :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float Avg = (a + b + c) / 3;
        System.out.println("Average of three subject marks is : " + Avg);
        if (Avg >= 90) {
            System.out.println("Grade is A+");
        } else if (Avg >= 75) {
            System.out.println("Grade is A");
        } else if (Avg >= 50) {
            System.out.println("Grade is B");
        } else {
            System.out.println("Fail");
        }

    }
}
