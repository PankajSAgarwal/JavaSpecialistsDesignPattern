import java.util.AbstractList;
import java.util.Objects;

public class ReadOnlyArrayList<E> extends AbstractList<E> {

    private Object[] elements;

    public ReadOnlyArrayList(Object... elements) {

        this.elements = elements.clone();
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index,size());
        return (E)elements[index];
    }
}
