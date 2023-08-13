import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        int arr[] = { 100, 80, 60, 75, 60, 85, 100 };
        int span[] = new int[arr.length];
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int preHigh = s.peek();
                span[i] = i - preHigh;
            }
            s.push(i);
        }
        print(span);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
