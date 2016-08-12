import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Пример из книги Java в примерах. Справочник. Дэвид Флэнаган
 * Упражнение 1-5. Стр.42
 */
public class Exercise15 {
    public static void main(String[] args) throws IOException {
        double[] nums = new double[100];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.random() * 100;
        }
        SortNumbers.sort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("> ");
        String line = in.readLine();
        double x = Double.parseDouble(line);
        find(x);

    }
    public int find(double x) {
        int i = -1;
        if (this.nums != null) {
            int low = 0, high = nums.length, mid;
            while (low < high) {
                mid = (low + high)/2; // Можно заменить на расчёт в беззнаковом типе: (low + high) >>> 1
                if (x == nums[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < nums[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}
