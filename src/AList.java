import java.util.Arrays;

//generic
public class AList<T> {
    private T[] items;
    private int size;
    private int capacity = 10;

    public AList() {
        items = (T[]) new Object[capacity];
        size = 0;
    }

    public void addy(T item) {
        if (size == items.length) {
            resize();
        }
        items[size++] = item;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        for (int i = pos; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
        items[--size] = null;
    }

    private void resize() {
        items = Arrays.copyOf(items, items.length * 2);
    }

    @Override
    public String toString() {
        if (size == 0) return "Empty List";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(items[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
