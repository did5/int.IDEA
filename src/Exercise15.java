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
        int index = binarySearch(nums, x);
        System.out.println("Меньшее число = " + nums[index-1]);
        System.out.println("Большое число = " + nums[index]);
    }

    public static int binarySearch(double[] array, double element){
        return binarySearch(array, element, 0, array.length-1);
    }

    private static int binarySearch(double[] array, double element, int left, int right) {
        int mid = left + (right - left)/2;
        if ((element < array[mid]) && (mid != left)){
            return binarySearch(array, element, left, mid-1);
        } else if (element > array[mid]){
            return binarySearch(array, element, mid+1, right);
        } else {
            return mid;
        }
    }
}
