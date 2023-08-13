import java.util.*;

public class StackB {

    public static class Stack{
        
            static ArrayList<Integer> list = new ArrayList<>();

            public boolean isEmpty(){
                return (list.size()==0);
            }

            //push
            public void push(int data){
                list.add(data);
            }

            //pop
            public int pop(){
                if(list.size()==0){
                    System.out.println("List is empty!");
                    return -1;
                }
                int lastItem = list.get(list.size()-1);
                list.remove(list.size()-1);
                return lastItem;
            }

            //peek
            public int peek(){
                return list.get(list.size()-1);
            }

            //print
            public void print(){
                if(list.size()==0){
                    System.out.println("List is empty!");
                }
                for(int i = list.size()-1;i>=0;i--){
                    System.out.println(list.get(i));
                }
            }
            
        
       
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.print();
        s.pop();
        s.pop();
        s.print();
        System.out.println(s.isEmpty());

        
    }
}
