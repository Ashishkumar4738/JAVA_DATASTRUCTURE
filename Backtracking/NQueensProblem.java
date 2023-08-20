public class NQueensProblem {

    static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static void nQueens(char board[][], int row) {
        if (row == board.length) {

            printArray(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }

    static boolean nQueensPrintOnlyOneSolution(char board[][], int row) {
        if (row == board.length) {

            //printArray(board);
            count++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueensPrintOnlyOneSolution(board, row+1)) {
                    nQueensPrintOnlyOneSolution(board, row + 1);
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }

    static void printArray(char arr[][]) {
        System.out.println("-------------Possible solutions--------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }
         if(nQueensPrintOnlyOneSolution(board, 0)){
            System.out.println("Solution exist");
            printArray(board);
         }else{
            System.out.println("Solution does not exist");
         }

        System.out.println("Total possible solution to put queens in " + n + "X" + n + " matrix is " + count);
    }
}
