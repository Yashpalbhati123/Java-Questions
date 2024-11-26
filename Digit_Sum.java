public class Digit_Sum {
    
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        int remainder=0;

        while(n>0){
            remainder = n % 10;
            sum = sum + remainder;
            n = n / 10;
        }
        System.out.println("Sum of digits of the number is: "+sum);
    }
}
