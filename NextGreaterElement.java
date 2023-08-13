import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int next[] = new int[arr.length];
        next[arr.length-1] = -1;
        Stack<Integer> s = new Stack<>();
        s.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            int current = arr[i];
            while(!s.isEmpty()&&s.peek()<current){
                s.pop();
            }if(s.isEmpty()){
                next[i] = -1;
            }else{
                next[i]=s.peek();
            }
            s.push(current);
        }
        print(next);
    }
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
