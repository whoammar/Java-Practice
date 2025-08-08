public class MyLinkedList<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> temp = new Node<>(data);
        if (head == null) {
            head = temp;
        } else {
            Node<T> current = head;
            while (current.getLink() != null) {
                current = current.getLink();
            }
            current.setLink(temp);
        }
    }
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getLink();
        }
    }
}