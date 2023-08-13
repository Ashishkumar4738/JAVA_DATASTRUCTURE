public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node temp = head;
        System.out.print("null<->");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printUsingTail() {
        if (tail == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = tail;
        System.out.print("null<->");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.previous;
        }
        System.out.println("null");

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked is empty!");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.previous = null;
        // if(head!=null) head.previous = null;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Linked list is empty!");
            return;
        }
        if(tail.previous==null){
            head = tail = null;
            return;
        }
        tail = tail.previous;
        tail.next=null;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.deleteLast();
        dll.deleteLast();
        dll.print();
        dll.printUsingTail();
    }
}
