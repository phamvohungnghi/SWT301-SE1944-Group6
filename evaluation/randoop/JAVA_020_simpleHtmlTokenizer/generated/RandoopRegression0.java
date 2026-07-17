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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test2");
        java.util.List<java.lang.String[]> strArrayList1 = JavaAlgorithms.simpleHtmlTokenizer("");
        java.lang.Class<?> wildcardClass2 = strArrayList1.getClass();
        org.junit.Assert.assertNotNull(strArrayList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test3");
        JavaAlgorithms javaAlgorithms0 = new JavaAlgorithms();
        java.lang.Class<?> wildcardClass1 = javaAlgorithms0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression0.test4");
        java.util.List<java.lang.String[]> strArrayList1 = JavaAlgorithms.simpleHtmlTokenizer("hi!");
        java.lang.Class<?> wildcardClass2 = strArrayList1.getClass();
        org.junit.Assert.assertNotNull(strArrayList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

