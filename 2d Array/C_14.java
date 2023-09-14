public class C_14 {

    public static void diognalSum(int matrix[][]) {

        int sum = 0;
        /*
         * //It's time complexity is O(n^2).
         * for (int i = 0; i < matrix.length; i++) {
         * for (int j = 0; j < matrix[0].length; j++) {
         * if (i == j) {
         * sum += matrix[i][j];
         * } else if (i + j == matrix.length - 1 && i != j) {
         * sum += matrix[i][j];
         * }
         * }
         * }
         * System.out.println(sum);
         */

        // It's time complexity is O(n).
        for (int i = 0; i < matrix.length; i++) {
            // for primary diognal
            sum += matrix[i][i];

            // for secondary diognal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);

    }

    public static boolean searchElement(int matrix[][], int key) {
        // search in 2d array when array is sorted
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("your number is found at index " + row + "," + col);
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            } else if (matrix[row][col] < key) {
                row++;
            }

        }
        System.out.println("Your element is not present in this 2d array");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 } };
        int key = 10;
        // diognalSum(matrix);
        boolean result = searchElement(matrix, key);
        System.out.println(result);
    }
}
