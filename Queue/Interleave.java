import java.util.*;
import java.util.LinkedList;
public class Interleave {

    public static void solution(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        int size = q.size()/2;
        while(size>0){
            temp.add(q.remove());
            size--;
        }
        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }
        System.out.println(q);
    }
    public static void main(String[] args) {
        //input 1,2,3,4,5,6,7,8,9,10
        //output 1,6s,2,7,3,8,4,9,5,10
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        solution(q);
    }
}
