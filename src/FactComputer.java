/**
 * Пример из книги Java в примерах. Справочник. Дэвид Флэнаган
 * Обработка исключений. Стр.36
 */
public class FactComputer {
    public static void main(String[] args){
        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(x + "! = " + Factorial4.factorial(x));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы должны задать аргумент");
            System.out.println("Формат: java FactComputer <число>");
        }
        catch (NumberFormatException e){
            System.out.println("Задваемый аргумент должен быть целым цислом");
        }
        catch (IllegalArgumentException e){
            System.out.println("Плохой аргумент: " + e.getMessage());
        }
    }
}
