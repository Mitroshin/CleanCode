package chapter2;

public class Cell {
    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    private int[] cellArray;

    public Cell(int[] cellArray) {
        this.cellArray = cellArray;
    }

    public boolean isFlagged() {
        return cellArray[STATUS_VALUE] == FLAGGED;
    }
}
