public class Fibonacci {
    public static void main(String[] args) {

        int term = 5, a = 0, b = 1, c = 0;

        System.out.print(a + "," + b + ",");

        c=a+b;
        System.out.print(c + ",");
        for (int i = 0; i < term; i++) {    
            a = b;
            b = c;
            c = a + b;
            System.out.print(c + ",");
        }

    }
}