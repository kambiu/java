package main;
import sudoku.*;

/**
 * Created by kambiu on 27/5/2017.
 */
public class Start {

    public static void main(String[] args) {

        System.out.println("Program main.Start");

        Sudoku s = new Sudoku();
        s.printPuzzle();
        //TODO input
        int[][] puzzle = new int[][] {
            {5, 7, 0,   0, 0, 6,   2, 0, 0},
            {1, 0, 8,   0, 4, 0,   0, 0, 0},
            {0, 4, 0,   0, 3, 2,   1, 0, 7},

            {0, 0, 5,   0, 0, 0,   0, 0, 0},
            {0, 0, 0,   3, 0, 8,   0, 1, 5},
            {7, 0, 0,   0, 0, 1,   0, 2, 0},

            {0, 0, 0,   9, 0, 4,   0, 7, 0},
            {2, 0, 7,   0, 0, 0,   0, 0, 0},
            {0, 6, 9,   0, 0, 7,   8, 0, 1},
        };

        s.input(puzzle);
        s.printPuzzle();
        int numberSolution = s.solve();

        System.out.println("Number of solution: " + numberSolution);


    }
}
