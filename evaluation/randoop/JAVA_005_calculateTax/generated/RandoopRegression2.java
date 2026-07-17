import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1001");
        double double2 = JavaAlgorithms.calculateTax(3.5786683502996643E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.157336700599329E-45d + "'", double2 == 7.157336700599329E-45d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1002");
        double double2 = JavaAlgorithms.calculateTax(4.132070672510955E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.26414134502191E-49d + "'", double2 == 8.26414134502191E-49d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1003");
        double double2 = JavaAlgorithms.calculateTax(1.7893341751498321E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5786683502996643E-44d + "'", double2 == 3.5786683502996643E-44d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1004");
        double double2 = JavaAlgorithms.calculateTax(5.902958103587078E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174157E-44d + "'", double2 == 1.1805916207174157E-44d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1005");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483848E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4757395258967697E-46d + "'", double2 == 1.4757395258967697E-46d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1006");
        double double2 = JavaAlgorithms.calculateTax(2.862934680239732E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.725869360479464E-47d + "'", double2 == 5.725869360479464E-47d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1007");
        double double2 = JavaAlgorithms.calculateTax(6.2864142619960955E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2572828523992191E-55d + "'", double2 == 1.2572828523992191E-55d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1008");
        double double2 = JavaAlgorithms.calculateTax(1.2572828523992191E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5145657047984385E-56d + "'", double2 == 2.5145657047984385E-56d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1009");
        double double2 = JavaAlgorithms.calculateTax(3.6028797018964065E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792814E-38d + "'", double2 == 7.205759403792814E-38d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1010");
        double double2 = JavaAlgorithms.calculateTax(5.289050460814024E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0578100921628047E-53d + "'", double2 == 1.0578100921628047E-53d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1011");
        double double2 = JavaAlgorithms.calculateTax(1.0578100921628047E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1156201843256097E-54d + "'", double2 == 2.1156201843256097E-54d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1012");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854808E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446744073709618E-44d + "'", double2 == 1.8446744073709618E-44d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1013");
        double double2 = JavaAlgorithms.calculateTax(1.1805916207174161E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348325E-49d + "'", double2 == 2.3611832414348325E-49d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1014");
        double double2 = JavaAlgorithms.calculateTax(2.5145657047984385E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.029131409596877E-57d + "'", double2 == 5.029131409596877E-57d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1015");
        double double2 = JavaAlgorithms.calculateTax(2.1156201843256097E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.23124036865122E-55d + "'", double2 == 4.23124036865122E-55d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1016");
        double double2 = JavaAlgorithms.calculateTax(1.5111572745182929E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0223145490365857E-50d + "'", double2 == 3.0223145490365857E-50d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1017");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348325E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869665E-50d + "'", double2 == 4.722366482869665E-50d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1018");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792814E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.441151880758563E-38d + "'", double2 == 1.441151880758563E-38d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1019");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869665E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.44473296573933E-51d + "'", double2 == 9.44473296573933E-51d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1020");
        double double2 = JavaAlgorithms.calculateTax(9.44473296573933E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888946593147866E-51d + "'", double2 == 1.888946593147866E-51d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1021");
        double double2 = JavaAlgorithms.calculateTax(7.858017827495117E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5716035654990236E-53d + "'", double2 == 1.5716035654990236E-53d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1022");
        double double2 = JavaAlgorithms.calculateTax(5.029131409596877E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0058262819193755E-57d + "'", double2 == 1.0058262819193755E-57d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1023");
        double double2 = JavaAlgorithms.calculateTax(1.3222626152035059E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.644525230407012E-52d + "'", double2 == 2.644525230407012E-52d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1024");
        double double2 = JavaAlgorithms.calculateTax(1.5111572745182929E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0223145490365857E-50d + "'", double2 == 3.0223145490365857E-50d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1025");
        double double2 = JavaAlgorithms.calculateTax(1.4314673401198658E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.862934680239732E-46d + "'", double2 == 2.862934680239732E-46d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1026");
        double double2 = JavaAlgorithms.calculateTax(1.888946593147866E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.777893186295732E-52d + "'", double2 == 3.777893186295732E-52d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1027");
        double double2 = JavaAlgorithms.calculateTax(1.888946593147866E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.777893186295732E-52d + "'", double2 == 3.777893186295732E-52d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1028");
        double double2 = JavaAlgorithms.calculateTax(4.23124036865122E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.46248073730244E-56d + "'", double2 == 8.46248073730244E-56d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1029");
        double double2 = JavaAlgorithms.calculateTax(5.725869360479464E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1451738720958929E-47d + "'", double2 == 1.1451738720958929E-47d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1030");
        double double2 = JavaAlgorithms.calculateTax(8.46248073730244E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6924961474604883E-56d + "'", double2 == 1.6924961474604883E-56d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1031");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591464E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5111572745182929E-49d + "'", double2 == 1.5111572745182929E-49d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1032");
        double double2 = JavaAlgorithms.calculateTax(4.23124036865122E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.46248073730244E-56d + "'", double2 == 8.46248073730244E-56d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1033");
        double double2 = JavaAlgorithms.calculateTax(5.725869360479464E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1451738720958929E-47d + "'", double2 == 1.1451738720958929E-47d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1034");
        double double2 = JavaAlgorithms.calculateTax(1.1451738720958929E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.290347744191786E-48d + "'", double2 == 2.290347744191786E-48d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1035");
        double double2 = JavaAlgorithms.calculateTax(3.777893186295732E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591465E-53d + "'", double2 == 7.555786372591465E-53d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1036");
        double double2 = JavaAlgorithms.calculateTax(1.0058262819193755E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.011652563838751E-58d + "'", double2 == 2.011652563838751E-58d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1037");
        double double2 = JavaAlgorithms.calculateTax(2.1156201843256097E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.23124036865122E-55d + "'", double2 == 4.23124036865122E-55d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1038");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792815E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411518807585631E-40d + "'", double2 == 1.4411518807585631E-40d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1039");
        double double2 = JavaAlgorithms.calculateTax(1.441151880758563E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.882303761517126E-39d + "'", double2 == 2.882303761517126E-39d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1040");
        double double2 = JavaAlgorithms.calculateTax(8.94667087574916E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7893341751498321E-43d + "'", double2 == 1.7893341751498321E-43d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1041");
        double double2 = JavaAlgorithms.calculateTax(1.4411518807585631E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8823037615171267E-41d + "'", double2 == 2.8823037615171267E-41d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1042");
        double double2 = JavaAlgorithms.calculateTax(2.290347744191786E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.580695488383572E-49d + "'", double2 == 4.580695488383572E-49d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1043");
        double double2 = JavaAlgorithms.calculateTax(1.441151880758563E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.882303761517126E-39d + "'", double2 == 2.882303761517126E-39d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1044");
        double double2 = JavaAlgorithms.calculateTax(1.801439850948203E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6028797018964065E-37d + "'", double2 == 3.6028797018964065E-37d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1045");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591465E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.511157274518293E-53d + "'", double2 == 1.511157274518293E-53d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1046");
        double double2 = JavaAlgorithms.calculateTax(1.6924961474604883E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.384992294920977E-57d + "'", double2 == 3.384992294920977E-57d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1047");
        double double2 = JavaAlgorithms.calculateTax(1.511157274518293E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.022314549036586E-54d + "'", double2 == 3.022314549036586E-54d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1048");
        double double2 = JavaAlgorithms.calculateTax(2.8823037615171267E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.764607523034254E-42d + "'", double2 == 5.764607523034254E-42d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1049");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869665E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.44473296573933E-51d + "'", double2 == 9.44473296573933E-51d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1050");
        double double2 = JavaAlgorithms.calculateTax(2.882303761517126E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.7646075230342526E-40d + "'", double2 == 5.7646075230342526E-40d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1051");
        double double2 = JavaAlgorithms.calculateTax(9.44473296573933E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888946593147866E-51d + "'", double2 == 1.888946593147866E-51d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1052");
        double double2 = JavaAlgorithms.calculateTax(2.290347744191786E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.580695488383572E-49d + "'", double2 == 4.580695488383572E-49d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1053");
        double double2 = JavaAlgorithms.calculateTax(1.511157274518293E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.022314549036586E-54d + "'", double2 == 3.022314549036586E-54d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1054");
        double double2 = JavaAlgorithms.calculateTax(3.3056565380087645E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.611313076017529E-51d + "'", double2 == 6.611313076017529E-51d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1055");
        double double2 = JavaAlgorithms.calculateTax(3.022314549036586E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073173E-55d + "'", double2 == 6.044629098073173E-55d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1056");
        double double2 = JavaAlgorithms.calculateTax(2.011652563838751E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.023305127677502E-59d + "'", double2 == 4.023305127677502E-59d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1057");
        double double2 = JavaAlgorithms.calculateTax(5.029131409596877E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0058262819193755E-57d + "'", double2 == 1.0058262819193755E-57d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1058");
        double double2 = JavaAlgorithms.calculateTax(2.882303761517126E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.7646075230342526E-40d + "'", double2 == 5.7646075230342526E-40d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1059");
        double double2 = JavaAlgorithms.calculateTax(8.46248073730244E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6924961474604883E-56d + "'", double2 == 1.6924961474604883E-56d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1060");
        double double2 = JavaAlgorithms.calculateTax(4.023305127677502E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.046610255355004E-60d + "'", double2 == 8.046610255355004E-60d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1061");
        double double2 = JavaAlgorithms.calculateTax(3.0223145490365857E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073172E-51d + "'", double2 == 6.044629098073172E-51d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1062");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073172E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146345E-51d + "'", double2 == 1.2089258196146345E-51d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1063");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146345E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.417851639229269E-52d + "'", double2 == 2.417851639229269E-52d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1064");
        double double2 = JavaAlgorithms.calculateTax(1.964504456873779E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.929008913747558E-52d + "'", double2 == 3.929008913747558E-52d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1065");
        double double2 = JavaAlgorithms.calculateTax(4.023305127677502E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.046610255355004E-60d + "'", double2 == 8.046610255355004E-60d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1066");
        double double2 = JavaAlgorithms.calculateTax(1.0058262819193755E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.011652563838751E-58d + "'", double2 == 2.011652563838751E-58d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1067");
        double double2 = JavaAlgorithms.calculateTax(4.580695488383572E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.161390976767143E-50d + "'", double2 == 9.161390976767143E-50d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1068");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073173E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146346E-55d + "'", double2 == 1.2089258196146346E-55d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1069");
        double double2 = JavaAlgorithms.calculateTax(5.7646075230342526E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1529215046068507E-40d + "'", double2 == 1.1529215046068507E-40d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1070");
        double double2 = JavaAlgorithms.calculateTax(5.764607523034254E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.152921504606851E-42d + "'", double2 == 1.152921504606851E-42d);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1071");
        double double2 = JavaAlgorithms.calculateTax(5.764607523034254E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.152921504606851E-42d + "'", double2 == 1.152921504606851E-42d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1072");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146345E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.417851639229269E-52d + "'", double2 == 2.417851639229269E-52d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1073");
        double double2 = JavaAlgorithms.calculateTax(9.161390976767143E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8322781953534288E-50d + "'", double2 == 1.8322781953534288E-50d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1074");
        double double2 = JavaAlgorithms.calculateTax(1.152921504606851E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.305843009213702E-43d + "'", double2 == 2.305843009213702E-43d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1075");
        double double2 = JavaAlgorithms.calculateTax(1.4411518807585631E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8823037615171267E-41d + "'", double2 == 2.8823037615171267E-41d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1076");
        double double2 = JavaAlgorithms.calculateTax(1.1529215046068507E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3058430092137017E-41d + "'", double2 == 2.3058430092137017E-41d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1077");
        double double2 = JavaAlgorithms.calculateTax(2.5145657047984385E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.029131409596877E-57d + "'", double2 == 5.029131409596877E-57d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1078");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348325E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869665E-50d + "'", double2 == 4.722366482869665E-50d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1079");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146346E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.417851639229269E-56d + "'", double2 == 2.417851639229269E-56d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1080");
        double double2 = JavaAlgorithms.calculateTax(3.0223145490365857E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073172E-51d + "'", double2 == 6.044629098073172E-51d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1081");
        double double2 = JavaAlgorithms.calculateTax(5.7646075230342526E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1529215046068507E-40d + "'", double2 == 1.1529215046068507E-40d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1082");
        double double2 = JavaAlgorithms.calculateTax(2.417851639229269E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8357032784585386E-57d + "'", double2 == 4.8357032784585386E-57d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1083");
        double double2 = JavaAlgorithms.calculateTax(3.777893186295732E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591465E-53d + "'", double2 == 7.555786372591465E-53d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1084");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146346E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.417851639229269E-56d + "'", double2 == 2.417851639229269E-56d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1085");
        double double2 = JavaAlgorithms.calculateTax(8.046610255355004E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.609322051071001E-60d + "'", double2 == 1.609322051071001E-60d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1086");
        double double2 = JavaAlgorithms.calculateTax(2.417851639229269E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.835703278458538E-53d + "'", double2 == 4.835703278458538E-53d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1087");
        double double2 = JavaAlgorithms.calculateTax(3.384992294920977E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.769984589841954E-58d + "'", double2 == 6.769984589841954E-58d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1088");
        double double2 = JavaAlgorithms.calculateTax(4.580695488383572E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.161390976767143E-50d + "'", double2 == 9.161390976767143E-50d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1089");
        double double2 = JavaAlgorithms.calculateTax(3.022314549036586E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073173E-55d + "'", double2 == 6.044629098073173E-55d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1090");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792815E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411518807585631E-40d + "'", double2 == 1.4411518807585631E-40d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1091");
        double double2 = JavaAlgorithms.calculateTax(1.8322781953534288E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.664556390706858E-51d + "'", double2 == 3.664556390706858E-51d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1092");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792814E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.441151880758563E-38d + "'", double2 == 1.441151880758563E-38d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1093");
        double double2 = JavaAlgorithms.calculateTax(2.305843009213702E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427404E-44d + "'", double2 == 4.611686018427404E-44d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1094");
        double double2 = JavaAlgorithms.calculateTax(1.152921504606851E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.305843009213702E-43d + "'", double2 == 2.305843009213702E-43d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1095");
        double double2 = JavaAlgorithms.calculateTax(1.0578100921628047E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1156201843256097E-54d + "'", double2 == 2.1156201843256097E-54d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1096");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741015E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.801439850948203E-36d + "'", double2 == 1.801439850948203E-36d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1097");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591465E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.511157274518293E-53d + "'", double2 == 1.511157274518293E-53d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1098");
        double double2 = JavaAlgorithms.calculateTax(1.609322051071001E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.218644102142002E-61d + "'", double2 == 3.218644102142002E-61d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1099");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073172E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146345E-51d + "'", double2 == 1.2089258196146345E-51d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1100");
        double double2 = JavaAlgorithms.calculateTax(3.218644102142002E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.437288204284005E-62d + "'", double2 == 6.437288204284005E-62d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1101");
        double double2 = JavaAlgorithms.calculateTax(4.8357032784585386E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.671406556917078E-58d + "'", double2 == 9.671406556917078E-58d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1102");
        double double2 = JavaAlgorithms.calculateTax(9.671406556917078E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.934281311383416E-58d + "'", double2 == 1.934281311383416E-58d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1103");
        double double2 = JavaAlgorithms.calculateTax(4.835703278458538E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.671406556917076E-54d + "'", double2 == 9.671406556917076E-54d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1104");
        double double2 = JavaAlgorithms.calculateTax(8.046610255355004E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.609322051071001E-60d + "'", double2 == 1.609322051071001E-60d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1105");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427404E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854809E-45d + "'", double2 == 9.223372036854809E-45d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1106");
        double double2 = JavaAlgorithms.calculateTax(2.305843009213702E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427404E-44d + "'", double2 == 4.611686018427404E-44d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1107");
        double double2 = JavaAlgorithms.calculateTax(6.769984589841954E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3539969179683907E-58d + "'", double2 == 1.3539969179683907E-58d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1108");
        double double2 = JavaAlgorithms.calculateTax(1.934281311383416E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.868562622766832E-59d + "'", double2 == 3.868562622766832E-59d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1109");
        double double2 = JavaAlgorithms.calculateTax(2.8823037615171267E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.764607523034254E-42d + "'", double2 == 5.764607523034254E-42d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1110");
        double double2 = JavaAlgorithms.calculateTax(3.664556390706858E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.329112781413716E-52d + "'", double2 == 7.329112781413716E-52d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1111");
        double double2 = JavaAlgorithms.calculateTax(9.671406556917078E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.934281311383416E-58d + "'", double2 == 1.934281311383416E-58d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1112");
        double double2 = JavaAlgorithms.calculateTax(3.868562622766832E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533664E-60d + "'", double2 == 7.737125245533664E-60d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1113");
        double double2 = JavaAlgorithms.calculateTax(6.437288204284005E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2874576408568011E-62d + "'", double2 == 1.2874576408568011E-62d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1114");
        double double2 = JavaAlgorithms.calculateTax(1.609322051071001E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.218644102142002E-61d + "'", double2 == 3.218644102142002E-61d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1115");
        double double2 = JavaAlgorithms.calculateTax(1.6924961474604883E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.384992294920977E-57d + "'", double2 == 3.384992294920977E-57d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1116");
        double double2 = JavaAlgorithms.calculateTax(2.3058430092137017E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427404E-42d + "'", double2 == 4.611686018427404E-42d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1117");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854809E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.844674407370962E-45d + "'", double2 == 1.844674407370962E-45d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1118");
        double double2 = JavaAlgorithms.calculateTax(7.329112781413716E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4658225562827434E-52d + "'", double2 == 1.4658225562827434E-52d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1119");
        double double2 = JavaAlgorithms.calculateTax(1.4658225562827434E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.931645112565487E-53d + "'", double2 == 2.931645112565487E-53d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1120");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533664E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.547425049106733E-60d + "'", double2 == 1.547425049106733E-60d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1121");
        double double2 = JavaAlgorithms.calculateTax(2.011652563838751E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.023305127677502E-59d + "'", double2 == 4.023305127677502E-59d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1122");
        double double2 = JavaAlgorithms.calculateTax(9.671406556917076E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9342813113834154E-54d + "'", double2 == 1.9342813113834154E-54d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1123");
        double double2 = JavaAlgorithms.calculateTax(3.868562622766832E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533664E-60d + "'", double2 == 7.737125245533664E-60d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1124");
        double double2 = JavaAlgorithms.calculateTax(2.3058430092137017E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427404E-42d + "'", double2 == 4.611686018427404E-42d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1125");
        double double2 = JavaAlgorithms.calculateTax(1.4658225562827434E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.931645112565487E-53d + "'", double2 == 2.931645112565487E-53d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1126");
        double double2 = JavaAlgorithms.calculateTax(1.547425049106733E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.094850098213466E-61d + "'", double2 == 3.094850098213466E-61d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1127");
        double double2 = JavaAlgorithms.calculateTax(3.664556390706858E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.329112781413716E-52d + "'", double2 == 7.329112781413716E-52d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1128");
        double double2 = JavaAlgorithms.calculateTax(3.384992294920977E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.769984589841954E-58d + "'", double2 == 6.769984589841954E-58d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1129");
        double double2 = JavaAlgorithms.calculateTax(3.094850098213466E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426932E-62d + "'", double2 == 6.189700196426932E-62d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1130");
        double double2 = JavaAlgorithms.calculateTax(1.2874576408568011E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5749152817136024E-63d + "'", double2 == 2.5749152817136024E-63d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1131");
        double double2 = JavaAlgorithms.calculateTax(6.437288204284005E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2874576408568011E-62d + "'", double2 == 1.2874576408568011E-62d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1132");
        double double2 = JavaAlgorithms.calculateTax(2.5749152817136024E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.149830563427205E-64d + "'", double2 == 5.149830563427205E-64d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1133");
        double double2 = JavaAlgorithms.calculateTax(9.671406556917076E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9342813113834154E-54d + "'", double2 == 1.9342813113834154E-54d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1134");
        double double2 = JavaAlgorithms.calculateTax(2.5749152817136024E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.149830563427205E-64d + "'", double2 == 5.149830563427205E-64d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1135");
        double double2 = JavaAlgorithms.calculateTax(1.547425049106733E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.094850098213466E-61d + "'", double2 == 3.094850098213466E-61d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1136");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427404E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854809E-45d + "'", double2 == 9.223372036854809E-45d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1137");
        double double2 = JavaAlgorithms.calculateTax(1.934281311383416E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.868562622766832E-59d + "'", double2 == 3.868562622766832E-59d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1138");
        double double2 = JavaAlgorithms.calculateTax(3.094850098213466E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426932E-62d + "'", double2 == 6.189700196426932E-62d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1139");
        double double2 = JavaAlgorithms.calculateTax(2.644525230407012E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.289050460814024E-53d + "'", double2 == 5.289050460814024E-53d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1140");
        double double2 = JavaAlgorithms.calculateTax(1.9342813113834154E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8685626227668306E-55d + "'", double2 == 3.8685626227668306E-55d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1141");
        double double2 = JavaAlgorithms.calculateTax(7.329112781413716E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4658225562827434E-52d + "'", double2 == 1.4658225562827434E-52d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1142");
        double double2 = JavaAlgorithms.calculateTax(1.8322781953534288E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.664556390706858E-51d + "'", double2 == 3.664556390706858E-51d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1143");
        double double2 = JavaAlgorithms.calculateTax(1.1529215046068507E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3058430092137017E-41d + "'", double2 == 2.3058430092137017E-41d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1144");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427404E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854808E-43d + "'", double2 == 9.223372036854808E-43d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1145");
        double double2 = JavaAlgorithms.calculateTax(6.769984589841954E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3539969179683907E-58d + "'", double2 == 1.3539969179683907E-58d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1146");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533664E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.547425049106733E-60d + "'", double2 == 1.547425049106733E-60d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1147");
        double double2 = JavaAlgorithms.calculateTax(9.161390976767143E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8322781953534288E-50d + "'", double2 == 1.8322781953534288E-50d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1148");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854808E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446744073709616E-43d + "'", double2 == 1.8446744073709616E-43d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1149");
        double double2 = JavaAlgorithms.calculateTax(1.8446744073709616E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6893488147419235E-44d + "'", double2 == 3.6893488147419235E-44d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1150");
        double double2 = JavaAlgorithms.calculateTax(4.835703278458538E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.671406556917076E-54d + "'", double2 == 9.671406556917076E-54d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1151");
        double double2 = JavaAlgorithms.calculateTax(1.8446744073709616E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6893488147419235E-44d + "'", double2 == 3.6893488147419235E-44d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1152");
        double double2 = JavaAlgorithms.calculateTax(1.844674407370962E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.689348814741924E-46d + "'", double2 == 3.689348814741924E-46d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1153");
        double double2 = JavaAlgorithms.calculateTax(3.6028797018964065E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792814E-38d + "'", double2 == 7.205759403792814E-38d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1154");
        double double2 = JavaAlgorithms.calculateTax(2.417851639229269E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.835703278458538E-53d + "'", double2 == 4.835703278458538E-53d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1155");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426932E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853866E-62d + "'", double2 == 1.2379400392853866E-62d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1156");
        double double2 = JavaAlgorithms.calculateTax(1.1451738720958929E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.290347744191786E-48d + "'", double2 == 2.290347744191786E-48d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1157");
        double double2 = JavaAlgorithms.calculateTax(2.417851639229269E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8357032784585386E-57d + "'", double2 == 4.8357032784585386E-57d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1158");
        double double2 = JavaAlgorithms.calculateTax(5.149830563427205E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.029966112685441E-64d + "'", double2 == 1.029966112685441E-64d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1159");
        double double2 = JavaAlgorithms.calculateTax(2.931645112565487E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.863290225130974E-54d + "'", double2 == 5.863290225130974E-54d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1160");
        double double2 = JavaAlgorithms.calculateTax(5.863290225130974E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1726580450261947E-54d + "'", double2 == 1.1726580450261947E-54d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1161");
        double double2 = JavaAlgorithms.calculateTax(5.289050460814024E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0578100921628047E-53d + "'", double2 == 1.0578100921628047E-53d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1162");
        double double2 = JavaAlgorithms.calculateTax(1.2874576408568011E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5749152817136024E-63d + "'", double2 == 2.5749152817136024E-63d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1163");
        double double2 = JavaAlgorithms.calculateTax(3.8685626227668306E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533662E-56d + "'", double2 == 7.737125245533662E-56d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1164");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854808E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446744073709616E-43d + "'", double2 == 1.8446744073709616E-43d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1165");
        double double2 = JavaAlgorithms.calculateTax(1.1726580450261947E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3453160900523898E-55d + "'", double2 == 2.3453160900523898E-55d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1166");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427404E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854808E-43d + "'", double2 == 9.223372036854808E-43d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1167");
        double double2 = JavaAlgorithms.calculateTax(3.6893488147419235E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483848E-45d + "'", double2 == 7.378697629483848E-45d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1168");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533662E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5474250491067325E-56d + "'", double2 == 1.5474250491067325E-56d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1169");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483848E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4757395258967696E-45d + "'", double2 == 1.4757395258967696E-45d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1170");
        double double2 = JavaAlgorithms.calculateTax(1.9342813113834154E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8685626227668306E-55d + "'", double2 == 3.8685626227668306E-55d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1171");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854809E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.844674407370962E-45d + "'", double2 == 1.844674407370962E-45d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1172");
        double double2 = JavaAlgorithms.calculateTax(2.931645112565487E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.863290225130974E-54d + "'", double2 == 5.863290225130974E-54d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1173");
        double double2 = JavaAlgorithms.calculateTax(3.689348814741924E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483849E-47d + "'", double2 == 7.378697629483849E-47d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1174");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073173E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146346E-55d + "'", double2 == 1.2089258196146346E-55d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1175");
        double double2 = JavaAlgorithms.calculateTax(1.3539969179683907E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7079938359367816E-59d + "'", double2 == 2.7079938359367816E-59d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1176");
        double double2 = JavaAlgorithms.calculateTax(1.5474250491067325E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0948500982134655E-57d + "'", double2 == 3.0948500982134655E-57d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1177");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483849E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.47573952589677E-47d + "'", double2 == 1.47573952589677E-47d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1178");
        double double2 = JavaAlgorithms.calculateTax(3.8685626227668306E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533662E-56d + "'", double2 == 7.737125245533662E-56d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1179");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483849E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.47573952589677E-47d + "'", double2 == 1.47573952589677E-47d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1180");
        double double2 = JavaAlgorithms.calculateTax(1.029966112685441E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.059932225370882E-65d + "'", double2 == 2.059932225370882E-65d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1181");
        double double2 = JavaAlgorithms.calculateTax(3.0948500982134655E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426931E-58d + "'", double2 == 6.189700196426931E-58d);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1182");
        double double2 = JavaAlgorithms.calculateTax(3.6893488147419235E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483848E-45d + "'", double2 == 7.378697629483848E-45d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1183");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533662E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5474250491067325E-56d + "'", double2 == 1.5474250491067325E-56d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1184");
        double double2 = JavaAlgorithms.calculateTax(1.4757395258967696E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9514790517935395E-46d + "'", double2 == 2.9514790517935395E-46d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1185");
        double double2 = JavaAlgorithms.calculateTax(1.47573952589677E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.95147905179354E-48d + "'", double2 == 2.95147905179354E-48d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1186");
        double double2 = JavaAlgorithms.calculateTax(4.8357032784585386E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.671406556917078E-58d + "'", double2 == 9.671406556917078E-58d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1187");
        double double2 = JavaAlgorithms.calculateTax(1.47573952589677E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.95147905179354E-48d + "'", double2 == 2.95147905179354E-48d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1188");
        double double2 = JavaAlgorithms.calculateTax(2.3453160900523898E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.690632180104779E-56d + "'", double2 == 4.690632180104779E-56d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1189");
        double double2 = JavaAlgorithms.calculateTax(5.149830563427205E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.029966112685441E-64d + "'", double2 == 1.029966112685441E-64d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1190");
        double double2 = JavaAlgorithms.calculateTax(3.218644102142002E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.437288204284005E-62d + "'", double2 == 6.437288204284005E-62d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1191");
        double double2 = JavaAlgorithms.calculateTax(1.1726580450261947E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3453160900523898E-55d + "'", double2 == 2.3453160900523898E-55d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1192");
        double double2 = JavaAlgorithms.calculateTax(1.029966112685441E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.059932225370882E-65d + "'", double2 == 2.059932225370882E-65d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1193");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853866E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4758800785707735E-63d + "'", double2 == 2.4758800785707735E-63d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1194");
        double double2 = JavaAlgorithms.calculateTax(2.4758800785707735E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9517601571415475E-64d + "'", double2 == 4.9517601571415475E-64d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1195");
        double double2 = JavaAlgorithms.calculateTax(2.059932225370882E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.119864450741764E-66d + "'", double2 == 4.119864450741764E-66d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1196");
        double double2 = JavaAlgorithms.calculateTax(4.119864450741764E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.239728901483529E-67d + "'", double2 == 8.239728901483529E-67d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1197");
        double double2 = JavaAlgorithms.calculateTax(1.844674407370962E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.689348814741924E-46d + "'", double2 == 3.689348814741924E-46d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1198");
        double double2 = JavaAlgorithms.calculateTax(4.119864450741764E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.239728901483529E-67d + "'", double2 == 8.239728901483529E-67d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1199");
        double double2 = JavaAlgorithms.calculateTax(2.9514790517935395E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.90295810358708E-47d + "'", double2 == 5.90295810358708E-47d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1200");
        double double2 = JavaAlgorithms.calculateTax(8.239728901483529E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.647945780296706E-67d + "'", double2 == 1.647945780296706E-67d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1201");
        double double2 = JavaAlgorithms.calculateTax(2.4758800785707735E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9517601571415475E-64d + "'", double2 == 4.9517601571415475E-64d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1202");
        double double2 = JavaAlgorithms.calculateTax(1.647945780296706E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.295891560593412E-68d + "'", double2 == 3.295891560593412E-68d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1203");
        double double2 = JavaAlgorithms.calculateTax(1.5474250491067325E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0948500982134655E-57d + "'", double2 == 3.0948500982134655E-57d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1204");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426932E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853866E-62d + "'", double2 == 1.2379400392853866E-62d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1205");
        double double2 = JavaAlgorithms.calculateTax(2.9514790517935395E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.90295810358708E-47d + "'", double2 == 5.90295810358708E-47d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1206");
        double double2 = JavaAlgorithms.calculateTax(3.295891560593412E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.591783121186824E-69d + "'", double2 == 6.591783121186824E-69d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1207");
        double double2 = JavaAlgorithms.calculateTax(3.0948500982134655E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426931E-58d + "'", double2 == 6.189700196426931E-58d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1208");
        double double2 = JavaAlgorithms.calculateTax(4.690632180104779E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.38126436020956E-57d + "'", double2 == 9.38126436020956E-57d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1209");
        double double2 = JavaAlgorithms.calculateTax(1.4757395258967696E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9514790517935395E-46d + "'", double2 == 2.9514790517935395E-46d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1210");
        double double2 = JavaAlgorithms.calculateTax(4.9517601571415475E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283096E-65d + "'", double2 == 9.903520314283096E-65d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1211");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426931E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853863E-58d + "'", double2 == 1.2379400392853863E-58d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1212");
        double double2 = JavaAlgorithms.calculateTax(3.689348814741924E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483849E-47d + "'", double2 == 7.378697629483849E-47d);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1213");
        double double2 = JavaAlgorithms.calculateTax(4.690632180104779E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.38126436020956E-57d + "'", double2 == 9.38126436020956E-57d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1214");
        double double2 = JavaAlgorithms.calculateTax(2.95147905179354E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9029581035870806E-49d + "'", double2 == 5.9029581035870806E-49d);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1215");
        double double2 = JavaAlgorithms.calculateTax(9.38126436020956E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8762528720419121E-57d + "'", double2 == 1.8762528720419121E-57d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1216");
        double double2 = JavaAlgorithms.calculateTax(8.239728901483529E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.647945780296706E-67d + "'", double2 == 1.647945780296706E-67d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1217");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283096E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566192E-65d + "'", double2 == 1.9807040628566192E-65d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1218");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853863E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4758800785707727E-59d + "'", double2 == 2.4758800785707727E-59d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1219");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426931E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853863E-58d + "'", double2 == 1.2379400392853863E-58d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1220");
        double double2 = JavaAlgorithms.calculateTax(1.3539969179683907E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7079938359367816E-59d + "'", double2 == 2.7079938359367816E-59d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1221");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853863E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4758800785707727E-59d + "'", double2 == 2.4758800785707727E-59d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1222");
        double double2 = JavaAlgorithms.calculateTax(5.9029581035870806E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174162E-49d + "'", double2 == 1.1805916207174162E-49d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1223");
        double double2 = JavaAlgorithms.calculateTax(5.90295810358708E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.180591620717416E-47d + "'", double2 == 1.180591620717416E-47d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1224");
        double double2 = JavaAlgorithms.calculateTax(1.1805916207174162E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348324E-50d + "'", double2 == 2.3611832414348324E-50d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1225");
        double double2 = JavaAlgorithms.calculateTax(1.180591620717416E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348322E-48d + "'", double2 == 2.3611832414348322E-48d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1226");
        double double2 = JavaAlgorithms.calculateTax(5.863290225130974E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1726580450261947E-54d + "'", double2 == 1.1726580450261947E-54d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1227");
        double double2 = JavaAlgorithms.calculateTax(2.7079938359367816E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.415987671873563E-60d + "'", double2 == 5.415987671873563E-60d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1228");
        double double2 = JavaAlgorithms.calculateTax(5.415987671873563E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0831975343747128E-60d + "'", double2 == 1.0831975343747128E-60d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1229");
        double double2 = JavaAlgorithms.calculateTax(2.95147905179354E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9029581035870806E-49d + "'", double2 == 5.9029581035870806E-49d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1230");
        double double2 = JavaAlgorithms.calculateTax(1.0831975343747128E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1663950687494256E-61d + "'", double2 == 2.1663950687494256E-61d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1231");
        double double2 = JavaAlgorithms.calculateTax(2.4758800785707727E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9517601571415455E-60d + "'", double2 == 4.9517601571415455E-60d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1232");
        double double2 = JavaAlgorithms.calculateTax(2.059932225370882E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.119864450741764E-66d + "'", double2 == 4.119864450741764E-66d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1233");
        double double2 = JavaAlgorithms.calculateTax(5.9029581035870806E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174162E-49d + "'", double2 == 1.1805916207174162E-49d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1234");
        double double2 = JavaAlgorithms.calculateTax(4.9517601571415455E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283091E-61d + "'", double2 == 9.903520314283091E-61d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1235");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283096E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566192E-65d + "'", double2 == 1.9807040628566192E-65d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1236");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283091E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566185E-61d + "'", double2 == 1.9807040628566185E-61d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1237");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566185E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.961408125713238E-62d + "'", double2 == 3.961408125713238E-62d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1238");
        double double2 = JavaAlgorithms.calculateTax(1.1805916207174162E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348324E-50d + "'", double2 == 2.3611832414348324E-50d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1239");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566192E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.961408125713239E-66d + "'", double2 == 3.961408125713239E-66d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1240");
        double double2 = JavaAlgorithms.calculateTax(3.295891560593412E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.591783121186824E-69d + "'", double2 == 6.591783121186824E-69d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1241");
        double double2 = JavaAlgorithms.calculateTax(2.1663950687494256E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.332790137498851E-62d + "'", double2 == 4.332790137498851E-62d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1242");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483848E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4757395258967696E-45d + "'", double2 == 1.4757395258967696E-45d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1243");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566185E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.961408125713238E-62d + "'", double2 == 3.961408125713238E-62d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1244");
        double double2 = JavaAlgorithms.calculateTax(1.0831975343747128E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1663950687494256E-61d + "'", double2 == 2.1663950687494256E-61d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1245");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348322E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869665E-49d + "'", double2 == 4.722366482869665E-49d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1246");
        double double2 = JavaAlgorithms.calculateTax(4.332790137498851E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.665580274997703E-63d + "'", double2 == 8.665580274997703E-63d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1247");
        double double2 = JavaAlgorithms.calculateTax(5.415987671873563E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0831975343747128E-60d + "'", double2 == 1.0831975343747128E-60d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1248");
        double double2 = JavaAlgorithms.calculateTax(1.647945780296706E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.295891560593412E-68d + "'", double2 == 3.295891560593412E-68d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1249");
        double double2 = JavaAlgorithms.calculateTax(3.961408125713238E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426476E-63d + "'", double2 == 7.922816251426476E-63d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1250");
        double double2 = JavaAlgorithms.calculateTax(8.665580274997703E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7331160549995407E-63d + "'", double2 == 1.7331160549995407E-63d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1251");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853866E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4758800785707735E-63d + "'", double2 == 2.4758800785707735E-63d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1252");
        double double2 = JavaAlgorithms.calculateTax(4.9517601571415455E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283091E-61d + "'", double2 == 9.903520314283091E-61d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1253");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348322E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869665E-49d + "'", double2 == 4.722366482869665E-49d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1254");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869665E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.44473296573933E-50d + "'", double2 == 9.44473296573933E-50d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1255");
        double double2 = JavaAlgorithms.calculateTax(4.9517601571415475E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283096E-65d + "'", double2 == 9.903520314283096E-65d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1256");
        double double2 = JavaAlgorithms.calculateTax(2.1663950687494256E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.332790137498851E-62d + "'", double2 == 4.332790137498851E-62d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1257");
        double double2 = JavaAlgorithms.calculateTax(3.961408125713239E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426478E-67d + "'", double2 == 7.922816251426478E-67d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1258");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348324E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869665E-51d + "'", double2 == 4.722366482869665E-51d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1259");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283091E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566185E-61d + "'", double2 == 1.9807040628566185E-61d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1260");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426476E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852954E-63d + "'", double2 == 1.5845632502852954E-63d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1261");
        double double2 = JavaAlgorithms.calculateTax(8.665580274997703E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7331160549995407E-63d + "'", double2 == 1.7331160549995407E-63d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1262");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869665E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.44473296573933E-52d + "'", double2 == 9.44473296573933E-52d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1263");
        double double2 = JavaAlgorithms.calculateTax(3.961408125713239E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426478E-67d + "'", double2 == 7.922816251426478E-67d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1264");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852954E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.169126500570591E-64d + "'", double2 == 3.169126500570591E-64d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1265");
        double double2 = JavaAlgorithms.calculateTax(2.3453160900523898E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.690632180104779E-56d + "'", double2 == 4.690632180104779E-56d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1266");
        double double2 = JavaAlgorithms.calculateTax(3.961408125713238E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426476E-63d + "'", double2 == 7.922816251426476E-63d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1267");
        double double2 = JavaAlgorithms.calculateTax(9.38126436020956E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8762528720419121E-57d + "'", double2 == 1.8762528720419121E-57d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1268");
        double double2 = JavaAlgorithms.calculateTax(5.90295810358708E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.180591620717416E-47d + "'", double2 == 1.180591620717416E-47d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1269");
        double double2 = JavaAlgorithms.calculateTax(9.44473296573933E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888946593147866E-50d + "'", double2 == 1.888946593147866E-50d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1270");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852954E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.169126500570591E-64d + "'", double2 == 3.169126500570591E-64d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1271");
        double double2 = JavaAlgorithms.calculateTax(1.7331160549995407E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4662321099990815E-64d + "'", double2 == 3.4662321099990815E-64d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1272");
        double double2 = JavaAlgorithms.calculateTax(1.7331160549995407E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4662321099990815E-64d + "'", double2 == 3.4662321099990815E-64d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1273");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426478E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852958E-67d + "'", double2 == 1.5845632502852958E-67d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1274");
        double double2 = JavaAlgorithms.calculateTax(1.888946593147866E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.777893186295732E-51d + "'", double2 == 3.777893186295732E-51d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1275");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348324E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869665E-51d + "'", double2 == 4.722366482869665E-51d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1276");
        double double2 = JavaAlgorithms.calculateTax(6.591783121186824E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.318356624237365E-69d + "'", double2 == 1.318356624237365E-69d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1277");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426478E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852958E-67d + "'", double2 == 1.5845632502852958E-67d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1278");
        double double2 = JavaAlgorithms.calculateTax(3.4662321099990815E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.932464219998163E-65d + "'", double2 == 6.932464219998163E-65d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1279");
        double double2 = JavaAlgorithms.calculateTax(9.44473296573933E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888946593147866E-52d + "'", double2 == 1.888946593147866E-52d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1280");
        double double2 = JavaAlgorithms.calculateTax(1.180591620717416E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348322E-48d + "'", double2 == 2.3611832414348322E-48d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1281");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869665E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.44473296573933E-50d + "'", double2 == 9.44473296573933E-50d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1282");
        double double2 = JavaAlgorithms.calculateTax(1.8762528720419121E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7525057440838246E-58d + "'", double2 == 3.7525057440838246E-58d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1283");
        double double2 = JavaAlgorithms.calculateTax(3.169126500570591E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141182E-65d + "'", double2 == 6.338253001141182E-65d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1284");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426476E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852954E-63d + "'", double2 == 1.5845632502852954E-63d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1285");
        double double2 = JavaAlgorithms.calculateTax(6.338253001141182E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282366E-65d + "'", double2 == 1.2676506002282366E-65d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1286");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869665E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.44473296573933E-52d + "'", double2 == 9.44473296573933E-52d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1287");
        double double2 = JavaAlgorithms.calculateTax(1.888946593147866E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.777893186295732E-51d + "'", double2 == 3.777893186295732E-51d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1288");
        double double2 = JavaAlgorithms.calculateTax(1.318356624237365E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.63671324847473E-70d + "'", double2 == 2.63671324847473E-70d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1289");
        double double2 = JavaAlgorithms.calculateTax(1.8762528720419121E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7525057440838246E-58d + "'", double2 == 3.7525057440838246E-58d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1290");
        double double2 = JavaAlgorithms.calculateTax(2.7079938359367816E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.415987671873563E-60d + "'", double2 == 5.415987671873563E-60d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1291");
        double double2 = JavaAlgorithms.calculateTax(1.2676506002282366E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5353012004564733E-66d + "'", double2 == 2.5353012004564733E-66d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1292");
        double double2 = JavaAlgorithms.calculateTax(2.4758800785707727E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9517601571415455E-60d + "'", double2 == 4.9517601571415455E-60d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1293");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852958E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1691265005705917E-68d + "'", double2 == 3.1691265005705917E-68d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1294");
        double double2 = JavaAlgorithms.calculateTax(6.591783121186824E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.318356624237365E-69d + "'", double2 == 1.318356624237365E-69d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1295");
        double double2 = JavaAlgorithms.calculateTax(2.5353012004564733E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.070602400912947E-67d + "'", double2 == 5.070602400912947E-67d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1296");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566192E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.961408125713239E-66d + "'", double2 == 3.961408125713239E-66d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1297");
        double double2 = JavaAlgorithms.calculateTax(3.7525057440838246E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.5050114881676495E-59d + "'", double2 == 7.5050114881676495E-59d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1298");
        double double2 = JavaAlgorithms.calculateTax(2.63671324847473E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2734264969494606E-71d + "'", double2 == 5.2734264969494606E-71d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1299");
        double double2 = JavaAlgorithms.calculateTax(7.5050114881676495E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.50100229763353E-59d + "'", double2 == 1.50100229763353E-59d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1300");
        double double2 = JavaAlgorithms.calculateTax(9.44473296573933E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888946593147866E-50d + "'", double2 == 1.888946593147866E-50d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1301");
        double double2 = JavaAlgorithms.calculateTax(1.888946593147866E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7778931862957327E-53d + "'", double2 == 3.7778931862957327E-53d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1302");
        double double2 = JavaAlgorithms.calculateTax(1.2676506002282366E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5353012004564733E-66d + "'", double2 == 2.5353012004564733E-66d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1303");
        double double2 = JavaAlgorithms.calculateTax(3.777893186295732E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591465E-52d + "'", double2 == 7.555786372591465E-52d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1304");
        double double2 = JavaAlgorithms.calculateTax(3.7525057440838246E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.5050114881676495E-59d + "'", double2 == 7.5050114881676495E-59d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1305");
        double double2 = JavaAlgorithms.calculateTax(3.7778931862957327E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591465E-54d + "'", double2 == 7.555786372591465E-54d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1306");
        double double2 = JavaAlgorithms.calculateTax(5.070602400912947E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825894E-67d + "'", double2 == 1.0141204801825894E-67d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1307");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591465E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.511157274518293E-54d + "'", double2 == 1.511157274518293E-54d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1308");
        double double2 = JavaAlgorithms.calculateTax(1.888946593147866E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7778931862957327E-53d + "'", double2 == 3.7778931862957327E-53d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1309");
        double double2 = JavaAlgorithms.calculateTax(3.4662321099990815E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.932464219998163E-65d + "'", double2 == 6.932464219998163E-65d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1310");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825894E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.028240960365179E-68d + "'", double2 == 2.028240960365179E-68d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1311");
        double double2 = JavaAlgorithms.calculateTax(3.1691265005705917E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141184E-69d + "'", double2 == 6.338253001141184E-69d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1312");
        double double2 = JavaAlgorithms.calculateTax(1.511157274518293E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0223145490365863E-55d + "'", double2 == 3.0223145490365863E-55d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1313");
        double double2 = JavaAlgorithms.calculateTax(7.5050114881676495E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.50100229763353E-59d + "'", double2 == 1.50100229763353E-59d);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1314");
        double double2 = JavaAlgorithms.calculateTax(1.50100229763353E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0020045952670603E-60d + "'", double2 == 3.0020045952670603E-60d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1315");
        double double2 = JavaAlgorithms.calculateTax(1.50100229763353E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0020045952670603E-60d + "'", double2 == 3.0020045952670603E-60d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1316");
        double double2 = JavaAlgorithms.calculateTax(1.511157274518293E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0223145490365863E-55d + "'", double2 == 3.0223145490365863E-55d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1317");
        double double2 = JavaAlgorithms.calculateTax(3.0020045952670603E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.004009190534121E-61d + "'", double2 == 6.004009190534121E-61d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1318");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591465E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.511157274518293E-52d + "'", double2 == 1.511157274518293E-52d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1319");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825894E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.028240960365179E-68d + "'", double2 == 2.028240960365179E-68d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1320");
        double double2 = JavaAlgorithms.calculateTax(3.169126500570591E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141182E-65d + "'", double2 == 6.338253001141182E-65d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1321");
        double double2 = JavaAlgorithms.calculateTax(1.511157274518293E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.022314549036586E-53d + "'", double2 == 3.022314549036586E-53d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1322");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852958E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1691265005705917E-68d + "'", double2 == 3.1691265005705917E-68d);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1323");
        double double2 = JavaAlgorithms.calculateTax(3.0223145490365863E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073173E-56d + "'", double2 == 6.044629098073173E-56d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1324");
        double double2 = JavaAlgorithms.calculateTax(3.7778931862957327E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591465E-54d + "'", double2 == 7.555786372591465E-54d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1325");
        double double2 = JavaAlgorithms.calculateTax(3.022314549036586E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073172E-54d + "'", double2 == 6.044629098073172E-54d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1326");
        double double2 = JavaAlgorithms.calculateTax(6.932464219998163E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3864928439996326E-65d + "'", double2 == 1.3864928439996326E-65d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1327");
        double double2 = JavaAlgorithms.calculateTax(9.44473296573933E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888946593147866E-52d + "'", double2 == 1.888946593147866E-52d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1328");
        double double2 = JavaAlgorithms.calculateTax(4.332790137498851E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.665580274997703E-63d + "'", double2 == 8.665580274997703E-63d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1329");
        double double2 = JavaAlgorithms.calculateTax(6.004009190534121E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2008018381068243E-61d + "'", double2 == 1.2008018381068243E-61d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1330");
        double double2 = JavaAlgorithms.calculateTax(1.2008018381068243E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4016036762136488E-62d + "'", double2 == 2.4016036762136488E-62d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1331");
        double double2 = JavaAlgorithms.calculateTax(6.338253001141184E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.267650600228237E-69d + "'", double2 == 1.267650600228237E-69d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1332");
        double double2 = JavaAlgorithms.calculateTax(2.63671324847473E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2734264969494606E-71d + "'", double2 == 5.2734264969494606E-71d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1333");
        double double2 = JavaAlgorithms.calculateTax(5.2734264969494606E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.054685299389892E-71d + "'", double2 == 1.054685299389892E-71d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1334");
        double double2 = JavaAlgorithms.calculateTax(3.0223145490365863E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073173E-56d + "'", double2 == 6.044629098073173E-56d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1335");
        double double2 = JavaAlgorithms.calculateTax(1.267650600228237E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.535301200456474E-70d + "'", double2 == 2.535301200456474E-70d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1336");
        double double2 = JavaAlgorithms.calculateTax(3.1691265005705917E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141184E-69d + "'", double2 == 6.338253001141184E-69d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1337");
        double double2 = JavaAlgorithms.calculateTax(1.054685299389892E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1093705987797843E-72d + "'", double2 == 2.1093705987797843E-72d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1338");
        double double2 = JavaAlgorithms.calculateTax(2.5353012004564733E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.070602400912947E-67d + "'", double2 == 5.070602400912947E-67d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1339");
        double double2 = JavaAlgorithms.calculateTax(3.0020045952670603E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.004009190534121E-61d + "'", double2 == 6.004009190534121E-61d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1340");
        double double2 = JavaAlgorithms.calculateTax(6.932464219998163E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3864928439996326E-65d + "'", double2 == 1.3864928439996326E-65d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1341");
        double double2 = JavaAlgorithms.calculateTax(2.4016036762136488E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.803207352427298E-63d + "'", double2 == 4.803207352427298E-63d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1342");
        double double2 = JavaAlgorithms.calculateTax(6.338253001141184E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.267650600228237E-69d + "'", double2 == 1.267650600228237E-69d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1343");
        double double2 = JavaAlgorithms.calculateTax(4.803207352427298E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.606414704854597E-64d + "'", double2 == 9.606414704854597E-64d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1344");
        double double2 = JavaAlgorithms.calculateTax(2.4016036762136488E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.803207352427298E-63d + "'", double2 == 4.803207352427298E-63d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1345");
        double double2 = JavaAlgorithms.calculateTax(1.318356624237365E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.63671324847473E-70d + "'", double2 == 2.63671324847473E-70d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1346");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073173E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146346E-56d + "'", double2 == 1.2089258196146346E-56d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1347");
        double double2 = JavaAlgorithms.calculateTax(1.2008018381068243E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4016036762136488E-62d + "'", double2 == 2.4016036762136488E-62d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1348");
        double double2 = JavaAlgorithms.calculateTax(1.054685299389892E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1093705987797843E-72d + "'", double2 == 2.1093705987797843E-72d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1349");
        double double2 = JavaAlgorithms.calculateTax(2.535301200456474E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0706024009129484E-71d + "'", double2 == 5.0706024009129484E-71d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1350");
        double double2 = JavaAlgorithms.calculateTax(9.606414704854597E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9212829409709194E-64d + "'", double2 == 1.9212829409709194E-64d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1351");
        double double2 = JavaAlgorithms.calculateTax(2.028240960365179E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0564819207303584E-69d + "'", double2 == 4.0564819207303584E-69d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1352");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591465E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.511157274518293E-54d + "'", double2 == 1.511157274518293E-54d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1353");
        double double2 = JavaAlgorithms.calculateTax(9.606414704854597E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9212829409709194E-64d + "'", double2 == 1.9212829409709194E-64d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1354");
        double double2 = JavaAlgorithms.calculateTax(1.3864928439996326E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7729856879992653E-66d + "'", double2 == 2.7729856879992653E-66d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1355");
        double double2 = JavaAlgorithms.calculateTax(5.070602400912947E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825894E-67d + "'", double2 == 1.0141204801825894E-67d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1356");
        double double2 = JavaAlgorithms.calculateTax(4.803207352427298E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.606414704854597E-64d + "'", double2 == 9.606414704854597E-64d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1357");
        double double2 = JavaAlgorithms.calculateTax(6.338253001141182E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282366E-65d + "'", double2 == 1.2676506002282366E-65d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1358");
        double double2 = JavaAlgorithms.calculateTax(3.022314549036586E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073172E-54d + "'", double2 == 6.044629098073172E-54d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1359");
        double double2 = JavaAlgorithms.calculateTax(5.0706024009129484E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825897E-71d + "'", double2 == 1.0141204801825897E-71d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1360");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073172E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146345E-54d + "'", double2 == 1.2089258196146345E-54d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1361");
        double double2 = JavaAlgorithms.calculateTax(2.535301200456474E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0706024009129484E-71d + "'", double2 == 5.0706024009129484E-71d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1362");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073173E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146346E-56d + "'", double2 == 1.2089258196146346E-56d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1363");
        double double2 = JavaAlgorithms.calculateTax(6.004009190534121E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2008018381068243E-61d + "'", double2 == 1.2008018381068243E-61d);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1364");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825897E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0282409603651795E-72d + "'", double2 == 2.0282409603651795E-72d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1365");
        double double2 = JavaAlgorithms.calculateTax(4.0564819207303584E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.112963841460717E-70d + "'", double2 == 8.112963841460717E-70d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1366");
        double double2 = JavaAlgorithms.calculateTax(1.511157274518293E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.022314549036586E-53d + "'", double2 == 3.022314549036586E-53d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1367");
        double double2 = JavaAlgorithms.calculateTax(3.777893186295732E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591465E-52d + "'", double2 == 7.555786372591465E-52d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1368");
        double double2 = JavaAlgorithms.calculateTax(2.1093705987797843E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2187411975595686E-73d + "'", double2 == 4.2187411975595686E-73d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1369");
        double double2 = JavaAlgorithms.calculateTax(4.0564819207303584E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.112963841460717E-70d + "'", double2 == 8.112963841460717E-70d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1370");
        double double2 = JavaAlgorithms.calculateTax(8.112963841460717E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6225927682921435E-70d + "'", double2 == 1.6225927682921435E-70d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1371");
        double double2 = JavaAlgorithms.calculateTax(2.0282409603651795E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0564819207303595E-73d + "'", double2 == 4.0564819207303595E-73d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1372");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146346E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4178516392292693E-57d + "'", double2 == 2.4178516392292693E-57d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1373");
        double double2 = JavaAlgorithms.calculateTax(2.1093705987797843E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2187411975595686E-73d + "'", double2 == 4.2187411975595686E-73d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1374");
        double double2 = JavaAlgorithms.calculateTax(1.3864928439996326E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7729856879992653E-66d + "'", double2 == 2.7729856879992653E-66d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1375");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146345E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4178516392292692E-55d + "'", double2 == 2.4178516392292692E-55d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1376");
        double double2 = JavaAlgorithms.calculateTax(2.7729856879992653E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.545971375998531E-67d + "'", double2 == 5.545971375998531E-67d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1377");
        double double2 = JavaAlgorithms.calculateTax(5.545971375998531E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1091942751997062E-67d + "'", double2 == 1.1091942751997062E-67d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1378");
        double double2 = JavaAlgorithms.calculateTax(2.0282409603651795E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0564819207303595E-73d + "'", double2 == 4.0564819207303595E-73d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1379");
        double double2 = JavaAlgorithms.calculateTax(4.0564819207303595E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.11296384146072E-74d + "'", double2 == 8.11296384146072E-74d);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1380");
        double double2 = JavaAlgorithms.calculateTax(5.2734264969494606E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.054685299389892E-71d + "'", double2 == 1.054685299389892E-71d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1381");
        double double2 = JavaAlgorithms.calculateTax(1.6225927682921435E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2451855365842872E-71d + "'", double2 == 3.2451855365842872E-71d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1382");
        double double2 = JavaAlgorithms.calculateTax(4.2187411975595686E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.437482395119138E-74d + "'", double2 == 8.437482395119138E-74d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1383");
        double double2 = JavaAlgorithms.calculateTax(3.2451855365842872E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168575E-72d + "'", double2 == 6.490371073168575E-72d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1384");
        double double2 = JavaAlgorithms.calculateTax(8.437482395119138E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6874964790238277E-74d + "'", double2 == 1.6874964790238277E-74d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1385");
        double double2 = JavaAlgorithms.calculateTax(2.4178516392292692E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.835703278458538E-56d + "'", double2 == 4.835703278458538E-56d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1386");
        double double2 = JavaAlgorithms.calculateTax(2.028240960365179E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0564819207303584E-69d + "'", double2 == 4.0564819207303584E-69d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1387");
        double double2 = JavaAlgorithms.calculateTax(4.835703278458538E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.671406556917077E-57d + "'", double2 == 9.671406556917077E-57d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1388");
        double double2 = JavaAlgorithms.calculateTax(2.4178516392292692E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.835703278458538E-56d + "'", double2 == 4.835703278458538E-56d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1389");
        double double2 = JavaAlgorithms.calculateTax(4.835703278458538E-56d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.671406556917077E-57d + "'", double2 == 9.671406556917077E-57d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1390");
        double double2 = JavaAlgorithms.calculateTax(8.437482395119138E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6874964790238277E-74d + "'", double2 == 1.6874964790238277E-74d);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1391");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825897E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0282409603651795E-72d + "'", double2 == 2.0282409603651795E-72d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1392");
        double double2 = JavaAlgorithms.calculateTax(8.11296384146072E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.622592768292144E-74d + "'", double2 == 1.622592768292144E-74d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1393");
        double double2 = JavaAlgorithms.calculateTax(1.6874964790238277E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3749929580476554E-75d + "'", double2 == 3.3749929580476554E-75d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1394");
        double double2 = JavaAlgorithms.calculateTax(6.044629098073172E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2089258196146345E-54d + "'", double2 == 1.2089258196146345E-54d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1395");
        double double2 = JavaAlgorithms.calculateTax(4.2187411975595686E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.437482395119138E-74d + "'", double2 == 8.437482395119138E-74d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1396");
        double double2 = JavaAlgorithms.calculateTax(8.112963841460717E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6225927682921435E-70d + "'", double2 == 1.6225927682921435E-70d);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1397");
        double double2 = JavaAlgorithms.calculateTax(9.671406556917077E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9342813113834157E-57d + "'", double2 == 1.9342813113834157E-57d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1398");
        double double2 = JavaAlgorithms.calculateTax(3.2451855365842872E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168575E-72d + "'", double2 == 6.490371073168575E-72d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1399");
        double double2 = JavaAlgorithms.calculateTax(1.9342813113834157E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.868562622766832E-58d + "'", double2 == 3.868562622766832E-58d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1400");
        double double2 = JavaAlgorithms.calculateTax(1.622592768292144E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.245185536584288E-75d + "'", double2 == 3.245185536584288E-75d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1401");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146346E-56d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4178516392292693E-57d + "'", double2 == 2.4178516392292693E-57d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1402");
        double double2 = JavaAlgorithms.calculateTax(3.3749929580476554E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.749985916095311E-76d + "'", double2 == 6.749985916095311E-76d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1403");
        double double2 = JavaAlgorithms.calculateTax(1.6874964790238277E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3749929580476554E-75d + "'", double2 == 3.3749929580476554E-75d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1404");
        double double2 = JavaAlgorithms.calculateTax(6.749985916095311E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3499971832190623E-76d + "'", double2 == 1.3499971832190623E-76d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1405");
        double double2 = JavaAlgorithms.calculateTax(1.9212829409709194E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.842565881941839E-65d + "'", double2 == 3.842565881941839E-65d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1406");
        double double2 = JavaAlgorithms.calculateTax(1.6225927682921435E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2451855365842872E-71d + "'", double2 == 3.2451855365842872E-71d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1407");
        double double2 = JavaAlgorithms.calculateTax(6.749985916095311E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3499971832190623E-76d + "'", double2 == 1.3499971832190623E-76d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1408");
        double double2 = JavaAlgorithms.calculateTax(1.2089258196146345E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4178516392292692E-55d + "'", double2 == 2.4178516392292692E-55d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1409");
        double double2 = JavaAlgorithms.calculateTax(1.622592768292144E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.245185536584288E-75d + "'", double2 == 3.245185536584288E-75d);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1410");
        double double2 = JavaAlgorithms.calculateTax(3.245185536584288E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168577E-76d + "'", double2 == 6.490371073168577E-76d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1411");
        double double2 = JavaAlgorithms.calculateTax(3.868562622766832E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533664E-59d + "'", double2 == 7.737125245533664E-59d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1412");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168575E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337152E-72d + "'", double2 == 1.2980742146337152E-72d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1413");
        double double2 = JavaAlgorithms.calculateTax(5.545971375998531E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1091942751997062E-67d + "'", double2 == 1.1091942751997062E-67d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1414");
        double double2 = JavaAlgorithms.calculateTax(5.0706024009129484E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825897E-71d + "'", double2 == 1.0141204801825897E-71d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1415");
        double double2 = JavaAlgorithms.calculateTax(3.842565881941839E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.685131763883679E-66d + "'", double2 == 7.685131763883679E-66d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1416");
        double double2 = JavaAlgorithms.calculateTax(1.9342813113834157E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.868562622766832E-58d + "'", double2 == 3.868562622766832E-58d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1417");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168575E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337152E-72d + "'", double2 == 1.2980742146337152E-72d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1418");
        double double2 = JavaAlgorithms.calculateTax(4.0564819207303595E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.11296384146072E-74d + "'", double2 == 8.11296384146072E-74d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1419");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533664E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5474250491067328E-59d + "'", double2 == 1.5474250491067328E-59d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1420");
        double double2 = JavaAlgorithms.calculateTax(3.842565881941839E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.685131763883679E-66d + "'", double2 == 7.685131763883679E-66d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1421");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533664E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5474250491067328E-59d + "'", double2 == 1.5474250491067328E-59d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1422");
        double double2 = JavaAlgorithms.calculateTax(1.5474250491067328E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.094850098213466E-60d + "'", double2 == 3.094850098213466E-60d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1423");
        double double2 = JavaAlgorithms.calculateTax(1.1091942751997062E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2183885503994127E-68d + "'", double2 == 2.2183885503994127E-68d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1424");
        double double2 = JavaAlgorithms.calculateTax(2.2183885503994127E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4367771007988254E-69d + "'", double2 == 4.4367771007988254E-69d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1425");
        double double2 = JavaAlgorithms.calculateTax(3.245185536584288E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168577E-76d + "'", double2 == 6.490371073168577E-76d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1426");
        double double2 = JavaAlgorithms.calculateTax(2.4178516392292693E-57d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.835703278458539E-58d + "'", double2 == 4.835703278458539E-58d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1427");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337152E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5961484292674303E-73d + "'", double2 == 2.5961484292674303E-73d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1428");
        double double2 = JavaAlgorithms.calculateTax(3.868562622766832E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533664E-59d + "'", double2 == 7.737125245533664E-59d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1429");
        double double2 = JavaAlgorithms.calculateTax(7.685131763883679E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.537026352776736E-66d + "'", double2 == 1.537026352776736E-66d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1430");
        double double2 = JavaAlgorithms.calculateTax(4.835703278458539E-58d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.67140655691708E-59d + "'", double2 == 9.67140655691708E-59d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1431");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168577E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337153E-76d + "'", double2 == 1.2980742146337153E-76d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1432");
        double double2 = JavaAlgorithms.calculateTax(8.11296384146072E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.622592768292144E-74d + "'", double2 == 1.622592768292144E-74d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1433");
        double double2 = JavaAlgorithms.calculateTax(3.3749929580476554E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.749985916095311E-76d + "'", double2 == 6.749985916095311E-76d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1434");
        double double2 = JavaAlgorithms.calculateTax(1.5474250491067328E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.094850098213466E-60d + "'", double2 == 3.094850098213466E-60d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1435");
        double double2 = JavaAlgorithms.calculateTax(7.685131763883679E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.537026352776736E-66d + "'", double2 == 1.537026352776736E-66d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1436");
        double double2 = JavaAlgorithms.calculateTax(2.2183885503994127E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4367771007988254E-69d + "'", double2 == 4.4367771007988254E-69d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1437");
        double double2 = JavaAlgorithms.calculateTax(1.267650600228237E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.535301200456474E-70d + "'", double2 == 2.535301200456474E-70d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1438");
        double double2 = JavaAlgorithms.calculateTax(9.67140655691708E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.934281311383416E-59d + "'", double2 == 1.934281311383416E-59d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1439");
        double double2 = JavaAlgorithms.calculateTax(1.3499971832190623E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6999943664381248E-77d + "'", double2 == 2.6999943664381248E-77d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1440");
        double double2 = JavaAlgorithms.calculateTax(1.1091942751997062E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2183885503994127E-68d + "'", double2 == 2.2183885503994127E-68d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1441");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591465E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.511157274518293E-52d + "'", double2 == 1.511157274518293E-52d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1442");
        double double2 = JavaAlgorithms.calculateTax(2.5961484292674303E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534861E-74d + "'", double2 == 5.192296858534861E-74d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1443");
        double double2 = JavaAlgorithms.calculateTax(1.934281311383416E-59d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.868562622766832E-60d + "'", double2 == 3.868562622766832E-60d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1444");
        double double2 = JavaAlgorithms.calculateTax(1.3499971832190623E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6999943664381248E-77d + "'", double2 == 2.6999943664381248E-77d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1445");
        double double2 = JavaAlgorithms.calculateTax(2.6999943664381248E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.39998873287625E-78d + "'", double2 == 5.39998873287625E-78d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1446");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534861E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069722E-74d + "'", double2 == 1.0384593717069722E-74d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1447");
        double double2 = JavaAlgorithms.calculateTax(5.39998873287625E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.07999774657525E-78d + "'", double2 == 1.07999774657525E-78d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1448");
        double double2 = JavaAlgorithms.calculateTax(4.4367771007988254E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.873554201597651E-70d + "'", double2 == 8.873554201597651E-70d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1449");
        double double2 = JavaAlgorithms.calculateTax(3.868562622766832E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533665E-61d + "'", double2 == 7.737125245533665E-61d);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1450");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533665E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.547425049106733E-61d + "'", double2 == 1.547425049106733E-61d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1451");
        double double2 = JavaAlgorithms.calculateTax(3.868562622766832E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533665E-61d + "'", double2 == 7.737125245533665E-61d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1452");
        double double2 = JavaAlgorithms.calculateTax(1.537026352776736E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.074052705553472E-67d + "'", double2 == 3.074052705553472E-67d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1453");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337153E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.596148429267431E-77d + "'", double2 == 2.596148429267431E-77d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1454");
        double double2 = JavaAlgorithms.calculateTax(4.835703278458539E-58d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.67140655691708E-59d + "'", double2 == 9.67140655691708E-59d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1455");
        double double2 = JavaAlgorithms.calculateTax(9.67140655691708E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.934281311383416E-59d + "'", double2 == 1.934281311383416E-59d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1456");
        double double2 = JavaAlgorithms.calculateTax(7.737125245533665E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.547425049106733E-61d + "'", double2 == 1.547425049106733E-61d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1457");
        double double2 = JavaAlgorithms.calculateTax(1.537026352776736E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.074052705553472E-67d + "'", double2 == 3.074052705553472E-67d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1458");
        double double2 = JavaAlgorithms.calculateTax(1.07999774657525E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1599954931505004E-79d + "'", double2 == 2.1599954931505004E-79d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1459");
        double double2 = JavaAlgorithms.calculateTax(2.6999943664381248E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.39998873287625E-78d + "'", double2 == 5.39998873287625E-78d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1460");
        double double2 = JavaAlgorithms.calculateTax(2.596148429267431E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534862E-78d + "'", double2 == 5.192296858534862E-78d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1461");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069722E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0769187434139445E-75d + "'", double2 == 2.0769187434139445E-75d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1462");
        double double2 = JavaAlgorithms.calculateTax(1.9212829409709194E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.842565881941839E-65d + "'", double2 == 3.842565881941839E-65d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1463");
        double double2 = JavaAlgorithms.calculateTax(1.547425049106733E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.094850098213466E-62d + "'", double2 == 3.094850098213466E-62d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1464");
        double double2 = JavaAlgorithms.calculateTax(2.1599954931505004E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3199909863010014E-80d + "'", double2 == 4.3199909863010014E-80d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1465");
        double double2 = JavaAlgorithms.calculateTax(2.4178516392292693E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.835703278458539E-58d + "'", double2 == 4.835703278458539E-58d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1466");
        double double2 = JavaAlgorithms.calculateTax(2.596148429267431E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534862E-78d + "'", double2 == 5.192296858534862E-78d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1467");
        double double2 = JavaAlgorithms.calculateTax(4.3199909863010014E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.639981972602004E-81d + "'", double2 == 8.639981972602004E-81d);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1468");
        double double2 = JavaAlgorithms.calculateTax(1.547425049106733E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.094850098213466E-62d + "'", double2 == 3.094850098213466E-62d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1469");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534862E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069724E-78d + "'", double2 == 1.0384593717069724E-78d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1470");
        double double2 = JavaAlgorithms.calculateTax(8.639981972602004E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7279963945204008E-81d + "'", double2 == 1.7279963945204008E-81d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1471");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069724E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.076918743413945E-79d + "'", double2 == 2.076918743413945E-79d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1472");
        double double2 = JavaAlgorithms.calculateTax(1.07999774657525E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1599954931505004E-79d + "'", double2 == 2.1599954931505004E-79d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1473");
        double double2 = JavaAlgorithms.calculateTax(2.076918743413945E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.153837486827891E-80d + "'", double2 == 4.153837486827891E-80d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1474");
        double double2 = JavaAlgorithms.calculateTax(2.0769187434139445E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1538374868278893E-76d + "'", double2 == 4.1538374868278893E-76d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1475");
        double double2 = JavaAlgorithms.calculateTax(1.7279963945204008E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.455992789040802E-82d + "'", double2 == 3.455992789040802E-82d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1476");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168577E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337153E-76d + "'", double2 == 1.2980742146337153E-76d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1477");
        double double2 = JavaAlgorithms.calculateTax(3.094850098213466E-60d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426932E-61d + "'", double2 == 6.189700196426932E-61d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1478");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337152E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5961484292674303E-73d + "'", double2 == 2.5961484292674303E-73d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1479");
        double double2 = JavaAlgorithms.calculateTax(3.094850098213466E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426933E-63d + "'", double2 == 6.189700196426933E-63d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1480");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069722E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0769187434139445E-75d + "'", double2 == 2.0769187434139445E-75d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1481");
        double double2 = JavaAlgorithms.calculateTax(3.455992789040802E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.911985578081604E-83d + "'", double2 == 6.911985578081604E-83d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1482");
        double double2 = JavaAlgorithms.calculateTax(4.3199909863010014E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.639981972602004E-81d + "'", double2 == 8.639981972602004E-81d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1483");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534862E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069724E-78d + "'", double2 == 1.0384593717069724E-78d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1484");
        double double2 = JavaAlgorithms.calculateTax(4.153837486827891E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655782E-81d + "'", double2 == 8.307674973655782E-81d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1485");
        double double2 = JavaAlgorithms.calculateTax(1.7279963945204008E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.455992789040802E-82d + "'", double2 == 3.455992789040802E-82d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1486");
        double double2 = JavaAlgorithms.calculateTax(5.39998873287625E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.07999774657525E-78d + "'", double2 == 1.07999774657525E-78d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1487");
        double double2 = JavaAlgorithms.calculateTax(3.094850098213466E-60d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426932E-61d + "'", double2 == 6.189700196426932E-61d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1488");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426932E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853864E-61d + "'", double2 == 1.2379400392853864E-61d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1489");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337153E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.596148429267431E-77d + "'", double2 == 2.596148429267431E-77d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1490");
        double double2 = JavaAlgorithms.calculateTax(4.153837486827891E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655782E-81d + "'", double2 == 8.307674973655782E-81d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1491");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426933E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853867E-63d + "'", double2 == 1.2379400392853867E-63d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1492");
        double double2 = JavaAlgorithms.calculateTax(8.639981972602004E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7279963945204008E-81d + "'", double2 == 1.7279963945204008E-81d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1493");
        double double2 = JavaAlgorithms.calculateTax(4.1538374868278893E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655779E-77d + "'", double2 == 8.307674973655779E-77d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1494");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853864E-61d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.475880078570773E-62d + "'", double2 == 2.475880078570773E-62d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1495");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655779E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311559E-77d + "'", double2 == 1.6615349947311559E-77d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1496");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853864E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.475880078570773E-62d + "'", double2 == 2.475880078570773E-62d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1497");
        double double2 = JavaAlgorithms.calculateTax(6.911985578081604E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3823971156163208E-83d + "'", double2 == 1.3823971156163208E-83d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1498");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069724E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.076918743413945E-79d + "'", double2 == 2.076918743413945E-79d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1499");
        double double2 = JavaAlgorithms.calculateTax(2.0769187434139445E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1538374868278893E-76d + "'", double2 == 4.1538374868278893E-76d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression2.test1500");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655779E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311559E-77d + "'", double2 == 1.6615349947311559E-77d);
    }
}

