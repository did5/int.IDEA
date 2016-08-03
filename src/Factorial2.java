public class Factorial2 {
    public static void main (String[] args){
        for (int i = 0; i <= 12; i++)
            System.out.println(i + "! = " + factorial(i));
        System.out.println(Long.MAX_VALUE);
    }
    private static long factorial(long x){
        if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        if (x <= 1) return 1;
        else return x * factorial(x-1);
    }
}
