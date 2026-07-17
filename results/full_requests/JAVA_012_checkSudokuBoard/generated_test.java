import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_012_checkSudokuBoardTest {
    @Test void rejectsWrongShape() { assertFalse(JavaAlgorithms.checkSudokuBoard(null)); assertFalse(JavaAlgorithms.checkSudokuBoard(new int[8][9])); }
    @Test void acceptsEmptyBoard() { assertTrue(JavaAlgorithms.checkSudokuBoard(new int[9][9])); }
    @Test void rejectsDuplicatesAndOutOfRange() { int[][] row=new int[9][9]; row[0][0]=1; row[0][1]=1; assertFalse(JavaAlgorithms.checkSudokuBoard(row)); int[][] col=new int[9][9]; col[0][0]=2; col[1][0]=2; assertFalse(JavaAlgorithms.checkSudokuBoard(col)); int[][] bad=new int[9][9]; bad[0][0]=10; assertFalse(JavaAlgorithms.checkSudokuBoard(bad)); }
}
