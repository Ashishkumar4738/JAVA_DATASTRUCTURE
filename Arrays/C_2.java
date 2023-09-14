
//largest number
public class C_2 {
    public static void main(String[] args) {
        //find maximum number 
        int arr [] = {45,1,7,4,9,3,78};
        int max = 0;
        int i=0;

        for(i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        System.out.println("This is largest number of the array "+arr[max]);
        int largest = Integer.MAX_VALUE;
        System.out.println(largest);
        int smallest = Integer.MIN_VALUE;
        System.out.println(smallest);
    }
    
}
