import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getMark() == s2.getMark()) {
            return 0;
        }
        if (s1.getMark() > s2.getMark()) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public void sorting(Student arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            sorting(arr, begin, partitionIndex-1);
            sorting(arr, partitionIndex+1, end);
        }
    }
    private int partition(Student arr[], int begin, int end) {
        Student pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (compare(arr[j], pivot) == 1) {
                i++;
                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Student swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
}
