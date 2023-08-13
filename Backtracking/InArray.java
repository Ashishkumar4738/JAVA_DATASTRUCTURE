public class InArray {

    public static void backTrackArray(int arr[], int value, int n) {
        if (n == arr.length) {
            printArray(arr);
            return;
        }
        arr[n] = value;
        backTrackArray(arr, value + 1, n + 1);
        arr[n] = arr[n] - 2;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backTrackArray(arr, 1, 0);
        printArray(arr);

    }
}