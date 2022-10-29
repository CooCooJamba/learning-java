import java.util.ArrayList;
import java.util.List;

public class UnfairWaitList<E> {
    private List<E> lst;
    public UnfairWaitList() {
        lst = new ArrayList<>();
    }
    public void remove(E element) {
        lst.remove(element);
    }
    public void addElement(E element) {
        lst.add(element);
    }

    public E getElement(int index) {
        return lst.get(index);
    }
    public void moveToBack(E element) {
        lst.set(lst.size() - 1, element);
    }
}
