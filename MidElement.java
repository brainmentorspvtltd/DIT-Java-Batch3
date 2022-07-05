public class MidElement {

    
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(10);
        LinkedListOperations<Integer> l = new LinkedListOperations<Integer>();
        l.addAtEnd(node);
        l.addAtEnd(new Node<Integer>(20));
        l.addAtEnd(new Node<Integer>(120));
        l.addAtEnd(new Node<Integer>(30));
        l.addAtEnd(new Node<Integer>(220));
    }
}
