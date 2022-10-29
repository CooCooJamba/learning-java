import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    private List<E> lst;
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {

    }

    public WaitList(ConcurrentLinkedQueue<E> c) {
        this.content = c;
    }

    public ConcurrentLinkedQueue<E> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
    @Override
    public void addElement(E element) {
        lst.add(element);
    };
    @Override
    public E remove() {
        return lst.remove(0);
    };
    @Override
    public boolean containsElement(E element) {
        return lst.contains(element);
    };
    @Override
    public boolean containsAllElements(Collection<E> c) {
        return lst.containsAll(c);
    };
    @Override
    public boolean lstIsEmpty() {
        return lst.isEmpty();
    };
}
