public class MaxRanctangle {

    static void solution(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int left = i;
            int right = i;
            int area = 0;
            int width = 1;
            // for left side
            left--;
            while (left >= 0) {
                if (arr[left] >= arr[i]) {
                    width++;
                    left--;
                } else
                    break;
            }
            right++;
            while (right < arr.length) {
                if (arr[right] >= arr[i]) {
                    width++;
                    right++;
                } else
                    break;
            }
            area = arr[i] * width;
            System.out.print(area + " ");
            max = Math.max(area, max);
            
        }
        System.out.println();
        System.out.println("Max area is "+max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        solution(arr);

    }
}
