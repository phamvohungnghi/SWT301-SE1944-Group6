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
        double double2 = JavaAlgorithms.calculateTax((double) 100, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0002");
        double double2 = JavaAlgorithms.calculateTax((double) '4', "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.4d + "'", double2 == 10.4d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0003");
        double double2 = JavaAlgorithms.calculateTax((double) 10.0f, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
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
        double double2 = JavaAlgorithms.calculateTax(0.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0006");
        double double2 = JavaAlgorithms.calculateTax((double) (-1.0f), "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0007");
        double double2 = JavaAlgorithms.calculateTax((-1.0d), "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0009");
        double double2 = JavaAlgorithms.calculateTax((double) 0.0f, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0010");
        double double2 = JavaAlgorithms.calculateTax((double) (-1), "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0011");
        double double2 = JavaAlgorithms.calculateTax((double) 'a', "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.400000000000002d + "'", double2 == 19.400000000000002d);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0012");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 1, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0013");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 100, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0014");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 0, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0015");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0016");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0017");
        double double2 = JavaAlgorithms.calculateTax(1.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0018");
        double double2 = JavaAlgorithms.calculateTax((double) '#', "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0019");
        double double2 = JavaAlgorithms.calculateTax(19.400000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.880000000000001d + "'", double2 == 3.880000000000001d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0020");
        double double2 = JavaAlgorithms.calculateTax((double) (short) -1, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0021");
        double double2 = JavaAlgorithms.calculateTax((double) 10, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0022");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0023");
        double double2 = JavaAlgorithms.calculateTax((-1.0d), "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0024");
        double double2 = JavaAlgorithms.calculateTax((double) (-1L), "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0025");
        double double2 = JavaAlgorithms.calculateTax(10.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0026");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0027");
        double double2 = JavaAlgorithms.calculateTax(10.4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.08d + "'", double2 == 2.08d);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0028");
        double double2 = JavaAlgorithms.calculateTax((double) 100, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0029");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0030");
        double double2 = JavaAlgorithms.calculateTax(2.08d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41600000000000004d + "'", double2 == 0.41600000000000004d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0031");
        double double2 = JavaAlgorithms.calculateTax((double) 10L, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0032");
        double double2 = JavaAlgorithms.calculateTax((double) '#', "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0033");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0034");
        double double2 = JavaAlgorithms.calculateTax((double) '4', "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.4d + "'", double2 == 10.4d);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0035");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0036");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0037");
        double double2 = JavaAlgorithms.calculateTax((double) 1.0f, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0038");
        double double2 = JavaAlgorithms.calculateTax(20.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0039");
        double double2 = JavaAlgorithms.calculateTax(4.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8d + "'", double2 == 0.8d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0040");
        double double2 = JavaAlgorithms.calculateTax(3.880000000000001d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7760000000000002d + "'", double2 == 0.7760000000000002d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0041");
        double double2 = JavaAlgorithms.calculateTax((double) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.400000000000002d + "'", double2 == 19.400000000000002d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0042");
        double double2 = JavaAlgorithms.calculateTax((double) 0, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0043");
        double double2 = JavaAlgorithms.calculateTax((double) ' ', "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.4d + "'", double2 == 6.4d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0044");
        double double2 = JavaAlgorithms.calculateTax(7.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4000000000000001d + "'", double2 == 1.4000000000000001d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0045");
        double double2 = JavaAlgorithms.calculateTax(1.4000000000000001d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28d + "'", double2 == 0.28d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0046");
        double double2 = JavaAlgorithms.calculateTax(6.4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2800000000000002d + "'", double2 == 1.2800000000000002d);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0047");
        double double2 = JavaAlgorithms.calculateTax(0.41600000000000004d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08320000000000001d + "'", double2 == 0.08320000000000001d);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0048");
        double double2 = JavaAlgorithms.calculateTax(100.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0049");
        double double2 = JavaAlgorithms.calculateTax(0.08320000000000001d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016640000000000002d + "'", double2 == 0.016640000000000002d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0050");
        double double2 = JavaAlgorithms.calculateTax(0.7760000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15520000000000006d + "'", double2 == 0.15520000000000006d);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0051");
        double double2 = JavaAlgorithms.calculateTax(10.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0052");
        double double2 = JavaAlgorithms.calculateTax((double) 0, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0053");
        double double2 = JavaAlgorithms.calculateTax((double) 1, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0054");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0055");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0056");
        double double2 = JavaAlgorithms.calculateTax(0.016640000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0033280000000000007d + "'", double2 == 0.0033280000000000007d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0057");
        double double2 = JavaAlgorithms.calculateTax((double) (-1L), "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0058");
        double double2 = JavaAlgorithms.calculateTax(7.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4000000000000001d + "'", double2 == 1.4000000000000001d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0059");
        double double2 = JavaAlgorithms.calculateTax(0.28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05600000000000001d + "'", double2 == 0.05600000000000001d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0060");
        double double2 = JavaAlgorithms.calculateTax(0.0033280000000000007d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.656000000000001E-4d + "'", double2 == 6.656000000000001E-4d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0061");
        double double2 = JavaAlgorithms.calculateTax(0.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0062");
        double double2 = JavaAlgorithms.calculateTax(6.4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2800000000000002d + "'", double2 == 1.2800000000000002d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0063");
        double double2 = JavaAlgorithms.calculateTax(0.28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05600000000000001d + "'", double2 == 0.05600000000000001d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0064");
        double double2 = JavaAlgorithms.calculateTax((double) 1L, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0065");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0066");
        double double2 = JavaAlgorithms.calculateTax((double) 100.0f, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0067");
        double double2 = JavaAlgorithms.calculateTax((double) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0068");
        double double2 = JavaAlgorithms.calculateTax(0.8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16000000000000003d + "'", double2 == 0.16000000000000003d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0069");
        double double2 = JavaAlgorithms.calculateTax(0.16000000000000003d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03200000000000001d + "'", double2 == 0.03200000000000001d);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0070");
        double double2 = JavaAlgorithms.calculateTax((double) 1, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0071");
        double double2 = JavaAlgorithms.calculateTax((double) 10, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0072");
        double double2 = JavaAlgorithms.calculateTax(2.08d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41600000000000004d + "'", double2 == 0.41600000000000004d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0073");
        double double2 = JavaAlgorithms.calculateTax(20.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0074");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0075");
        double double2 = JavaAlgorithms.calculateTax(100.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0076");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0077");
        double double2 = JavaAlgorithms.calculateTax(3.880000000000001d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7760000000000002d + "'", double2 == 0.7760000000000002d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0078");
        double double2 = JavaAlgorithms.calculateTax((double) 0L, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0079");
        double double2 = JavaAlgorithms.calculateTax((double) 10.0f, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0080");
        double double2 = JavaAlgorithms.calculateTax(0.15520000000000006d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.031040000000000012d + "'", double2 == 0.031040000000000012d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0081");
        double double2 = JavaAlgorithms.calculateTax(0.15520000000000006d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.031040000000000012d + "'", double2 == 0.031040000000000012d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0082");
        double double2 = JavaAlgorithms.calculateTax(0.031040000000000012d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006208000000000003d + "'", double2 == 0.006208000000000003d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0083");
        double double2 = JavaAlgorithms.calculateTax(0.05600000000000001d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011200000000000002d + "'", double2 == 0.011200000000000002d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0084");
        double double2 = JavaAlgorithms.calculateTax((double) 100L, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0085");
        double double2 = JavaAlgorithms.calculateTax(4.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8d + "'", double2 == 0.8d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0086");
        double double2 = JavaAlgorithms.calculateTax(0.006208000000000003d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012416000000000007d + "'", double2 == 0.0012416000000000007d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0087");
        double double2 = JavaAlgorithms.calculateTax(1.4000000000000001d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28d + "'", double2 == 0.28d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0088");
        double double2 = JavaAlgorithms.calculateTax((double) (short) 10, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0089");
        double double2 = JavaAlgorithms.calculateTax((double) 100.0f, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0090");
        double double2 = JavaAlgorithms.calculateTax((double) 0.0f, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0091");
        double double2 = JavaAlgorithms.calculateTax((double) 0L, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0092");
        double double2 = JavaAlgorithms.calculateTax(0.03200000000000001d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006400000000000002d + "'", double2 == 0.006400000000000002d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0093");
        double double2 = JavaAlgorithms.calculateTax(0.2d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04000000000000001d + "'", double2 == 0.04000000000000001d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0094");
        double double2 = JavaAlgorithms.calculateTax(0.0012416000000000007d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4832000000000017E-4d + "'", double2 == 2.4832000000000017E-4d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0095");
        double double2 = JavaAlgorithms.calculateTax(2.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4d + "'", double2 == 0.4d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0096");
        double double2 = JavaAlgorithms.calculateTax(0.7760000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15520000000000006d + "'", double2 == 0.15520000000000006d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0097");
        double double2 = JavaAlgorithms.calculateTax(0.04000000000000001d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008000000000000002d + "'", double2 == 0.008000000000000002d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0098");
        double double2 = JavaAlgorithms.calculateTax((double) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.4d + "'", double2 == 6.4d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0099");
        double double2 = JavaAlgorithms.calculateTax(0.0033280000000000007d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.656000000000001E-4d + "'", double2 == 6.656000000000001E-4d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0100");
        double double2 = JavaAlgorithms.calculateTax((double) (-1), "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0101");
        double double2 = JavaAlgorithms.calculateTax((double) 10L, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0102");
        double double2 = JavaAlgorithms.calculateTax(2.4832000000000017E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.966400000000004E-5d + "'", double2 == 4.966400000000004E-5d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0103");
        double double2 = JavaAlgorithms.calculateTax(4.966400000000004E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.932800000000008E-6d + "'", double2 == 9.932800000000008E-6d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0104");
        double double2 = JavaAlgorithms.calculateTax(0.41600000000000004d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08320000000000001d + "'", double2 == 0.08320000000000001d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0105");
        double double2 = JavaAlgorithms.calculateTax(0.4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08000000000000002d + "'", double2 == 0.08000000000000002d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0106");
        double double2 = JavaAlgorithms.calculateTax(6.656000000000001E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3312000000000003E-4d + "'", double2 == 1.3312000000000003E-4d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0107");
        double double2 = JavaAlgorithms.calculateTax(0.031040000000000012d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006208000000000003d + "'", double2 == 0.006208000000000003d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0108");
        double double2 = JavaAlgorithms.calculateTax(0.006208000000000003d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012416000000000007d + "'", double2 == 0.0012416000000000007d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0109");
        double double2 = JavaAlgorithms.calculateTax(0.16000000000000003d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03200000000000001d + "'", double2 == 0.03200000000000001d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0110");
        double double2 = JavaAlgorithms.calculateTax(2.4832000000000017E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.966400000000004E-5d + "'", double2 == 4.966400000000004E-5d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0111");
        double double2 = JavaAlgorithms.calculateTax(19.400000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.880000000000001d + "'", double2 == 3.880000000000001d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0112");
        double double2 = JavaAlgorithms.calculateTax(1.3312000000000003E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6624000000000008E-5d + "'", double2 == 2.6624000000000008E-5d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0113");
        double double2 = JavaAlgorithms.calculateTax(0.8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16000000000000003d + "'", double2 == 0.16000000000000003d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0114");
        double double2 = JavaAlgorithms.calculateTax(2.6624000000000008E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.324800000000002E-6d + "'", double2 == 5.324800000000002E-6d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0115");
        double double2 = JavaAlgorithms.calculateTax(0.08000000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016000000000000004d + "'", double2 == 0.016000000000000004d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0116");
        double double2 = JavaAlgorithms.calculateTax(2.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4d + "'", double2 == 0.4d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0117");
        double double2 = JavaAlgorithms.calculateTax(1.2800000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25600000000000006d + "'", double2 == 0.25600000000000006d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0118");
        double double2 = JavaAlgorithms.calculateTax(0.08000000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016000000000000004d + "'", double2 == 0.016000000000000004d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0119");
        double double2 = JavaAlgorithms.calculateTax(0.008000000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016000000000000005d + "'", double2 == 0.0016000000000000005d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0120");
        double double2 = JavaAlgorithms.calculateTax(0.008000000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016000000000000005d + "'", double2 == 0.0016000000000000005d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0121");
        double double2 = JavaAlgorithms.calculateTax(0.03200000000000001d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006400000000000002d + "'", double2 == 0.006400000000000002d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0122");
        double double2 = JavaAlgorithms.calculateTax(0.006400000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012800000000000005d + "'", double2 == 0.0012800000000000005d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0123");
        double double2 = JavaAlgorithms.calculateTax(6.656000000000001E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3312000000000003E-4d + "'", double2 == 1.3312000000000003E-4d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0124");
        double double2 = JavaAlgorithms.calculateTax(0.011200000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0022400000000000002d + "'", double2 == 0.0022400000000000002d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0125");
        double double2 = JavaAlgorithms.calculateTax(1.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0126");
        double double2 = JavaAlgorithms.calculateTax(0.25600000000000006d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.051200000000000016d + "'", double2 == 0.051200000000000016d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0127");
        double double2 = JavaAlgorithms.calculateTax(0.051200000000000016d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010240000000000004d + "'", double2 == 0.010240000000000004d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0128");
        double double2 = JavaAlgorithms.calculateTax(0.05600000000000001d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011200000000000002d + "'", double2 == 0.011200000000000002d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0129");
        double double2 = JavaAlgorithms.calculateTax(0.4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08000000000000002d + "'", double2 == 0.08000000000000002d);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0130");
        double double2 = JavaAlgorithms.calculateTax(0.010240000000000004d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0020480000000000008d + "'", double2 == 0.0020480000000000008d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0131");
        double double2 = JavaAlgorithms.calculateTax(0.016640000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0033280000000000007d + "'", double2 == 0.0033280000000000007d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0132");
        double double2 = JavaAlgorithms.calculateTax(5.324800000000002E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0649600000000003E-6d + "'", double2 == 1.0649600000000003E-6d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0133");
        double double2 = JavaAlgorithms.calculateTax(0.016000000000000004d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003200000000000001d + "'", double2 == 0.003200000000000001d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0134");
        double double2 = JavaAlgorithms.calculateTax(0.051200000000000016d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010240000000000004d + "'", double2 == 0.010240000000000004d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0135");
        double double2 = JavaAlgorithms.calculateTax(4.966400000000004E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.932800000000008E-6d + "'", double2 == 9.932800000000008E-6d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0136");
        double double2 = JavaAlgorithms.calculateTax(9.932800000000008E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9865600000000016E-6d + "'", double2 == 1.9865600000000016E-6d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0137");
        double double2 = JavaAlgorithms.calculateTax(1.9865600000000016E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.973120000000003E-7d + "'", double2 == 3.973120000000003E-7d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0138");
        double double2 = JavaAlgorithms.calculateTax(0.0016000000000000005d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2000000000000013E-4d + "'", double2 == 3.2000000000000013E-4d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0139");
        double double2 = JavaAlgorithms.calculateTax((double) 1L, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0140");
        double double2 = JavaAlgorithms.calculateTax(3.2000000000000013E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.400000000000002E-5d + "'", double2 == 6.400000000000002E-5d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0141");
        double double2 = JavaAlgorithms.calculateTax(3.2000000000000013E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.400000000000002E-5d + "'", double2 == 6.400000000000002E-5d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0142");
        double double2 = JavaAlgorithms.calculateTax(0.0012416000000000007d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4832000000000017E-4d + "'", double2 == 2.4832000000000017E-4d);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0143");
        double double2 = JavaAlgorithms.calculateTax(0.003200000000000001d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.400000000000003E-4d + "'", double2 == 6.400000000000003E-4d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0144");
        double double2 = JavaAlgorithms.calculateTax(0.010240000000000004d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0020480000000000008d + "'", double2 == 0.0020480000000000008d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0145");
        double double2 = JavaAlgorithms.calculateTax(6.400000000000002E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2800000000000006E-5d + "'", double2 == 1.2800000000000006E-5d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0146");
        double double2 = JavaAlgorithms.calculateTax(0.003200000000000001d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.400000000000003E-4d + "'", double2 == 6.400000000000003E-4d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0147");
        double double2 = JavaAlgorithms.calculateTax(6.400000000000002E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2800000000000006E-5d + "'", double2 == 1.2800000000000006E-5d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0148");
        double double2 = JavaAlgorithms.calculateTax(0.04000000000000001d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008000000000000002d + "'", double2 == 0.008000000000000002d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0149");
        double double2 = JavaAlgorithms.calculateTax((double) 1.0f, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0150");
        double double2 = JavaAlgorithms.calculateTax((double) (-1.0f), "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0151");
        double double2 = JavaAlgorithms.calculateTax(10.4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.08d + "'", double2 == 2.08d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0152");
        double double2 = JavaAlgorithms.calculateTax(1.2800000000000006E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5600000000000013E-6d + "'", double2 == 2.5600000000000013E-6d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0153");
        double double2 = JavaAlgorithms.calculateTax(2.5600000000000013E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.120000000000002E-7d + "'", double2 == 5.120000000000002E-7d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0154");
        double double2 = JavaAlgorithms.calculateTax(0.0022400000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4800000000000005E-4d + "'", double2 == 4.4800000000000005E-4d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0155");
        double double2 = JavaAlgorithms.calculateTax(0.0016000000000000005d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2000000000000013E-4d + "'", double2 == 3.2000000000000013E-4d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0156");
        double double2 = JavaAlgorithms.calculateTax(1.2800000000000006E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5600000000000013E-6d + "'", double2 == 2.5600000000000013E-6d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0157");
        double double2 = JavaAlgorithms.calculateTax((double) 100L, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0158");
        double double2 = JavaAlgorithms.calculateTax(1.3312000000000003E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6624000000000008E-5d + "'", double2 == 2.6624000000000008E-5d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0159");
        double double2 = JavaAlgorithms.calculateTax(1.2800000000000002d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25600000000000006d + "'", double2 == 0.25600000000000006d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0160");
        double double2 = JavaAlgorithms.calculateTax(0.25600000000000006d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.051200000000000016d + "'", double2 == 0.051200000000000016d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0161");
        double double2 = JavaAlgorithms.calculateTax(0.2d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04000000000000001d + "'", double2 == 0.04000000000000001d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0162");
        double double2 = JavaAlgorithms.calculateTax((double) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0163");
        double double2 = JavaAlgorithms.calculateTax(0.08320000000000001d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016640000000000002d + "'", double2 == 0.016640000000000002d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0164");
        double double2 = JavaAlgorithms.calculateTax(5.324800000000002E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0649600000000003E-6d + "'", double2 == 1.0649600000000003E-6d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0165");
        double double2 = JavaAlgorithms.calculateTax(4.4800000000000005E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.960000000000001E-5d + "'", double2 == 8.960000000000001E-5d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0166");
        double double2 = JavaAlgorithms.calculateTax(3.973120000000003E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.946240000000007E-8d + "'", double2 == 7.946240000000007E-8d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0167");
        double double2 = JavaAlgorithms.calculateTax(1.0649600000000003E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1299200000000009E-7d + "'", double2 == 2.1299200000000009E-7d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0168");
        double double2 = JavaAlgorithms.calculateTax(0.0012800000000000005d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.560000000000001E-4d + "'", double2 == 2.560000000000001E-4d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0169");
        double double2 = JavaAlgorithms.calculateTax(0.006400000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012800000000000005d + "'", double2 == 0.0012800000000000005d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0170");
        double double2 = JavaAlgorithms.calculateTax(8.960000000000001E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.792E-5d + "'", double2 == 1.792E-5d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0171");
        double double2 = JavaAlgorithms.calculateTax(2.560000000000001E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1200000000000025E-5d + "'", double2 == 5.1200000000000025E-5d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0172");
        double double2 = JavaAlgorithms.calculateTax(2.5600000000000013E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.120000000000002E-7d + "'", double2 == 5.120000000000002E-7d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0173");
        double double2 = JavaAlgorithms.calculateTax(2.560000000000001E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1200000000000025E-5d + "'", double2 == 5.1200000000000025E-5d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0174");
        double double2 = JavaAlgorithms.calculateTax(0.0020480000000000008d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.096000000000002E-4d + "'", double2 == 4.096000000000002E-4d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0175");
        double double2 = JavaAlgorithms.calculateTax(0.0012800000000000005d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.560000000000001E-4d + "'", double2 == 2.560000000000001E-4d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0176");
        double double2 = JavaAlgorithms.calculateTax(1.792E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5840000000000003E-6d + "'", double2 == 3.5840000000000003E-6d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0177");
        double double2 = JavaAlgorithms.calculateTax(6.400000000000003E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2800000000000005E-4d + "'", double2 == 1.2800000000000005E-4d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0178");
        double double2 = JavaAlgorithms.calculateTax(0.016000000000000004d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003200000000000001d + "'", double2 == 0.003200000000000001d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0179");
        double double2 = JavaAlgorithms.calculateTax(5.1200000000000025E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0240000000000005E-5d + "'", double2 == 1.0240000000000005E-5d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0180");
        double double2 = JavaAlgorithms.calculateTax(3.5840000000000003E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.168000000000001E-7d + "'", double2 == 7.168000000000001E-7d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0181");
        double double2 = JavaAlgorithms.calculateTax(8.960000000000001E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.792E-5d + "'", double2 == 1.792E-5d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0182");
        double double2 = JavaAlgorithms.calculateTax(1.792E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5840000000000003E-6d + "'", double2 == 3.5840000000000003E-6d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0183");
        double double2 = JavaAlgorithms.calculateTax(1.2800000000000005E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5600000000000012E-5d + "'", double2 == 2.5600000000000012E-5d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0184");
        double double2 = JavaAlgorithms.calculateTax(1.0240000000000005E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.048000000000001E-6d + "'", double2 == 2.048000000000001E-6d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0185");
        double double2 = JavaAlgorithms.calculateTax(5.120000000000002E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0240000000000006E-7d + "'", double2 == 1.0240000000000006E-7d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0186");
        double double2 = JavaAlgorithms.calculateTax(7.168000000000001E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4336000000000003E-7d + "'", double2 == 1.4336000000000003E-7d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0187");
        double double2 = JavaAlgorithms.calculateTax(2.1299200000000009E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.259840000000002E-8d + "'", double2 == 4.259840000000002E-8d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0188");
        double double2 = JavaAlgorithms.calculateTax(0.0020480000000000008d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.096000000000002E-4d + "'", double2 == 4.096000000000002E-4d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0189");
        double double2 = JavaAlgorithms.calculateTax(0.0022400000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4800000000000005E-4d + "'", double2 == 4.4800000000000005E-4d);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0190");
        double double2 = JavaAlgorithms.calculateTax(1.4336000000000003E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8672000000000007E-8d + "'", double2 == 2.8672000000000007E-8d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0191");
        double double2 = JavaAlgorithms.calculateTax(2.6624000000000008E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.324800000000002E-6d + "'", double2 == 5.324800000000002E-6d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0192");
        double double2 = JavaAlgorithms.calculateTax(7.946240000000007E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5892480000000015E-8d + "'", double2 == 1.5892480000000015E-8d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0193");
        double double2 = JavaAlgorithms.calculateTax(5.1200000000000025E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0240000000000005E-5d + "'", double2 == 1.0240000000000005E-5d);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0194");
        double double2 = JavaAlgorithms.calculateTax(2.5600000000000012E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.120000000000003E-6d + "'", double2 == 5.120000000000003E-6d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0195");
        double double2 = JavaAlgorithms.calculateTax(1.0240000000000006E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0480000000000012E-8d + "'", double2 == 2.0480000000000012E-8d);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0196");
        double double2 = JavaAlgorithms.calculateTax(3.5840000000000003E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.168000000000001E-7d + "'", double2 == 7.168000000000001E-7d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0197");
        double double2 = JavaAlgorithms.calculateTax(2.5600000000000012E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.120000000000003E-6d + "'", double2 == 5.120000000000003E-6d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0198");
        double double2 = JavaAlgorithms.calculateTax(7.168000000000001E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4336000000000003E-7d + "'", double2 == 1.4336000000000003E-7d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0199");
        double double2 = JavaAlgorithms.calculateTax(2.048000000000001E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0960000000000023E-7d + "'", double2 == 4.0960000000000023E-7d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0200");
        double double2 = JavaAlgorithms.calculateTax(5.120000000000002E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0240000000000006E-7d + "'", double2 == 1.0240000000000006E-7d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0201");
        double double2 = JavaAlgorithms.calculateTax(1.4336000000000003E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8672000000000007E-8d + "'", double2 == 2.8672000000000007E-8d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0202");
        double double2 = JavaAlgorithms.calculateTax(2.048000000000001E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0960000000000023E-7d + "'", double2 == 4.0960000000000023E-7d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0203");
        double double2 = JavaAlgorithms.calculateTax(1.0240000000000006E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0480000000000012E-8d + "'", double2 == 2.0480000000000012E-8d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0204");
        double double2 = JavaAlgorithms.calculateTax(4.096000000000002E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000004E-5d + "'", double2 == 8.192000000000004E-5d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0205");
        double double2 = JavaAlgorithms.calculateTax(4.096000000000002E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000004E-5d + "'", double2 == 8.192000000000004E-5d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0206");
        double double2 = JavaAlgorithms.calculateTax(4.4800000000000005E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.960000000000001E-5d + "'", double2 == 8.960000000000001E-5d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0207");
        double double2 = JavaAlgorithms.calculateTax(4.259840000000002E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.519680000000003E-9d + "'", double2 == 8.519680000000003E-9d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0208");
        double double2 = JavaAlgorithms.calculateTax(0.011200000000000002d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0022400000000000002d + "'", double2 == 0.0022400000000000002d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0209");
        double double2 = JavaAlgorithms.calculateTax(8.519680000000003E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7039360000000008E-9d + "'", double2 == 1.7039360000000008E-9d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0210");
        double double2 = JavaAlgorithms.calculateTax(2.0480000000000012E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.096000000000002E-9d + "'", double2 == 4.096000000000002E-9d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0211");
        double double2 = JavaAlgorithms.calculateTax(3.973120000000003E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.946240000000007E-8d + "'", double2 == 7.946240000000007E-8d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0212");
        double double2 = JavaAlgorithms.calculateTax(4.096000000000002E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000005E-10d + "'", double2 == 8.192000000000005E-10d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0213");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000004E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6384000000000008E-5d + "'", double2 == 1.6384000000000008E-5d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0214");
        double double2 = JavaAlgorithms.calculateTax(7.946240000000007E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5892480000000015E-8d + "'", double2 == 1.5892480000000015E-8d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0215");
        double double2 = JavaAlgorithms.calculateTax(5.120000000000003E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0240000000000005E-6d + "'", double2 == 1.0240000000000005E-6d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0216");
        double double2 = JavaAlgorithms.calculateTax(8.519680000000003E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7039360000000008E-9d + "'", double2 == 1.7039360000000008E-9d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0217");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000004E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6384000000000008E-5d + "'", double2 == 1.6384000000000008E-5d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0218");
        double double2 = JavaAlgorithms.calculateTax(1.7039360000000008E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4078720000000016E-10d + "'", double2 == 3.4078720000000016E-10d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0219");
        double double2 = JavaAlgorithms.calculateTax(1.0240000000000005E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0480000000000011E-7d + "'", double2 == 2.0480000000000011E-7d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0220");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000005E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6384000000000013E-10d + "'", double2 == 1.6384000000000013E-10d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0221");
        double double2 = JavaAlgorithms.calculateTax(3.4078720000000016E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.815744000000003E-11d + "'", double2 == 6.815744000000003E-11d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0222");
        double double2 = JavaAlgorithms.calculateTax(4.0960000000000023E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000005E-8d + "'", double2 == 8.192000000000005E-8d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0223");
        double double2 = JavaAlgorithms.calculateTax(1.6384000000000013E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.276800000000003E-11d + "'", double2 == 3.276800000000003E-11d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0224");
        double double2 = JavaAlgorithms.calculateTax(1.0240000000000005E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0480000000000011E-7d + "'", double2 == 2.0480000000000011E-7d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0225");
        double double2 = JavaAlgorithms.calculateTax(2.1299200000000009E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.259840000000002E-8d + "'", double2 == 4.259840000000002E-8d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0226");
        double double2 = JavaAlgorithms.calculateTax(9.932800000000008E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9865600000000016E-6d + "'", double2 == 1.9865600000000016E-6d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0227");
        double double2 = JavaAlgorithms.calculateTax(2.8672000000000007E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.734400000000002E-9d + "'", double2 == 5.734400000000002E-9d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0228");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000005E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6384000000000013E-10d + "'", double2 == 1.6384000000000013E-10d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0229");
        double double2 = JavaAlgorithms.calculateTax(6.400000000000003E-4d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2800000000000005E-4d + "'", double2 == 1.2800000000000005E-4d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0230");
        double double2 = JavaAlgorithms.calculateTax(4.259840000000002E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.519680000000003E-9d + "'", double2 == 8.519680000000003E-9d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0231");
        double double2 = JavaAlgorithms.calculateTax(1.5892480000000015E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.178496000000003E-9d + "'", double2 == 3.178496000000003E-9d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0232");
        double double2 = JavaAlgorithms.calculateTax(2.0480000000000012E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.096000000000002E-9d + "'", double2 == 4.096000000000002E-9d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0233");
        double double2 = JavaAlgorithms.calculateTax(6.815744000000003E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3631488000000008E-11d + "'", double2 == 1.3631488000000008E-11d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0234");
        double double2 = JavaAlgorithms.calculateTax(6.815744000000003E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3631488000000008E-11d + "'", double2 == 1.3631488000000008E-11d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0235");
        double double2 = JavaAlgorithms.calculateTax(1.7039360000000008E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4078720000000016E-10d + "'", double2 == 3.4078720000000016E-10d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0236");
        double double2 = JavaAlgorithms.calculateTax(1.3631488000000008E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7262976000000016E-12d + "'", double2 == 2.7262976000000016E-12d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0237");
        double double2 = JavaAlgorithms.calculateTax(1.6384000000000008E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.276800000000002E-6d + "'", double2 == 3.276800000000002E-6d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0238");
        double double2 = JavaAlgorithms.calculateTax(3.4078720000000016E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.815744000000003E-11d + "'", double2 == 6.815744000000003E-11d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0239");
        double double2 = JavaAlgorithms.calculateTax(3.178496000000003E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.356992000000007E-10d + "'", double2 == 6.356992000000007E-10d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0240");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000005E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.638400000000001E-8d + "'", double2 == 1.638400000000001E-8d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0241");
        double double2 = JavaAlgorithms.calculateTax(3.276800000000003E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000006E-12d + "'", double2 == 6.553600000000006E-12d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0242");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000006E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000013E-12d + "'", double2 == 1.3107200000000013E-12d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0243");
        double double2 = JavaAlgorithms.calculateTax(1.638400000000001E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.276800000000002E-9d + "'", double2 == 3.276800000000002E-9d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0244");
        double double2 = JavaAlgorithms.calculateTax(3.276800000000002E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000005E-10d + "'", double2 == 6.553600000000005E-10d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0245");
        double double2 = JavaAlgorithms.calculateTax(3.276800000000003E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000006E-12d + "'", double2 == 6.553600000000006E-12d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0246");
        double double2 = JavaAlgorithms.calculateTax(3.276800000000002E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000004E-7d + "'", double2 == 6.553600000000004E-7d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0247");
        double double2 = JavaAlgorithms.calculateTax(3.178496000000003E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.356992000000007E-10d + "'", double2 == 6.356992000000007E-10d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0248");
        double double2 = JavaAlgorithms.calculateTax(2.0480000000000011E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0960000000000024E-8d + "'", double2 == 4.0960000000000024E-8d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0249");
        double double2 = JavaAlgorithms.calculateTax(6.356992000000007E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2713984000000013E-10d + "'", double2 == 1.2713984000000013E-10d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0250");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000006E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000013E-12d + "'", double2 == 1.3107200000000013E-12d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0251");
        double double2 = JavaAlgorithms.calculateTax(5.120000000000003E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0240000000000005E-6d + "'", double2 == 1.0240000000000005E-6d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0252");
        double double2 = JavaAlgorithms.calculateTax(5.734400000000002E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1468800000000005E-9d + "'", double2 == 1.1468800000000005E-9d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0253");
        double double2 = JavaAlgorithms.calculateTax(1.0649600000000003E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1299200000000009E-7d + "'", double2 == 2.1299200000000009E-7d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0254");
        double double2 = JavaAlgorithms.calculateTax(1.0240000000000005E-5d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.048000000000001E-6d + "'", double2 == 2.048000000000001E-6d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0255");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000005E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000011E-10d + "'", double2 == 1.3107200000000011E-10d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0256");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000004E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000008E-7d + "'", double2 == 1.3107200000000008E-7d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0257");
        double double2 = JavaAlgorithms.calculateTax(1.5892480000000015E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.178496000000003E-9d + "'", double2 == 3.178496000000003E-9d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0258");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000013E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000027E-13d + "'", double2 == 2.6214400000000027E-13d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0259");
        double double2 = JavaAlgorithms.calculateTax(1.2713984000000013E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5427968000000025E-11d + "'", double2 == 2.5427968000000025E-11d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0260");
        double double2 = JavaAlgorithms.calculateTax(4.0960000000000023E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000005E-8d + "'", double2 == 8.192000000000005E-8d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0261");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000027E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2428800000000056E-14d + "'", double2 == 5.2428800000000056E-14d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0262");
        double double2 = JavaAlgorithms.calculateTax(1.6384000000000008E-5d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.276800000000002E-6d + "'", double2 == 3.276800000000002E-6d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0263");
        double double2 = JavaAlgorithms.calculateTax(1.9865600000000016E-6d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.973120000000003E-7d + "'", double2 == 3.973120000000003E-7d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0264");
        double double2 = JavaAlgorithms.calculateTax(1.1468800000000005E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.293760000000001E-10d + "'", double2 == 2.293760000000001E-10d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0265");
        double double2 = JavaAlgorithms.calculateTax(4.0960000000000024E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000005E-9d + "'", double2 == 8.192000000000005E-9d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0266");
        double double2 = JavaAlgorithms.calculateTax(1.638400000000001E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.276800000000002E-9d + "'", double2 == 3.276800000000002E-9d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0267");
        double double2 = JavaAlgorithms.calculateTax(2.293760000000001E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.587520000000002E-11d + "'", double2 == 4.587520000000002E-11d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0268");
        double double2 = JavaAlgorithms.calculateTax(5.2428800000000056E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0485760000000012E-14d + "'", double2 == 1.0485760000000012E-14d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0269");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000008E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000017E-8d + "'", double2 == 2.6214400000000017E-8d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0270");
        double double2 = JavaAlgorithms.calculateTax(2.5427968000000025E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.085593600000005E-12d + "'", double2 == 5.085593600000005E-12d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0271");
        double double2 = JavaAlgorithms.calculateTax(3.276800000000002E-6d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000004E-7d + "'", double2 == 6.553600000000004E-7d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0272");
        double double2 = JavaAlgorithms.calculateTax(4.0960000000000024E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000005E-9d + "'", double2 == 8.192000000000005E-9d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0273");
        double double2 = JavaAlgorithms.calculateTax(1.1468800000000005E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.293760000000001E-10d + "'", double2 == 2.293760000000001E-10d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0274");
        double double2 = JavaAlgorithms.calculateTax(1.0485760000000012E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0971520000000026E-15d + "'", double2 == 2.0971520000000026E-15d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0275");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000027E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2428800000000056E-14d + "'", double2 == 5.2428800000000056E-14d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0276");
        double double2 = JavaAlgorithms.calculateTax(2.7262976000000016E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.452595200000003E-13d + "'", double2 == 5.452595200000003E-13d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0277");
        double double2 = JavaAlgorithms.calculateTax(2.0971520000000026E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000005E-16d + "'", double2 == 4.194304000000005E-16d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0278");
        double double2 = JavaAlgorithms.calculateTax(5.085593600000005E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.017118720000001E-12d + "'", double2 == 1.017118720000001E-12d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0279");
        double double2 = JavaAlgorithms.calculateTax(6.356992000000007E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2713984000000013E-10d + "'", double2 == 1.2713984000000013E-10d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0280");
        double double2 = JavaAlgorithms.calculateTax(5.2428800000000056E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0485760000000012E-14d + "'", double2 == 1.0485760000000012E-14d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0281");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000005E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.638400000000001E-8d + "'", double2 == 1.638400000000001E-8d);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0282");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000017E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.242880000000004E-9d + "'", double2 == 5.242880000000004E-9d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0283");
        double double2 = JavaAlgorithms.calculateTax(4.587520000000002E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.175040000000005E-12d + "'", double2 == 9.175040000000005E-12d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0284");
        double double2 = JavaAlgorithms.calculateTax(4.587520000000002E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.175040000000005E-12d + "'", double2 == 9.175040000000005E-12d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0285");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000005E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.638400000000001E-9d + "'", double2 == 1.638400000000001E-9d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0286");
        double double2 = JavaAlgorithms.calculateTax(1.2713984000000013E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5427968000000025E-11d + "'", double2 == 2.5427968000000025E-11d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0287");
        double double2 = JavaAlgorithms.calculateTax(1.017118720000001E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0342374400000022E-13d + "'", double2 == 2.0342374400000022E-13d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0288");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000013E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000027E-13d + "'", double2 == 2.6214400000000027E-13d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0289");
        double double2 = JavaAlgorithms.calculateTax(2.293760000000001E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.587520000000002E-11d + "'", double2 == 4.587520000000002E-11d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0290");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000008E-7d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000017E-8d + "'", double2 == 2.6214400000000017E-8d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0291");
        double double2 = JavaAlgorithms.calculateTax(8.192000000000005E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.638400000000001E-9d + "'", double2 == 1.638400000000001E-9d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0292");
        double double2 = JavaAlgorithms.calculateTax(4.096000000000002E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.192000000000005E-10d + "'", double2 == 8.192000000000005E-10d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0293");
        double double2 = JavaAlgorithms.calculateTax(2.0342374400000022E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0684748800000044E-14d + "'", double2 == 4.0684748800000044E-14d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0294");
        double double2 = JavaAlgorithms.calculateTax(1.017118720000001E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0342374400000022E-13d + "'", double2 == 2.0342374400000022E-13d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0295");
        double double2 = JavaAlgorithms.calculateTax(2.0342374400000022E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0684748800000044E-14d + "'", double2 == 4.0684748800000044E-14d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0296");
        double double2 = JavaAlgorithms.calculateTax(5.734400000000002E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1468800000000005E-9d + "'", double2 == 1.1468800000000005E-9d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0297");
        double double2 = JavaAlgorithms.calculateTax(2.0971520000000026E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000005E-16d + "'", double2 == 4.194304000000005E-16d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0298");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000011E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000025E-11d + "'", double2 == 2.6214400000000025E-11d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0299");
        double double2 = JavaAlgorithms.calculateTax(2.0480000000000011E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0960000000000024E-8d + "'", double2 == 4.0960000000000024E-8d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0300");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000017E-8d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.242880000000004E-9d + "'", double2 == 5.242880000000004E-9d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0301");
        double double2 = JavaAlgorithms.calculateTax(5.452595200000003E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0905190400000007E-13d + "'", double2 == 1.0905190400000007E-13d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0302");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000005E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.388608000000011E-17d + "'", double2 == 8.388608000000011E-17d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0303");
        double double2 = JavaAlgorithms.calculateTax(1.0905190400000007E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1810380800000017E-14d + "'", double2 == 2.1810380800000017E-14d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0304");
        double double2 = JavaAlgorithms.calculateTax(2.5427968000000025E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.085593600000005E-12d + "'", double2 == 5.085593600000005E-12d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0305");
        double double2 = JavaAlgorithms.calculateTax(2.8672000000000007E-8d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.734400000000002E-9d + "'", double2 == 5.734400000000002E-9d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0306");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000011E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000025E-11d + "'", double2 == 2.6214400000000025E-11d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0307");
        double double2 = JavaAlgorithms.calculateTax(9.175040000000005E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.835008000000001E-12d + "'", double2 == 1.835008000000001E-12d);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0308");
        double double2 = JavaAlgorithms.calculateTax(8.388608000000011E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6777216000000023E-17d + "'", double2 == 1.6777216000000023E-17d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0309");
        double double2 = JavaAlgorithms.calculateTax(1.638400000000001E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2768000000000026E-10d + "'", double2 == 3.2768000000000026E-10d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0310");
        double double2 = JavaAlgorithms.calculateTax(3.2768000000000026E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000006E-11d + "'", double2 == 6.553600000000006E-11d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0311");
        double double2 = JavaAlgorithms.calculateTax(2.7262976000000016E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.452595200000003E-13d + "'", double2 == 5.452595200000003E-13d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0312");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000004E-7d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000008E-7d + "'", double2 == 1.3107200000000008E-7d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0313");
        double double2 = JavaAlgorithms.calculateTax(4.0684748800000044E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.136949760000009E-15d + "'", double2 == 8.136949760000009E-15d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0314");
        double double2 = JavaAlgorithms.calculateTax(1.835008000000001E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6700160000000027E-13d + "'", double2 == 3.6700160000000027E-13d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0315");
        double double2 = JavaAlgorithms.calculateTax(1.6384000000000013E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.276800000000003E-11d + "'", double2 == 3.276800000000003E-11d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0316");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000025E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.242880000000005E-12d + "'", double2 == 5.242880000000005E-12d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0317");
        double double2 = JavaAlgorithms.calculateTax(8.388608000000011E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6777216000000023E-17d + "'", double2 == 1.6777216000000023E-17d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0318");
        double double2 = JavaAlgorithms.calculateTax(3.6700160000000027E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.340032000000006E-14d + "'", double2 == 7.340032000000006E-14d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0319");
        double double2 = JavaAlgorithms.calculateTax(1.2800000000000005E-4d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5600000000000012E-5d + "'", double2 == 2.5600000000000012E-5d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0320");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000006E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000013E-11d + "'", double2 == 1.3107200000000013E-11d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0321");
        double double2 = JavaAlgorithms.calculateTax(1.0905190400000007E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1810380800000017E-14d + "'", double2 == 2.1810380800000017E-14d);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0322");
        double double2 = JavaAlgorithms.calculateTax(5.242880000000004E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048576000000001E-9d + "'", double2 == 1.048576000000001E-9d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0323");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000006E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000013E-11d + "'", double2 == 1.3107200000000013E-11d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0324");
        double double2 = JavaAlgorithms.calculateTax(8.136949760000009E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6273899520000018E-15d + "'", double2 == 1.6273899520000018E-15d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0325");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000013E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000026E-12d + "'", double2 == 2.6214400000000026E-12d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0326");
        double double2 = JavaAlgorithms.calculateTax(7.340032000000006E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4680064000000014E-14d + "'", double2 == 1.4680064000000014E-14d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0327");
        double double2 = JavaAlgorithms.calculateTax(5.242880000000005E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048576000000001E-12d + "'", double2 == 1.048576000000001E-12d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0328");
        double double2 = JavaAlgorithms.calculateTax(1.6777216000000023E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3554432000000048E-18d + "'", double2 == 3.3554432000000048E-18d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0329");
        double double2 = JavaAlgorithms.calculateTax(1.4680064000000014E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.936012800000003E-15d + "'", double2 == 2.936012800000003E-15d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0330");
        double double2 = JavaAlgorithms.calculateTax(1.4680064000000014E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.936012800000003E-15d + "'", double2 == 2.936012800000003E-15d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0331");
        double double2 = JavaAlgorithms.calculateTax(1.6777216000000023E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3554432000000048E-18d + "'", double2 == 3.3554432000000048E-18d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0332");
        double double2 = JavaAlgorithms.calculateTax(1.3631488000000008E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7262976000000016E-12d + "'", double2 == 2.7262976000000016E-12d);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0333");
        double double2 = JavaAlgorithms.calculateTax(9.175040000000005E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.835008000000001E-12d + "'", double2 == 1.835008000000001E-12d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0334");
        double double2 = JavaAlgorithms.calculateTax(2.936012800000003E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.872025600000006E-16d + "'", double2 == 5.872025600000006E-16d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0335");
        double double2 = JavaAlgorithms.calculateTax(2.1810380800000017E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.362076160000004E-15d + "'", double2 == 4.362076160000004E-15d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0336");
        double double2 = JavaAlgorithms.calculateTax(5.872025600000006E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.174405120000001E-16d + "'", double2 == 1.174405120000001E-16d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0337");
        double double2 = JavaAlgorithms.calculateTax(2.1810380800000017E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.362076160000004E-15d + "'", double2 == 4.362076160000004E-15d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0338");
        double double2 = JavaAlgorithms.calculateTax(1.174405120000001E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3488102400000023E-17d + "'", double2 == 2.3488102400000023E-17d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0339");
        double double2 = JavaAlgorithms.calculateTax(1.835008000000001E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6700160000000027E-13d + "'", double2 == 3.6700160000000027E-13d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0340");
        double double2 = JavaAlgorithms.calculateTax(2.936012800000003E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.872025600000006E-16d + "'", double2 == 5.872025600000006E-16d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0341");
        double double2 = JavaAlgorithms.calculateTax(1.3107200000000013E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6214400000000026E-12d + "'", double2 == 2.6214400000000026E-12d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0342");
        double double2 = JavaAlgorithms.calculateTax(1.048576000000001E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0971520000000022E-13d + "'", double2 == 2.0971520000000022E-13d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0343");
        double double2 = JavaAlgorithms.calculateTax(1.048576000000001E-9d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.097152000000002E-10d + "'", double2 == 2.097152000000002E-10d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0344");
        double double2 = JavaAlgorithms.calculateTax(4.362076160000004E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.724152320000008E-16d + "'", double2 == 8.724152320000008E-16d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0345");
        double double2 = JavaAlgorithms.calculateTax(2.3488102400000023E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.697620480000005E-18d + "'", double2 == 4.697620480000005E-18d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0346");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000026E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.242880000000005E-13d + "'", double2 == 5.242880000000005E-13d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0347");
        double double2 = JavaAlgorithms.calculateTax(4.362076160000004E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.724152320000008E-16d + "'", double2 == 8.724152320000008E-16d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0348");
        double double2 = JavaAlgorithms.calculateTax(5.242880000000005E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0485760000000011E-13d + "'", double2 == 1.0485760000000011E-13d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0349");
        double double2 = JavaAlgorithms.calculateTax(4.697620480000005E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.39524096000001E-19d + "'", double2 == 9.39524096000001E-19d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0350");
        double double2 = JavaAlgorithms.calculateTax(9.39524096000001E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8790481920000021E-19d + "'", double2 == 1.8790481920000021E-19d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0351");
        double double2 = JavaAlgorithms.calculateTax(5.872025600000006E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.174405120000001E-16d + "'", double2 == 1.174405120000001E-16d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0352");
        double double2 = JavaAlgorithms.calculateTax(1.048576000000001E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0971520000000022E-13d + "'", double2 == 2.0971520000000022E-13d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0353");
        double double2 = JavaAlgorithms.calculateTax(3.6700160000000027E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.340032000000006E-14d + "'", double2 == 7.340032000000006E-14d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0354");
        double double2 = JavaAlgorithms.calculateTax(8.724152320000008E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7448304640000017E-16d + "'", double2 == 1.7448304640000017E-16d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0355");
        double double2 = JavaAlgorithms.calculateTax(1.048576000000001E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.097152000000002E-10d + "'", double2 == 2.097152000000002E-10d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0356");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000026E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.242880000000005E-13d + "'", double2 == 5.242880000000005E-13d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0357");
        double double2 = JavaAlgorithms.calculateTax(2.0971520000000022E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000005E-14d + "'", double2 == 4.194304000000005E-14d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0358");
        double double2 = JavaAlgorithms.calculateTax(2.097152000000002E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000004E-11d + "'", double2 == 4.194304000000004E-11d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0359");
        double double2 = JavaAlgorithms.calculateTax(1.6273899520000018E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.254779904000004E-16d + "'", double2 == 3.254779904000004E-16d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0360");
        double double2 = JavaAlgorithms.calculateTax(2.6214400000000025E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.242880000000005E-12d + "'", double2 == 5.242880000000005E-12d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0361");
        double double2 = JavaAlgorithms.calculateTax(3.2768000000000026E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000006E-11d + "'", double2 == 6.553600000000006E-11d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0362");
        double double2 = JavaAlgorithms.calculateTax(3.276800000000002E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553600000000005E-10d + "'", double2 == 6.553600000000005E-10d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0363");
        double double2 = JavaAlgorithms.calculateTax(3.3554432000000048E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.71088640000001E-19d + "'", double2 == 6.71088640000001E-19d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0364");
        double double2 = JavaAlgorithms.calculateTax(4.0684748800000044E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.136949760000009E-15d + "'", double2 == 8.136949760000009E-15d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0365");
        double double2 = JavaAlgorithms.calculateTax(5.085593600000005E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.017118720000001E-12d + "'", double2 == 1.017118720000001E-12d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0366");
        double double2 = JavaAlgorithms.calculateTax(5.452595200000003E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0905190400000007E-13d + "'", double2 == 1.0905190400000007E-13d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0367");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000005E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.38860800000001E-15d + "'", double2 == 8.38860800000001E-15d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0368");
        double double2 = JavaAlgorithms.calculateTax(6.553600000000005E-10d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3107200000000011E-10d + "'", double2 == 1.3107200000000011E-10d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0369");
        double double2 = JavaAlgorithms.calculateTax(5.242880000000004E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048576000000001E-9d + "'", double2 == 1.048576000000001E-9d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0370");
        double double2 = JavaAlgorithms.calculateTax(1.8790481920000021E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7580963840000045E-20d + "'", double2 == 3.7580963840000045E-20d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0371");
        double double2 = JavaAlgorithms.calculateTax(8.724152320000008E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7448304640000017E-16d + "'", double2 == 1.7448304640000017E-16d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0372");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000004E-11d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.388608000000009E-12d + "'", double2 == 8.388608000000009E-12d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0373");
        double double2 = JavaAlgorithms.calculateTax(3.3554432000000048E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.71088640000001E-19d + "'", double2 == 6.71088640000001E-19d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0374");
        double double2 = JavaAlgorithms.calculateTax(2.0971520000000022E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000005E-14d + "'", double2 == 4.194304000000005E-14d);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0375");
        double double2 = JavaAlgorithms.calculateTax(8.136949760000009E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6273899520000018E-15d + "'", double2 == 1.6273899520000018E-15d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0376");
        double double2 = JavaAlgorithms.calculateTax(3.254779904000004E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.509559808000007E-17d + "'", double2 == 6.509559808000007E-17d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0377");
        double double2 = JavaAlgorithms.calculateTax(1.0485760000000011E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0971520000000024E-14d + "'", double2 == 2.0971520000000024E-14d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0378");
        double double2 = JavaAlgorithms.calculateTax(6.509559808000007E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3019119616000016E-17d + "'", double2 == 1.3019119616000016E-17d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0379");
        double double2 = JavaAlgorithms.calculateTax(6.509559808000007E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3019119616000016E-17d + "'", double2 == 1.3019119616000016E-17d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0380");
        double double2 = JavaAlgorithms.calculateTax(1.7448304640000017E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4896609280000037E-17d + "'", double2 == 3.4896609280000037E-17d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0381");
        double double2 = JavaAlgorithms.calculateTax(1.8790481920000021E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7580963840000045E-20d + "'", double2 == 3.7580963840000045E-20d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0382");
        double double2 = JavaAlgorithms.calculateTax(9.39524096000001E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8790481920000021E-19d + "'", double2 == 1.8790481920000021E-19d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0383");
        double double2 = JavaAlgorithms.calculateTax(2.097152000000002E-10d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000004E-11d + "'", double2 == 4.194304000000004E-11d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0384");
        double double2 = JavaAlgorithms.calculateTax(5.242880000000005E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0485760000000011E-13d + "'", double2 == 1.0485760000000011E-13d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0385");
        double double2 = JavaAlgorithms.calculateTax(2.0971520000000024E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000005E-15d + "'", double2 == 4.194304000000005E-15d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0386");
        double double2 = JavaAlgorithms.calculateTax(8.388608000000009E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6777216000000018E-12d + "'", double2 == 1.6777216000000018E-12d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0387");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000005E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.38860800000001E-16d + "'", double2 == 8.38860800000001E-16d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0388");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000005E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.38860800000001E-16d + "'", double2 == 8.38860800000001E-16d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0389");
        double double2 = JavaAlgorithms.calculateTax(6.71088640000001E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.342177280000002E-19d + "'", double2 == 1.342177280000002E-19d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0390");
        double double2 = JavaAlgorithms.calculateTax(8.388608000000009E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6777216000000018E-12d + "'", double2 == 1.6777216000000018E-12d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0391");
        double double2 = JavaAlgorithms.calculateTax(3.4896609280000037E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.979321856000008E-18d + "'", double2 == 6.979321856000008E-18d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0392");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000005E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.38860800000001E-15d + "'", double2 == 8.38860800000001E-15d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0393");
        double double2 = JavaAlgorithms.calculateTax(1.638400000000001E-9d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2768000000000026E-10d + "'", double2 == 3.2768000000000026E-10d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0394");
        double double2 = JavaAlgorithms.calculateTax(1.6777216000000018E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.355443200000004E-13d + "'", double2 == 3.355443200000004E-13d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0395");
        double double2 = JavaAlgorithms.calculateTax(6.71088640000001E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.342177280000002E-19d + "'", double2 == 1.342177280000002E-19d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0396");
        double double2 = JavaAlgorithms.calculateTax(8.38860800000001E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.677721600000002E-15d + "'", double2 == 1.677721600000002E-15d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0397");
        double double2 = JavaAlgorithms.calculateTax(3.7580963840000045E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.51619276800001E-21d + "'", double2 == 7.51619276800001E-21d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0398");
        double double2 = JavaAlgorithms.calculateTax(8.38860800000001E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6777216000000022E-16d + "'", double2 == 1.6777216000000022E-16d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0399");
        double double2 = JavaAlgorithms.calculateTax(7.51619276800001E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.503238553600002E-21d + "'", double2 == 1.503238553600002E-21d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0400");
        double double2 = JavaAlgorithms.calculateTax(1.503238553600002E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.006477107200004E-22d + "'", double2 == 3.006477107200004E-22d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0401");
        double double2 = JavaAlgorithms.calculateTax(1.0485760000000012E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0971520000000026E-15d + "'", double2 == 2.0971520000000026E-15d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0402");
        double double2 = JavaAlgorithms.calculateTax(6.979321856000008E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3958643712000016E-18d + "'", double2 == 1.3958643712000016E-18d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0403");
        double double2 = JavaAlgorithms.calculateTax(3.4896609280000037E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.979321856000008E-18d + "'", double2 == 6.979321856000008E-18d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0404");
        double double2 = JavaAlgorithms.calculateTax(1.3958643712000016E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7917287424000034E-19d + "'", double2 == 2.7917287424000034E-19d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0405");
        double double2 = JavaAlgorithms.calculateTax(1.3958643712000016E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7917287424000034E-19d + "'", double2 == 2.7917287424000034E-19d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0406");
        double double2 = JavaAlgorithms.calculateTax(1.6777216000000022E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3554432000000047E-17d + "'", double2 == 3.3554432000000047E-17d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0407");
        double double2 = JavaAlgorithms.calculateTax(3.355443200000004E-13d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.710886400000008E-14d + "'", double2 == 6.710886400000008E-14d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0408");
        double double2 = JavaAlgorithms.calculateTax(4.697620480000005E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.39524096000001E-19d + "'", double2 == 9.39524096000001E-19d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0409");
        double double2 = JavaAlgorithms.calculateTax(1.677721600000002E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3554432000000043E-16d + "'", double2 == 3.3554432000000043E-16d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0410");
        double double2 = JavaAlgorithms.calculateTax(2.7917287424000034E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.583457484800006E-20d + "'", double2 == 5.583457484800006E-20d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0411");
        double double2 = JavaAlgorithms.calculateTax(2.0971520000000024E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194304000000005E-15d + "'", double2 == 4.194304000000005E-15d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0412");
        double double2 = JavaAlgorithms.calculateTax(1.174405120000001E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3488102400000023E-17d + "'", double2 == 2.3488102400000023E-17d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0413");
        double double2 = JavaAlgorithms.calculateTax(1.7448304640000017E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4896609280000037E-17d + "'", double2 == 3.4896609280000037E-17d);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0414");
        double double2 = JavaAlgorithms.calculateTax(1.0485760000000011E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0971520000000024E-14d + "'", double2 == 2.0971520000000024E-14d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0415");
        double double2 = JavaAlgorithms.calculateTax(3.006477107200004E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.012954214400008E-23d + "'", double2 == 6.012954214400008E-23d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0416");
        double double2 = JavaAlgorithms.calculateTax(5.583457484800006E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1166914969600013E-20d + "'", double2 == 1.1166914969600013E-20d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0417");
        double double2 = JavaAlgorithms.calculateTax(1.503238553600002E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.006477107200004E-22d + "'", double2 == 3.006477107200004E-22d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0418");
        double double2 = JavaAlgorithms.calculateTax(6.012954214400008E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2025908428800017E-23d + "'", double2 == 1.2025908428800017E-23d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0419");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000004E-11d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.388608000000009E-12d + "'", double2 == 8.388608000000009E-12d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0420");
        double double2 = JavaAlgorithms.calculateTax(6.012954214400008E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2025908428800017E-23d + "'", double2 == 1.2025908428800017E-23d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0421");
        double double2 = JavaAlgorithms.calculateTax(6.979321856000008E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3958643712000016E-18d + "'", double2 == 1.3958643712000016E-18d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0422");
        double double2 = JavaAlgorithms.calculateTax(2.7917287424000034E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.583457484800006E-20d + "'", double2 == 5.583457484800006E-20d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0423");
        double double2 = JavaAlgorithms.calculateTax(1.342177280000002E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.684354560000004E-20d + "'", double2 == 2.684354560000004E-20d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0424");
        double double2 = JavaAlgorithms.calculateTax(1.2025908428800017E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4051816857600036E-24d + "'", double2 == 2.4051816857600036E-24d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0425");
        double double2 = JavaAlgorithms.calculateTax(8.38860800000001E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6777216000000022E-16d + "'", double2 == 1.6777216000000022E-16d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0426");
        double double2 = JavaAlgorithms.calculateTax(1.3019119616000016E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6038239232000034E-18d + "'", double2 == 2.6038239232000034E-18d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0427");
        double double2 = JavaAlgorithms.calculateTax(1.6777216000000022E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3554432000000047E-17d + "'", double2 == 3.3554432000000047E-17d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0428");
        double double2 = JavaAlgorithms.calculateTax(6.710886400000008E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3421772800000016E-14d + "'", double2 == 1.3421772800000016E-14d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0429");
        double double2 = JavaAlgorithms.calculateTax(2.6038239232000034E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.207647846400008E-19d + "'", double2 == 5.207647846400008E-19d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0430");
        double double2 = JavaAlgorithms.calculateTax(1.1166914969600013E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2333829939200026E-21d + "'", double2 == 2.2333829939200026E-21d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0431");
        double double2 = JavaAlgorithms.calculateTax(2.684354560000004E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000009E-21d + "'", double2 == 5.368709120000009E-21d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0432");
        double double2 = JavaAlgorithms.calculateTax(2.2333829939200026E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.466765987840005E-22d + "'", double2 == 4.466765987840005E-22d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0433");
        double double2 = JavaAlgorithms.calculateTax(3.3554432000000043E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.710886400000009E-17d + "'", double2 == 6.710886400000009E-17d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0434");
        double double2 = JavaAlgorithms.calculateTax(3.355443200000004E-13d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.710886400000008E-14d + "'", double2 == 6.710886400000008E-14d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0435");
        double double2 = JavaAlgorithms.calculateTax(1.3019119616000016E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6038239232000034E-18d + "'", double2 == 2.6038239232000034E-18d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0436");
        double double2 = JavaAlgorithms.calculateTax(3.7580963840000045E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.51619276800001E-21d + "'", double2 == 7.51619276800001E-21d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0437");
        double double2 = JavaAlgorithms.calculateTax(1.6777216000000018E-12d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.355443200000004E-13d + "'", double2 == 3.355443200000004E-13d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0438");
        double double2 = JavaAlgorithms.calculateTax(2.3488102400000023E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.697620480000005E-18d + "'", double2 == 4.697620480000005E-18d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0439");
        double double2 = JavaAlgorithms.calculateTax(5.207647846400008E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0415295692800016E-19d + "'", double2 == 1.0415295692800016E-19d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0440");
        double double2 = JavaAlgorithms.calculateTax(3.006477107200004E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.012954214400008E-23d + "'", double2 == 6.012954214400008E-23d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0441");
        double double2 = JavaAlgorithms.calculateTax(2.4051816857600036E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.810363371520007E-25d + "'", double2 == 4.810363371520007E-25d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0442");
        double double2 = JavaAlgorithms.calculateTax(3.254779904000004E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.509559808000007E-17d + "'", double2 == 6.509559808000007E-17d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0443");
        double double2 = JavaAlgorithms.calculateTax(1.0415295692800016E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0830591385600032E-20d + "'", double2 == 2.0830591385600032E-20d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0444");
        double double2 = JavaAlgorithms.calculateTax(8.38860800000001E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.677721600000002E-15d + "'", double2 == 1.677721600000002E-15d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0445");
        double double2 = JavaAlgorithms.calculateTax(5.583457484800006E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1166914969600013E-20d + "'", double2 == 1.1166914969600013E-20d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0446");
        double double2 = JavaAlgorithms.calculateTax(5.242880000000005E-12d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.048576000000001E-12d + "'", double2 == 1.048576000000001E-12d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0447");
        double double2 = JavaAlgorithms.calculateTax(1.1166914969600013E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2333829939200026E-21d + "'", double2 == 2.2333829939200026E-21d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0448");
        double double2 = JavaAlgorithms.calculateTax(4.810363371520007E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.620726743040015E-26d + "'", double2 == 9.620726743040015E-26d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0449");
        double double2 = JavaAlgorithms.calculateTax(1.0415295692800016E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0830591385600032E-20d + "'", double2 == 2.0830591385600032E-20d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0450");
        double double2 = JavaAlgorithms.calculateTax(2.6038239232000034E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.207647846400008E-19d + "'", double2 == 5.207647846400008E-19d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0451");
        double double2 = JavaAlgorithms.calculateTax(2.0830591385600032E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1661182771200065E-21d + "'", double2 == 4.1661182771200065E-21d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0452");
        double double2 = JavaAlgorithms.calculateTax(9.620726743040015E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9241453486080032E-26d + "'", double2 == 1.9241453486080032E-26d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0453");
        double double2 = JavaAlgorithms.calculateTax(4.194304000000005E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.388608000000011E-17d + "'", double2 == 8.388608000000011E-17d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0454");
        double double2 = JavaAlgorithms.calculateTax(2.4051816857600036E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.810363371520007E-25d + "'", double2 == 4.810363371520007E-25d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0455");
        double double2 = JavaAlgorithms.calculateTax(4.466765987840005E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.93353197568001E-23d + "'", double2 == 8.93353197568001E-23d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0456");
        double double2 = JavaAlgorithms.calculateTax(9.620726743040015E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9241453486080032E-26d + "'", double2 == 1.9241453486080032E-26d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0457");
        double double2 = JavaAlgorithms.calculateTax(6.710886400000008E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3421772800000016E-14d + "'", double2 == 1.3421772800000016E-14d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0458");
        double double2 = JavaAlgorithms.calculateTax(7.340032000000006E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4680064000000014E-14d + "'", double2 == 1.4680064000000014E-14d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0459");
        double double2 = JavaAlgorithms.calculateTax(6.710886400000009E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3421772800000019E-17d + "'", double2 == 1.3421772800000019E-17d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0460");
        double double2 = JavaAlgorithms.calculateTax(1.3421772800000016E-14d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6843545600000034E-15d + "'", double2 == 2.6843545600000034E-15d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0461");
        double double2 = JavaAlgorithms.calculateTax(1.3421772800000019E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.684354560000004E-18d + "'", double2 == 2.684354560000004E-18d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0462");
        double double2 = JavaAlgorithms.calculateTax(7.51619276800001E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.503238553600002E-21d + "'", double2 == 1.503238553600002E-21d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0463");
        double double2 = JavaAlgorithms.calculateTax(2.6843545600000034E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000007E-16d + "'", double2 == 5.368709120000007E-16d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0464");
        double double2 = JavaAlgorithms.calculateTax(2.0830591385600032E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1661182771200065E-21d + "'", double2 == 4.1661182771200065E-21d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0465");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000009E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000018E-21d + "'", double2 == 1.0737418240000018E-21d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0466");
        double double2 = JavaAlgorithms.calculateTax(2.684354560000004E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000008E-19d + "'", double2 == 5.368709120000008E-19d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0467");
        double double2 = JavaAlgorithms.calculateTax(3.3554432000000043E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.710886400000009E-17d + "'", double2 == 6.710886400000009E-17d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0468");
        double double2 = JavaAlgorithms.calculateTax(1.677721600000002E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3554432000000043E-16d + "'", double2 == 3.3554432000000043E-16d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0469");
        double double2 = JavaAlgorithms.calculateTax(2.2333829939200026E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.466765987840005E-22d + "'", double2 == 4.466765987840005E-22d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0470");
        double double2 = JavaAlgorithms.calculateTax(5.207647846400008E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0415295692800016E-19d + "'", double2 == 1.0415295692800016E-19d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0471");
        double double2 = JavaAlgorithms.calculateTax(2.684354560000004E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000008E-19d + "'", double2 == 5.368709120000008E-19d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0472");
        double double2 = JavaAlgorithms.calculateTax(4.466765987840005E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.93353197568001E-23d + "'", double2 == 8.93353197568001E-23d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0473");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000018E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000035E-22d + "'", double2 == 2.1474836480000035E-22d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0474");
        double double2 = JavaAlgorithms.calculateTax(1.9241453486080032E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8482906972160065E-27d + "'", double2 == 3.8482906972160065E-27d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0475");
        double double2 = JavaAlgorithms.calculateTax(1.2025908428800017E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4051816857600036E-24d + "'", double2 == 2.4051816857600036E-24d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0476");
        double double2 = JavaAlgorithms.calculateTax(1.9241453486080032E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8482906972160065E-27d + "'", double2 == 3.8482906972160065E-27d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0477");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000008E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000017E-19d + "'", double2 == 1.0737418240000017E-19d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0478");
        double double2 = JavaAlgorithms.calculateTax(3.3554432000000047E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.7108864000000095E-18d + "'", double2 == 6.7108864000000095E-18d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0479");
        double double2 = JavaAlgorithms.calculateTax(6.7108864000000095E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.342177280000002E-18d + "'", double2 == 1.342177280000002E-18d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0480");
        double double2 = JavaAlgorithms.calculateTax(1.6273899520000018E-15d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.254779904000004E-16d + "'", double2 == 3.254779904000004E-16d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0481");
        double double2 = JavaAlgorithms.calculateTax(3.8482906972160065E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.696581394432013E-28d + "'", double2 == 7.696581394432013E-28d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0482");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000007E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000015E-16d + "'", double2 == 1.0737418240000015E-16d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0483");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000008E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000017E-19d + "'", double2 == 1.0737418240000017E-19d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0484");
        double double2 = JavaAlgorithms.calculateTax(3.8482906972160065E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.696581394432013E-28d + "'", double2 == 7.696581394432013E-28d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0485");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000035E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000007E-23d + "'", double2 == 4.294967296000007E-23d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0486");
        double double2 = JavaAlgorithms.calculateTax(2.684354560000004E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000009E-21d + "'", double2 == 5.368709120000009E-21d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0487");
        double double2 = JavaAlgorithms.calculateTax(7.696581394432013E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5393162788864027E-28d + "'", double2 == 1.5393162788864027E-28d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0488");
        double double2 = JavaAlgorithms.calculateTax(4.1661182771200065E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.332236554240013E-22d + "'", double2 == 8.332236554240013E-22d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0489");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000007E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000015E-16d + "'", double2 == 1.0737418240000015E-16d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0490");
        double double2 = JavaAlgorithms.calculateTax(8.332236554240013E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6664473108480028E-22d + "'", double2 == 1.6664473108480028E-22d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0491");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000018E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000035E-22d + "'", double2 == 2.1474836480000035E-22d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0492");
        double double2 = JavaAlgorithms.calculateTax(1.342177280000002E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.684354560000004E-19d + "'", double2 == 2.684354560000004E-19d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0493");
        double double2 = JavaAlgorithms.calculateTax(7.696581394432013E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5393162788864027E-28d + "'", double2 == 1.5393162788864027E-28d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0494");
        double double2 = JavaAlgorithms.calculateTax(4.1661182771200065E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.332236554240013E-22d + "'", double2 == 8.332236554240013E-22d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0495");
        double double2 = JavaAlgorithms.calculateTax(8.93353197568001E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7867063951360023E-23d + "'", double2 == 1.7867063951360023E-23d);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0496");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000007E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000015E-24d + "'", double2 == 8.589934592000015E-24d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0497");
        double double2 = JavaAlgorithms.calculateTax(1.5393162788864027E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.078632557772806E-29d + "'", double2 == 3.078632557772806E-29d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0498");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000009E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000018E-21d + "'", double2 == 1.0737418240000018E-21d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0499");
        double double2 = JavaAlgorithms.calculateTax(1.6664473108480028E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3328946216960057E-23d + "'", double2 == 3.3328946216960057E-23d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test0500");
        double double2 = JavaAlgorithms.calculateTax(8.93353197568001E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7867063951360023E-23d + "'", double2 == 1.7867063951360023E-23d);
    }
}

