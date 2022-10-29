import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        exercise_1();
        exercise_2();
    }
    public static void exercise_1() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result_for = 0;
        int result_while = 0;
        int result_do_while = 0;
        for (int i = 0; i < arr.length; i++) {
            result_for += arr[i];
        }
        System.out.println("Сумма элементов массива: " + result_for);
        int i = 0;
        while (i < arr.length) {
            result_while += arr[i];
            i++;
        }
        System.out.println("Сумма элементов массива: " + result_while);
        int j = 0;
        do {
            result_do_while += arr[j];
            j++;
        } while (j < arr.length);
        System.out.println("Сумма элементов массива: " + result_do_while);
    }
    public static void exercise_2() {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(10);
        }
        System.out.println("Элементы массива случайных чисел:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы отсортированного массива случайных чисел:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
