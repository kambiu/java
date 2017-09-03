package sudoku;

import java.awt.*;
import java.util.List;

/**
 * Created by kambiu on 6/5/2017.
 */

public class Cell {

    public int value;
    public int x;
    public int y;

    private List<Integer> possibleNumbers;
    private List<Integer> confirmedNumbers;
    public Row row;
    public Column col;
    public Region reg;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getPossibleValues() {
        //TODO
    }

    public int getRowNumber(){ return this.x; }
    public int getColNumber(){ return this.y; }
    public Row getRow() { return this.row; }
    public Column getColumn() { return this.col; }
    public Region getRegion() { return this.reg; }

    protected boolean equals(Cell c){
        return this.value == c.value;
    }

}
