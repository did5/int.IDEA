public class Factorial {
    public static void main(String[] args){
        int input = Integer.parseInt(args[0]);
        double result = factorial(input);
        System.out.println("Factorial from " + input + " equals " + result);
    }
    private static double factorial(int x){
        if (x < 0) return 0.0;
        double fact = 1.0;
        while (x > 1) {
            fact = fact * x;
            x = x - 1;
        }
        return fact;
    }
}
