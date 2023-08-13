public class StackLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static class Stack{
        static Node head = null;

        //isEmpty
        public boolean isEmpty(){
            return (head==null);
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public int pop(){
            int data = head.data;
            head = head.next;
            return data;
        }

        //peek
        public int peek(){
            return head.data;
        }

        //print
        public void print(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        // System.out.println(s.isEmpty());
        // s.isEmpty();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println();
        System.out.println(s.peek());
        System.out.println();
        s.print();
    }
}
