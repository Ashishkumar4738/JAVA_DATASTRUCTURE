//print subarray sum

public class C_7 {

    public static void main(String[] args) {
        int result = 0;
        int max = 0;
        int arr[] = {1,-2,6,-1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                result =0;
                //System.out.print(" ( ");
                for(int k=i;k<=j;k++){
                    result += arr[k];
                    //System.out.print(arr[k]+" ");
                }
                if(result>max){
                    max = result;
                }
                System.out.print(" "+result+" ");
              // System.out.print(") ");
            }
            System.out.println(" ");
        }
        System.out.println("So maximum of the subarray is "+max);
    }
}
