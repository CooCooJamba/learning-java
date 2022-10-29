import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        int n = 5;
        Student arr[] = new Student[n];
        for (int i = 0; i < n; i++) {
            Student student = new Student(new Random().nextInt(100));
            arr[i] = student;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].getMark());
        }
        SortingStudentsByGPA sorting = new SortingStudentsByGPA();
        sorting.sorting(arr, 0, n - 1);
        System.out.println("After sorting");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].getMark());
        }
    }
}
