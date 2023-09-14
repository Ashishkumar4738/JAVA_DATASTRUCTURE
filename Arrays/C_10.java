
import java.util.*;
public class C_10 {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int width = 1;
        int maxLeft [] = new int[arr.length];
        maxLeft[0] = arr[0];
        int maxRight [] = new int[arr.length];
        maxRight[arr.length-1] = arr[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            if(maxLeft[i-1] > arr[i]){
                maxLeft[i] = maxLeft[i-1];
            }else{
                maxLeft[i] = arr[i];
            }
        }
        for (int i = arr.length-2; i >= 0 ; i--) {
            if(maxRight[i+1] > arr[i]){
                maxRight[i] = maxRight[i+1];
            }else{
                maxRight[i] = arr[i];
            }
        }
        int min = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(maxLeft[i],maxRight[i]);
            //System.out.println(min);
            total += (min - arr[i]) * width;
        }
        System.out.println("Total trapped water is "+total+" by default we choose width is 1 ");
        //printArray(maxRight);
        sc.close();
    }
}
