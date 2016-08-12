/**
 * Пример из книги Java в примерах. Справочник. Дэвид Флэнаган
 * Упражнение 1-2. Стр.42
 */
public class Fibonacci3 {
    public static void main(String[] args){
        int n0 = 1, n1 = 1, n2 = 2, n3;
        System.out.print(n0 + " " + n1 + " " + n2 + " ");
        for (int i = 0; i < 20; i++){
            n3 = n2 + n1 + n0;
            System.out.print(n3 + " ");
            n0 = n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}