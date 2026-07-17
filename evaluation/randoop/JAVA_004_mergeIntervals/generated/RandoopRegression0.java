import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0001");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass4 = intArrayList1.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0002");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass4 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0003");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0004");
        JavaAlgorithms javaAlgorithms0 = new JavaAlgorithms();
        java.lang.Class<?> wildcardClass1 = javaAlgorithms0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0005");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0006");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0008");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass4 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0009");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0010");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0011");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass4 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0012");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0013");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass5 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0014");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0015");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0016");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass7 = intArrayList4.getClass();
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0017");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass6 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0018");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.lang.Class<?> wildcardClass3 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0019");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0020");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0021");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass6 = intArrayList1.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0022");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0023");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0024");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass5 = intArrayList1.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0025");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0026");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.lang.Class<?> wildcardClass4 = intArrayList1.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0027");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.lang.Class<?> wildcardClass4 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0028");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0029");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0030");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.lang.Class<?> wildcardClass3 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0031");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass7 = intArrayList1.getClass();
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0033");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0034");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass4 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0035");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList5.getClass();
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0036");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.lang.Class<?> wildcardClass4 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0037");
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0038");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0039");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0040");
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
        java.lang.Class<?> wildcardClass10 = intArrayList6.getClass();
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0041");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0042");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0043");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0044");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0045");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0046");
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0047");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.lang.Class<?> wildcardClass2 = intArrayList1.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0048");
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0049");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0050");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0051");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass6 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0052");
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0053");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0054");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass8 = intArrayList1.getClass();
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0055");
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
        java.lang.Class<?> wildcardClass10 = intArrayList7.getClass();
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0056");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0057");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0058");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList5.getClass();
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0059");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0060");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0061");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0062");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0063");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0064");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass9 = intArrayList1.getClass();
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0065");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0066");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass11 = intArrayList6.getClass();
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0067");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.lang.Class<?> wildcardClass5 = intArrayList1.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0068");
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0069");
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
        java.lang.Class<?> wildcardClass12 = intArrayList9.getClass();
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0070");
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0071");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0072");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0073");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0074");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0075");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0076");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0077");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass6 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0078");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0079");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass5 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0080");
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0081");
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0083");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0084");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0085");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0086");
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
        java.lang.Class<?> wildcardClass11 = intArrayList7.getClass();
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0088");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0089");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0090");
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
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0091");
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
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0092");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList5.getClass();
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0093");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass8 = intArrayList5.getClass();
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0094");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0095");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList6.getClass();
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0096");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList5.getClass();
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0097");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0098");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0099");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0100");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList6.getClass();
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0101");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList6.getClass();
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0102");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0103");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0104");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0105");
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
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0106");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass10 = intArrayList8.getClass();
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0107");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0108");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0109");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0111");
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
        java.lang.Class<?> wildcardClass10 = intArrayList7.getClass();
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0112");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass7 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0113");
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0114");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0115");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass7 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0116");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0117");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0118");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0119");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0120");
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
        java.lang.Class<?> wildcardClass12 = intArrayList9.getClass();
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0121");
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0122");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0123");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0124");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0125");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0126");
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
        java.lang.Class<?> wildcardClass13 = intArrayList9.getClass();
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0127");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0128");
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0129");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0130");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0131");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0132");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0133");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0134");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList5.getClass();
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0135");
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
        java.lang.Class<?> wildcardClass14 = intArrayList11.getClass();
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0136");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0137");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0138");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0139");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0140");
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0141");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass5 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0142");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0143");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0144");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0145");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList5.getClass();
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0146");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0147");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0148");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0149");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass8 = intArrayList5.getClass();
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0150");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0151");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0152");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0153");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0154");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0155");
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
        java.lang.Class<?> wildcardClass10 = intArrayList7.getClass();
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0156");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0157");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0158");
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
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass12 = intArrayList8.getClass();
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0159");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0160");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0161");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0162");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0163");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0164");
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
        java.lang.Class<?> wildcardClass10 = intArrayList6.getClass();
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0165");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0166");
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0167");
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0168");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0169");
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
        java.lang.Class<?> wildcardClass10 = intArrayList6.getClass();
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0171");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0172");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0173");
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
        java.lang.Class<?> wildcardClass10 = intArrayList8.getClass();
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0174");
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
        java.lang.Class<?> wildcardClass10 = intArrayList8.getClass();
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0175");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0176");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass8 = intArrayList3.getClass();
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0178");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0179");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0180");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass7 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0181");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0182");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass6 = intArrayList5.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0183");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0184");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0185");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0187");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0188");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0189");
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
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0190");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0191");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0192");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0194");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0195");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0196");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0197");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0198");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0199");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0200");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0201");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0203");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0204");
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
        java.lang.Class<?> wildcardClass14 = intArrayList11.getClass();
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0205");
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0206");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0207");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0208");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0209");
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
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0210");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0211");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0212");
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
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0213");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0214");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0215");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0216");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList5.getClass();
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0217");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0218");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0219");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0220");
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
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList11);
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0221");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0222");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0223");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0224");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass12 = intArrayList6.getClass();
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0225");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0226");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0227");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0228");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0229");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0230");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0231");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0232");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0233");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0234");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0235");
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0236");
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0237");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0239");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0240");
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
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0241");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0242");
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0243");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass10 = intArrayList5.getClass();
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0244");
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0245");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0246");
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0247");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0248");
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0249");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0250");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0251");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass11 = intArrayList5.getClass();
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0252");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0253");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0254");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0255");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.lang.Class<?> wildcardClass9 = intArrayList3.getClass();
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0256");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0257");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0258");
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0259");
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
        java.lang.Class<?> wildcardClass12 = intArrayList9.getClass();
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0260");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList5.getClass();
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0261");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0263");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0264");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList6.getClass();
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0265");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0266");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0267");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0268");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0269");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0271");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0272");
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0273");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList2);
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0274");
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0276");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass4 = intArrayList3.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0277");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0278");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0279");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0280");
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0281");
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0282");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0283");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0284");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass10 = intArrayList8.getClass();
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0285");
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0286");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0287");
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0288");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0289");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0290");
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
        java.lang.Class<?> wildcardClass12 = intArrayList11.getClass();
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0291");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0292");
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
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0293");
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
        java.lang.Class<?> wildcardClass17 = intArrayList13.getClass();
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0294");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0295");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass6 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0296");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0297");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0298");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList1);
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0299");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0300");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0301");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0302");
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
        java.lang.Class<?> wildcardClass11 = intArrayList7.getClass();
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0303");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0304");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0305");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0306");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass6 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0307");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0308");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0309");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0310");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0311");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0312");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0313");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0314");
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0316");
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0317");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0318");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0319");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.lang.Class<?> wildcardClass7 = intArrayList2.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0320");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0321");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0322");
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
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0323");
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
        java.lang.Class<?> wildcardClass14 = intArrayList11.getClass();
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0324");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0325");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0326");
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
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0327");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0328");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.lang.Class<?> wildcardClass8 = intArrayList1.getClass();
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0329");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0330");
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
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass14 = intArrayList11.getClass();
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0331");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0332");
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
        java.lang.Class<?> wildcardClass11 = intArrayList3.getClass();
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0333");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass15 = intArrayList12.getClass();
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0334");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0335");
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0336");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0337");
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0338");
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0339");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0340");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0341");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass7 = intArrayList4.getClass();
        org.junit.Assert.assertNotNull(intArrayList1);
        org.junit.Assert.assertNotNull(intArrayList2);
        org.junit.Assert.assertNotNull(intArrayList3);
        org.junit.Assert.assertNotNull(intArrayList4);
        org.junit.Assert.assertNotNull(intArrayList5);
        org.junit.Assert.assertNotNull(intArrayList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0342");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0343");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass9 = intArrayList4.getClass();
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0344");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0345");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass9 = intArrayList5.getClass();
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0346");
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0347");
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
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0348");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0349");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0350");
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
        java.lang.Class<?> wildcardClass13 = intArrayList9.getClass();
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0351");
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0352");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0353");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0354");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0355");
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
        java.lang.Class<?> wildcardClass14 = intArrayList11.getClass();
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0356");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0357");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0358");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0359");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0360");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0361");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0362");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList13);
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0363");
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0364");
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0365");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0366");
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0367");
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
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0368");
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
        java.lang.Class<?> wildcardClass12 = intArrayList11.getClass();
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0369");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0370");
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0371");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0372");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0373");
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0374");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0375");
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
        java.lang.Class<?> wildcardClass12 = intArrayList9.getClass();
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0376");
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0377");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0378");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0379");
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
        java.lang.Class<?> wildcardClass12 = intArrayList10.getClass();
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0380");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0381");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0382");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0383");
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0384");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList1);
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0385");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0386");
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0387");
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0388");
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
        java.lang.Class<?> wildcardClass12 = intArrayList8.getClass();
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0389");
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
        java.lang.Class<?> wildcardClass17 = intArrayList13.getClass();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0391");
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
        java.lang.Class<?> wildcardClass14 = intArrayList10.getClass();
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0392");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0393");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0394");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList6.getClass();
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0395");
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0396");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0397");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0398");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0399");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0400");
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
        java.lang.Class<?> wildcardClass12 = intArrayList11.getClass();
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0401");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0403");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList0);
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0404");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0405");
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
        java.lang.Class<?> wildcardClass10 = intArrayList7.getClass();
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0406");
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
        java.lang.Class<?> wildcardClass10 = intArrayList3.getClass();
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0407");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0408");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0409");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList6.getClass();
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0410");
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
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0411");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0412");
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
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0414");
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
        java.lang.Class<?> wildcardClass15 = intArrayList12.getClass();
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0415");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0416");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.lang.Class<?> wildcardClass14 = intArrayList11.getClass();
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0417");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0418");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0419");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0420");
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
        java.lang.Class<?> wildcardClass10 = intArrayList1.getClass();
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0421");
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
        java.lang.Class<?> wildcardClass12 = intArrayList9.getClass();
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0422");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0423");
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
        java.lang.Class<?> wildcardClass18 = intArrayList16.getClass();
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0424");
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
        java.lang.Class<?> wildcardClass12 = intArrayList8.getClass();
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0425");
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
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0426");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0427");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0429");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0430");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList10);
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList11);
        java.util.List<int[]> intArrayList13 = JavaAlgorithms.mergeIntervals(intArrayList12);
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0431");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0432");
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
        java.lang.Class<?> wildcardClass14 = intArrayList12.getClass();
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0434");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0435");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0436");
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
        java.lang.Class<?> wildcardClass11 = intArrayList8.getClass();
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0437");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0439");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0442");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.lang.Class<?> wildcardClass9 = intArrayList4.getClass();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0445");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0447");
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
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass13 = intArrayList9.getClass();
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0449");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0450");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0451");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0452");
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
        java.lang.Class<?> wildcardClass11 = intArrayList7.getClass();
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0453");
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
        java.lang.Class<?> wildcardClass12 = intArrayList11.getClass();
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0455");
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
        java.util.List<int[]> intArrayList12 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass13 = intArrayList9.getClass();
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0456");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0460");
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0461");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0463");
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
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0465");
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
        java.lang.Class<?> wildcardClass10 = intArrayList6.getClass();
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0466");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList2);
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0468");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList9 = JavaAlgorithms.mergeIntervals(intArrayList8);
        java.lang.Class<?> wildcardClass10 = intArrayList8.getClass();
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0469");
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
        java.util.List<int[]> intArrayList14 = JavaAlgorithms.mergeIntervals(intArrayList12);
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0470");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0471");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0472");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0474");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0475");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0476");
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
        java.util.List<int[]> intArrayList11 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass12 = intArrayList7.getClass();
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0477");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.lang.Class<?> wildcardClass7 = intArrayList6.getClass();
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0478");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0479");
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
        java.lang.Class<?> wildcardClass14 = intArrayList8.getClass();
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0480");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0481");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList3);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList3);
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0482");
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0483");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0484");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0485");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0486");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList7.getClass();
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0487");
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
        java.lang.Class<?> wildcardClass10 = intArrayList9.getClass();
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0488");
        java.util.List<int[]> intArrayList0 = null;
        java.util.List<int[]> intArrayList1 = JavaAlgorithms.mergeIntervals(intArrayList0);
        java.util.List<int[]> intArrayList2 = JavaAlgorithms.mergeIntervals(intArrayList1);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList2);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList2);
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0489");
        int[][] intArray0 = new int[][] {};
        java.util.ArrayList<int[]> intArrayList1 = new java.util.ArrayList<int[]>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<int[]>) intArrayList1, intArray0);
        java.util.List<int[]> intArrayList3 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList4 = JavaAlgorithms.mergeIntervals((java.util.List<int[]>) intArrayList1);
        java.util.List<int[]> intArrayList5 = JavaAlgorithms.mergeIntervals(intArrayList4);
        java.util.List<int[]> intArrayList6 = JavaAlgorithms.mergeIntervals(intArrayList5);
        java.util.List<int[]> intArrayList7 = JavaAlgorithms.mergeIntervals(intArrayList6);
        java.util.List<int[]> intArrayList8 = JavaAlgorithms.mergeIntervals(intArrayList7);
        java.lang.Class<?> wildcardClass9 = intArrayList8.getClass();
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0490");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0492");
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
        java.lang.Class<?> wildcardClass14 = intArrayList13.getClass();
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0493");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList8);
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0494");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0495");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0497");
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
        java.util.List<int[]> intArrayList10 = JavaAlgorithms.mergeIntervals(intArrayList9);
        java.lang.Class<?> wildcardClass11 = intArrayList9.getClass();
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0498");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0499");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0500");
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
}

