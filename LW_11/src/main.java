import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Solution<Integer, String, Long> solution = new Solution<>();
        Scanner scanner = new Scanner(System.in);
        String str;
        for (int i = 0; i < 5; i++) {
            solution.newArrayList(i);
            solution.newHashSet(i);
            str = scanner.nextLine();
            solution.newHashMap(str, (long)i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(solution.);
    }
}
