import java.util.*;
public class FindSubsequenceInArray {

    static void solve(int arr[],ArrayList<Integer> list,int size){

        if(size == arr.length){
            // if(list.size()==3)
            System.out.println(list);
            return;
        }
        list.add(arr[size]);
        solve(arr, list, size+1);
        list.remove(list.size()-1);
        solve(arr, list, size+1);
    }
    public static void main(String[] args) {
        int arr[] ={3,1,2,9,4};
        ArrayList<Integer> list = new ArrayList<>();
        solve(arr, list, 0);
    }
}
