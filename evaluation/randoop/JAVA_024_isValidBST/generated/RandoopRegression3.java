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
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1502");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1503");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1504");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1505");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1506");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1507");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1508");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1509");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        java.lang.Class<?> wildcardClass25 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1510");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1511");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1512");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1513");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1514");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1515");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1516");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        java.lang.Class<?> wildcardClass7 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1517");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1518");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1519");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1520");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1521");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1522");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1523");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1524");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1525");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1526");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1527");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1528");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1529");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1530");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1531");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1532");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1533");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1534");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean28 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1535");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1536");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        java.lang.Class<?> wildcardClass7 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1537");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1538");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1539");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1540");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1541");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1542");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1543");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        java.lang.Class<?> wildcardClass7 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1544");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1545");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1546");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1547");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1548");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1549");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1550");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1551");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1552");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1553");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1554");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1555");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1556");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1557");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1558");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1559");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1560");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        java.lang.Class<?> wildcardClass23 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1561");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1562");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1563");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1564");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1565");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1566");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1567");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1568");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1569");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1570");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1571");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1572");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1573");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1574");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1575");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1576");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1577");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1578");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1579");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1580");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1581");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1582");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1583");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1584");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1585");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1586");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1587");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1588");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1589");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1590");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1591");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1592");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean28 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean30 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean32 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1593");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1594");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1595");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1596");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1597");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1598");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1599");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1600");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean28 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean30 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        java.lang.Class<?> wildcardClass31 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1601");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1602");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1603");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1604");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1605");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1606");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1607");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1608");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1609");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1610");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1611");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1612");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1613");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1614");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1615");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1616");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1617");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1618");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1619");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1620");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1621");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1622");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1623");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1624");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1625");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        java.lang.Class<?> wildcardClass5 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1626");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1627");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1628");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1629");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1630");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1631");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1632");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1633");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1634");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1635");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1636");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1637");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1638");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1639");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1640");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1641");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1642");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1643");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1644");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1645");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1646");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1647");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1648");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1649");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1650");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1651");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1652");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1653");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1654");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1655");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1656");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1657");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1658");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1659");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1660");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1661");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1662");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean28 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1663");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1664");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1665");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1666");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1667");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1668");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1669");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1670");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1671");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1672");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1673");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1674");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1675");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1676");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1677");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        java.lang.Class<?> wildcardClass7 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1678");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1679");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1680");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1681");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1682");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1683");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1684");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1685");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1686");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1687");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1688");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1689");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1690");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1691");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1692");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1693");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1694");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1695");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1696");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1697");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1698");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1699");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1700");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1701");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1702");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1703");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1704");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1705");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1706");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean28 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1707");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1708");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1709");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1710");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1711");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1712");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1713");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1714");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1715");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1716");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1717");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1718");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1719");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1720");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1721");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1722");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1723");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1724");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1725");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1726");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1727");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1728");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1729");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1730");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1731");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1732");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1733");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1734");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1735");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1736");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1737");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1738");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1739");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1740");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1741");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1742");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1743");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1744");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1745");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1746");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1747");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1748");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1749");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1750");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1751");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1752");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1753");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1754");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1755");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1756");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1757");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1758");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1759");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1760");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1761");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1762");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1763");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1764");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1765");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1766");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1767");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        java.lang.Class<?> wildcardClass17 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1768");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1769");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1770");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1771");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        java.lang.Class<?> wildcardClass9 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1772");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1773");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1774");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1775");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1776");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1777");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1778");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1779");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1780");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1781");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        java.lang.Class<?> wildcardClass13 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1782");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1783");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean26 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1784");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1785");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1786");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1787");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1788");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1789");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1790");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean24 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1791");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '#');
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1792");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 1);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1793");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) 'a');
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 1);
        boolean boolean22 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1794");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) ' ');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 100);
        boolean boolean16 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) -1);
        boolean boolean18 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 10);
        boolean boolean20 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1795");
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>> strMapList0 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Integer>>();
        boolean boolean2 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (-1));
        boolean boolean4 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (byte) 10);
        boolean boolean6 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 0);
        boolean boolean8 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean10 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) '4');
        boolean boolean12 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, (int) (short) 10);
        boolean boolean14 = JavaAlgorithms.isValidBST((java.util.List<java.util.Map<java.lang.String, java.lang.Integer>>) strMapList0, 0);
        java.lang.Class<?> wildcardClass15 = strMapList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

