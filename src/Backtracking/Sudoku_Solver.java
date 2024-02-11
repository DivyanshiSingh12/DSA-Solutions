package Backtracking;
public class Sudoku_Solver {

    public static boolean isSafe(int [][]sudoku, int row, int col, int digits){
        //Check in Column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digits){
                return false;
            }
        }

        //Check in Row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digits){
                return false;
            }
        }

        //Check in Grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digits){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
    // Base Case
    if (row == 9) {
        return true;
    }

    // Recursion
    int nextRow = row;
    int nextCol = col + 1;
    if (nextCol == 9) {
        nextRow = row + 1;
        nextCol = 0;
    }

    if (sudoku[row][col] != 0) {
        return sudokuSolver(sudoku, nextRow, nextCol);
    }

    for (int digit = 1; digit <= 9; digit++) {
        if (isSafe(sudoku, row, col, digit)) {
            sudoku[row][col] = digit;
            if (sudokuSolver(sudoku, nextRow, nextCol)) {
                return true;
            }
            sudoku[row][col] = 0;
        }
    }

    return false;
}


   public static void printArray(int arr[][]) {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

    public static void main(String args[]){
        int[][] sudoku = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,1,9,0,1,3}
        };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution Exists");
            printArray(sudoku);
        }else{
            System.out.println("Solution Does Not Exists");
        }
    }
    
}
