public class Reverse_num {
    
    public static void main(String[] args) {
        int num = 12345;
        int reversed_num = 0;
        int remainder = 0;

        while(num>0){
            remainder = num % 10;
            reversed_num = reversed_num * 10 + remainder;
            num = num / 10;

        }
        System.out.println(reversed_num);
    }
}
