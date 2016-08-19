/**
 * Пример из книги Java в примерах. Справочник. Дэвид Флэнаган
 * Подкласс класса Rect. Стр.46
 *
 * Это подкласс класса Rect, позволяющий нарисовать его на экране.
 * Он наследует все поля и методы класса Rect.
 * Для рисования он использует объект класса java.awt.Graphics.
 */
public class DrawableRect extends Rect {
    /** Конструктор DrawableRect просто вызывает конструктор Rect()*/
    public DrawableRect(int x1, int y1, int x2, int y2) { super(x1,y1,x2,y2);
    }
    /** Это новый метод, определяемый в классе DrawableRect */
    public void draw(java.awt.Graphics g) {
        g.drawRect(x1, y1, (x2 - x1), (y2-y1));
    }
}
