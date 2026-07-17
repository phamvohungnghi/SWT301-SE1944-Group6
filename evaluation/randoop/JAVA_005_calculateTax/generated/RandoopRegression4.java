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
        double double2 = JavaAlgorithms.calculateTax(1.8268770466636457E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.653754093327292E-110d + "'", double2 == 3.653754093327292E-110d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2002");
        double double2 = JavaAlgorithms.calculateTax(3.40282366920941E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418821E-89d + "'", double2 == 6.805647338418821E-89d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2003");
        double double2 = JavaAlgorithms.calculateTax(2.2300745198530807E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4601490397061615E-97d + "'", double2 == 4.4601490397061615E-97d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2004");
        double double2 = JavaAlgorithms.calculateTax(1.393796574908175E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.78759314981635E-94d + "'", double2 == 2.78759314981635E-94d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2005");
        double double2 = JavaAlgorithms.calculateTax(1.2195720030446525E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.439144006089305E-96d + "'", double2 == 2.439144006089305E-96d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2006");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632701E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265402E-95d + "'", double2 == 1.1150372599265402E-95d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2007");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511762E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023525E-89d + "'", double2 == 8.507059173023525E-89d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2008");
        double double2 = JavaAlgorithms.calculateTax(2.78759314981635E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632701E-95d + "'", double2 == 5.575186299632701E-95d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2009");
        double double2 = JavaAlgorithms.calculateTax(3.653754093327292E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654584E-111d + "'", double2 == 7.307508186654584E-111d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2010");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265402E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2300745198530807E-96d + "'", double2 == 2.2300745198530807E-96d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2011");
        double double2 = JavaAlgorithms.calculateTax(4.4601490397061615E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412324E-98d + "'", double2 == 8.920298079412324E-98d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2012");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412324E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.784059615882465E-98d + "'", double2 == 1.784059615882465E-98d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2013");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023524E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7014118346047048E-87d + "'", double2 == 1.7014118346047048E-87d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2014");
        double double2 = JavaAlgorithms.calculateTax(4.1259236989164044E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.251847397832808E-87d + "'", double2 == 8.251847397832808E-87d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2015");
        double double2 = JavaAlgorithms.calculateTax(3.4028236692094105E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418821E-91d + "'", double2 == 6.805647338418821E-91d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2016");
        double double2 = JavaAlgorithms.calculateTax(4.4601490397061615E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412324E-98d + "'", double2 == 8.920298079412324E-98d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2017");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418821E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837643E-91d + "'", double2 == 1.3611294676837643E-91d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2018");
        double double2 = JavaAlgorithms.calculateTax(4.1259236989164044E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.251847397832808E-87d + "'", double2 == 8.251847397832808E-87d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2019");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837643E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7222589353675288E-92d + "'", double2 == 2.7222589353675288E-92d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2020");
        double double2 = JavaAlgorithms.calculateTax(2.126764793255881E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511762E-88d + "'", double2 == 4.253529586511762E-88d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2021");
        double double2 = JavaAlgorithms.calculateTax(2.7222589353675288E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.444517870735058E-93d + "'", double2 == 5.444517870735058E-93d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2022");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654584E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.461501637330917E-111d + "'", double2 == 1.461501637330917E-111d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2023");
        double double2 = JavaAlgorithms.calculateTax(5.444517870735058E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470117E-93d + "'", double2 == 1.0889035741470117E-93d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2024");
        double double2 = JavaAlgorithms.calculateTax(1.7014118346047053E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4028236692094105E-90d + "'", double2 == 3.4028236692094105E-90d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2025");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023525E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7014118346047053E-89d + "'", double2 == 1.7014118346047053E-89d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2026");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540875E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.393796574908175E-93d + "'", double2 == 1.393796574908175E-93d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2027");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470117E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1778071482940236E-94d + "'", double2 == 2.1778071482940236E-94d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2028");
        double double2 = JavaAlgorithms.calculateTax(3.40282366920941E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418821E-89d + "'", double2 == 6.805647338418821E-89d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2029");
        double double2 = JavaAlgorithms.calculateTax(2.439144006089305E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.87828801217861E-97d + "'", double2 == 4.87828801217861E-97d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2030");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412324E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.784059615882465E-98d + "'", double2 == 1.784059615882465E-98d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2031");
        double double2 = JavaAlgorithms.calculateTax(1.5244650038058153E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.048930007611631E-94d + "'", double2 == 3.048930007611631E-94d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2032");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418821E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837643E-91d + "'", double2 == 1.3611294676837643E-91d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2033");
        double double2 = JavaAlgorithms.calculateTax(1.784059615882465E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.56811923176493E-99d + "'", double2 == 3.56811923176493E-99d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2034");
        double double2 = JavaAlgorithms.calculateTax(6.097860015223262E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2195720030446525E-95d + "'", double2 == 1.2195720030446525E-95d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2035");
        double double2 = JavaAlgorithms.calculateTax(1.784059615882465E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.56811923176493E-99d + "'", double2 == 3.56811923176493E-99d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2036");
        double double2 = JavaAlgorithms.calculateTax(8.251847397832808E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6503694795665619E-87d + "'", double2 == 1.6503694795665619E-87d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2037");
        double double2 = JavaAlgorithms.calculateTax(1.461501637330917E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661834E-112d + "'", double2 == 2.923003274661834E-112d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2038");
        double double2 = JavaAlgorithms.calculateTax(1.461501637330917E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661834E-112d + "'", double2 == 2.923003274661834E-112d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2039");
        double double2 = JavaAlgorithms.calculateTax(1.7014118346047048E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.40282366920941E-88d + "'", double2 == 3.40282366920941E-88d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2040");
        double double2 = JavaAlgorithms.calculateTax(2.1778071482940236E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588047E-95d + "'", double2 == 4.355614296588047E-95d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2041");
        double double2 = JavaAlgorithms.calculateTax(2.2300745198530807E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4601490397061615E-97d + "'", double2 == 4.4601490397061615E-97d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2042");
        double double2 = JavaAlgorithms.calculateTax(4.87828801217861E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.756576024357221E-98d + "'", double2 == 9.756576024357221E-98d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2043");
        double double2 = JavaAlgorithms.calculateTax(1.6503694795665619E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.300738959133124E-88d + "'", double2 == 3.300738959133124E-88d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2044");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418821E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837642E-89d + "'", double2 == 1.3611294676837642E-89d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2045");
        double double2 = JavaAlgorithms.calculateTax(5.444517870735058E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470117E-93d + "'", double2 == 1.0889035741470117E-93d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2046");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661834E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.846006549323668E-113d + "'", double2 == 5.846006549323668E-113d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2047");
        double double2 = JavaAlgorithms.calculateTax(5.846006549323668E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647337E-113d + "'", double2 == 1.1692013098647337E-113d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2048");
        double double2 = JavaAlgorithms.calculateTax(2.4319387245186425E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.863877449037285E-115d + "'", double2 == 4.863877449037285E-115d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2049");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647337E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3384026197294676E-114d + "'", double2 == 2.3384026197294676E-114d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2050");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661834E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.846006549323668E-113d + "'", double2 == 5.846006549323668E-113d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2051");
        double double2 = JavaAlgorithms.calculateTax(4.863877449037285E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.72775489807457E-116d + "'", double2 == 9.72775489807457E-116d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2052");
        double double2 = JavaAlgorithms.calculateTax(3.56811923176493E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.13623846352986E-100d + "'", double2 == 7.13623846352986E-100d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2053");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588047E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176095E-96d + "'", double2 == 8.711228593176095E-96d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2054");
        double double2 = JavaAlgorithms.calculateTax(3.653754093327292E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654584E-111d + "'", double2 == 7.307508186654584E-111d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2055");
        double double2 = JavaAlgorithms.calculateTax(2.1778071482940236E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588047E-95d + "'", double2 == 4.355614296588047E-95d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2056");
        double double2 = JavaAlgorithms.calculateTax(2.439144006089305E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.87828801217861E-97d + "'", double2 == 4.87828801217861E-97d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2057");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837643E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7222589353675288E-92d + "'", double2 == 2.7222589353675288E-92d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2058");
        double double2 = JavaAlgorithms.calculateTax(1.8268770466636457E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.653754093327292E-110d + "'", double2 == 3.653754093327292E-110d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2059");
        double double2 = JavaAlgorithms.calculateTax(3.811162509514538E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.622325019029076E-93d + "'", double2 == 7.622325019029076E-93d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2060");
        double double2 = JavaAlgorithms.calculateTax(4.863877449037285E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.72775489807457E-116d + "'", double2 == 9.72775489807457E-116d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2061");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654584E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.461501637330917E-111d + "'", double2 == 1.461501637330917E-111d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2062");
        double double2 = JavaAlgorithms.calculateTax(9.72775489807457E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.945550979614914E-116d + "'", double2 == 1.945550979614914E-116d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2063");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418821E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837642E-89d + "'", double2 == 1.3611294676837642E-89d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2064");
        double double2 = JavaAlgorithms.calculateTax(2.3384026197294676E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.676805239458935E-115d + "'", double2 == 4.676805239458935E-115d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2065");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837642E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7222589353675284E-90d + "'", double2 == 2.7222589353675284E-90d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2066");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588047E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176095E-96d + "'", double2 == 8.711228593176095E-96d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2067");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470117E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1778071482940236E-94d + "'", double2 == 2.1778071482940236E-94d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2068");
        double double2 = JavaAlgorithms.calculateTax(1.6503694795665619E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.300738959133124E-88d + "'", double2 == 3.300738959133124E-88d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2069");
        double double2 = JavaAlgorithms.calculateTax(3.300738959133124E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.601477918266248E-89d + "'", double2 == 6.601477918266248E-89d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2070");
        double double2 = JavaAlgorithms.calculateTax(5.846006549323668E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647337E-113d + "'", double2 == 1.1692013098647337E-113d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2071");
        double double2 = JavaAlgorithms.calculateTax(8.251847397832808E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6503694795665619E-87d + "'", double2 == 1.6503694795665619E-87d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2072");
        double double2 = JavaAlgorithms.calculateTax(6.601477918266248E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3202955836532498E-89d + "'", double2 == 1.3202955836532498E-89d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2073");
        double double2 = JavaAlgorithms.calculateTax(3.300738959133124E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.601477918266248E-89d + "'", double2 == 6.601477918266248E-89d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2074");
        double double2 = JavaAlgorithms.calculateTax(1.945550979614914E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8911019592298285E-117d + "'", double2 == 3.8911019592298285E-117d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2075");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176095E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.742245718635219E-96d + "'", double2 == 1.742245718635219E-96d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2076");
        double double2 = JavaAlgorithms.calculateTax(3.8911019592298285E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.782203918459657E-118d + "'", double2 == 7.782203918459657E-118d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2077");
        double double2 = JavaAlgorithms.calculateTax(3.56811923176493E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.13623846352986E-100d + "'", double2 == 7.13623846352986E-100d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2078");
        double double2 = JavaAlgorithms.calculateTax(7.782203918459657E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5564407836919317E-118d + "'", double2 == 1.5564407836919317E-118d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2079");
        double double2 = JavaAlgorithms.calculateTax(1.742245718635219E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270438E-97d + "'", double2 == 3.484491437270438E-97d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2080");
        double double2 = JavaAlgorithms.calculateTax(7.13623846352986E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059722E-100d + "'", double2 == 1.4272476927059722E-100d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2081");
        double double2 = JavaAlgorithms.calculateTax(2.3384026197294676E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.676805239458935E-115d + "'", double2 == 4.676805239458935E-115d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2082");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059722E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8544953854119446E-101d + "'", double2 == 2.8544953854119446E-101d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2083");
        double double2 = JavaAlgorithms.calculateTax(1.5564407836919317E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.112881567383864E-119d + "'", double2 == 3.112881567383864E-119d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2084");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837642E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7222589353675284E-90d + "'", double2 == 2.7222589353675284E-90d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2085");
        double double2 = JavaAlgorithms.calculateTax(6.601477918266248E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3202955836532498E-89d + "'", double2 == 1.3202955836532498E-89d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2086");
        double double2 = JavaAlgorithms.calculateTax(1.3202955836532498E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6405911673064995E-90d + "'", double2 == 2.6405911673064995E-90d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2087");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270438E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540877E-98d + "'", double2 == 6.968982874540877E-98d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2088");
        double double2 = JavaAlgorithms.calculateTax(3.112881567383864E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.225763134767728E-120d + "'", double2 == 6.225763134767728E-120d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2089");
        double double2 = JavaAlgorithms.calculateTax(2.8544953854119446E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823889E-102d + "'", double2 == 5.708990770823889E-102d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2090");
        double double2 = JavaAlgorithms.calculateTax(3.8911019592298285E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.782203918459657E-118d + "'", double2 == 7.782203918459657E-118d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2091");
        double double2 = JavaAlgorithms.calculateTax(6.225763134767728E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2451526269535457E-120d + "'", double2 == 1.2451526269535457E-120d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2092");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270438E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540877E-98d + "'", double2 == 6.968982874540877E-98d);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2093");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823889E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.141798154164778E-102d + "'", double2 == 1.141798154164778E-102d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2094");
        double double2 = JavaAlgorithms.calculateTax(1.141798154164778E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.283596308329556E-103d + "'", double2 == 2.283596308329556E-103d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2095");
        double double2 = JavaAlgorithms.calculateTax(7.782203918459657E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5564407836919317E-118d + "'", double2 == 1.5564407836919317E-118d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2096");
        double double2 = JavaAlgorithms.calculateTax(7.13623846352986E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059722E-100d + "'", double2 == 1.4272476927059722E-100d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2097");
        double double2 = JavaAlgorithms.calculateTax(2.7222589353675284E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.444517870735057E-91d + "'", double2 == 5.444517870735057E-91d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2098");
        double double2 = JavaAlgorithms.calculateTax(9.756576024357221E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9513152048714443E-98d + "'", double2 == 1.9513152048714443E-98d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2099");
        double double2 = JavaAlgorithms.calculateTax(5.444517870735057E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470115E-91d + "'", double2 == 1.0889035741470115E-91d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2100");
        double double2 = JavaAlgorithms.calculateTax(4.87828801217861E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.756576024357221E-98d + "'", double2 == 9.756576024357221E-98d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2101");
        double double2 = JavaAlgorithms.calculateTax(1.2195720030446525E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.439144006089305E-96d + "'", double2 == 2.439144006089305E-96d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2102");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176095E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.742245718635219E-96d + "'", double2 == 1.742245718635219E-96d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2103");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059722E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8544953854119446E-101d + "'", double2 == 2.8544953854119446E-101d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2104");
        double double2 = JavaAlgorithms.calculateTax(1.3202955836532498E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6405911673064995E-90d + "'", double2 == 2.6405911673064995E-90d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2105");
        double double2 = JavaAlgorithms.calculateTax(2.6405911673064995E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.281182334612999E-91d + "'", double2 == 5.281182334612999E-91d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2106");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540877E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3937965749081755E-98d + "'", double2 == 1.3937965749081755E-98d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2107");
        double double2 = JavaAlgorithms.calculateTax(1.9513152048714443E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9026304097428884E-99d + "'", double2 == 3.9026304097428884E-99d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2108");
        double double2 = JavaAlgorithms.calculateTax(1.5564407836919317E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.112881567383864E-119d + "'", double2 == 3.112881567383864E-119d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2109");
        double double2 = JavaAlgorithms.calculateTax(1.141798154164778E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.283596308329556E-103d + "'", double2 == 2.283596308329556E-103d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2110");
        double double2 = JavaAlgorithms.calculateTax(3.9026304097428884E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.805260819485777E-100d + "'", double2 == 7.805260819485777E-100d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2111");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823889E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.141798154164778E-102d + "'", double2 == 1.141798154164778E-102d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2112");
        double double2 = JavaAlgorithms.calculateTax(3.9026304097428884E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.805260819485777E-100d + "'", double2 == 7.805260819485777E-100d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2113");
        double double2 = JavaAlgorithms.calculateTax(6.225763134767728E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2451526269535457E-120d + "'", double2 == 1.2451526269535457E-120d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2114");
        double double2 = JavaAlgorithms.calculateTax(3.4028236692094105E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418821E-91d + "'", double2 == 6.805647338418821E-91d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2115");
        double double2 = JavaAlgorithms.calculateTax(1.2451526269535457E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4903052539070915E-121d + "'", double2 == 2.4903052539070915E-121d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2116");
        double double2 = JavaAlgorithms.calculateTax(2.7222589353675284E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.444517870735057E-91d + "'", double2 == 5.444517870735057E-91d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2117");
        double double2 = JavaAlgorithms.calculateTax(2.283596308329556E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5671926166591125E-104d + "'", double2 == 4.5671926166591125E-104d);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2118");
        double double2 = JavaAlgorithms.calculateTax(1.3937965749081755E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.787593149816351E-99d + "'", double2 == 2.787593149816351E-99d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2119");
        double double2 = JavaAlgorithms.calculateTax(5.281182334612999E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0562364669225998E-91d + "'", double2 == 1.0562364669225998E-91d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2120");
        double double2 = JavaAlgorithms.calculateTax(2.787593149816351E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632703E-100d + "'", double2 == 5.575186299632703E-100d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2121");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318228E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8268770466636457E-109d + "'", double2 == 1.8268770466636457E-109d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2122");
        double double2 = JavaAlgorithms.calculateTax(3.112881567383864E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.225763134767728E-120d + "'", double2 == 6.225763134767728E-120d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2123");
        double double2 = JavaAlgorithms.calculateTax(2.4319387245186425E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.863877449037285E-115d + "'", double2 == 4.863877449037285E-115d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2124");
        double double2 = JavaAlgorithms.calculateTax(2.4903052539070915E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.980610507814183E-122d + "'", double2 == 4.980610507814183E-122d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2125");
        double double2 = JavaAlgorithms.calculateTax(7.805260819485777E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5610521638971555E-100d + "'", double2 == 1.5610521638971555E-100d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2126");
        double double2 = JavaAlgorithms.calculateTax(4.676805239458935E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.353610478917871E-116d + "'", double2 == 9.353610478917871E-116d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2127");
        double double2 = JavaAlgorithms.calculateTax(1.0562364669225998E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1124729338451998E-92d + "'", double2 == 2.1124729338451998E-92d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2128");
        double double2 = JavaAlgorithms.calculateTax(2.283596308329556E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5671926166591125E-104d + "'", double2 == 4.5671926166591125E-104d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2129");
        double double2 = JavaAlgorithms.calculateTax(4.980610507814183E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.961221015628366E-123d + "'", double2 == 9.961221015628366E-123d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2130");
        double double2 = JavaAlgorithms.calculateTax(1.9513152048714443E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9026304097428884E-99d + "'", double2 == 3.9026304097428884E-99d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2131");
        double double2 = JavaAlgorithms.calculateTax(1.742245718635219E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270438E-97d + "'", double2 == 3.484491437270438E-97d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2132");
        double double2 = JavaAlgorithms.calculateTax(2.4903052539070915E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.980610507814183E-122d + "'", double2 == 4.980610507814183E-122d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2133");
        double double2 = JavaAlgorithms.calculateTax(5.281182334612999E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0562364669225998E-91d + "'", double2 == 1.0562364669225998E-91d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2134");
        double double2 = JavaAlgorithms.calculateTax(1.945550979614914E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8911019592298285E-117d + "'", double2 == 3.8911019592298285E-117d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2135");
        double double2 = JavaAlgorithms.calculateTax(5.444517870735057E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470115E-91d + "'", double2 == 1.0889035741470115E-91d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2136");
        double double2 = JavaAlgorithms.calculateTax(4.5671926166591125E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318226E-105d + "'", double2 == 9.134385233318226E-105d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2137");
        double double2 = JavaAlgorithms.calculateTax(9.353610478917871E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835744E-116d + "'", double2 == 1.8707220957835744E-116d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2138");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470115E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.177807148294023E-92d + "'", double2 == 2.177807148294023E-92d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2139");
        double double2 = JavaAlgorithms.calculateTax(2.7222589353675288E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.444517870735058E-93d + "'", double2 == 5.444517870735058E-93d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2140");
        double double2 = JavaAlgorithms.calculateTax(2.1124729338451998E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2249458676904E-93d + "'", double2 == 4.2249458676904E-93d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2141");
        double double2 = JavaAlgorithms.calculateTax(9.353610478917871E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835744E-116d + "'", double2 == 1.8707220957835744E-116d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2142");
        double double2 = JavaAlgorithms.calculateTax(1.2451526269535457E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4903052539070915E-121d + "'", double2 == 2.4903052539070915E-121d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2143");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835744E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567149E-117d + "'", double2 == 3.741444191567149E-117d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2144");
        double double2 = JavaAlgorithms.calculateTax(9.72775489807457E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.945550979614914E-116d + "'", double2 == 1.945550979614914E-116d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2145");
        double double2 = JavaAlgorithms.calculateTax(2.1124729338451998E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2249458676904E-93d + "'", double2 == 4.2249458676904E-93d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2146");
        double double2 = JavaAlgorithms.calculateTax(9.961221015628366E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9922442031256734E-123d + "'", double2 == 1.9922442031256734E-123d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2147");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632703E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265406E-100d + "'", double2 == 1.1150372599265406E-100d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2148");
        double double2 = JavaAlgorithms.calculateTax(2.8544953854119446E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823889E-102d + "'", double2 == 5.708990770823889E-102d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2149");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318226E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8268770466636454E-105d + "'", double2 == 1.8268770466636454E-105d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2150");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318226E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8268770466636454E-105d + "'", double2 == 1.8268770466636454E-105d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2151");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632703E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265406E-100d + "'", double2 == 1.1150372599265406E-100d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2152");
        double double2 = JavaAlgorithms.calculateTax(2.787593149816351E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632703E-100d + "'", double2 == 5.575186299632703E-100d);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2153");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835744E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567149E-117d + "'", double2 == 3.741444191567149E-117d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2154");
        double double2 = JavaAlgorithms.calculateTax(7.805260819485777E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5610521638971555E-100d + "'", double2 == 1.5610521638971555E-100d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2155");
        double double2 = JavaAlgorithms.calculateTax(4.2249458676904E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.4498917353808E-94d + "'", double2 == 8.4498917353808E-94d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2156");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540877E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3937965749081755E-98d + "'", double2 == 1.3937965749081755E-98d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2157");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265406E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2300745198530812E-101d + "'", double2 == 2.2300745198530812E-101d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2158");
        double double2 = JavaAlgorithms.calculateTax(1.9922442031256734E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.984488406251347E-124d + "'", double2 == 3.984488406251347E-124d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2159");
        double double2 = JavaAlgorithms.calculateTax(3.984488406251347E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.968976812502695E-125d + "'", double2 == 7.968976812502695E-125d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2160");
        double double2 = JavaAlgorithms.calculateTax(9.961221015628366E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9922442031256734E-123d + "'", double2 == 1.9922442031256734E-123d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2161");
        double double2 = JavaAlgorithms.calculateTax(2.177807148294023E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588047E-93d + "'", double2 == 4.355614296588047E-93d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2162");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567149E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134298E-118d + "'", double2 == 7.482888383134298E-118d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2163");
        double double2 = JavaAlgorithms.calculateTax(4.676805239458935E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.353610478917871E-116d + "'", double2 == 9.353610478917871E-116d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2164");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647337E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3384026197294676E-114d + "'", double2 == 2.3384026197294676E-114d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2165");
        double double2 = JavaAlgorithms.calculateTax(3.984488406251347E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.968976812502695E-125d + "'", double2 == 7.968976812502695E-125d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2166");
        double double2 = JavaAlgorithms.calculateTax(1.8268770466636454E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.653754093327291E-106d + "'", double2 == 3.653754093327291E-106d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2167");
        double double2 = JavaAlgorithms.calculateTax(3.653754093327291E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654582E-107d + "'", double2 == 7.307508186654582E-107d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2168");
        double double2 = JavaAlgorithms.calculateTax(8.4498917353808E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6899783470761602E-94d + "'", double2 == 1.6899783470761602E-94d);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2169");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265406E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2300745198530812E-101d + "'", double2 == 2.2300745198530812E-101d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2170");
        double double2 = JavaAlgorithms.calculateTax(1.0562364669225998E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1124729338451998E-92d + "'", double2 == 2.1124729338451998E-92d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2171");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588047E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176094E-94d + "'", double2 == 8.711228593176094E-94d);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2172");
        double double2 = JavaAlgorithms.calculateTax(1.6899783470761602E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.379956694152321E-95d + "'", double2 == 3.379956694152321E-95d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2173");
        double double2 = JavaAlgorithms.calculateTax(3.653754093327291E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654582E-107d + "'", double2 == 7.307508186654582E-107d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2174");
        double double2 = JavaAlgorithms.calculateTax(2.6405911673064995E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.281182334612999E-91d + "'", double2 == 5.281182334612999E-91d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2175");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588047E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176094E-94d + "'", double2 == 8.711228593176094E-94d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2176");
        double double2 = JavaAlgorithms.calculateTax(1.5610521638971555E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1221043277943113E-101d + "'", double2 == 3.1221043277943113E-101d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2177");
        double double2 = JavaAlgorithms.calculateTax(2.2300745198530812E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.460149039706163E-102d + "'", double2 == 4.460149039706163E-102d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2178");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470115E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.177807148294023E-92d + "'", double2 == 2.177807148294023E-92d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2179");
        double double2 = JavaAlgorithms.calculateTax(1.8268770466636454E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.653754093327291E-106d + "'", double2 == 3.653754093327291E-106d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2180");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567149E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134298E-118d + "'", double2 == 7.482888383134298E-118d);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2181");
        double double2 = JavaAlgorithms.calculateTax(4.980610507814183E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.961221015628366E-123d + "'", double2 == 9.961221015628366E-123d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2182");
        double double2 = JavaAlgorithms.calculateTax(8.4498917353808E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6899783470761602E-94d + "'", double2 == 1.6899783470761602E-94d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2183");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176094E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7422457186352188E-94d + "'", double2 == 1.7422457186352188E-94d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2184");
        double double2 = JavaAlgorithms.calculateTax(4.460149039706163E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412327E-103d + "'", double2 == 8.920298079412327E-103d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2185");
        double double2 = JavaAlgorithms.calculateTax(1.9922442031256734E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.984488406251347E-124d + "'", double2 == 3.984488406251347E-124d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2186");
        double double2 = JavaAlgorithms.calculateTax(4.460149039706163E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412327E-103d + "'", double2 == 8.920298079412327E-103d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2187");
        double double2 = JavaAlgorithms.calculateTax(7.968976812502695E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.593795362500539E-125d + "'", double2 == 1.593795362500539E-125d);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2188");
        double double2 = JavaAlgorithms.calculateTax(4.5671926166591125E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318226E-105d + "'", double2 == 9.134385233318226E-105d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2189");
        double double2 = JavaAlgorithms.calculateTax(1.5610521638971555E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1221043277943113E-101d + "'", double2 == 3.1221043277943113E-101d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2190");
        double double2 = JavaAlgorithms.calculateTax(1.7422457186352188E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270438E-95d + "'", double2 == 3.484491437270438E-95d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2191");
        double double2 = JavaAlgorithms.calculateTax(2.2300745198530812E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.460149039706163E-102d + "'", double2 == 4.460149039706163E-102d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2192");
        double double2 = JavaAlgorithms.calculateTax(1.7422457186352188E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270438E-95d + "'", double2 == 3.484491437270438E-95d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2193");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924626E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849252E-82d + "'", double2 == 1.3292279957849252E-82d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2194");
        double double2 = JavaAlgorithms.calculateTax(1.593795362500539E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1875907250010783E-126d + "'", double2 == 3.1875907250010783E-126d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2195");
        double double2 = JavaAlgorithms.calculateTax(9.756576024357221E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9513152048714443E-98d + "'", double2 == 1.9513152048714443E-98d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2196");
        double double2 = JavaAlgorithms.calculateTax(3.1875907250010783E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.375181450002157E-127d + "'", double2 == 6.375181450002157E-127d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2197");
        double double2 = JavaAlgorithms.calculateTax(3.1221043277943113E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.244208655588623E-102d + "'", double2 == 6.244208655588623E-102d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2198");
        double double2 = JavaAlgorithms.calculateTax(3.1875907250010783E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.375181450002157E-127d + "'", double2 == 6.375181450002157E-127d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2199");
        double double2 = JavaAlgorithms.calculateTax(3.1221043277943113E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.244208655588623E-102d + "'", double2 == 6.244208655588623E-102d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2200");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270438E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540876E-96d + "'", double2 == 6.968982874540876E-96d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2201");
        double double2 = JavaAlgorithms.calculateTax(6.244208655588623E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2488417311177246E-102d + "'", double2 == 1.2488417311177246E-102d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2202");
        double double2 = JavaAlgorithms.calculateTax(1.3937965749081755E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.787593149816351E-99d + "'", double2 == 2.787593149816351E-99d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2203");
        double double2 = JavaAlgorithms.calculateTax(2.177807148294023E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588047E-93d + "'", double2 == 4.355614296588047E-93d);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2204");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654582E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4615016373309166E-107d + "'", double2 == 1.4615016373309166E-107d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2205");
        double double2 = JavaAlgorithms.calculateTax(1.4615016373309166E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661833E-108d + "'", double2 == 2.923003274661833E-108d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2206");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134298E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4965776766268598E-118d + "'", double2 == 1.4965776766268598E-118d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2207");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661833E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.846006549323667E-109d + "'", double2 == 5.846006549323667E-109d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2208");
        double double2 = JavaAlgorithms.calculateTax(5.846006549323667E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647335E-109d + "'", double2 == 1.1692013098647335E-109d);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2209");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412327E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7840596158824654E-103d + "'", double2 == 1.7840596158824654E-103d);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2210");
        double double2 = JavaAlgorithms.calculateTax(1.593795362500539E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1875907250010783E-126d + "'", double2 == 3.1875907250010783E-126d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2211");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540876E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3937965749081753E-96d + "'", double2 == 1.3937965749081753E-96d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2212");
        double double2 = JavaAlgorithms.calculateTax(3.379956694152321E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.759913388304642E-96d + "'", double2 == 6.759913388304642E-96d);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2213");
        double double2 = JavaAlgorithms.calculateTax(1.2488417311177246E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.497683462235449E-103d + "'", double2 == 2.497683462235449E-103d);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2214");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134298E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4965776766268598E-118d + "'", double2 == 1.4965776766268598E-118d);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2215");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412327E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7840596158824654E-103d + "'", double2 == 1.7840596158824654E-103d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2216");
        double double2 = JavaAlgorithms.calculateTax(7.968976812502695E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.593795362500539E-125d + "'", double2 == 1.593795362500539E-125d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2217");
        double double2 = JavaAlgorithms.calculateTax(6.759913388304642E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3519826776609285E-96d + "'", double2 == 1.3519826776609285E-96d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2218");
        double double2 = JavaAlgorithms.calculateTax(5.846006549323667E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647335E-109d + "'", double2 == 1.1692013098647335E-109d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2219");
        double double2 = JavaAlgorithms.calculateTax(1.3937965749081753E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.787593149816351E-97d + "'", double2 == 2.787593149816351E-97d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2220");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176094E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7422457186352188E-94d + "'", double2 == 1.7422457186352188E-94d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2221");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647335E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.338402619729467E-110d + "'", double2 == 2.338402619729467E-110d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2222");
        double double2 = JavaAlgorithms.calculateTax(2.787593149816351E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632702E-98d + "'", double2 == 5.575186299632702E-98d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2223");
        double double2 = JavaAlgorithms.calculateTax(1.2488417311177246E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.497683462235449E-103d + "'", double2 == 2.497683462235449E-103d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2224");
        double double2 = JavaAlgorithms.calculateTax(1.3519826776609285E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.703965355321857E-97d + "'", double2 == 2.703965355321857E-97d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2225");
        double double2 = JavaAlgorithms.calculateTax(2.703965355321857E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.407930710643714E-98d + "'", double2 == 5.407930710643714E-98d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2226");
        double double2 = JavaAlgorithms.calculateTax(2.338402619729467E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.676805239458934E-111d + "'", double2 == 4.676805239458934E-111d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2227");
        double double2 = JavaAlgorithms.calculateTax(1.4615016373309166E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661833E-108d + "'", double2 == 2.923003274661833E-108d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2228");
        double double2 = JavaAlgorithms.calculateTax(2.338402619729467E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.676805239458934E-111d + "'", double2 == 4.676805239458934E-111d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2229");
        double double2 = JavaAlgorithms.calculateTax(4.676805239458934E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.35361047891787E-112d + "'", double2 == 9.35361047891787E-112d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2230");
        double double2 = JavaAlgorithms.calculateTax(1.7840596158824654E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.568119231764931E-104d + "'", double2 == 3.568119231764931E-104d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2231");
        double double2 = JavaAlgorithms.calculateTax(1.6899783470761602E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.379956694152321E-95d + "'", double2 == 3.379956694152321E-95d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2232");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632702E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265405E-98d + "'", double2 == 1.1150372599265405E-98d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2233");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654582E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4615016373309166E-107d + "'", double2 == 1.4615016373309166E-107d);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2234");
        double double2 = JavaAlgorithms.calculateTax(4.2249458676904E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.4498917353808E-94d + "'", double2 == 8.4498917353808E-94d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2235");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632702E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265405E-98d + "'", double2 == 1.1150372599265405E-98d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2236");
        double double2 = JavaAlgorithms.calculateTax(1.4965776766268598E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99315535325372E-119d + "'", double2 == 2.99315535325372E-119d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2237");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647335E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.338402619729467E-110d + "'", double2 == 2.338402619729467E-110d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2238");
        double double2 = JavaAlgorithms.calculateTax(1.3519826776609285E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.703965355321857E-97d + "'", double2 == 2.703965355321857E-97d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2239");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661833E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.846006549323667E-109d + "'", double2 == 5.846006549323667E-109d);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2240");
        double double2 = JavaAlgorithms.calculateTax(2.99315535325372E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.98631070650744E-120d + "'", double2 == 5.98631070650744E-120d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2241");
        double double2 = JavaAlgorithms.calculateTax(9.35361047891787E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835739E-112d + "'", double2 == 1.8707220957835739E-112d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2242");
        double double2 = JavaAlgorithms.calculateTax(2.497683462235449E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9953669244708987E-104d + "'", double2 == 4.9953669244708987E-104d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2243");
        double double2 = JavaAlgorithms.calculateTax(2.703965355321857E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.407930710643714E-98d + "'", double2 == 5.407930710643714E-98d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2244");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540876E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3937965749081753E-96d + "'", double2 == 1.3937965749081753E-96d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2245");
        double double2 = JavaAlgorithms.calculateTax(5.407930710643714E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.081586142128743E-98d + "'", double2 == 1.081586142128743E-98d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2246");
        double double2 = JavaAlgorithms.calculateTax(1.081586142128743E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.163172284257486E-99d + "'", double2 == 2.163172284257486E-99d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2247");
        double double2 = JavaAlgorithms.calculateTax(2.497683462235449E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9953669244708987E-104d + "'", double2 == 4.9953669244708987E-104d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2248");
        double double2 = JavaAlgorithms.calculateTax(2.163172284257486E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.326344568514972E-100d + "'", double2 == 4.326344568514972E-100d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2249");
        double double2 = JavaAlgorithms.calculateTax(1.7840596158824654E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.568119231764931E-104d + "'", double2 == 3.568119231764931E-104d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2250");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270438E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540876E-96d + "'", double2 == 6.968982874540876E-96d);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2251");
        double double2 = JavaAlgorithms.calculateTax(9.35361047891787E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835739E-112d + "'", double2 == 1.8707220957835739E-112d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2252");
        double double2 = JavaAlgorithms.calculateTax(6.244208655588623E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2488417311177246E-102d + "'", double2 == 1.2488417311177246E-102d);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2253");
        double double2 = JavaAlgorithms.calculateTax(2.163172284257486E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.326344568514972E-100d + "'", double2 == 4.326344568514972E-100d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2254");
        double double2 = JavaAlgorithms.calculateTax(1.081586142128743E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.163172284257486E-99d + "'", double2 == 2.163172284257486E-99d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2255");
        double double2 = JavaAlgorithms.calculateTax(6.759913388304642E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3519826776609285E-96d + "'", double2 == 1.3519826776609285E-96d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2256");
        double double2 = JavaAlgorithms.calculateTax(4.326344568514972E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.652689137029944E-101d + "'", double2 == 8.652689137029944E-101d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2257");
        double double2 = JavaAlgorithms.calculateTax(2.99315535325372E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.98631070650744E-120d + "'", double2 == 5.98631070650744E-120d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2258");
        double double2 = JavaAlgorithms.calculateTax(3.568119231764931E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.136238463529863E-105d + "'", double2 == 7.136238463529863E-105d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2259");
        double double2 = JavaAlgorithms.calculateTax(8.652689137029944E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.730537827405989E-101d + "'", double2 == 1.730537827405989E-101d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2260");
        double double2 = JavaAlgorithms.calculateTax(5.98631070650744E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1972621413014881E-120d + "'", double2 == 1.1972621413014881E-120d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2261");
        double double2 = JavaAlgorithms.calculateTax(6.375181450002157E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2750362900004314E-127d + "'", double2 == 1.2750362900004314E-127d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2262");
        double double2 = JavaAlgorithms.calculateTax(7.136238463529863E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059727E-105d + "'", double2 == 1.4272476927059727E-105d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2263");
        double double2 = JavaAlgorithms.calculateTax(4.9953669244708987E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.990733848941798E-105d + "'", double2 == 9.990733848941798E-105d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2264");
        double double2 = JavaAlgorithms.calculateTax(1.730537827405989E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4610756548119777E-102d + "'", double2 == 3.4610756548119777E-102d);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2265");
        double double2 = JavaAlgorithms.calculateTax(7.136238463529863E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059727E-105d + "'", double2 == 1.4272476927059727E-105d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2266");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059727E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8544953854119457E-106d + "'", double2 == 2.8544953854119457E-106d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2267");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265405E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.230074519853081E-99d + "'", double2 == 2.230074519853081E-99d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2268");
        double double2 = JavaAlgorithms.calculateTax(5.407930710643714E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.081586142128743E-98d + "'", double2 == 1.081586142128743E-98d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2269");
        double double2 = JavaAlgorithms.calculateTax(2.230074519853081E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4601490397061625E-100d + "'", double2 == 4.4601490397061625E-100d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2270");
        double double2 = JavaAlgorithms.calculateTax(4.676805239458934E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.35361047891787E-112d + "'", double2 == 9.35361047891787E-112d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2271");
        double double2 = JavaAlgorithms.calculateTax(2.230074519853081E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4601490397061625E-100d + "'", double2 == 4.4601490397061625E-100d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2272");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059727E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8544953854119457E-106d + "'", double2 == 2.8544953854119457E-106d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2273");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835739E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567148E-113d + "'", double2 == 3.741444191567148E-113d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2274");
        double double2 = JavaAlgorithms.calculateTax(2.8544953854119457E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823892E-107d + "'", double2 == 5.708990770823892E-107d);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2275");
        double double2 = JavaAlgorithms.calculateTax(1.4965776766268598E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99315535325372E-119d + "'", double2 == 2.99315535325372E-119d);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2276");
        double double2 = JavaAlgorithms.calculateTax(4.326344568514972E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.652689137029944E-101d + "'", double2 == 8.652689137029944E-101d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2277");
        double double2 = JavaAlgorithms.calculateTax(3.4610756548119777E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.922151309623956E-103d + "'", double2 == 6.922151309623956E-103d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2278");
        double double2 = JavaAlgorithms.calculateTax(1.2750362900004314E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.550072580000863E-128d + "'", double2 == 2.550072580000863E-128d);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2279");
        double double2 = JavaAlgorithms.calculateTax(5.98631070650744E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1972621413014881E-120d + "'", double2 == 1.1972621413014881E-120d);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2280");
        double double2 = JavaAlgorithms.calculateTax(3.4610756548119777E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.922151309623956E-103d + "'", double2 == 6.922151309623956E-103d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2281");
        double double2 = JavaAlgorithms.calculateTax(6.375181450002157E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2750362900004314E-127d + "'", double2 == 1.2750362900004314E-127d);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2282");
        double double2 = JavaAlgorithms.calculateTax(2.550072580000863E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.100145160001726E-129d + "'", double2 == 5.100145160001726E-129d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2283");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567148E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134296E-114d + "'", double2 == 7.482888383134296E-114d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2284");
        double double2 = JavaAlgorithms.calculateTax(6.922151309623956E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3844302619247913E-103d + "'", double2 == 1.3844302619247913E-103d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2285");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265405E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.230074519853081E-99d + "'", double2 == 2.230074519853081E-99d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2286");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823892E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1417981541647784E-107d + "'", double2 == 1.1417981541647784E-107d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2287");
        double double2 = JavaAlgorithms.calculateTax(3.379956694152321E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.759913388304642E-96d + "'", double2 == 6.759913388304642E-96d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2288");
        double double2 = JavaAlgorithms.calculateTax(5.100145160001726E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0200290320003452E-129d + "'", double2 == 1.0200290320003452E-129d);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2289");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823892E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1417981541647784E-107d + "'", double2 == 1.1417981541647784E-107d);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2290");
        double double2 = JavaAlgorithms.calculateTax(6.922151309623956E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3844302619247913E-103d + "'", double2 == 1.3844302619247913E-103d);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2291");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835739E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567148E-113d + "'", double2 == 3.741444191567148E-113d);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2292");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134296E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4965776766268594E-114d + "'", double2 == 1.4965776766268594E-114d);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2293");
        double double2 = JavaAlgorithms.calculateTax(1.0200290320003452E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0400580640006904E-130d + "'", double2 == 2.0400580640006904E-130d);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2294");
        double double2 = JavaAlgorithms.calculateTax(8.652689137029944E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.730537827405989E-101d + "'", double2 == 1.730537827405989E-101d);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2295");
        double double2 = JavaAlgorithms.calculateTax(5.100145160001726E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0200290320003452E-129d + "'", double2 == 1.0200290320003452E-129d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2296");
        double double2 = JavaAlgorithms.calculateTax(1.4965776766268594E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993155353253719E-115d + "'", double2 == 2.993155353253719E-115d);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2297");
        double double2 = JavaAlgorithms.calculateTax(9.990733848941798E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9981467697883597E-105d + "'", double2 == 1.9981467697883597E-105d);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2298");
        double double2 = JavaAlgorithms.calculateTax(1.1417981541647784E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.283596308329557E-108d + "'", double2 == 2.283596308329557E-108d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2299");
        double double2 = JavaAlgorithms.calculateTax(4.4601490397061625E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412325E-101d + "'", double2 == 8.920298079412325E-101d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2300");
        double double2 = JavaAlgorithms.calculateTax(2.993155353253719E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.986310706507438E-116d + "'", double2 == 5.986310706507438E-116d);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2301");
        double double2 = JavaAlgorithms.calculateTax(1.9981467697883597E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9962935395767198E-106d + "'", double2 == 3.9962935395767198E-106d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2302");
        double double2 = JavaAlgorithms.calculateTax(2.0400580640006904E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.080116128001381E-131d + "'", double2 == 4.080116128001381E-131d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2303");
        double double2 = JavaAlgorithms.calculateTax(2.8544953854119457E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823892E-107d + "'", double2 == 5.708990770823892E-107d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2304");
        double double2 = JavaAlgorithms.calculateTax(2.993155353253719E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.986310706507438E-116d + "'", double2 == 5.986310706507438E-116d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2305");
        double double2 = JavaAlgorithms.calculateTax(1.1417981541647784E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.283596308329557E-108d + "'", double2 == 2.283596308329557E-108d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2306");
        double double2 = JavaAlgorithms.calculateTax(1.3937965749081753E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.787593149816351E-97d + "'", double2 == 2.787593149816351E-97d);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2307");
        double double2 = JavaAlgorithms.calculateTax(2.550072580000863E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.100145160001726E-129d + "'", double2 == 5.100145160001726E-129d);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2308");
        double double2 = JavaAlgorithms.calculateTax(1.9981467697883597E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9962935395767198E-106d + "'", double2 == 3.9962935395767198E-106d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2309");
        double double2 = JavaAlgorithms.calculateTax(1.4965776766268594E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993155353253719E-115d + "'", double2 == 2.993155353253719E-115d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2310");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412325E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7840596158824652E-101d + "'", double2 == 1.7840596158824652E-101d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2311");
        double double2 = JavaAlgorithms.calculateTax(1.0200290320003452E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0400580640006904E-130d + "'", double2 == 2.0400580640006904E-130d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2312");
        double double2 = JavaAlgorithms.calculateTax(3.9962935395767198E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.99258707915344E-107d + "'", double2 == 7.99258707915344E-107d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2313");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134296E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4965776766268594E-114d + "'", double2 == 1.4965776766268594E-114d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2314");
        double double2 = JavaAlgorithms.calculateTax(4.9953669244708987E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.990733848941798E-105d + "'", double2 == 9.990733848941798E-105d);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2315");
        double double2 = JavaAlgorithms.calculateTax(4.080116128001381E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.160232256002762E-132d + "'", double2 == 8.160232256002762E-132d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2316");
        double double2 = JavaAlgorithms.calculateTax(8.160232256002762E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6320464512005525E-132d + "'", double2 == 1.6320464512005525E-132d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2317");
        double double2 = JavaAlgorithms.calculateTax(1.3844302619247913E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.768860523849583E-104d + "'", double2 == 2.768860523849583E-104d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2318");
        double double2 = JavaAlgorithms.calculateTax(1.3844302619247913E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.768860523849583E-104d + "'", double2 == 2.768860523849583E-104d);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2319");
        double double2 = JavaAlgorithms.calculateTax(5.986310706507438E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1972621413014877E-116d + "'", double2 == 1.1972621413014877E-116d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2320");
        double double2 = JavaAlgorithms.calculateTax(1.730537827405989E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4610756548119777E-102d + "'", double2 == 3.4610756548119777E-102d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2321");
        double double2 = JavaAlgorithms.calculateTax(3.9962935395767198E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.99258707915344E-107d + "'", double2 == 7.99258707915344E-107d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2322");
        double double2 = JavaAlgorithms.calculateTax(1.1972621413014881E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029764E-121d + "'", double2 == 2.3945242826029764E-121d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2323");
        double double2 = JavaAlgorithms.calculateTax(1.1972621413014881E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029764E-121d + "'", double2 == 2.3945242826029764E-121d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2324");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029764E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205953E-122d + "'", double2 == 4.789048565205953E-122d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2325");
        double double2 = JavaAlgorithms.calculateTax(4.4601490397061625E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412325E-101d + "'", double2 == 8.920298079412325E-101d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2326");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205953E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411907E-123d + "'", double2 == 9.578097130411907E-123d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2327");
        double double2 = JavaAlgorithms.calculateTax(2.768860523849583E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.537721047699166E-105d + "'", double2 == 5.537721047699166E-105d);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2328");
        double double2 = JavaAlgorithms.calculateTax(5.537721047699166E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1075442095398333E-105d + "'", double2 == 1.1075442095398333E-105d);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2329");
        double double2 = JavaAlgorithms.calculateTax(1.6320464512005525E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.264092902401105E-133d + "'", double2 == 3.264092902401105E-133d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2330");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205953E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411907E-123d + "'", double2 == 9.578097130411907E-123d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2331");
        double double2 = JavaAlgorithms.calculateTax(2.768860523849583E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.537721047699166E-105d + "'", double2 == 5.537721047699166E-105d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2332");
        double double2 = JavaAlgorithms.calculateTax(3.568119231764931E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.136238463529863E-105d + "'", double2 == 7.136238463529863E-105d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2333");
        double double2 = JavaAlgorithms.calculateTax(2.787593149816351E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632702E-98d + "'", double2 == 5.575186299632702E-98d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2334");
        double double2 = JavaAlgorithms.calculateTax(2.283596308329557E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.567192616659114E-109d + "'", double2 == 4.567192616659114E-109d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2335");
        double double2 = JavaAlgorithms.calculateTax(1.6320464512005525E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.264092902401105E-133d + "'", double2 == 3.264092902401105E-133d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2336");
        double double2 = JavaAlgorithms.calculateTax(7.99258707915344E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.598517415830688E-107d + "'", double2 == 1.598517415830688E-107d);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2337");
        double double2 = JavaAlgorithms.calculateTax(1.1075442095398333E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2150884190796667E-106d + "'", double2 == 2.2150884190796667E-106d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2338");
        double double2 = JavaAlgorithms.calculateTax(2.283596308329557E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.567192616659114E-109d + "'", double2 == 4.567192616659114E-109d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2339");
        double double2 = JavaAlgorithms.calculateTax(7.99258707915344E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.598517415830688E-107d + "'", double2 == 1.598517415830688E-107d);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2340");
        double double2 = JavaAlgorithms.calculateTax(1.598517415830688E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1970348316613764E-108d + "'", double2 == 3.1970348316613764E-108d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2341");
        double double2 = JavaAlgorithms.calculateTax(4.567192616659114E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318229E-110d + "'", double2 == 9.134385233318229E-110d);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2342");
        double double2 = JavaAlgorithms.calculateTax(3.1970348316613764E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.394069663322753E-109d + "'", double2 == 6.394069663322753E-109d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2343");
        double double2 = JavaAlgorithms.calculateTax(9.990733848941798E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9981467697883597E-105d + "'", double2 == 1.9981467697883597E-105d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2344");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318229E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.826877046663646E-110d + "'", double2 == 1.826877046663646E-110d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2345");
        double double2 = JavaAlgorithms.calculateTax(4.567192616659114E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318229E-110d + "'", double2 == 9.134385233318229E-110d);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2346");
        double double2 = JavaAlgorithms.calculateTax(1.7840596158824652E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5681192317649307E-102d + "'", double2 == 3.5681192317649307E-102d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2347");
        double double2 = JavaAlgorithms.calculateTax(6.394069663322753E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2788139326645508E-109d + "'", double2 == 1.2788139326645508E-109d);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2348");
        double double2 = JavaAlgorithms.calculateTax(1.1075442095398333E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2150884190796667E-106d + "'", double2 == 2.2150884190796667E-106d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2349");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029764E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205953E-122d + "'", double2 == 4.789048565205953E-122d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2350");
        double double2 = JavaAlgorithms.calculateTax(1.2788139326645508E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5576278653291018E-110d + "'", double2 == 2.5576278653291018E-110d);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2351");
        double double2 = JavaAlgorithms.calculateTax(4.080116128001381E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.160232256002762E-132d + "'", double2 == 8.160232256002762E-132d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2352");
        double double2 = JavaAlgorithms.calculateTax(2.5576278653291018E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.115255730658204E-111d + "'", double2 == 5.115255730658204E-111d);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2353");
        double double2 = JavaAlgorithms.calculateTax(1.1972621413014877E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029757E-117d + "'", double2 == 2.3945242826029757E-117d);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2354");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318229E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.826877046663646E-110d + "'", double2 == 1.826877046663646E-110d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2355");
        double double2 = JavaAlgorithms.calculateTax(5.537721047699166E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1075442095398333E-105d + "'", double2 == 1.1075442095398333E-105d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2356");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567148E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134296E-114d + "'", double2 == 7.482888383134296E-114d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2357");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412325E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7840596158824652E-101d + "'", double2 == 1.7840596158824652E-101d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2358");
        double double2 = JavaAlgorithms.calculateTax(3.5681192317649307E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.136238463529862E-103d + "'", double2 == 7.136238463529862E-103d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2359");
        double double2 = JavaAlgorithms.calculateTax(6.394069663322753E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2788139326645508E-109d + "'", double2 == 1.2788139326645508E-109d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2360");
        double double2 = JavaAlgorithms.calculateTax(2.2150884190796667E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.430176838159334E-107d + "'", double2 == 4.430176838159334E-107d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2361");
        double double2 = JavaAlgorithms.calculateTax(7.136238463529862E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059724E-103d + "'", double2 == 1.4272476927059724E-103d);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2362");
        double double2 = JavaAlgorithms.calculateTax(3.5681192317649307E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.136238463529862E-103d + "'", double2 == 7.136238463529862E-103d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2363");
        double double2 = JavaAlgorithms.calculateTax(1.826877046663646E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.653754093327292E-111d + "'", double2 == 3.653754093327292E-111d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2364");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029757E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205952E-118d + "'", double2 == 4.789048565205952E-118d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2365");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059724E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.854495385411945E-104d + "'", double2 == 2.854495385411945E-104d);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2366");
        double double2 = JavaAlgorithms.calculateTax(5.986310706507438E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1972621413014877E-116d + "'", double2 == 1.1972621413014877E-116d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2367");
        double double2 = JavaAlgorithms.calculateTax(2.0400580640006904E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.080116128001381E-131d + "'", double2 == 4.080116128001381E-131d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2368");
        double double2 = JavaAlgorithms.calculateTax(4.430176838159334E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.860353676318668E-108d + "'", double2 == 8.860353676318668E-108d);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2369");
        double double2 = JavaAlgorithms.calculateTax(3.264092902401105E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.528185804802211E-134d + "'", double2 == 6.528185804802211E-134d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2370");
        double double2 = JavaAlgorithms.calculateTax(2.854495385411945E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823891E-105d + "'", double2 == 5.708990770823891E-105d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2371");
        double double2 = JavaAlgorithms.calculateTax(3.264092902401105E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.528185804802211E-134d + "'", double2 == 6.528185804802211E-134d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2372");
        double double2 = JavaAlgorithms.calculateTax(1.1972621413014877E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029757E-117d + "'", double2 == 2.3945242826029757E-117d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2373");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411907E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9156194260823816E-123d + "'", double2 == 1.9156194260823816E-123d);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2374");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205952E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411904E-119d + "'", double2 == 9.578097130411904E-119d);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2375");
        double double2 = JavaAlgorithms.calculateTax(5.115255730658204E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0230511461316408E-111d + "'", double2 == 1.0230511461316408E-111d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2376");
        double double2 = JavaAlgorithms.calculateTax(3.653754093327292E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654585E-112d + "'", double2 == 7.307508186654585E-112d);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2377");
        double double2 = JavaAlgorithms.calculateTax(8.160232256002762E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6320464512005525E-132d + "'", double2 == 1.6320464512005525E-132d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2378");
        double double2 = JavaAlgorithms.calculateTax(2.5576278653291018E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.115255730658204E-111d + "'", double2 == 5.115255730658204E-111d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2379");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654585E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.461501637330917E-112d + "'", double2 == 1.461501637330917E-112d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2380");
        double double2 = JavaAlgorithms.calculateTax(1.7840596158824652E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5681192317649307E-102d + "'", double2 == 3.5681192317649307E-102d);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2381");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059724E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.854495385411945E-104d + "'", double2 == 2.854495385411945E-104d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2382");
        double double2 = JavaAlgorithms.calculateTax(1.461501637330917E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661834E-113d + "'", double2 == 2.923003274661834E-113d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2383");
        double double2 = JavaAlgorithms.calculateTax(2.854495385411945E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823891E-105d + "'", double2 == 5.708990770823891E-105d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2384");
        double double2 = JavaAlgorithms.calculateTax(1.0230511461316408E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0461022922632817E-112d + "'", double2 == 2.0461022922632817E-112d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2385");
        double double2 = JavaAlgorithms.calculateTax(1.461501637330917E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661834E-113d + "'", double2 == 2.923003274661834E-113d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2386");
        double double2 = JavaAlgorithms.calculateTax(7.136238463529862E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059724E-103d + "'", double2 == 1.4272476927059724E-103d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2387");
        double double2 = JavaAlgorithms.calculateTax(2.0461022922632817E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.092204584526564E-113d + "'", double2 == 4.092204584526564E-113d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2388");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411907E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9156194260823816E-123d + "'", double2 == 1.9156194260823816E-123d);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2389");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823891E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1417981541647783E-105d + "'", double2 == 1.1417981541647783E-105d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2390");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411904E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.915619426082381E-119d + "'", double2 == 1.915619426082381E-119d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2391");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654585E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.461501637330917E-112d + "'", double2 == 1.461501637330917E-112d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2392");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029757E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205952E-118d + "'", double2 == 4.789048565205952E-118d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2393");
        double double2 = JavaAlgorithms.calculateTax(1.598517415830688E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1970348316613764E-108d + "'", double2 == 3.1970348316613764E-108d);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2394");
        double double2 = JavaAlgorithms.calculateTax(8.860353676318668E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.772070735263734E-108d + "'", double2 == 1.772070735263734E-108d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2395");
        double double2 = JavaAlgorithms.calculateTax(3.653754093327292E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654585E-112d + "'", double2 == 7.307508186654585E-112d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2396");
        double double2 = JavaAlgorithms.calculateTax(1.9156194260823816E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.831238852164763E-124d + "'", double2 == 3.831238852164763E-124d);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2397");
        double double2 = JavaAlgorithms.calculateTax(1.0230511461316408E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0461022922632817E-112d + "'", double2 == 2.0461022922632817E-112d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2398");
        double double2 = JavaAlgorithms.calculateTax(1.915619426082381E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.831238852164762E-120d + "'", double2 == 3.831238852164762E-120d);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2399");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205952E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411904E-119d + "'", double2 == 9.578097130411904E-119d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2400");
        double double2 = JavaAlgorithms.calculateTax(4.430176838159334E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.860353676318668E-108d + "'", double2 == 8.860353676318668E-108d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2401");
        double double2 = JavaAlgorithms.calculateTax(2.0461022922632817E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.092204584526564E-113d + "'", double2 == 4.092204584526564E-113d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2402");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823891E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1417981541647783E-105d + "'", double2 == 1.1417981541647783E-105d);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2403");
        double double2 = JavaAlgorithms.calculateTax(5.115255730658204E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0230511461316408E-111d + "'", double2 == 1.0230511461316408E-111d);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2404");
        double double2 = JavaAlgorithms.calculateTax(1.1417981541647783E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.283596308329557E-106d + "'", double2 == 2.283596308329557E-106d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2405");
        double double2 = JavaAlgorithms.calculateTax(1.826877046663646E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.653754093327292E-111d + "'", double2 == 3.653754093327292E-111d);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2406");
        double double2 = JavaAlgorithms.calculateTax(1.2750362900004314E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.550072580000863E-128d + "'", double2 == 2.550072580000863E-128d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2407");
        double double2 = JavaAlgorithms.calculateTax(6.528185804802211E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3056371609604423E-134d + "'", double2 == 1.3056371609604423E-134d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2408");
        double double2 = JavaAlgorithms.calculateTax(3.831238852164763E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329527E-125d + "'", double2 == 7.662477704329527E-125d);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2409");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411904E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.915619426082381E-119d + "'", double2 == 1.915619426082381E-119d);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2410");
        double double2 = JavaAlgorithms.calculateTax(1.1417981541647783E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.283596308329557E-106d + "'", double2 == 2.283596308329557E-106d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2411");
        double double2 = JavaAlgorithms.calculateTax(4.092204584526564E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.184409169053128E-114d + "'", double2 == 8.184409169053128E-114d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2412");
        double double2 = JavaAlgorithms.calculateTax(8.184409169053128E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6368818338106257E-114d + "'", double2 == 1.6368818338106257E-114d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2413");
        double double2 = JavaAlgorithms.calculateTax(1.772070735263734E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.544141470527468E-109d + "'", double2 == 3.544141470527468E-109d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2414");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329527E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659054E-125d + "'", double2 == 1.5324955408659054E-125d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2415");
        double double2 = JavaAlgorithms.calculateTax(3.544141470527468E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.088282941054936E-110d + "'", double2 == 7.088282941054936E-110d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2416");
        double double2 = JavaAlgorithms.calculateTax(1.6368818338106257E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2737636676212515E-115d + "'", double2 == 3.2737636676212515E-115d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2417");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661834E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.8460065493236684E-114d + "'", double2 == 5.8460065493236684E-114d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2418");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329527E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659054E-125d + "'", double2 == 1.5324955408659054E-125d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2419");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659054E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.064991081731811E-126d + "'", double2 == 3.064991081731811E-126d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2420");
        double double2 = JavaAlgorithms.calculateTax(1.772070735263734E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.544141470527468E-109d + "'", double2 == 3.544141470527468E-109d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2421");
        double double2 = JavaAlgorithms.calculateTax(8.860353676318668E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.772070735263734E-108d + "'", double2 == 1.772070735263734E-108d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2422");
        double double2 = JavaAlgorithms.calculateTax(2.283596308329557E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5671926166591135E-107d + "'", double2 == 4.5671926166591135E-107d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2423");
        double double2 = JavaAlgorithms.calculateTax(3.544141470527468E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.088282941054936E-110d + "'", double2 == 7.088282941054936E-110d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2424");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659054E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.064991081731811E-126d + "'", double2 == 3.064991081731811E-126d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2425");
        double double2 = JavaAlgorithms.calculateTax(3.831238852164762E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329525E-121d + "'", double2 == 7.662477704329525E-121d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2426");
        double double2 = JavaAlgorithms.calculateTax(4.5671926166591135E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318228E-108d + "'", double2 == 9.134385233318228E-108d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2427");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329525E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659052E-121d + "'", double2 == 1.5324955408659052E-121d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2428");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318228E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8268770466636457E-108d + "'", double2 == 1.8268770466636457E-108d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2429");
        double double2 = JavaAlgorithms.calculateTax(3.2737636676212515E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.547527335242504E-116d + "'", double2 == 6.547527335242504E-116d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2430");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329525E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659052E-121d + "'", double2 == 1.5324955408659052E-121d);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2431");
        double double2 = JavaAlgorithms.calculateTax(4.092204584526564E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.184409169053128E-114d + "'", double2 == 8.184409169053128E-114d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2432");
        double double2 = JavaAlgorithms.calculateTax(8.184409169053128E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6368818338106257E-114d + "'", double2 == 1.6368818338106257E-114d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2433");
        double double2 = JavaAlgorithms.calculateTax(1.3056371609604423E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.611274321920885E-135d + "'", double2 == 2.611274321920885E-135d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2434");
        double double2 = JavaAlgorithms.calculateTax(2.611274321920885E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.22254864384177E-136d + "'", double2 == 5.22254864384177E-136d);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2435");
        double double2 = JavaAlgorithms.calculateTax(5.8460065493236684E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647338E-114d + "'", double2 == 1.1692013098647338E-114d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2436");
        double double2 = JavaAlgorithms.calculateTax(3.1970348316613764E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.394069663322753E-109d + "'", double2 == 6.394069663322753E-109d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2437");
        double double2 = JavaAlgorithms.calculateTax(7.088282941054936E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4176565882109874E-110d + "'", double2 == 1.4176565882109874E-110d);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2438");
        double double2 = JavaAlgorithms.calculateTax(1.8268770466636457E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6537540933272915E-109d + "'", double2 == 3.6537540933272915E-109d);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2439");
        double double2 = JavaAlgorithms.calculateTax(1.8268770466636457E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6537540933272915E-109d + "'", double2 == 3.6537540933272915E-109d);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2440");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659052E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0649910817318105E-122d + "'", double2 == 3.0649910817318105E-122d);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2441");
        double double2 = JavaAlgorithms.calculateTax(5.8460065493236684E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647338E-114d + "'", double2 == 1.1692013098647338E-114d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2442");
        double double2 = JavaAlgorithms.calculateTax(3.6537540933272915E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654584E-110d + "'", double2 == 7.307508186654584E-110d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2443");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654584E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.461501637330917E-110d + "'", double2 == 1.461501637330917E-110d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2444");
        double double2 = JavaAlgorithms.calculateTax(3.0649910817318105E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463621E-123d + "'", double2 == 6.129982163463621E-123d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2445");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647338E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3384026197294676E-115d + "'", double2 == 2.3384026197294676E-115d);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2446");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661834E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.8460065493236684E-114d + "'", double2 == 5.8460065493236684E-114d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2447");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463621E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927243E-123d + "'", double2 == 1.2259964326927243E-123d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2448");
        double double2 = JavaAlgorithms.calculateTax(1.3056371609604423E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.611274321920885E-135d + "'", double2 == 2.611274321920885E-135d);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2449");
        double double2 = JavaAlgorithms.calculateTax(1.461501637330917E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661834E-111d + "'", double2 == 2.923003274661834E-111d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2450");
        double double2 = JavaAlgorithms.calculateTax(1.461501637330917E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.923003274661834E-111d + "'", double2 == 2.923003274661834E-111d);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2451");
        double double2 = JavaAlgorithms.calculateTax(2.611274321920885E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.22254864384177E-136d + "'", double2 == 5.22254864384177E-136d);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2452");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659052E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0649910817318105E-122d + "'", double2 == 3.0649910817318105E-122d);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2453");
        double double2 = JavaAlgorithms.calculateTax(1.2788139326645508E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5576278653291018E-110d + "'", double2 == 2.5576278653291018E-110d);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2454");
        double double2 = JavaAlgorithms.calculateTax(1.6368818338106257E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2737636676212515E-115d + "'", double2 == 3.2737636676212515E-115d);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2455");
        double double2 = JavaAlgorithms.calculateTax(4.5671926166591135E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318228E-108d + "'", double2 == 9.134385233318228E-108d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2456");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661834E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.846006549323668E-112d + "'", double2 == 5.846006549323668E-112d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2457");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318228E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8268770466636457E-108d + "'", double2 == 1.8268770466636457E-108d);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2458");
        double double2 = JavaAlgorithms.calculateTax(1.4176565882109874E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.835313176421975E-111d + "'", double2 == 2.835313176421975E-111d);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2459");
        double double2 = JavaAlgorithms.calculateTax(2.923003274661834E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.846006549323668E-112d + "'", double2 == 5.846006549323668E-112d);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2460");
        double double2 = JavaAlgorithms.calculateTax(7.307508186654584E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.461501637330917E-110d + "'", double2 == 1.461501637330917E-110d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2461");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463621E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927243E-123d + "'", double2 == 1.2259964326927243E-123d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2462");
        double double2 = JavaAlgorithms.calculateTax(2.283596308329557E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5671926166591135E-107d + "'", double2 == 4.5671926166591135E-107d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2463");
        double double2 = JavaAlgorithms.calculateTax(1.915619426082381E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.831238852164762E-120d + "'", double2 == 3.831238852164762E-120d);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2464");
        double double2 = JavaAlgorithms.calculateTax(1.4176565882109874E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.835313176421975E-111d + "'", double2 == 2.835313176421975E-111d);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2465");
        double double2 = JavaAlgorithms.calculateTax(1.9156194260823816E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.831238852164763E-124d + "'", double2 == 3.831238852164763E-124d);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2466");
        double double2 = JavaAlgorithms.calculateTax(2.835313176421975E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.670626352843951E-112d + "'", double2 == 5.670626352843951E-112d);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2467");
        double double2 = JavaAlgorithms.calculateTax(5.670626352843951E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1341252705687903E-112d + "'", double2 == 1.1341252705687903E-112d);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2468");
        double double2 = JavaAlgorithms.calculateTax(5.670626352843951E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1341252705687903E-112d + "'", double2 == 1.1341252705687903E-112d);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2469");
        double double2 = JavaAlgorithms.calculateTax(3.831238852164763E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329527E-125d + "'", double2 == 7.662477704329527E-125d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2470");
        double double2 = JavaAlgorithms.calculateTax(7.088282941054936E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4176565882109874E-110d + "'", double2 == 1.4176565882109874E-110d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2471");
        double double2 = JavaAlgorithms.calculateTax(3.0649910817318105E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463621E-123d + "'", double2 == 6.129982163463621E-123d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2472");
        double double2 = JavaAlgorithms.calculateTax(2.2150884190796667E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.430176838159334E-107d + "'", double2 == 4.430176838159334E-107d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2473");
        double double2 = JavaAlgorithms.calculateTax(6.528185804802211E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3056371609604423E-134d + "'", double2 == 1.3056371609604423E-134d);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2474");
        double double2 = JavaAlgorithms.calculateTax(2.3384026197294676E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6768052394589356E-116d + "'", double2 == 4.6768052394589356E-116d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2475");
        double double2 = JavaAlgorithms.calculateTax(1.1341252705687903E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2682505411375807E-113d + "'", double2 == 2.2682505411375807E-113d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2476");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927243E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854487E-124d + "'", double2 == 2.4519928653854487E-124d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2477");
        double double2 = JavaAlgorithms.calculateTax(5.22254864384177E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.044509728768354E-136d + "'", double2 == 1.044509728768354E-136d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2478");
        double double2 = JavaAlgorithms.calculateTax(3.2737636676212515E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.547527335242504E-116d + "'", double2 == 6.547527335242504E-116d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2479");
        double double2 = JavaAlgorithms.calculateTax(2.835313176421975E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.670626352843951E-112d + "'", double2 == 5.670626352843951E-112d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2480");
        double double2 = JavaAlgorithms.calculateTax(5.846006549323668E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647337E-112d + "'", double2 == 1.1692013098647337E-112d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2481");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647337E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3384026197294674E-113d + "'", double2 == 2.3384026197294674E-113d);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2482");
        double double2 = JavaAlgorithms.calculateTax(6.547527335242504E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3095054670485008E-116d + "'", double2 == 1.3095054670485008E-116d);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2483");
        double double2 = JavaAlgorithms.calculateTax(2.2682505411375807E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.536501082275162E-114d + "'", double2 == 4.536501082275162E-114d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2484");
        double double2 = JavaAlgorithms.calculateTax(2.2682505411375807E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.536501082275162E-114d + "'", double2 == 4.536501082275162E-114d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2485");
        double double2 = JavaAlgorithms.calculateTax(4.6768052394589356E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.353610478917872E-117d + "'", double2 == 9.353610478917872E-117d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2486");
        double double2 = JavaAlgorithms.calculateTax(2.3384026197294674E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.676805239458935E-114d + "'", double2 == 4.676805239458935E-114d);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2487");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647337E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3384026197294674E-113d + "'", double2 == 2.3384026197294674E-113d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2488");
        double double2 = JavaAlgorithms.calculateTax(6.547527335242504E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3095054670485008E-116d + "'", double2 == 1.3095054670485008E-116d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2489");
        double double2 = JavaAlgorithms.calculateTax(5.846006549323668E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1692013098647337E-112d + "'", double2 == 1.1692013098647337E-112d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2490");
        double double2 = JavaAlgorithms.calculateTax(4.6768052394589356E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.353610478917872E-117d + "'", double2 == 9.353610478917872E-117d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2491");
        double double2 = JavaAlgorithms.calculateTax(3.064991081731811E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463623E-127d + "'", double2 == 6.129982163463623E-127d);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2492");
        double double2 = JavaAlgorithms.calculateTax(2.3384026197294674E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.676805239458935E-114d + "'", double2 == 4.676805239458935E-114d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2493");
        double double2 = JavaAlgorithms.calculateTax(1.044509728768354E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0890194575367082E-137d + "'", double2 == 2.0890194575367082E-137d);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2494");
        double double2 = JavaAlgorithms.calculateTax(4.536501082275162E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.073002164550323E-115d + "'", double2 == 9.073002164550323E-115d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2495");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854487E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.903985730770898E-125d + "'", double2 == 4.903985730770898E-125d);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2496");
        double double2 = JavaAlgorithms.calculateTax(2.0890194575367082E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1780389150734166E-138d + "'", double2 == 4.1780389150734166E-138d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2497");
        double double2 = JavaAlgorithms.calculateTax(4.903985730770898E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.807971461541797E-126d + "'", double2 == 9.807971461541797E-126d);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2498");
        double double2 = JavaAlgorithms.calculateTax(9.073002164550323E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8146004329100648E-115d + "'", double2 == 1.8146004329100648E-115d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2499");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463623E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927247E-127d + "'", double2 == 1.2259964326927247E-127d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression4.test2500");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927243E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854487E-124d + "'", double2 == 2.4519928653854487E-124d);
    }
}

