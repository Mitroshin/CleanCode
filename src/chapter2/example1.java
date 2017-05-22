package chapter2;

import java.util.ArrayList;
import java.util.List;

public class example1 {
    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    private List<int[]> theList;
    private List<Cell> gameBoard;

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
