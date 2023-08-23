import java.util.*;
import java.util.LinkedList;
public class DequeClass {
    //Stack using Deque
    static class Stack{
        static Deque<Integer> de = new LinkedList<>();
        public boolean isEmpty(){
            return de.isEmpty();
        }
        public void push(int data){
            de.addFirst(data);
        }
        public int pop(){
            return de.removeFirst();
        }
        public int peek(){
            return de.getFirst();
        }
        public void print(){
            System.out.println(de);
        }
    }

    //Queue using Deque
    static class Queue{
        static Deque<Integer> de = new LinkedList<>();
        public boolean isEmpty(){
            return de.isEmpty();
        }
        public void add(int data){
            de.addLast(data);
        }
        public int remove(){
            return de.removeFirst();
        }
        public int peek(){
            return de.getFirst();
        }
        public void print(){
            System.out.println(de);
        }
    }
    public static void main(String[] args) {
    //    Stack s = new Stack();
    //    s.push(1);
    //    s.push(2);
    //    s.push(3);
    //    s.push(4);
    //    s.pop();
    //    s.print();
    //    System.out.println(s.isEmpty());
    //    System.out.println(s.peek());
    //Queue
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        q.print();
    }
}
