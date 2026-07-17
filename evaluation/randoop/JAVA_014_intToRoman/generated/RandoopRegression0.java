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
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test02");
        JavaAlgorithms javaAlgorithms0 = new JavaAlgorithms();
        java.lang.Class<?> wildcardClass1 = javaAlgorithms0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test04");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test05");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test06");
        java.lang.String str1 = JavaAlgorithms.intToRoman((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test07");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test08");
        java.lang.String str1 = JavaAlgorithms.intToRoman(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test09");
        java.lang.String str1 = JavaAlgorithms.intToRoman(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test10");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test11");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXV" + "'", str1, "XXXV");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test12");
        java.lang.String str1 = JavaAlgorithms.intToRoman(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test13");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LII" + "'", str1, "LII");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test14");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXII" + "'", str1, "XXXII");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test15");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test16");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test17");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test18");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test19");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XCVII" + "'", str1, "XCVII");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test20");
        java.lang.String str1 = JavaAlgorithms.intToRoman((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test21");
        java.lang.String str1 = JavaAlgorithms.intToRoman(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }
}

