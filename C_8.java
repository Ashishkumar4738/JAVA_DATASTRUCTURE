class C_8{
    public static void main(String[] args) {
        int result = 0;
        int max = 0;
        int arr[] = {1,-2,6,-1,3};
        int prefix[] = new int[arr.length];
        //Calculate prefix array
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        printArray(prefix);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                result =0;
                //System.out.print(" ( ");
                result = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                
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

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}