package org.example.sudoku;

public class MainApp {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveBoard(sudoku)){
            System.out.println("Resolvido!");
        }else{
            System.out.println("Não resolvido!");
        }

        printBoard(sudoku);

    }

    private static void printBoard(int[][] sudoku) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                System.out.println(sudoku[row][column]);
            }
        }
        System.out.println();
    }

    private static boolean isNumberInRow(int[][] matriz, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (matriz[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] matriz, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (matriz[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] matriz, int number, int column, int row) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (matriz[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] matriz, int number, int row, int column) {
        return !isNumberInRow(matriz, number, row)
                && !isNumberInColumn(matriz, number, column)
                && !isNumberInBox(matriz, number, row, column);
    }

    private static boolean solveBoard(int[][] matriz) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (matriz[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if (isValidPlacement(matriz, numberToTry, row, column)) {
                            matriz[row][column] = numberToTry;

                            if(solveBoard(matriz)){
                                return true;
                            }else{
                                matriz[row][column] = 0;
                            }

                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

}




