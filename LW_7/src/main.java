import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println();
        System.out.println("Массив пуст: " + al.isEmpty());
        System.out.println();
        al.remove(3);
        System.out.println("Элементы массива:");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
