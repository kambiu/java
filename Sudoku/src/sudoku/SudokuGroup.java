package sudoku;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kambiu on 27/5/2017.
 */

public class SudokuGroup {

    // the 9 cells
    List<Cell> cells;
    String type;

    public SudokuGroup(String typeName) {
        cells = new ArrayList<Cell>();
        type = typeName;
    }

    protected void addCell(Cell cell) {
        this.cells.add(cell);
    }

    protected boolean isDuplicate() {
        for (int i=0; i< cells.size() - 1; i++) {
            for (int j=i+1; j< cells.size(); j++) {
                if (cells.get(i).equals(cells.get(j)))
                    return false;
            }
        }
        return true;
    }

}
