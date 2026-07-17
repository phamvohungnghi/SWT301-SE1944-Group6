import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1501");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass15 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1502");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1503");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1504");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1505");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.lang.Class<?> wildcardClass18 = intArrayList17.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1506");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1507");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass8 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1508");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1509");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass14 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1510");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass15 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1511");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1512");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass13 = intArrayList12.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1513");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1514");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1515");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass15 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1516");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1517");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1518");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass8 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1519");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.lang.Class<?> wildcardClass19 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1520");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1521");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass19 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1522");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass21 = intArrayList20.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1523");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1524");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1525");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.lang.Class<?> wildcardClass19 = intArrayList17.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1526");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass17 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1527");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1528");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList8);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1529");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1530");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1531");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass15 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1532");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.lang.Class<?> wildcardClass20 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1533");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.lang.Class<?> wildcardClass19 = intArrayList17.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1534");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass18 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1535");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass18 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1536");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass13 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1537");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass10 = intArrayList7.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1538");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass19 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1539");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1540");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1541");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1542");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1543");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass11 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1544");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1545");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1546");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass8 = intArrayList6.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1547");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.lang.Class<?> wildcardClass21 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1548");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1549");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass17 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1550");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass10 = intArrayList8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1551");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass13 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1552");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1553");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass13 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1554");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass15 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1555");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass13 = intArrayList12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1556");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass13 = intArrayList9.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1557");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.lang.Class<?> wildcardClass19 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1558");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1559");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1560");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.lang.Class<?> wildcardClass18 = intArrayList17.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1561");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1562");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass15 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1563");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass18 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1564");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1565");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1566");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1567");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1568");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1569");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass16 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1570");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1571");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1572");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass18 = intArrayList17.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1573");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1574");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass18 = intArrayList17.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1575");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass17 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1576");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1577");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass13 = intArrayList12.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1578");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1579");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1580");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1581");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1582");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1583");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass13 = intArrayList12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1584");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1585");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1586");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass17 = intArrayList16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1587");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1588");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass11 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1589");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1590");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1591");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1592");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass17 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1593");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1594");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass16 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1595");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList21 = JavaAlgorithms.mergeIntervals(intArrayList20);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(intArrayList21);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1596");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass8 = intArrayList7.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1597");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1598");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1599");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.lang.Class<?> wildcardClass20 = intArrayList17.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1600");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1601");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass7 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1602");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass16 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1603");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList21 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList22 = JavaAlgorithms.mergeIntervals(intArrayList21);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(intArrayList21);
        org.junit.Assert.assertNotNull(intArrayList22);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1604");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass11 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1605");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1606");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1607");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass10 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1608");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass17 = intArrayList16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1609");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1610");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1611");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList19);
        java.util.List<int[]> intArrayList21 = JavaAlgorithms.mergeIntervals(intArrayList20);
        java.util.List<int[]> intArrayList22 = JavaAlgorithms.mergeIntervals(intArrayList21);
        java.lang.Class<?> wildcardClass23 = intArrayList21.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(intArrayList21);
        org.junit.Assert.assertNotNull(intArrayList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1612");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1613");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.lang.Class<?> wildcardClass19 = intArrayList16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1614");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.lang.Class<?> wildcardClass20 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1615");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1616");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1617");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1618");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1619");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass8 = intArrayList7.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1620");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass16 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1621");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1622");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass19 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1623");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1624");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1625");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList19);
        java.util.List<int[]> intArrayList21 = JavaAlgorithms.mergeIntervals(intArrayList19);
        java.lang.Class<?> wildcardClass22 = intArrayList21.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(intArrayList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1626");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass21 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1627");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass12 = intArrayList9.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1628");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass15 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1629");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.util.List<int[]> intArrayList21 = JavaAlgorithms.mergeIntervals(intArrayList18);
        java.lang.Class<?> wildcardClass22 = intArrayList21.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(intArrayList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1630");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1631");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1632");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1633");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1634");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass12 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1635");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass15 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1636");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1637");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1638");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1639");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1640");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass17 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1641");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1642");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass11 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1643");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass13 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1644");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1645");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1646");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass16 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1647");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1648");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1649");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass19 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1650");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1651");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1652");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1653");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass15 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1654");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1655");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass13 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1656");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass16 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1657");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1658");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1659");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1660");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass16 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1661");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass11 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1662");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1663");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass12 = intArrayList11.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1664");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1665");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1666");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1667");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.lang.Class<?> wildcardClass19 = intArrayList18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1668");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1669");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass14 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1670");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.lang.Class<?> wildcardClass15 = intArrayList13.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1671");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1672");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1673");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1674");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass15 = intArrayList14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1675");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1676");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1677");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass8 = intArrayList6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1678");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1679");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1680");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1681");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1682");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass12 = intArrayList9.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1683");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1684");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList17 = JavaAlgorithms.mergeIntervals(intArrayList16);
        java.util.List<int[]> intArrayList18 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList19 = JavaAlgorithms.mergeIntervals(intArrayList17);
        java.util.List<int[]> intArrayList20 = JavaAlgorithms.mergeIntervals(intArrayList19);
        java.util.List<int[]> intArrayList21 = JavaAlgorithms.mergeIntervals(intArrayList19);
        java.lang.Class<?> wildcardClass22 = intArrayList19.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(intArrayList17);
        org.junit.Assert.assertNotNull(intArrayList18);
        org.junit.Assert.assertNotNull(intArrayList19);
        org.junit.Assert.assertNotNull(intArrayList20);
        org.junit.Assert.assertNotNull(intArrayList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1685");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1686");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.lang.Class<?> wildcardClass16 = intArrayList15.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1687");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1688");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList15 = JavaAlgorithms.mergeIntervals(intArrayList14);
        java.util.List<int[]> intArrayList16 = JavaAlgorithms.mergeIntervals(intArrayList15);
        java.lang.Class<?> wildcardClass17 = intArrayList16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(intArrayList7);
        org.junit.Assert.assertNotNull(intArrayList8);
        org.junit.Assert.assertNotNull(intArrayList9);
        org.junit.Assert.assertNotNull(intArrayList10);
        org.junit.Assert.assertNotNull(intArrayList11);
        org.junit.Assert.assertNotNull(intArrayList12);
        org.junit.Assert.assertNotNull(intArrayList13);
        org.junit.Assert.assertNotNull(intArrayList14);
        org.junit.Assert.assertNotNull(intArrayList15);
        org.junit.Assert.assertNotNull(intArrayList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

