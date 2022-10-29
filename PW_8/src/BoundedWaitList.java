import java.util.ArrayList;
import java.util.List;

public class BoundedWaitList<E> {
    private int capacity;
    private int size = 0;
    private List<E> lst;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
        lst = new ArrayList<>(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void addElement(E element) {
        if (capacity >= size) {
            lst.add(element);
            size++;
        }
    }

    public E getElement(int index) {
        return lst.get(index);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
