import java.util.Collection;

public class main {
    public static void main(String[] args) {
        BoundedWaitList bl = new BoundedWaitList<Integer>(10);
        for (int i = 0; i < 11; i++) {
            bl.addElement(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(bl.getElement(i));;
        }
        System.out.println();
        UnfairWaitList ul = new UnfairWaitList<Integer>();
        for (int i = 0; i < 11; i++) {
            ul.addElement(i);
        }
        ul.remove(9);
        ul.moveToBack(4);
        for (int i = 0; i < 10; i++) {
            System.out.println(ul.getElement(i));;
        }
        System.out.println();
        WaitList wl = new WaitList<Integer>();
        for (int i = 0; i < 11; i++) {
            bl.addElement(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(bl.getElement(i));;
        }
    }
}
