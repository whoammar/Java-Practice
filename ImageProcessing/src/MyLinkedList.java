public class MyLinkedList<T> {

    private Node<T> head;

    public void add(T data) {
        Node<T> temp = new Node<T>(data, null);

        if (head == null) {
            head = temp;
        } else {
            Node<T> current = head;

            while (current.link != null) {
                current = current.link;
            }

            current.link = temp;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node<T> current = head;

            while (current != null) {
                System.out.println(current.data);
                current = current.link;
            }
        }
    }
}
