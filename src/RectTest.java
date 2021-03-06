/**
 * Пример из книги Java в примерах. Справочник. Дэвид Флэнаган
 * Тестирование класса  Rect. Стр.46
 *
 * Это подкласс класса Rect, позволяющий нарисовать его на экране.
 * Он наследует все поля и методы класса Rect.
 * Для рисования он использует объект класса java.awt.Graphics.
 */
public class RectTest {
    public static void main(String[] args) {
        Rect r1 = new Rect(1, 1, 4, 4); // Создаем объекты класса Rect
        Rect r2 = new Rect(2, 3, 5, 6);
        Rect u = r1.union(r2); // Вызываем методы класса Rect
        Rect i = r2.intersection(r1);
        if (u.isInside(r2.x1, r2.y1)) // Используем поля Rect и вызываем метод
            System.out.println("(" + r2.x1 + "," + r2.y1 + ") содержится в объединении");
        // Следующие строки неявно вызывают метод Rect.toString()
        System.out.println(r1 + " union " + r2 + " = " + u);
        System.out.println(r1 + " intersect " + r2 + " = " + i);
    }
}
