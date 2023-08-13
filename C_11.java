public class C_11 {
    public static void bubbleSort(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // printArray(arr);
                    swap++;
                }
                // System.out.println("");
                // printArray(arr);
                // System.out.println("");
            }
            if (swap == 0) {
                System.out.println("array is already sorted");
                break;
            }
        }
        System.out.println("swap count is " + swap);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5,4,3,2,1 };
        int arr1[] = { 1, 2, 3, 4, 5 };
        //bubbleSort(arr);
        selectionSort(arr1);
        insertionSort(arr);
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        printArray(arr);
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int previous = i-1;
            System.out.println("/////////////////////////");
            while(previous >= 0 && key < arr[previous]){
                //int temp = arr[key];
                arr[previous + 1] = arr[previous];
                //arr[previous] = temp;
                previous--;
                printArray(arr);
                System.out.println(" ");
                
            }
            arr[previous +1] = key;
            printArray(arr);
            System.out.println(" ");

        }
        //printArray(arr);
    }

}
