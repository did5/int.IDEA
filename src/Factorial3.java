public class Factorial3 {
    static long[] table = new long[21];
    static { table[0] = 1;}
    static int last = 0;

    public static void main (String[] args){
        for (int i = 0; i <= 20; i++)
            System.out.println(i + "! = " + factorial(i));
        System.out.println("Long MAX_VALUE = " + Long.MAX_VALUE);
    }

    public static long factorial(int x) throws IllegalArgumentException {
        if (x >= table.length) throw new IllegalArgumentException("Переполнение: х слишком велик.");
        if (x < 0) throw new IllegalArgumentException("х не должен быть отрицательным");
        while (last < x) {
            table[last+1] = table[last] * (last +1);
            last++;
        }
        return table[x];
    }
}
