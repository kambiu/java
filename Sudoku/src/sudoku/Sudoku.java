package sudoku;

import java.util.ArrayList;
import java.util.List;


public class Sudoku {

    private List<Row> rows;
    private List<Column> cols;
    private List<Region> regs;
    private List<Cell> cells;

    public Sudoku() {
        getInitCells();
        getInitRows();
        getInitCols();
        getInitRegs();

    }
    /*
    Solve the sudoku.Sudoku puzzles
     */

    /**
     * Solve the sudoku
     *
     * @return      the number of results
     */
    public int solve() {
        //TODO
        return 0;
    }

    /*
    Input the predefined constraints
     */
    public void input(int[][] listInput) {
        for (int i=0; i< 9; i++) {
            for (int j=0; j< 9; j++) {
                Cell c = cells.get(9 * i + j);
                c.value = listInput[i][j];
            }
        }
    }

    public int[][] printResult() {
        //TODO
        return null;
    }

    public int[][] printAllResult() {
        //TODO
        return null;
    }

    public void printPuzzle() {
        System.out.println("--------------------");
        for (Cell c : this.cells){
            if (c.getColNumber() % 3 == 0) System.out.print("   ");

            System.out.print(c.value + " ");

            if (c.getColNumber() == 8) {
                System.out.println();
                if (c.getRowNumber() % 3 == 2) {
                    System.out.println();
                }
            }
        }
        System.out.println("--------------------");
    }

    private void getInitRows() {
        this.rows = new ArrayList<>();
        for (int i=0; i<9; i++) {
            Row row = new Row(i);
            for (Cell c : this.cells) {
                if (c.getRowNumber() == i){
                    row.addCell(c);
                    c.row = row;
                }
            }
        }
    }

    private void getInitCols() {
        this.cols = new ArrayList<>();
        for (int i=0; i<9; i++) {
            Column column = new Column(i);
            for (Cell c : this.cells) {
                if (c.getColNumber() == i){
                    column.addCell(c);
                    c.col = column;
                }
            }
        }
    }

    private void getInitRegs() {

        this.regs = new ArrayList<>();
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                Region region = new Region(i, j);
                for (Cell c : this.cells) {
                    if (c.getRowNumber() % 3 == i && c.getColNumber() % 3 == j) {
                        region.addCell(c);
                        c.reg = region;
                    }
                }
                this.regs.add(region);

            }
        }


    }

    private void getInitCells() {
        this.cells = new ArrayList<>();
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                Cell c = new Cell(i, j);
                cells.add(c);
            }
        }
    }
}
