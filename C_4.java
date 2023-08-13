//Reverse an array
public class C_4 {
    public static void main(String[] args) {
        //Reverse an array
        int arr[] = {1,2,3,4,5};
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
