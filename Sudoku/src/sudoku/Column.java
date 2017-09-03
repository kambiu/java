package sudoku;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kambiu on 6/5/2017.
 */
public class Column extends SudokuGroup{

    private int columnNumber;

    public Column(int colNum) {
        super(Column.class.getName());
        this.columnNumber = colNum;

    }

}
