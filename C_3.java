//Binary search
import java.util.*;
public class C_3 {
    public static void main(String[] args) {
        // Binary search 
        int arr [] = {3,4,7,9,12,34,56,78,98,123};
        int start = 0;
        int end = arr.length -1;
        System.out.println("Enter a number that you want to search");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==num){
                System.out.println("Your number is present at index "+mid);
                break;
            }
            else if(arr[mid]>num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            if(start > end){
                System.out.println("Your number is not present in the array");
            }
        }
    }
}
