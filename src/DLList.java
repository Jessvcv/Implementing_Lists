//generic
public class DLList<T> {
    private DLNode<T> head;

    public DLList() {
        this.head = null;
    }

    public void addy(T data) {
        DLNode<T> newNode = new DLNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            DLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) return;
        DLNode<T> temp = head;
        for (int i = 0; temp != null && i < pos; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    @Override
    public String toString() {
        if (head == null) return "Empty List";
        StringBuilder sb = new StringBuilder();
        DLNode<T> temp = head;
        while (temp != null) {
            sb.append(temp.data.toString()).append("\n");
            temp = temp.next;
        }
        return sb.toString().trim();
    }
}