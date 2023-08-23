import java.util.*;
import java.util.LinkedList;
public class StackUsingQueue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        public void push(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
            else{
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
        }
        public int pop(){
            if(isEmpty()) return -1;
            if(!q1.isEmpty()){
                return q1.remove();
            }else{
                return q2.remove();
            }
        }
        public int peek(){
            if(isEmpty()) return -1;
            if(!q1.isEmpty()){
                return q1.peek();
            }else{
                return q2.peek();
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.pop());
        System.out.println(s.isEmpty()); 
    }
}
