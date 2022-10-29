import java.util.Collection;

interface IWaitList <E> {
    public void addElement(E element);
    public E remove();
    public boolean containsElement(E element);
    public boolean containsAllElements(Collection<E> c);
    public boolean lstIsEmpty();
}
