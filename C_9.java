public class C_9 {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int arr1[] = {-1,-2,-3,-4};
        kadans(arr);

    }

    public static void kadans(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;

            }
            ms = Math.max(cs, ms);
        }
        if (ms > 0) {
            System.out.println("your maximun sum is " + ms);
        } else {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println("your maximun sum is " + max);
        }
    }
}
