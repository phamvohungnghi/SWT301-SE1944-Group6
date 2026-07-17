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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test02");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test03");
        JavaAlgorithms javaAlgorithms0 = new JavaAlgorithms();
        java.lang.Class<?> wildcardClass1 = javaAlgorithms0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test04");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test05");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test06");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test07");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) '#');
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test08");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test09");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors(0);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test10");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors(1);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test11");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test12");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors(10);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test13");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test14");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((-1));
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test15");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) ' ');
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test16");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test17");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) '4');
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test18");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) 'a');
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test19");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test20");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test21");
        java.util.List<java.lang.Integer> intList1 = JavaAlgorithms.findPrimeFactors(100);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

