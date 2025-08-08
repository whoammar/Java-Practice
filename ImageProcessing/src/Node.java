public class Node <T>{
   T data;
   Node <T> link;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    public Node(T data, Node<T> link) {
        this.data = data;
        this.link = link;
    }
}