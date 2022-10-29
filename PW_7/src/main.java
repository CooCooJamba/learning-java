import java.lang.reflect.Array;
import java.util.*;
public class main {
    public static void main(String[] args) {
        deque();
        stack();
    }
    public static void deque() {
        int score_first = 0;
        int score_second = 0;
        Deque<Integer> first = new ArrayDeque<>();
        first.add(1);
        first.add(3);
        first.add(5);
        first.add(7);
        first.add(9);
        Deque<Integer> second = new ArrayDeque<>();
        second.add(2);
        second.add(4);
        second.add(6);
        second.add(8);
        second.add(0);
        while (true) {
            if (score_first + score_second == 106) {
                System.out.println("botva");
                break;
            }
            else if (first.isEmpty() || second.isEmpty()) {
                break;
            }
            else {
                if (first.getLast() < second.getLast()) {
                    score_first++;
                    first.addFirst(first.pop());
                    first.addFirst(second.pop());
                } else {
                    score_second++;
                    second.addFirst(first.pop());
                    second.addFirst(second.pop());
                }
            }
        }
        if (score_first > score_second) {
            System.out.println("first " + score_first);
        } else {
            System.out.println("second " + score_second);
        }
    }
    public static void stack() {
        int score_first = 0;
        int score_second = 0;
        Stack<Integer> first = new Stack<>();
        first.push(1);
        first.push(3);
        first.push(5);
        first.push(7);
        first.push(9);
        Stack<Integer> second = new Stack<>();
        second.push(2);
        second.push(4);
        second.push(6);
        second.push(8);
        second.push(0);
        while (true) {
            if (score_first + score_second == 106) {
                System.out.println("botva");
                break;
            }
            else if (first.empty() || second.empty()) {
                break;
            }
            else {
                if (first.peek() < second.peek()) {
                    score_first++;
                    first.add(first.size() - 1, first.peek());
                    first.pop();
                    first.add(first.size() - 1, second.peek());
                    second.pop();
                } else {
                    score_second++;
                    second.add(second.size() - 1, first.peek());
                    first.pop();
                    second.add(second.size() - 1, second.peek());
                    second.pop();
                }
            }
        }
        if (score_first > score_second) {
            System.out.println("first " + score_first);
        } else {
            System.out.println("second " + score_second);
        }
    }
}
