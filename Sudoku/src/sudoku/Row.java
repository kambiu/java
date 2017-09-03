package sudoku;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kambiu on 6/5/2017.
 */
public class Row extends SudokuGroup {

    private int rowNumber;

    public Row(int rowNum){
        super(Row.class.getName());
        this.rowNumber = rowNum;
    }

}
