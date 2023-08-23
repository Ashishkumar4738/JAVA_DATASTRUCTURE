import java.util.*;
public class QueueUsingJSF {
    static class Queue{
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();
        public boolean isEmpty(){
            return st1.isEmpty()&&st2.isEmpty();
        }
        //here we add data in st1 so we need to remove all elements from st1 to st2
        public void add(int data){
            while(!st1.isEmpty()){
                st2.push(st1.pop()) ;
            }
            st1.push(data);
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        public int remove(){
            if(st1.isEmpty()){
                System.out.println("Queue is empty.......");
                return -1;
            }
            return st1.pop();
        }
        public int peek(){
            if(st1.isEmpty()){
                System.out.println("Queue is empty.......");
                return -1;
            }
            return st1.peek();
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        
        // while(!q.st1.isEmpty()){
        //     System.out.println(q.st1.pop());
        // }
        

    }
}
