import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Solution s = new Solution();
        s.recursion_1(n, 0);
        System.out.println(" ");
        s.recursion_2(n, 0);
        System.out.println(" ");
        System.out.println(s.sum(m));
    }
}