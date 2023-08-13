public class LastOccurence {

    static int checkLastOccurence(int arr[],int i,int n){
        if(i==0) return -1;
        if(arr[i]==n) return i;
        int index = checkLastOccurence(arr, i-1, n);
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5,5,5};
        System.out.println(checkLastOccurence(arr, arr.length-1, 0));
        
    }
}
