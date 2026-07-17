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
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int21 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2002");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int21 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2003");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 0);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int27 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int29 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int31 = JavaAlgorithms.binarySearch(intArray3, 100);
        java.lang.Class<?> wildcardClass32 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2004");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 1);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) '4');
        int int14 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int16 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 1);
        int int18 = JavaAlgorithms.binarySearch(intArray2, (int) '#');
        int int20 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 10);
        int int22 = JavaAlgorithms.binarySearch(intArray2, 1);
        int int24 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2005");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2006");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) -1);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) 'a');
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) '#');
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 0);
        int int16 = JavaAlgorithms.binarySearch(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2007");
        int[] intArray2 = new int[] { (short) 0, 2 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 10);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2008");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int21 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2009");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int27 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int29 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2010");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2011");
        int[] intArray6 = new int[] { 100, ' ', (short) 10, (-1), (-1), '#' };
        int int8 = JavaAlgorithms.binarySearch(intArray6, 1);
        int int10 = JavaAlgorithms.binarySearch(intArray6, (int) 'a');
        int int12 = JavaAlgorithms.binarySearch(intArray6, (int) (byte) -1);
        int int14 = JavaAlgorithms.binarySearch(intArray6, (int) ' ');
        int int16 = JavaAlgorithms.binarySearch(intArray6, 0);
        int int18 = JavaAlgorithms.binarySearch(intArray6, (int) (short) 100);
        int int20 = JavaAlgorithms.binarySearch(intArray6, 100);
        int int22 = JavaAlgorithms.binarySearch(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 32, 10, (-1), (-1), 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2012");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int21 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2013");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int7 = JavaAlgorithms.binarySearch(intArray1, 10);
        int int9 = JavaAlgorithms.binarySearch(intArray1, (-1));
        int int11 = JavaAlgorithms.binarySearch(intArray1, (int) '#');
        int int13 = JavaAlgorithms.binarySearch(intArray1, 10);
        int int15 = JavaAlgorithms.binarySearch(intArray1, 0);
        int int17 = JavaAlgorithms.binarySearch(intArray1, 100);
        int int19 = JavaAlgorithms.binarySearch(intArray1, 2);
        int int21 = JavaAlgorithms.binarySearch(intArray1, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2014");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2015");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2016");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int8 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int14 = JavaAlgorithms.binarySearch(intArray2, 5);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2017");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) '4');
        int int14 = JavaAlgorithms.binarySearch(intArray2, 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2018");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) -1);
        int int16 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int18 = JavaAlgorithms.binarySearch(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2019");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) ' ');
        int int23 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int27 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2020");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int27 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int29 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2021");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2022");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (-1));
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) ' ');
        int int15 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) ' ');
        int int19 = JavaAlgorithms.binarySearch(intArray3, 2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2023");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int7 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 10);
        int int9 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray1, 0);
        int int13 = JavaAlgorithms.binarySearch(intArray1, (-1));
        int int15 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2024");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2025");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 100);
        int int7 = JavaAlgorithms.binarySearch(intArray1, 2);
        int int9 = JavaAlgorithms.binarySearch(intArray1, (int) (short) -1);
        int int11 = JavaAlgorithms.binarySearch(intArray1, (int) 'a');
        int int13 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 0);
        int int15 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2026");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2027");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int17 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2028");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int7 = JavaAlgorithms.binarySearch(intArray1, (int) 'a');
        int int9 = JavaAlgorithms.binarySearch(intArray1, 10);
        int int11 = JavaAlgorithms.binarySearch(intArray1, (int) 'a');
        int int13 = JavaAlgorithms.binarySearch(intArray1, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2029");
        int[] intArray6 = new int[] { 100, ' ', (short) 10, (-1), (-1), '#' };
        int int8 = JavaAlgorithms.binarySearch(intArray6, 1);
        int int10 = JavaAlgorithms.binarySearch(intArray6, (int) 'a');
        int int12 = JavaAlgorithms.binarySearch(intArray6, 2);
        int int14 = JavaAlgorithms.binarySearch(intArray6, 0);
        int int16 = JavaAlgorithms.binarySearch(intArray6, (int) (short) 1);
        int int18 = JavaAlgorithms.binarySearch(intArray6, 5);
        int int20 = JavaAlgorithms.binarySearch(intArray6, 1);
        int int22 = JavaAlgorithms.binarySearch(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 32, 10, (-1), (-1), 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2030");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int7 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) -1);
        int int9 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 10);
        int int13 = JavaAlgorithms.binarySearch(intArray1, 0);
        int int15 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 0);
        int int17 = JavaAlgorithms.binarySearch(intArray1, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2031");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2032");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) -1);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 1);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 1);
        int int16 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int18 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 0);
        int int20 = JavaAlgorithms.binarySearch(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2033");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) '4');
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 1);
        int int16 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 1);
        int int18 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int20 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int22 = JavaAlgorithms.binarySearch(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2034");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2035");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int25 = JavaAlgorithms.binarySearch(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2036");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 10);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) -1);
        int int16 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 0);
        int int18 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int20 = JavaAlgorithms.binarySearch(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2037");
        int[] intArray6 = new int[] { 100, ' ', (short) 10, (-1), (-1), '#' };
        int int8 = JavaAlgorithms.binarySearch(intArray6, 1);
        int int10 = JavaAlgorithms.binarySearch(intArray6, (int) (short) -1);
        int int12 = JavaAlgorithms.binarySearch(intArray6, (int) (byte) 1);
        int int14 = JavaAlgorithms.binarySearch(intArray6, 100);
        int int16 = JavaAlgorithms.binarySearch(intArray6, (int) (short) 0);
        int int18 = JavaAlgorithms.binarySearch(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 32, 10, (-1), (-1), 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2038");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (-1));
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) ' ');
        int int15 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2039");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2040");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2041");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int23 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2042");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int8 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 10);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2043");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2044");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int25 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int27 = JavaAlgorithms.binarySearch(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2045");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, 0);
        int int7 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int9 = JavaAlgorithms.binarySearch(intArray1, (int) '#');
        int int11 = JavaAlgorithms.binarySearch(intArray1, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2046");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 1);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) '4');
        int int14 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int16 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 1);
        int int18 = JavaAlgorithms.binarySearch(intArray2, (int) '#');
        int int20 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int22 = JavaAlgorithms.binarySearch(intArray2, 2);
        int int24 = JavaAlgorithms.binarySearch(intArray2, 5);
        int int26 = JavaAlgorithms.binarySearch(intArray2, 1);
        int int28 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2047");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int14 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int16 = JavaAlgorithms.binarySearch(intArray2, 100);
        int int18 = JavaAlgorithms.binarySearch(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2048");
        int[] intArray6 = new int[] { 100, ' ', (short) 10, (-1), (-1), '#' };
        int int8 = JavaAlgorithms.binarySearch(intArray6, 1);
        int int10 = JavaAlgorithms.binarySearch(intArray6, (int) 'a');
        int int12 = JavaAlgorithms.binarySearch(intArray6, 10);
        int int14 = JavaAlgorithms.binarySearch(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 32, 10, (-1), (-1), 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2049");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (-1));
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2050");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2051");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int7 = JavaAlgorithms.binarySearch(intArray1, 1);
        int int9 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray1, 1);
        int int13 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2052");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2053");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (-1));
        int int13 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2054");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 0);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2055");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 0);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int27 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int29 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int31 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int33 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int35 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int37 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass38 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2056");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int13 = JavaAlgorithms.binarySearch(intArray3, 5);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 5);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2057");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int12 = JavaAlgorithms.binarySearch(intArray2, 2);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int16 = JavaAlgorithms.binarySearch(intArray2, 1);
        int int18 = JavaAlgorithms.binarySearch(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2058");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int23 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int25 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int27 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2059");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 0);
        int int8 = JavaAlgorithms.binarySearch(intArray2, (int) '#');
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 0);
        int int12 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 0);
        int int16 = JavaAlgorithms.binarySearch(intArray2, (-1));
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2060");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (-1));
        int int7 = JavaAlgorithms.binarySearch(intArray1, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray1, 1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2061");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int25 = JavaAlgorithms.binarySearch(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2062");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2063");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 0);
        int int8 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 10);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) 'a');
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2064");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int21 = JavaAlgorithms.binarySearch(intArray3, 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2065");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        int int19 = JavaAlgorithms.binarySearch(intArray3, (-1));
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2066");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int14 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int16 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 100);
        int int18 = JavaAlgorithms.binarySearch(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2067");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int8 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int16 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 100);
        int int18 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2068");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 0);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (-1));
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int25 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int27 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int29 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int31 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass32 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2069");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (short) -1);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 10);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int23 = JavaAlgorithms.binarySearch(intArray3, (int) ' ');
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2070");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 100);
        int int16 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int18 = JavaAlgorithms.binarySearch(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2071");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int8 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) 10);
        int int10 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) -1);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (short) 10);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) '#');
        int int16 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2072");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int11 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int13 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int15 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) ' ');
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2073");
        int[] intArray6 = new int[] { 100, ' ', (short) 10, (-1), (-1), '#' };
        int int8 = JavaAlgorithms.binarySearch(intArray6, 1);
        int int10 = JavaAlgorithms.binarySearch(intArray6, (int) (short) -1);
        int int12 = JavaAlgorithms.binarySearch(intArray6, 100);
        int int14 = JavaAlgorithms.binarySearch(intArray6, 2);
        int int16 = JavaAlgorithms.binarySearch(intArray6, (int) (short) 1);
        int int18 = JavaAlgorithms.binarySearch(intArray6, (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 32, 10, (-1), (-1), 35 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2074");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int7 = JavaAlgorithms.binarySearch(intArray1, (int) 'a');
        int int9 = JavaAlgorithms.binarySearch(intArray1, 10);
        int int11 = JavaAlgorithms.binarySearch(intArray1, (int) 'a');
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2075");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int int4 = JavaAlgorithms.binarySearch(intArray2, (int) (short) -1);
        int int6 = JavaAlgorithms.binarySearch(intArray2, (int) ' ');
        int int8 = JavaAlgorithms.binarySearch(intArray2, 10);
        int int10 = JavaAlgorithms.binarySearch(intArray2, 0);
        int int12 = JavaAlgorithms.binarySearch(intArray2, (int) (byte) -1);
        int int14 = JavaAlgorithms.binarySearch(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2076");
        int[] intArray1 = new int[] { 1 };
        int int3 = JavaAlgorithms.binarySearch(intArray1, (int) (short) 1);
        int int5 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int7 = JavaAlgorithms.binarySearch(intArray1, 10);
        int int9 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray1, (int) (byte) 1);
        int int13 = JavaAlgorithms.binarySearch(intArray1, (int) (short) -1);
        int int15 = JavaAlgorithms.binarySearch(intArray1, 100);
        int int17 = JavaAlgorithms.binarySearch(intArray1, 100);
        int int19 = JavaAlgorithms.binarySearch(intArray1, 5);
        int int21 = JavaAlgorithms.binarySearch(intArray1, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2077");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 10 };
        int int5 = JavaAlgorithms.binarySearch(intArray3, (int) '#');
        int int7 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 100);
        int int9 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 0);
        int int11 = JavaAlgorithms.binarySearch(intArray3, 10);
        int int13 = JavaAlgorithms.binarySearch(intArray3, 2);
        int int15 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 1);
        int int17 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 0);
        int int19 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int21 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) 100);
        int int23 = JavaAlgorithms.binarySearch(intArray3, 0);
        int int25 = JavaAlgorithms.binarySearch(intArray3, (int) (short) 10);
        int int27 = JavaAlgorithms.binarySearch(intArray3, 1);
        int int29 = JavaAlgorithms.binarySearch(intArray3, (int) 'a');
        int int31 = JavaAlgorithms.binarySearch(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass32 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 52, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }
}

