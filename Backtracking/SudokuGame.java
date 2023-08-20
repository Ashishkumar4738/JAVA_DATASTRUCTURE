public class SudokuGame {

    static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // check for row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // check for col
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // check for 3*3 matrix
        int checkRow = (row / 3)*3;
        int checkCol = (col / 3)*3;
        for (int i = checkRow; i < checkRow + 3; i++) {
            for (int j = checkCol; j < checkCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean gameLogic(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // main recursion logic
        // reset row and column
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // put digit if there is 0
        if (sudoku[row][col] != 0) {
            return gameLogic(sudoku, nextRow, nextCol);
        }

        // put values from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                
                if (gameLogic(sudoku, nextRow, nextCol)) {
                    
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;

    }

    static void print(int sudoku[][]) {
        System.out.println("-------------Solution-------------------");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if(gameLogic(sudoku, 0, 0)){
            System.out.println("Solution exist....");
            print(sudoku);
        }else{
            System.out.println("Solution does not exist.....");
        }
    }
}
