import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int arr[] = {8,6,0,4,9};
        Stack<Integer> s = new Stack<>();
        int answer[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()) answer[i] = -1;
            else answer[i] = arr[s.peek()];

            s.push(i);
        }
        print(answer);
    }
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");   
        }
    }
}
