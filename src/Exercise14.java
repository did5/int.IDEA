import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Пример из книги Java в примерах. Справочник. Дэвид Флэнаган
 * Упражнение 1-4. Стр.42
 */
public class Exercise14 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (;;){
            System.out.print("> ");
            String line = in.readLine();
            if ((line == null) || line.equals("quit") || line.equals("tiuq")) break;
            for (int i = line.length()-1; i >= 0; i--){
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
    }
}
