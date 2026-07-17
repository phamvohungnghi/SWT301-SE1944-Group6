import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class JAVA_023_dateDifferenceTest {
    @Test void rejectsMissingAndMalformedDates() { assertEquals(-1,JavaAlgorithms.dateDifference(null,"2024-01-01")); assertEquals(-1,JavaAlgorithms.dateDifference("bad","2024-01-01")); assertEquals(-1,JavaAlgorithms.dateDifference("2024-xx-01","2024-01-01")); }
    @Test void computesAbsoluteDifferences() { assertEquals(0,JavaAlgorithms.dateDifference("2024-01-01","2024-01-01")); assertEquals(1,JavaAlgorithms.dateDifference("2024-02-28","2024-02-29")); assertEquals(10,JavaAlgorithms.dateDifference("2024-01-01","2024-01-11")); }
}
