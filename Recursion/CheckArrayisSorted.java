public class CheckArrayisSorted {

    static boolean checkFunction(int arr[], int i) {
        if (i == arr.length-1) return true;
        if (arr[i] > arr[i + 1]) return false;

        return checkFunction(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,26};
        System.out.println(checkFunction(arr, 0));
    }
}
