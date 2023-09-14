//Spiral matrix of a given 2d array
public class C_13 {

    public static void spiral(int arr[][]) {

        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // upper
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startCol][i] + " ");
            }

            // right
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol] + " ");
            }
            // bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endCol][i] + " ");
            }

            // left
            for (int j = endRow - 1; j > startRow; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[j][startRow] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println("");

    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                {13, 14, 15, 16} };
        spiral(arr);

    }
}
