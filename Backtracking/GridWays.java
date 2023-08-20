public class GridWays {

    static int findWays(int arr[][],int row, int column, int n) {
        if(arr[row][column]==0){
            return 0;
        }
        else if (row == n - 1 || column == n - 1) {
            return 1;
        }

        int n1 = findWays(arr,row + 1, column, n);
        int n2 = findWays(arr,row, column + 1, n);
        return n1 + n2;

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 0 },
                { 1, 1, 0, },
                { 1, 1, 1 }
        };
        System.out.println(findWays(arr,0, 0, 3));
    }
}
