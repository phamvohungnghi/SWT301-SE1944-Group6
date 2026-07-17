import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression4 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2001");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2002");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2003");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2004");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2005");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2006");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2007");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2008");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2009");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2010");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2011");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2012");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2013");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2014");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2015");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2016");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 0, 0);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2017");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2018");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2019");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2020");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2021");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2022");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2023");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2024");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2025");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2026");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        java.lang.Class<?> wildcardClass46 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2027");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2028");
        int[][] intArray0 = null;
        int int3 = JavaAlgorithms.dijkstra(intArray0, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2029");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2030");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass40 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2031");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2032");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2033");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2034");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2035");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2036");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2037");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2038");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2039");
        int[][] intArray0 = null;
        int int3 = JavaAlgorithms.dijkstra(intArray0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2040");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2041");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2042");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2043");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2044");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 0, 0);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2045");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2046");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2047");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2048");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2049");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2050");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2051");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2052");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass46 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2053");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2054");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass46 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2055");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2056");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2057");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2058");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2059");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2060");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2061");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2062");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2063");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2064");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2065");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass37 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2066");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2067");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2068");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2069");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2070");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2071");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2072");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2073");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2074");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2075");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2076");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2077");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2078");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        int int4 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        int int7 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = JavaAlgorithms.dijkstra(intArray1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2079");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2080");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2081");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray5 = new int[] { ' ', (byte) 10 };
        int[] intArray8 = new int[] { ' ', (byte) 10 };
        int[] intArray11 = new int[] { ' ', (byte) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        int int15 = JavaAlgorithms.dijkstra(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = JavaAlgorithms.dijkstra(intArray12, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2082");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2083");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (short) 1);
        int int35 = JavaAlgorithms.dijkstra(intArray20, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = JavaAlgorithms.dijkstra(intArray20, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2084");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2085");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 1);
        int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass49 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2086");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray5 = new int[] { ' ', (byte) 10 };
        int[] intArray8 = new int[] { ' ', (byte) 10 };
        int[] intArray11 = new int[] { ' ', (byte) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        int int15 = JavaAlgorithms.dijkstra(intArray12, 0, (int) (byte) 0);
        int int18 = JavaAlgorithms.dijkstra(intArray12, 0, 0);
        int int21 = JavaAlgorithms.dijkstra(intArray12, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = JavaAlgorithms.dijkstra(intArray12, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2087");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2088");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2089");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2090");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2091");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2092");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 0, 0);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2093");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2094");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2095");
        int[][] intArray0 = null;
        int int3 = JavaAlgorithms.dijkstra(intArray0, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2096");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2097");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2098");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2099");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2100");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2101");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2102");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2103");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2104");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        int int4 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        int int7 = JavaAlgorithms.dijkstra(intArray1, (int) (byte) 0, 0);
        int int10 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (short) 0);
        int int13 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = JavaAlgorithms.dijkstra(intArray1, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2105");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2106");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2107");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2108");
        int[][] intArray0 = null;
        int int3 = JavaAlgorithms.dijkstra(intArray0, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2109");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2110");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 0, 0);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        int int35 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = JavaAlgorithms.dijkstra(intArray20, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2111");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray5 = new int[] { ' ', (byte) 10 };
        int[] intArray8 = new int[] { ' ', (byte) 10 };
        int[] intArray11 = new int[] { ' ', (byte) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        int int15 = JavaAlgorithms.dijkstra(intArray12, 0, (int) (byte) 0);
        int int18 = JavaAlgorithms.dijkstra(intArray12, 0, 0);
        int int21 = JavaAlgorithms.dijkstra(intArray12, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = JavaAlgorithms.dijkstra(intArray12, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2112");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2113");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2114");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2115");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 0, 0);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2116");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2117");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray5 = new int[] { ' ', (byte) 10 };
        int[] intArray8 = new int[] { ' ', (byte) 10 };
        int[] intArray11 = new int[] { ' ', (byte) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        int int15 = JavaAlgorithms.dijkstra(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = JavaAlgorithms.dijkstra(intArray12, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2118");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2119");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2120");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2121");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2122");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass46 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2123");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2124");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2125");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2126");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2127");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2128");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2129");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        int int4 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        int int7 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        int int10 = JavaAlgorithms.dijkstra(intArray1, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = JavaAlgorithms.dijkstra(intArray1, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2130");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2131");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = JavaAlgorithms.dijkstra(intArray20, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2132");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2133");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2134");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2135");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2136");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2137");
        int[][] intArray0 = null;
        int int3 = JavaAlgorithms.dijkstra(intArray0, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2138");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2139");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2140");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2141");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 1);
        int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = JavaAlgorithms.dijkstra(intArray18, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2142");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2143");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2144");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2145");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2146");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2147");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        int int4 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = JavaAlgorithms.dijkstra(intArray1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2148");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2149");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2150");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 0, 0);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, 1, (int) (short) 1);
        int int35 = JavaAlgorithms.dijkstra(intArray20, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2151");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = JavaAlgorithms.dijkstra(intArray20, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2152");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2153");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int48 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass49 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2154");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2155");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = JavaAlgorithms.dijkstra(intArray18, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2156");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2157");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2158");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2159");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2160");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2161");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2162");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 0, 0);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        int int35 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2163");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2164");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2165");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2166");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2167");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2168");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2169");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2170");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        int int4 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        int int7 = JavaAlgorithms.dijkstra(intArray1, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = JavaAlgorithms.dijkstra(intArray1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2171");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2172");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2173");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2174");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2175");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2176");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2177");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        int int4 = JavaAlgorithms.dijkstra(intArray1, 0, (int) (byte) 0);
        int int7 = JavaAlgorithms.dijkstra(intArray1, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = JavaAlgorithms.dijkstra(intArray1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2178");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2179");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2180");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2181");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2182");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2183");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2184");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2185");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2186");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2187");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2188");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2189");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2190");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2191");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2192");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass49 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2193");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2194");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2195");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2196");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2197");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray5 = new int[] { ' ', (byte) 10 };
        int[] intArray8 = new int[] { ' ', (byte) 10 };
        int[] intArray11 = new int[] { ' ', (byte) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        int int15 = JavaAlgorithms.dijkstra(intArray12, 0, (int) (byte) 0);
        int int18 = JavaAlgorithms.dijkstra(intArray12, 0, 0);
        int int21 = JavaAlgorithms.dijkstra(intArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = JavaAlgorithms.dijkstra(intArray12, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2198");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2199");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2200");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2201");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2202");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int48 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = JavaAlgorithms.dijkstra(intArray18, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2203");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2204");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2205");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2206");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2207");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2208");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2209");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2210");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2211");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = JavaAlgorithms.dijkstra(intArray20, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2212");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2213");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2214");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2215");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2216");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2217");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int39 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (short) 0);
        int int42 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 0);
        int int48 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2218");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 1, 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2219");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2220");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2221");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 1, (int) (byte) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, (int) (short) 1, (int) (byte) 1);
        int int33 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = JavaAlgorithms.dijkstra(intArray18, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2222");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 0, (int) (short) 1);
        int int30 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 0);
        int int33 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int36 = JavaAlgorithms.dijkstra(intArray18, 0, 1);
        int int39 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (short) 1);
        int int42 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (short) 1);
        int int45 = JavaAlgorithms.dijkstra(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = JavaAlgorithms.dijkstra(intArray18, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2223");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray19 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        int int23 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int26 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, 1);
        int int29 = JavaAlgorithms.dijkstra(intArray20, (int) (short) 1, (int) (byte) 1);
        int int32 = JavaAlgorithms.dijkstra(intArray20, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = JavaAlgorithms.dijkstra(intArray20, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), (-1), 1 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2224");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray17 = new int[] { '#', (short) 100, (byte) 10, '4', (byte) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        int int21 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        int int24 = JavaAlgorithms.dijkstra(intArray18, 0, 0);
        int int27 = JavaAlgorithms.dijkstra(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = JavaAlgorithms.dijkstra(intArray18, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 100, 10, 52, 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }
}

