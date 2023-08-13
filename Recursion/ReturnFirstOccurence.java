public class ReturnFirstOccurence {

    static int firstOccurence(int arr[],int i,int n){
        if(i==arr.length-1) return -1;
        if(arr[i] == n) return i;
        int result = firstOccurence(arr, i+1, n);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,4};
        System.out.println(firstOccurence(arr, 0, 4));
    }
}
