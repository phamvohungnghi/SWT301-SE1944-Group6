import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class SudokuBoardTest {

    @Test
    public void testNullBoard() {
        assertFalse(JAVA_012_checkSudokuBoard.checkSudokuBoard(null));
    }

    @Test
    public void testInvalidBoardSize() {
        int[][] invalidBoard = new int[8][9];
        assertFalse(JAVA_012_checkSudokuBoard.checkSudokuBoard(invalidBoard));
        
        invalidBoard = new int[10][9];
        assertFalse(JAVA_012_checkSudokuBoard.checkSudokuBoard(invalidBoard));
    }

    @Test
    public void testValidBoard() {
        int[][] validBoard = {
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
        assertTrue(JAVA_012_checkSudokuBoard.checkSudokuBoard(validBoard));
    }

    @Test
    public void testDuplicateInRow() {
        int[][] boardWithDuplicateRow = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 5, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        assertFalse(JAVA_012_checkSudokuBoard.checkSudokuBoard(boardWithDuplicateRow));
    }

    @Test
    public void testDuplicateInColumn() {
        int[][] boardWithDuplicateColumn = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 5}
        };
        assertFalse(JAVA_012_checkSudokuBoard.checkSudokuBoard(boardWithDuplicateColumn));
    }

    @Test
    public void testInvalidNumberInBoard() {
        int[][] boardWithInvalidNumber = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 10, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        assertFalse(JAVA_012_checkSudokuBoard.checkSudokuBoard(boardWithInvalidNumber));
    }

    @Test
    public void testValidBoardWithZeros() {
        int[][] validBoardWithZeros = {
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
        assertTrue(JAVA_012_checkSudokuBoard.checkSudokuBoard(validBoardWithZeros));
    }
}