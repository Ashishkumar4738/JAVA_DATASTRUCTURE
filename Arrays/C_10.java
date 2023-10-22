
import java.util.*;

public class C_10 {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array");
        // int size = sc.nextInt();
        int arr[] = {3,5,1,2,9,5,10,10,8,4,9,9};

        System.out.println("Enter array elements ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int width = 1;
        int maxLeft[] = new int[arr.length];
        maxLeft[0] = arr[0];
        int maxRight[] = new int[arr.length];
        maxRight[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            if (maxLeft[i - 1] > arr[i]) {
                maxLeft[i] = maxLeft[i - 1];
            } else {
                maxLeft[i] = arr[i];
            }
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            if (maxRight[i + 1] > arr[i]) {
                maxRight[i] = maxRight[i + 1];
            } else {
                maxRight[i] = arr[i];
            }
        }
        print(maxRight);
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(maxLeft[i], maxRight[i]);
            // System.out.println(min);
            width = maxRight[i]-maxLeft[i];
            int value = min*width;

			max = Math.max(max,value);
        }
        System.out.println("Total trapped water is " + max + " by default we choose width is 1 ");
        // printArray(maxRight);
        sc.close();
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

            
        }
        System.out.println();
    }
}
