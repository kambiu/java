package sudoku;


/**
 * Created by kambiu on 6/5/2017.
 */
public class Region extends SudokuGroup{

    private int regionNumber;
    private int regionRowNumber;
    private int regionColumnNumber;

    public Region(int regRowNumber, int regColNumber){
        super(Region.class.getName());
        this.regionRowNumber = regRowNumber;
        this.regionColumnNumber = regColNumber;
        this.regionNumber = regRowNumber * 3 + regColNumber + 1;
    }


}
