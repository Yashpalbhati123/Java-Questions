public class Check_Divisible {
    public static void main(String[] args) {
    
        int n=15;

        String res = (n%3==0 && n%5==0) ? "Divisible by 3 or 5 " : "Not divisible by 3 or 5";
    
        System.out.println(res);
    }
    
}
