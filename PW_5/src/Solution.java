public class Solution {
    public int recursion_1(int n, int m) {
        for (int i = 0; i < (m + 1); i++) {
            System.out.print((m + 1) + " ");
        }
        return (n != 1) ? recursion_1(n - 1, m + 1) : 0;
    }
    public int recursion_2(int n, int m) {
        System.out.print((m + 1) + " ");
        return (n != 1) ? recursion_2(n - 1, m + 1) : 0;
    }
    public int sum(int n) {
        return n == 0 ? 0 : n % 10 + sum(n / 10);
    }
}