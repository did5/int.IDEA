/**
 * Пример из книги Java в примерах. Справочник. Дэвид Флэнаган
 * Упражнение 1-3. Стр.42
 */
public class Substring {
    public static void main(String[] args){
        try {
            int n1 = Integer.parseInt(args[1]);
            int n2 = Integer.parseInt(args[2]);
            for(int i = n1; i <= n2; i++){
                System.out.print(args[0].charAt(i));
            }
        }
        catch (Exception e){
            System.out.println("Error input");
        }
    }
}
