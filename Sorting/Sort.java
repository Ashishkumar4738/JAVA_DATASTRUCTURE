import java.util.*;

public class Sort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                System.out.println("no swap");
                break;
            }
            print(arr);
        }

    }

    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        print(arr);
    }

    public static void quickSort(int arr[], int st, int end) {
        if (st < end) {
            int index = quick(arr, st, end);
            quickSort(arr, st, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    public static int quick(int arr[], int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;
        System.out.println("piovt " + pivot);
        while (i < j) {
            while (i <= right - 1 && arr[i] <= pivot) {
                i++;
            }
            while (j >= left + 1 && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        print(arr);
        System.out.println("*********************************");
        return j;

    }

    public static void selectionSrot(int arr[], int n) {
        // in left side we have sorted array and we select the smallest elememt from
        // unsorted array and put it in sorted array
        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != -1) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        print(arr);
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=high) temp[k++] = arr[j++];
        for(k=0,i=low;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter array length");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elements");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        int arr[] = { 8, 7, 6, 5, 4, 3, 2, 1 };

        // quickSort(arr, 0, 7);
        // selectionSrot(arr, n);
        mergeSort(arr, 0, 7);
        print(arr);
    }
}
