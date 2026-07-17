import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0501");
        double double2 = JavaAlgorithms.calculateTax(2.6843545600000034E-15d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000007E-16d + "'", double2 == 5.368709120000007E-16d);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0502");
        double double2 = JavaAlgorithms.calculateTax(2.684354560000004E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000008E-20d + "'", double2 == 5.368709120000008E-20d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0503");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000015E-16d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000032E-17d + "'", double2 == 2.1474836480000032E-17d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0504");
        double double2 = JavaAlgorithms.calculateTax(8.332236554240013E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6664473108480028E-22d + "'", double2 == 1.6664473108480028E-22d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0505");
        double double2 = JavaAlgorithms.calculateTax(1.7867063951360023E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5734127902720045E-24d + "'", double2 == 3.5734127902720045E-24d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0506");
        double double2 = JavaAlgorithms.calculateTax(1.7867063951360023E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5734127902720045E-24d + "'", double2 == 3.5734127902720045E-24d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0507");
        double double2 = JavaAlgorithms.calculateTax(1.3421772800000016E-14d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6843545600000034E-15d + "'", double2 == 2.6843545600000034E-15d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0508");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000015E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.717986918400003E-24d + "'", double2 == 1.717986918400003E-24d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0509");
        double double2 = JavaAlgorithms.calculateTax(3.3328946216960057E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.665789243392012E-24d + "'", double2 == 6.665789243392012E-24d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0510");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000032E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000006E-18d + "'", double2 == 4.294967296000006E-18d);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0511");
        double double2 = JavaAlgorithms.calculateTax(1.6664473108480028E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3328946216960057E-23d + "'", double2 == 3.3328946216960057E-23d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0512");
        double double2 = JavaAlgorithms.calculateTax(6.665789243392012E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3331578486784025E-24d + "'", double2 == 1.3331578486784025E-24d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0513");
        double double2 = JavaAlgorithms.calculateTax(6.710886400000009E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3421772800000019E-17d + "'", double2 == 1.3421772800000019E-17d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0514");
        double double2 = JavaAlgorithms.calculateTax(1.342177280000002E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.684354560000004E-19d + "'", double2 == 2.684354560000004E-19d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0515");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000007E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000015E-24d + "'", double2 == 8.589934592000015E-24d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0516");
        double double2 = JavaAlgorithms.calculateTax(1.3331578486784025E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.666315697356805E-25d + "'", double2 == 2.666315697356805E-25d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0517");
        double double2 = JavaAlgorithms.calculateTax(1.5393162788864027E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.078632557772806E-29d + "'", double2 == 3.078632557772806E-29d);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0518");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000008E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000017E-20d + "'", double2 == 1.0737418240000017E-20d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0519");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000017E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000036E-21d + "'", double2 == 2.1474836480000036E-21d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0520");
        double double2 = JavaAlgorithms.calculateTax(3.5734127902720045E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.146825580544009E-25d + "'", double2 == 7.146825580544009E-25d);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0521");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000032E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000006E-18d + "'", double2 == 4.294967296000006E-18d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0522");
        double double2 = JavaAlgorithms.calculateTax(2.666315697356805E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.332631394713611E-26d + "'", double2 == 5.332631394713611E-26d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0523");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000006E-18d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000013E-19d + "'", double2 == 8.589934592000013E-19d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0524");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000006E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000013E-19d + "'", double2 == 8.589934592000013E-19d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0525");
        double double2 = JavaAlgorithms.calculateTax(1.717986918400003E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368000065E-25d + "'", double2 == 3.4359738368000065E-25d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0526");
        double double2 = JavaAlgorithms.calculateTax(5.332631394713611E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0665262789427222E-26d + "'", double2 == 1.0665262789427222E-26d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0527");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000035E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000007E-23d + "'", double2 == 4.294967296000007E-23d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0528");
        double double2 = JavaAlgorithms.calculateTax(3.5734127902720045E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.146825580544009E-25d + "'", double2 == 7.146825580544009E-25d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0529");
        double double2 = JavaAlgorithms.calculateTax(6.7108864000000095E-18d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.342177280000002E-18d + "'", double2 == 1.342177280000002E-18d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0530");
        double double2 = JavaAlgorithms.calculateTax(3.4359738368000065E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600013E-26d + "'", double2 == 6.871947673600013E-26d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0531");
        double double2 = JavaAlgorithms.calculateTax(3.3554432000000047E-17d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.7108864000000095E-18d + "'", double2 == 6.7108864000000095E-18d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0532");
        double double2 = JavaAlgorithms.calculateTax(1.3331578486784025E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.666315697356805E-25d + "'", double2 == 2.666315697356805E-25d);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0533");
        double double2 = JavaAlgorithms.calculateTax(7.146825580544009E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.429365116108802E-25d + "'", double2 == 1.429365116108802E-25d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0534");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000013E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7179869184000028E-19d + "'", double2 == 1.7179869184000028E-19d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0535");
        double double2 = JavaAlgorithms.calculateTax(2.684354560000004E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.368709120000008E-20d + "'", double2 == 5.368709120000008E-20d);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0536");
        double double2 = JavaAlgorithms.calculateTax(1.717986918400003E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368000065E-25d + "'", double2 == 3.4359738368000065E-25d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0537");
        double double2 = JavaAlgorithms.calculateTax(3.078632557772806E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.157265115545612E-30d + "'", double2 == 6.157265115545612E-30d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0538");
        double double2 = JavaAlgorithms.calculateTax(5.332631394713611E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0665262789427222E-26d + "'", double2 == 1.0665262789427222E-26d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0539");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000017E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000036E-21d + "'", double2 == 2.1474836480000036E-21d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0540");
        double double2 = JavaAlgorithms.calculateTax(5.368709120000008E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737418240000017E-20d + "'", double2 == 1.0737418240000017E-20d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0541");
        double double2 = JavaAlgorithms.calculateTax(6.157265115545612E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2314530231091224E-30d + "'", double2 == 1.2314530231091224E-30d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0542");
        double double2 = JavaAlgorithms.calculateTax(6.157265115545612E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2314530231091224E-30d + "'", double2 == 1.2314530231091224E-30d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0543");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600013E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200027E-26d + "'", double2 == 1.3743895347200027E-26d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0544");
        double double2 = JavaAlgorithms.calculateTax(3.4359738368000065E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600013E-26d + "'", double2 == 6.871947673600013E-26d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0545");
        double double2 = JavaAlgorithms.calculateTax(1.7179869184000028E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.435973836800006E-20d + "'", double2 == 3.435973836800006E-20d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0546");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000015E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.717986918400003E-24d + "'", double2 == 1.717986918400003E-24d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0547");
        double double2 = JavaAlgorithms.calculateTax(7.146825580544009E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.429365116108802E-25d + "'", double2 == 1.429365116108802E-25d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0548");
        double double2 = JavaAlgorithms.calculateTax(1.0665262789427222E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1330525578854444E-27d + "'", double2 == 2.1330525578854444E-27d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0549");
        double double2 = JavaAlgorithms.calculateTax(1.429365116108802E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.858730232217604E-26d + "'", double2 == 2.858730232217604E-26d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0550");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000036E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000007E-22d + "'", double2 == 4.294967296000007E-22d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0551");
        double double2 = JavaAlgorithms.calculateTax(1.3421772800000019E-17d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.684354560000004E-18d + "'", double2 == 2.684354560000004E-18d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0552");
        double double2 = JavaAlgorithms.calculateTax(3.435973836800006E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600011E-21d + "'", double2 == 6.871947673600011E-21d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0553");
        double double2 = JavaAlgorithms.calculateTax(1.7179869184000028E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.435973836800006E-20d + "'", double2 == 3.435973836800006E-20d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0554");
        double double2 = JavaAlgorithms.calculateTax(2.1330525578854444E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.266105115770889E-28d + "'", double2 == 4.266105115770889E-28d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0555");
        double double2 = JavaAlgorithms.calculateTax(4.266105115770889E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.532210231541779E-29d + "'", double2 == 8.532210231541779E-29d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0556");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000007E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000015E-23d + "'", double2 == 8.589934592000015E-23d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0557");
        double double2 = JavaAlgorithms.calculateTax(1.2314530231091224E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.462906046218245E-31d + "'", double2 == 2.462906046218245E-31d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0558");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000013E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7179869184000028E-19d + "'", double2 == 1.7179869184000028E-19d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0559");
        double double2 = JavaAlgorithms.calculateTax(3.435973836800006E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600011E-21d + "'", double2 == 6.871947673600011E-21d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0560");
        double double2 = JavaAlgorithms.calculateTax(2.666315697356805E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.332631394713611E-26d + "'", double2 == 5.332631394713611E-26d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0561");
        double double2 = JavaAlgorithms.calculateTax(1.429365116108802E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.858730232217604E-26d + "'", double2 == 2.858730232217604E-26d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0562");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600011E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200023E-21d + "'", double2 == 1.3743895347200023E-21d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0563");
        double double2 = JavaAlgorithms.calculateTax(1.2314530231091224E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.462906046218245E-31d + "'", double2 == 2.462906046218245E-31d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0564");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000015E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.717986918400003E-23d + "'", double2 == 1.717986918400003E-23d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0565");
        double double2 = JavaAlgorithms.calculateTax(2.858730232217604E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.7174604644352086E-27d + "'", double2 == 5.7174604644352086E-27d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0566");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200023E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.748779069440005E-22d + "'", double2 == 2.748779069440005E-22d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0567");
        double double2 = JavaAlgorithms.calculateTax(4.266105115770889E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.532210231541779E-29d + "'", double2 == 8.532210231541779E-29d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0568");
        double double2 = JavaAlgorithms.calculateTax(5.7174604644352086E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1434920928870419E-27d + "'", double2 == 1.1434920928870419E-27d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0569");
        double double2 = JavaAlgorithms.calculateTax(8.532210231541779E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7064420463083558E-29d + "'", double2 == 1.7064420463083558E-29d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0570");
        double double2 = JavaAlgorithms.calculateTax(2.748779069440005E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.49755813888001E-23d + "'", double2 == 5.49755813888001E-23d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0571");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000007E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000015E-23d + "'", double2 == 8.589934592000015E-23d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0572");
        double double2 = JavaAlgorithms.calculateTax(1.7064420463083558E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4128840926167115E-30d + "'", double2 == 3.4128840926167115E-30d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0573");
        double double2 = JavaAlgorithms.calculateTax(5.49755813888001E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.099511627776002E-23d + "'", double2 == 1.099511627776002E-23d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0574");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000015E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.717986918400003E-23d + "'", double2 == 1.717986918400003E-23d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0575");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000036E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000007E-22d + "'", double2 == 4.294967296000007E-22d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0576");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600011E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200023E-21d + "'", double2 == 1.3743895347200023E-21d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0577");
        double double2 = JavaAlgorithms.calculateTax(1.1434920928870419E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.286984185774084E-28d + "'", double2 == 2.286984185774084E-28d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0578");
        double double2 = JavaAlgorithms.calculateTax(5.7174604644352086E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1434920928870419E-27d + "'", double2 == 1.1434920928870419E-27d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0579");
        double double2 = JavaAlgorithms.calculateTax(1.7064420463083558E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4128840926167115E-30d + "'", double2 == 3.4128840926167115E-30d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0580");
        double double2 = JavaAlgorithms.calculateTax(1.099511627776002E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1990232555520043E-24d + "'", double2 == 2.1990232555520043E-24d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0581");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000015E-16d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000032E-17d + "'", double2 == 2.1474836480000032E-17d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0582");
        double double2 = JavaAlgorithms.calculateTax(2.286984185774084E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5739683715481684E-29d + "'", double2 == 4.5739683715481684E-29d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0583");
        double double2 = JavaAlgorithms.calculateTax(2.1330525578854444E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.266105115770889E-28d + "'", double2 == 4.266105115770889E-28d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0584");
        double double2 = JavaAlgorithms.calculateTax(2.462906046218245E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.92581209243649E-32d + "'", double2 == 4.92581209243649E-32d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0585");
        double double2 = JavaAlgorithms.calculateTax(2.462906046218245E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.92581209243649E-32d + "'", double2 == 4.92581209243649E-32d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0586");
        double double2 = JavaAlgorithms.calculateTax(4.5739683715481684E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.147936743096337E-30d + "'", double2 == 9.147936743096337E-30d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0587");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000017E-19d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000035E-20d + "'", double2 == 2.1474836480000035E-20d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0588");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000035E-20d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000007E-21d + "'", double2 == 4.294967296000007E-21d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0589");
        double double2 = JavaAlgorithms.calculateTax(2.1990232555520043E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.398046511104009E-25d + "'", double2 == 4.398046511104009E-25d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0590");
        double double2 = JavaAlgorithms.calculateTax(1.0665262789427222E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1330525578854444E-27d + "'", double2 == 2.1330525578854444E-27d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0591");
        double double2 = JavaAlgorithms.calculateTax(4.92581209243649E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.851624184872981E-33d + "'", double2 == 9.851624184872981E-33d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0592");
        double double2 = JavaAlgorithms.calculateTax(1.099511627776002E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1990232555520043E-24d + "'", double2 == 2.1990232555520043E-24d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0593");
        double double2 = JavaAlgorithms.calculateTax(4.398046511104009E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.796093022208018E-26d + "'", double2 == 8.796093022208018E-26d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0594");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200027E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7487790694400056E-27d + "'", double2 == 2.7487790694400056E-27d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0595");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000007E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000014E-22d + "'", double2 == 8.589934592000014E-22d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0596");
        double double2 = JavaAlgorithms.calculateTax(2.858730232217604E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.7174604644352086E-27d + "'", double2 == 5.7174604644352086E-27d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0597");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200027E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7487790694400056E-27d + "'", double2 == 2.7487790694400056E-27d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0598");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200023E-21d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.748779069440005E-22d + "'", double2 == 2.748779069440005E-22d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0599");
        double double2 = JavaAlgorithms.calculateTax(2.1474836480000035E-20d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967296000007E-21d + "'", double2 == 4.294967296000007E-21d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0600");
        double double2 = JavaAlgorithms.calculateTax(3.3328946216960057E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.665789243392012E-24d + "'", double2 == 6.665789243392012E-24d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0601");
        double double2 = JavaAlgorithms.calculateTax(1.1434920928870419E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.286984185774084E-28d + "'", double2 == 2.286984185774084E-28d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0602");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600013E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200027E-26d + "'", double2 == 1.3743895347200027E-26d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0603");
        double double2 = JavaAlgorithms.calculateTax(5.49755813888001E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.099511627776002E-23d + "'", double2 == 1.099511627776002E-23d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0604");
        double double2 = JavaAlgorithms.calculateTax(3.078632557772806E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.157265115545612E-30d + "'", double2 == 6.157265115545612E-30d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0605");
        double double2 = JavaAlgorithms.calculateTax(2.1990232555520043E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.398046511104009E-25d + "'", double2 == 4.398046511104009E-25d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0606");
        double double2 = JavaAlgorithms.calculateTax(6.665789243392012E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3331578486784025E-24d + "'", double2 == 1.3331578486784025E-24d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0607");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000014E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.717986918400003E-22d + "'", double2 == 1.717986918400003E-22d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0608");
        double double2 = JavaAlgorithms.calculateTax(1.342177280000002E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.684354560000004E-20d + "'", double2 == 2.684354560000004E-20d);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0609");
        double double2 = JavaAlgorithms.calculateTax(1.717986918400003E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.435973836800006E-23d + "'", double2 == 3.435973836800006E-23d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0610");
        double double2 = JavaAlgorithms.calculateTax(4.92581209243649E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.851624184872981E-33d + "'", double2 == 9.851624184872981E-33d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0611");
        double double2 = JavaAlgorithms.calculateTax(3.4128840926167115E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.825768185233423E-31d + "'", double2 == 6.825768185233423E-31d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0612");
        double double2 = JavaAlgorithms.calculateTax(8.796093022208018E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7592186044416036E-26d + "'", double2 == 1.7592186044416036E-26d);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0613");
        double double2 = JavaAlgorithms.calculateTax(9.147936743096337E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8295873486192674E-30d + "'", double2 == 1.8295873486192674E-30d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0614");
        double double2 = JavaAlgorithms.calculateTax(3.435973836800006E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600013E-24d + "'", double2 == 6.871947673600013E-24d);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0615");
        double double2 = JavaAlgorithms.calculateTax(2.286984185774084E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5739683715481684E-29d + "'", double2 == 4.5739683715481684E-29d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0616");
        double double2 = JavaAlgorithms.calculateTax(8.532210231541779E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7064420463083558E-29d + "'", double2 == 1.7064420463083558E-29d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0617");
        double double2 = JavaAlgorithms.calculateTax(1.717986918400003E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.435973836800006E-24d + "'", double2 == 3.435973836800006E-24d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0618");
        double double2 = JavaAlgorithms.calculateTax(4.398046511104009E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.796093022208018E-26d + "'", double2 == 8.796093022208018E-26d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0619");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600013E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200026E-24d + "'", double2 == 1.3743895347200026E-24d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0620");
        double double2 = JavaAlgorithms.calculateTax(6.825768185233423E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3651536370466846E-31d + "'", double2 == 1.3651536370466846E-31d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0621");
        double double2 = JavaAlgorithms.calculateTax(2.7487790694400056E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.497558138880011E-28d + "'", double2 == 5.497558138880011E-28d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0622");
        double double2 = JavaAlgorithms.calculateTax(9.851624184872981E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9703248369745964E-33d + "'", double2 == 1.9703248369745964E-33d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0623");
        double double2 = JavaAlgorithms.calculateTax(1.3651536370466846E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7303072740933693E-32d + "'", double2 == 2.7303072740933693E-32d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0624");
        double double2 = JavaAlgorithms.calculateTax(8.796093022208018E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7592186044416036E-26d + "'", double2 == 1.7592186044416036E-26d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0625");
        double double2 = JavaAlgorithms.calculateTax(3.435973836800006E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600013E-25d + "'", double2 == 6.871947673600013E-25d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0626");
        double double2 = JavaAlgorithms.calculateTax(3.435973836800006E-23d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600013E-24d + "'", double2 == 6.871947673600013E-24d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0627");
        double double2 = JavaAlgorithms.calculateTax(1.9703248369745964E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.940649673949193E-34d + "'", double2 == 3.940649673949193E-34d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0628");
        double double2 = JavaAlgorithms.calculateTax(4.294967296000007E-21d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.589934592000014E-22d + "'", double2 == 8.589934592000014E-22d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0629");
        double double2 = JavaAlgorithms.calculateTax(4.810363371520007E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.620726743040015E-26d + "'", double2 == 9.620726743040015E-26d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0630");
        double double2 = JavaAlgorithms.calculateTax(3.435973836800006E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.871947673600013E-25d + "'", double2 == 6.871947673600013E-25d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0631");
        double double2 = JavaAlgorithms.calculateTax(1.3651536370466846E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7303072740933693E-32d + "'", double2 == 2.7303072740933693E-32d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0632");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600013E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200026E-24d + "'", double2 == 1.3743895347200026E-24d);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0633");
        double double2 = JavaAlgorithms.calculateTax(6.825768185233423E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3651536370466846E-31d + "'", double2 == 1.3651536370466846E-31d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0634");
        double double2 = JavaAlgorithms.calculateTax(5.497558138880011E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0995116277760024E-28d + "'", double2 == 1.0995116277760024E-28d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0635");
        double double2 = JavaAlgorithms.calculateTax(9.147936743096337E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8295873486192674E-30d + "'", double2 == 1.8295873486192674E-30d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0636");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600013E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200027E-25d + "'", double2 == 1.3743895347200027E-25d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0637");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200027E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7487790694400053E-26d + "'", double2 == 2.7487790694400053E-26d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0638");
        double double2 = JavaAlgorithms.calculateTax(1.0995116277760024E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1990232555520048E-29d + "'", double2 == 2.1990232555520048E-29d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0639");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200027E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7487790694400053E-26d + "'", double2 == 2.7487790694400053E-26d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0640");
        double double2 = JavaAlgorithms.calculateTax(1.8295873486192674E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.659174697238535E-31d + "'", double2 == 3.659174697238535E-31d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0641");
        double double2 = JavaAlgorithms.calculateTax(1.717986918400003E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.435973836800006E-23d + "'", double2 == 3.435973836800006E-23d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0642");
        double double2 = JavaAlgorithms.calculateTax(3.4128840926167115E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.825768185233423E-31d + "'", double2 == 6.825768185233423E-31d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0643");
        double double2 = JavaAlgorithms.calculateTax(8.589934592000014E-22d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.717986918400003E-22d + "'", double2 == 1.717986918400003E-22d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0644");
        double double2 = JavaAlgorithms.calculateTax(4.5739683715481684E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.147936743096337E-30d + "'", double2 == 9.147936743096337E-30d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0645");
        double double2 = JavaAlgorithms.calculateTax(1.717986918400003E-23d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.435973836800006E-24d + "'", double2 == 3.435973836800006E-24d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0646");
        double double2 = JavaAlgorithms.calculateTax(2.1990232555520048E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.39804651110401E-30d + "'", double2 == 4.39804651110401E-30d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0647");
        double double2 = JavaAlgorithms.calculateTax(1.9703248369745964E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.940649673949193E-34d + "'", double2 == 3.940649673949193E-34d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0648");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200026E-24d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7487790694400053E-25d + "'", double2 == 2.7487790694400053E-25d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0649");
        double double2 = JavaAlgorithms.calculateTax(1.8295873486192674E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.659174697238535E-31d + "'", double2 == 3.659174697238535E-31d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0650");
        double double2 = JavaAlgorithms.calculateTax(1.0995116277760024E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1990232555520048E-29d + "'", double2 == 2.1990232555520048E-29d);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0651");
        double double2 = JavaAlgorithms.calculateTax(2.7487790694400053E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.497558138880011E-27d + "'", double2 == 5.497558138880011E-27d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0652");
        double double2 = JavaAlgorithms.calculateTax(5.497558138880011E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0995116277760024E-28d + "'", double2 == 1.0995116277760024E-28d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0653");
        double double2 = JavaAlgorithms.calculateTax(2.748779069440005E-22d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.49755813888001E-23d + "'", double2 == 5.49755813888001E-23d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0654");
        double double2 = JavaAlgorithms.calculateTax(1.0737418240000017E-19d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474836480000035E-20d + "'", double2 == 2.1474836480000035E-20d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0655");
        double double2 = JavaAlgorithms.calculateTax(9.851624184872981E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9703248369745964E-33d + "'", double2 == 1.9703248369745964E-33d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0656");
        double double2 = JavaAlgorithms.calculateTax(2.7487790694400053E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.497558138880011E-26d + "'", double2 == 5.497558138880011E-26d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0657");
        double double2 = JavaAlgorithms.calculateTax(5.497558138880011E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0995116277760023E-27d + "'", double2 == 1.0995116277760023E-27d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0658");
        double double2 = JavaAlgorithms.calculateTax(3.940649673949193E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.881299347898386E-35d + "'", double2 == 7.881299347898386E-35d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0659");
        double double2 = JavaAlgorithms.calculateTax(5.497558138880011E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0995116277760023E-26d + "'", double2 == 1.0995116277760023E-26d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0660");
        double double2 = JavaAlgorithms.calculateTax(1.0995116277760023E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1990232555520045E-27d + "'", double2 == 2.1990232555520045E-27d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0661");
        double double2 = JavaAlgorithms.calculateTax(7.881299347898386E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5762598695796772E-35d + "'", double2 == 1.5762598695796772E-35d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0662");
        double double2 = JavaAlgorithms.calculateTax(3.659174697238535E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.31834939447707E-32d + "'", double2 == 7.31834939447707E-32d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0663");
        double double2 = JavaAlgorithms.calculateTax(1.0995116277760023E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1990232555520045E-27d + "'", double2 == 2.1990232555520045E-27d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0664");
        double double2 = JavaAlgorithms.calculateTax(5.497558138880011E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0995116277760023E-26d + "'", double2 == 1.0995116277760023E-26d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0665");
        double double2 = JavaAlgorithms.calculateTax(2.7303072740933693E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.460614548186739E-33d + "'", double2 == 5.460614548186739E-33d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0666");
        double double2 = JavaAlgorithms.calculateTax(7.31834939447707E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.463669878895414E-32d + "'", double2 == 1.463669878895414E-32d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0667");
        double double2 = JavaAlgorithms.calculateTax(1.463669878895414E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.927339757790828E-33d + "'", double2 == 2.927339757790828E-33d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0668");
        double double2 = JavaAlgorithms.calculateTax(2.7487790694400053E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.497558138880011E-27d + "'", double2 == 5.497558138880011E-27d);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0669");
        double double2 = JavaAlgorithms.calculateTax(2.1990232555520048E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.39804651110401E-30d + "'", double2 == 4.39804651110401E-30d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0670");
        double double2 = JavaAlgorithms.calculateTax(1.463669878895414E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.927339757790828E-33d + "'", double2 == 2.927339757790828E-33d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0671");
        double double2 = JavaAlgorithms.calculateTax(2.927339757790828E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.854679515581657E-34d + "'", double2 == 5.854679515581657E-34d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0672");
        double double2 = JavaAlgorithms.calculateTax(1.7592186044416036E-26d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-27d + "'", double2 == 3.518437208883208E-27d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0673");
        double double2 = JavaAlgorithms.calculateTax(1.0995116277760023E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.199023255552005E-28d + "'", double2 == 2.199023255552005E-28d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0674");
        double double2 = JavaAlgorithms.calculateTax(2.199023255552005E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3980465111040096E-29d + "'", double2 == 4.3980465111040096E-29d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0675");
        double double2 = JavaAlgorithms.calculateTax(5.854679515581657E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1709359031163314E-34d + "'", double2 == 1.1709359031163314E-34d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0676");
        double double2 = JavaAlgorithms.calculateTax(4.3980465111040096E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.79609302220802E-30d + "'", double2 == 8.79609302220802E-30d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0677");
        double double2 = JavaAlgorithms.calculateTax(2.7487790694400053E-25d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.497558138880011E-26d + "'", double2 == 5.497558138880011E-26d);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0678");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766415E-28d + "'", double2 == 7.036874417766415E-28d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0679");
        double double2 = JavaAlgorithms.calculateTax(7.881299347898386E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5762598695796772E-35d + "'", double2 == 1.5762598695796772E-35d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0680");
        double double2 = JavaAlgorithms.calculateTax(1.5762598695796772E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1525197391593546E-36d + "'", double2 == 3.1525197391593546E-36d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0681");
        double double2 = JavaAlgorithms.calculateTax(2.1990232555520045E-27d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.39804651110401E-28d + "'", double2 == 4.39804651110401E-28d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0682");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766415E-28d + "'", double2 == 7.036874417766415E-28d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0683");
        double double2 = JavaAlgorithms.calculateTax(2.7487790694400056E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.497558138880011E-28d + "'", double2 == 5.497558138880011E-28d);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0684");
        double double2 = JavaAlgorithms.calculateTax(1.1709359031163314E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3418718062326627E-35d + "'", double2 == 2.3418718062326627E-35d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0685");
        double double2 = JavaAlgorithms.calculateTax(4.39804651110401E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.79609302220802E-31d + "'", double2 == 8.79609302220802E-31d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0686");
        double double2 = JavaAlgorithms.calculateTax(2.927339757790828E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.854679515581657E-34d + "'", double2 == 5.854679515581657E-34d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0687");
        double double2 = JavaAlgorithms.calculateTax(8.79609302220802E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.759218604441604E-30d + "'", double2 == 1.759218604441604E-30d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0688");
        double double2 = JavaAlgorithms.calculateTax(8.79609302220802E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.759218604441604E-31d + "'", double2 == 1.759218604441604E-31d);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0689");
        double double2 = JavaAlgorithms.calculateTax(4.39804651110401E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.796093022208019E-29d + "'", double2 == 8.796093022208019E-29d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0690");
        double double2 = JavaAlgorithms.calculateTax(1.759218604441604E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-31d + "'", double2 == 3.518437208883208E-31d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0691");
        double double2 = JavaAlgorithms.calculateTax(8.79609302220802E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.759218604441604E-30d + "'", double2 == 1.759218604441604E-30d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0692");
        double double2 = JavaAlgorithms.calculateTax(2.1990232555520045E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.39804651110401E-28d + "'", double2 == 4.39804651110401E-28d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0693");
        double double2 = JavaAlgorithms.calculateTax(4.3980465111040096E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.79609302220802E-30d + "'", double2 == 8.79609302220802E-30d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0694");
        double double2 = JavaAlgorithms.calculateTax(1.7592186044416036E-26d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-27d + "'", double2 == 3.518437208883208E-27d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0695");
        double double2 = JavaAlgorithms.calculateTax(3.1525197391593546E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.305039478318709E-37d + "'", double2 == 6.305039478318709E-37d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0696");
        double double2 = JavaAlgorithms.calculateTax(6.871947673600013E-25d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3743895347200027E-25d + "'", double2 == 1.3743895347200027E-25d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0697");
        double double2 = JavaAlgorithms.calculateTax(8.79609302220802E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.759218604441604E-31d + "'", double2 == 1.759218604441604E-31d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0698");
        double double2 = JavaAlgorithms.calculateTax(1.0995116277760023E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.199023255552005E-28d + "'", double2 == 2.199023255552005E-28d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0699");
        double double2 = JavaAlgorithms.calculateTax(3.940649673949193E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.881299347898386E-35d + "'", double2 == 7.881299347898386E-35d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0700");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766415E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532832E-28d + "'", double2 == 1.4073748835532832E-28d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0701");
        double double2 = JavaAlgorithms.calculateTax(2.199023255552005E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3980465111040096E-29d + "'", double2 == 4.3980465111040096E-29d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0702");
        double double2 = JavaAlgorithms.calculateTax(1.3743895347200026E-24d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7487790694400053E-25d + "'", double2 == 2.7487790694400053E-25d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0703");
        double double2 = JavaAlgorithms.calculateTax(5.497558138880011E-27d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0995116277760023E-27d + "'", double2 == 1.0995116277760023E-27d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0704");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766415E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532832E-28d + "'", double2 == 1.4073748835532832E-28d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0705");
        double double2 = JavaAlgorithms.calculateTax(1.1709359031163314E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3418718062326627E-35d + "'", double2 == 2.3418718062326627E-35d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0706");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532832E-28d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065664E-29d + "'", double2 == 2.8147497671065664E-29d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0707");
        double double2 = JavaAlgorithms.calculateTax(3.1525197391593546E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.305039478318709E-37d + "'", double2 == 6.305039478318709E-37d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0708");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766416E-32d + "'", double2 == 7.036874417766416E-32d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0709");
        double double2 = JavaAlgorithms.calculateTax(2.3418718062326627E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6837436124653256E-36d + "'", double2 == 4.6837436124653256E-36d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0710");
        double double2 = JavaAlgorithms.calculateTax(4.6837436124653256E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.367487224930652E-37d + "'", double2 == 9.367487224930652E-37d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0711");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065664E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.629499534213133E-30d + "'", double2 == 5.629499534213133E-30d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0712");
        double double2 = JavaAlgorithms.calculateTax(4.6837436124653256E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.367487224930652E-37d + "'", double2 == 9.367487224930652E-37d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0713");
        double double2 = JavaAlgorithms.calculateTax(8.796093022208019E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.759218604441604E-29d + "'", double2 == 1.759218604441604E-29d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0714");
        double double2 = JavaAlgorithms.calculateTax(1.759218604441604E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-31d + "'", double2 == 3.518437208883208E-31d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0715");
        double double2 = JavaAlgorithms.calculateTax(1.5762598695796772E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1525197391593546E-36d + "'", double2 == 3.1525197391593546E-36d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0716");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766416E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532833E-32d + "'", double2 == 1.4073748835532833E-32d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0717");
        double double2 = JavaAlgorithms.calculateTax(5.629499534213133E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426266E-30d + "'", double2 == 1.1258999068426266E-30d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0718");
        double double2 = JavaAlgorithms.calculateTax(4.39804651110401E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.796093022208019E-29d + "'", double2 == 8.796093022208019E-29d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0719");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766416E-32d + "'", double2 == 7.036874417766416E-32d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0720");
        double double2 = JavaAlgorithms.calculateTax(8.796093022208019E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.759218604441604E-29d + "'", double2 == 1.759218604441604E-29d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0721");
        double double2 = JavaAlgorithms.calculateTax(7.31834939447707E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.463669878895414E-32d + "'", double2 == 1.463669878895414E-32d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0722");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065664E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.629499534213133E-30d + "'", double2 == 5.629499534213133E-30d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0723");
        double double2 = JavaAlgorithms.calculateTax(6.305039478318709E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.261007895663742E-37d + "'", double2 == 1.261007895663742E-37d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0724");
        double double2 = JavaAlgorithms.calculateTax(4.39804651110401E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.79609302220802E-31d + "'", double2 == 8.79609302220802E-31d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0725");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532832E-28d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065664E-29d + "'", double2 == 2.8147497671065664E-29d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0726");
        double double2 = JavaAlgorithms.calculateTax(1.261007895663742E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.522015791327484E-38d + "'", double2 == 2.522015791327484E-38d);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0727");
        double double2 = JavaAlgorithms.calculateTax(1.759218604441604E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-32d + "'", double2 == 3.518437208883208E-32d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0728");
        double double2 = JavaAlgorithms.calculateTax(2.3418718062326627E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6837436124653256E-36d + "'", double2 == 4.6837436124653256E-36d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0729");
        double double2 = JavaAlgorithms.calculateTax(5.629499534213133E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426266E-30d + "'", double2 == 1.1258999068426266E-30d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0730");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532833E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065668E-33d + "'", double2 == 2.8147497671065668E-33d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0731");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426266E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852533E-31d + "'", double2 == 2.2517998136852533E-31d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0732");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065668E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6294995342131335E-34d + "'", double2 == 5.6294995342131335E-34d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0733");
        double double2 = JavaAlgorithms.calculateTax(5.6294995342131335E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426267E-34d + "'", double2 == 1.1258999068426267E-34d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0734");
        double double2 = JavaAlgorithms.calculateTax(5.854679515581657E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1709359031163314E-34d + "'", double2 == 1.1709359031163314E-34d);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0735");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852533E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370507E-32d + "'", double2 == 4.503599627370507E-32d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0736");
        double double2 = JavaAlgorithms.calculateTax(6.305039478318709E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.261007895663742E-37d + "'", double2 == 1.261007895663742E-37d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0737");
        double double2 = JavaAlgorithms.calculateTax(2.522015791327484E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.044031582654969E-39d + "'", double2 == 5.044031582654969E-39d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0738");
        double double2 = JavaAlgorithms.calculateTax(5.044031582654969E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0088063165309939E-39d + "'", double2 == 1.0088063165309939E-39d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0739");
        double double2 = JavaAlgorithms.calculateTax(4.503599627370507E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741014E-33d + "'", double2 == 9.007199254741014E-33d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0740");
        double double2 = JavaAlgorithms.calculateTax(9.367487224930652E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8734974449861303E-37d + "'", double2 == 1.8734974449861303E-37d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0741");
        double double2 = JavaAlgorithms.calculateTax(1.759218604441604E-29d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-30d + "'", double2 == 3.518437208883208E-30d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0742");
        double double2 = JavaAlgorithms.calculateTax(5.460614548186739E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.092122909637348E-33d + "'", double2 == 1.092122909637348E-33d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0743");
        double double2 = JavaAlgorithms.calculateTax(2.522015791327484E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.044031582654969E-39d + "'", double2 == 5.044031582654969E-39d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0744");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426267E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852536E-35d + "'", double2 == 2.2517998136852536E-35d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0745");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852536E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5035996273705074E-36d + "'", double2 == 4.5035996273705074E-36d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0746");
        double double2 = JavaAlgorithms.calculateTax(1.8734974449861303E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.746994889972261E-38d + "'", double2 == 3.746994889972261E-38d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0747");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741014E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8014398509482027E-33d + "'", double2 == 1.8014398509482027E-33d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0748");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741014E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8014398509482027E-33d + "'", double2 == 1.8014398509482027E-33d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0749");
        double double2 = JavaAlgorithms.calculateTax(4.5035996273705074E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741015E-37d + "'", double2 == 9.007199254741015E-37d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0750");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426266E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852533E-31d + "'", double2 == 2.2517998136852533E-31d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0751");
        double double2 = JavaAlgorithms.calculateTax(1.8734974449861303E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.746994889972261E-38d + "'", double2 == 3.746994889972261E-38d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0752");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532833E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065668E-33d + "'", double2 == 2.8147497671065668E-33d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0753");
        double double2 = JavaAlgorithms.calculateTax(1.261007895663742E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.522015791327484E-38d + "'", double2 == 2.522015791327484E-38d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0754");
        double double2 = JavaAlgorithms.calculateTax(3.746994889972261E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.493989779944522E-39d + "'", double2 == 7.493989779944522E-39d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0755");
        double double2 = JavaAlgorithms.calculateTax(5.044031582654969E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0088063165309939E-39d + "'", double2 == 1.0088063165309939E-39d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0756");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766416E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532833E-32d + "'", double2 == 1.4073748835532833E-32d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0757");
        double double2 = JavaAlgorithms.calculateTax(7.493989779944522E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4987979559889046E-39d + "'", double2 == 1.4987979559889046E-39d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0758");
        double double2 = JavaAlgorithms.calculateTax(5.6294995342131335E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426267E-34d + "'", double2 == 1.1258999068426267E-34d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0759");
        double double2 = JavaAlgorithms.calculateTax(1.0088063165309939E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.017612633061988E-40d + "'", double2 == 2.017612633061988E-40d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0760");
        double double2 = JavaAlgorithms.calculateTax(1.759218604441604E-29d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-30d + "'", double2 == 3.518437208883208E-30d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0761");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741015E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8014398509482033E-37d + "'", double2 == 1.8014398509482033E-37d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0762");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426267E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852536E-35d + "'", double2 == 2.2517998136852536E-35d);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0763");
        double double2 = JavaAlgorithms.calculateTax(1.8014398509482027E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.602879701896406E-34d + "'", double2 == 3.602879701896406E-34d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0764");
        double double2 = JavaAlgorithms.calculateTax(3.602879701896406E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792812E-35d + "'", double2 == 7.205759403792812E-35d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0765");
        double double2 = JavaAlgorithms.calculateTax(3.746994889972261E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.493989779944522E-39d + "'", double2 == 7.493989779944522E-39d);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0766");
        double double2 = JavaAlgorithms.calculateTax(3.659174697238535E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.31834939447707E-32d + "'", double2 == 7.31834939447707E-32d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0767");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741015E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8014398509482033E-37d + "'", double2 == 1.8014398509482033E-37d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0768");
        double double2 = JavaAlgorithms.calculateTax(1.4987979559889046E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.997595911977809E-40d + "'", double2 == 2.997595911977809E-40d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0769");
        double double2 = JavaAlgorithms.calculateTax(3.602879701896406E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792812E-35d + "'", double2 == 7.205759403792812E-35d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0770");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792812E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411518807585625E-35d + "'", double2 == 1.4411518807585625E-35d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0771");
        double double2 = JavaAlgorithms.calculateTax(4.5035996273705074E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741015E-37d + "'", double2 == 9.007199254741015E-37d);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0772");
        double double2 = JavaAlgorithms.calculateTax(9.367487224930652E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8734974449861303E-37d + "'", double2 == 1.8734974449861303E-37d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0773");
        double double2 = JavaAlgorithms.calculateTax(1.759218604441604E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.518437208883208E-32d + "'", double2 == 3.518437208883208E-32d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0774");
        double double2 = JavaAlgorithms.calculateTax(1.092122909637348E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.184245819274696E-34d + "'", double2 == 2.184245819274696E-34d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0775");
        double double2 = JavaAlgorithms.calculateTax(1.8014398509482033E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.602879701896407E-38d + "'", double2 == 3.602879701896407E-38d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0776");
        double double2 = JavaAlgorithms.calculateTax(7.493989779944522E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4987979559889046E-39d + "'", double2 == 1.4987979559889046E-39d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0777");
        double double2 = JavaAlgorithms.calculateTax(4.503599627370507E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741014E-33d + "'", double2 == 9.007199254741014E-33d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0778");
        double double2 = JavaAlgorithms.calculateTax(2.997595911977809E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.995191823955618E-41d + "'", double2 == 5.995191823955618E-41d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0779");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766417E-33d + "'", double2 == 7.036874417766417E-33d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0780");
        double double2 = JavaAlgorithms.calculateTax(5.460614548186739E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.092122909637348E-33d + "'", double2 == 1.092122909637348E-33d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0781");
        double double2 = JavaAlgorithms.calculateTax(1.0088063165309939E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.017612633061988E-40d + "'", double2 == 2.017612633061988E-40d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0782");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852533E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370507E-32d + "'", double2 == 4.503599627370507E-32d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0783");
        double double2 = JavaAlgorithms.calculateTax(5.995191823955618E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1990383647911238E-41d + "'", double2 == 1.1990383647911238E-41d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0784");
        double double2 = JavaAlgorithms.calculateTax(1.1990383647911238E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.398076729582248E-42d + "'", double2 == 2.398076729582248E-42d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0785");
        double double2 = JavaAlgorithms.calculateTax(1.4987979559889046E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.997595911977809E-40d + "'", double2 == 2.997595911977809E-40d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0786");
        double double2 = JavaAlgorithms.calculateTax(5.995191823955618E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1990383647911238E-41d + "'", double2 == 1.1990383647911238E-41d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0787");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065668E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6294995342131335E-34d + "'", double2 == 5.6294995342131335E-34d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0788");
        double double2 = JavaAlgorithms.calculateTax(1.092122909637348E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.184245819274696E-34d + "'", double2 == 2.184245819274696E-34d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0789");
        double double2 = JavaAlgorithms.calculateTax(2.017612633061988E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0352252661239757E-41d + "'", double2 == 4.0352252661239757E-41d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0790");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-30d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766416E-31d + "'", double2 == 7.036874417766416E-31d);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0791");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766417E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532834E-33d + "'", double2 == 1.4073748835532834E-33d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0792");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792812E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411518807585625E-35d + "'", double2 == 1.4411518807585625E-35d);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0793");
        double double2 = JavaAlgorithms.calculateTax(2.7303072740933693E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.460614548186739E-33d + "'", double2 == 5.460614548186739E-33d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0794");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766417E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532834E-33d + "'", double2 == 1.4073748835532834E-33d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0795");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532834E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065668E-34d + "'", double2 == 2.8147497671065668E-34d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0796");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-30d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766416E-31d + "'", double2 == 7.036874417766416E-31d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0797");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532834E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065668E-34d + "'", double2 == 2.8147497671065668E-34d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0798");
        double double2 = JavaAlgorithms.calculateTax(2.398076729582248E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.796153459164496E-43d + "'", double2 == 4.796153459164496E-43d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0799");
        double double2 = JavaAlgorithms.calculateTax(2.398076729582248E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.796153459164496E-43d + "'", double2 == 4.796153459164496E-43d);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0800");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766416E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532833E-31d + "'", double2 == 1.4073748835532833E-31d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0801");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852536E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5035996273705074E-36d + "'", double2 == 4.5035996273705074E-36d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0802");
        double double2 = JavaAlgorithms.calculateTax(2.017612633061988E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0352252661239757E-41d + "'", double2 == 4.0352252661239757E-41d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0803");
        double double2 = JavaAlgorithms.calculateTax(1.8014398509482027E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.602879701896406E-34d + "'", double2 == 3.602879701896406E-34d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0804");
        double double2 = JavaAlgorithms.calculateTax(4.0352252661239757E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.070450532247952E-42d + "'", double2 == 8.070450532247952E-42d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0805");
        double double2 = JavaAlgorithms.calculateTax(1.4411518807585625E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8823037615171252E-36d + "'", double2 == 2.8823037615171252E-36d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0806");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532833E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065666E-32d + "'", double2 == 2.8147497671065666E-32d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0807");
        double double2 = JavaAlgorithms.calculateTax(2.184245819274696E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.368491638549392E-35d + "'", double2 == 4.368491638549392E-35d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0808");
        double double2 = JavaAlgorithms.calculateTax(1.1990383647911238E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.398076729582248E-42d + "'", double2 == 2.398076729582248E-42d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0809");
        double double2 = JavaAlgorithms.calculateTax(4.796153459164496E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.592306918328993E-44d + "'", double2 == 9.592306918328993E-44d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0810");
        double double2 = JavaAlgorithms.calculateTax(1.4073748835532833E-31d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8147497671065666E-32d + "'", double2 == 2.8147497671065666E-32d);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0811");
        double double2 = JavaAlgorithms.calculateTax(9.592306918328993E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9184613836657989E-44d + "'", double2 == 1.9184613836657989E-44d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0812");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065668E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.629499534213134E-35d + "'", double2 == 5.629499534213134E-35d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0813");
        double double2 = JavaAlgorithms.calculateTax(2.8823037615171252E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.764607523034251E-37d + "'", double2 == 5.764607523034251E-37d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0814");
        double double2 = JavaAlgorithms.calculateTax(3.518437208883208E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766417E-33d + "'", double2 == 7.036874417766417E-33d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0815");
        double double2 = JavaAlgorithms.calculateTax(9.592306918328993E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9184613836657989E-44d + "'", double2 == 1.9184613836657989E-44d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0816");
        double double2 = JavaAlgorithms.calculateTax(4.0352252661239757E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.070450532247952E-42d + "'", double2 == 8.070450532247952E-42d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0817");
        double double2 = JavaAlgorithms.calculateTax(3.602879701896407E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792814E-39d + "'", double2 == 7.205759403792814E-39d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0818");
        double double2 = JavaAlgorithms.calculateTax(8.070450532247952E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6140901064495907E-42d + "'", double2 == 1.6140901064495907E-42d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0819");
        double double2 = JavaAlgorithms.calculateTax(5.764607523034251E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1529215046068503E-37d + "'", double2 == 1.1529215046068503E-37d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0820");
        double double2 = JavaAlgorithms.calculateTax(7.036874417766416E-31d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073748835532833E-31d + "'", double2 == 1.4073748835532833E-31d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0821");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065666E-32d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6294995342131335E-33d + "'", double2 == 5.6294995342131335E-33d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0822");
        double double2 = JavaAlgorithms.calculateTax(1.6140901064495907E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2281802128991816E-43d + "'", double2 == 3.2281802128991816E-43d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0823");
        double double2 = JavaAlgorithms.calculateTax(1.9184613836657989E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.836922767331598E-45d + "'", double2 == 3.836922767331598E-45d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0824");
        double double2 = JavaAlgorithms.calculateTax(3.602879701896407E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792814E-39d + "'", double2 == 7.205759403792814E-39d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0825");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792814E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.441151880758563E-39d + "'", double2 == 1.441151880758563E-39d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0826");
        double double2 = JavaAlgorithms.calculateTax(1.441151880758563E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8823037615171263E-40d + "'", double2 == 2.8823037615171263E-40d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0827");
        double double2 = JavaAlgorithms.calculateTax(5.764607523034251E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1529215046068503E-37d + "'", double2 == 1.1529215046068503E-37d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0828");
        double double2 = JavaAlgorithms.calculateTax(2.8823037615171263E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.764607523034253E-41d + "'", double2 == 5.764607523034253E-41d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0829");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065668E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.629499534213134E-35d + "'", double2 == 5.629499534213134E-35d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0830");
        double double2 = JavaAlgorithms.calculateTax(2.997595911977809E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.995191823955618E-41d + "'", double2 == 5.995191823955618E-41d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0831");
        double double2 = JavaAlgorithms.calculateTax(1.9184613836657989E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.836922767331598E-45d + "'", double2 == 3.836922767331598E-45d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0832");
        double double2 = JavaAlgorithms.calculateTax(4.796153459164496E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.592306918328993E-44d + "'", double2 == 9.592306918328993E-44d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0833");
        double double2 = JavaAlgorithms.calculateTax(5.6294995342131335E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426267E-33d + "'", double2 == 1.1258999068426267E-33d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0834");
        double double2 = JavaAlgorithms.calculateTax(3.836922767331598E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.673845534663196E-46d + "'", double2 == 7.673845534663196E-46d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0835");
        double double2 = JavaAlgorithms.calculateTax(5.629499534213134E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426268E-35d + "'", double2 == 1.1258999068426268E-35d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0836");
        double double2 = JavaAlgorithms.calculateTax(7.673845534663196E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5347691069326393E-46d + "'", double2 == 1.5347691069326393E-46d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0837");
        double double2 = JavaAlgorithms.calculateTax(4.368491638549392E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.736983277098785E-36d + "'", double2 == 8.736983277098785E-36d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0838");
        double double2 = JavaAlgorithms.calculateTax(1.1529215046068503E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3058430092137008E-38d + "'", double2 == 2.3058430092137008E-38d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0839");
        double double2 = JavaAlgorithms.calculateTax(2.3058430092137008E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427402E-39d + "'", double2 == 4.611686018427402E-39d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0840");
        double double2 = JavaAlgorithms.calculateTax(8.736983277098785E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.747396655419757E-36d + "'", double2 == 1.747396655419757E-36d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0841");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426268E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852537E-36d + "'", double2 == 2.2517998136852537E-36d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0842");
        double double2 = JavaAlgorithms.calculateTax(5.764607523034253E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1529215046068508E-41d + "'", double2 == 1.1529215046068508E-41d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0843");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426267E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852534E-34d + "'", double2 == 2.2517998136852534E-34d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0844");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852534E-34d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370507E-35d + "'", double2 == 4.503599627370507E-35d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0845");
        double double2 = JavaAlgorithms.calculateTax(5.629499534213134E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426268E-35d + "'", double2 == 1.1258999068426268E-35d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0846");
        double double2 = JavaAlgorithms.calculateTax(2.8823037615171263E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.764607523034253E-41d + "'", double2 == 5.764607523034253E-41d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0847");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426268E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852537E-36d + "'", double2 == 2.2517998136852537E-36d);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0848");
        double double2 = JavaAlgorithms.calculateTax(1.441151880758563E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8823037615171263E-40d + "'", double2 == 2.8823037615171263E-40d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0849");
        double double2 = JavaAlgorithms.calculateTax(1.1258999068426267E-33d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2517998136852534E-34d + "'", double2 == 2.2517998136852534E-34d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0850");
        double double2 = JavaAlgorithms.calculateTax(8.736983277098785E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.747396655419757E-36d + "'", double2 == 1.747396655419757E-36d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0851");
        double double2 = JavaAlgorithms.calculateTax(1.6140901064495907E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2281802128991816E-43d + "'", double2 == 3.2281802128991816E-43d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0852");
        double double2 = JavaAlgorithms.calculateTax(7.673845534663196E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5347691069326393E-46d + "'", double2 == 1.5347691069326393E-46d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0853");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427402E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854805E-40d + "'", double2 == 9.223372036854805E-40d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0854");
        double double2 = JavaAlgorithms.calculateTax(5.764607523034253E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1529215046068508E-41d + "'", double2 == 1.1529215046068508E-41d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0855");
        double double2 = JavaAlgorithms.calculateTax(1.5347691069326393E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.069538213865279E-47d + "'", double2 == 3.069538213865279E-47d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0856");
        double double2 = JavaAlgorithms.calculateTax(4.503599627370507E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741015E-36d + "'", double2 == 9.007199254741015E-36d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0857");
        double double2 = JavaAlgorithms.calculateTax(3.2281802128991816E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.456360425798364E-44d + "'", double2 == 6.456360425798364E-44d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0858");
        double double2 = JavaAlgorithms.calculateTax(3.2281802128991816E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.456360425798364E-44d + "'", double2 == 6.456360425798364E-44d);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0859");
        double double2 = JavaAlgorithms.calculateTax(6.456360425798364E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.291272085159673E-44d + "'", double2 == 1.291272085159673E-44d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0860");
        double double2 = JavaAlgorithms.calculateTax(3.836922767331598E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.673845534663196E-46d + "'", double2 == 7.673845534663196E-46d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0861");
        double double2 = JavaAlgorithms.calculateTax(3.069538213865279E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.139076427730558E-48d + "'", double2 == 6.139076427730558E-48d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0862");
        double double2 = JavaAlgorithms.calculateTax(2.184245819274696E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.368491638549392E-35d + "'", double2 == 4.368491638549392E-35d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0863");
        double double2 = JavaAlgorithms.calculateTax(2.3058430092137008E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427402E-39d + "'", double2 == 4.611686018427402E-39d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0864");
        double double2 = JavaAlgorithms.calculateTax(1.1529215046068503E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3058430092137008E-38d + "'", double2 == 2.3058430092137008E-38d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0865");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427402E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854805E-40d + "'", double2 == 9.223372036854805E-40d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0866");
        double double2 = JavaAlgorithms.calculateTax(7.205759403792814E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.441151880758563E-39d + "'", double2 == 1.441151880758563E-39d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0867");
        double double2 = JavaAlgorithms.calculateTax(8.070450532247952E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6140901064495907E-42d + "'", double2 == 1.6140901064495907E-42d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0868");
        double double2 = JavaAlgorithms.calculateTax(2.8147497671065666E-32d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6294995342131335E-33d + "'", double2 == 5.6294995342131335E-33d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0869");
        double double2 = JavaAlgorithms.calculateTax(6.139076427730558E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2278152855461116E-48d + "'", double2 == 1.2278152855461116E-48d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0870");
        double double2 = JavaAlgorithms.calculateTax(6.456360425798364E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.291272085159673E-44d + "'", double2 == 1.291272085159673E-44d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0871");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852534E-34d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370507E-35d + "'", double2 == 4.503599627370507E-35d);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0872");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854805E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446744073709613E-40d + "'", double2 == 1.8446744073709613E-40d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0873");
        double double2 = JavaAlgorithms.calculateTax(1.2278152855461116E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4556305710922234E-49d + "'", double2 == 2.4556305710922234E-49d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0874");
        double double2 = JavaAlgorithms.calculateTax(1.291272085159673E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.582544170319346E-45d + "'", double2 == 2.582544170319346E-45d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0875");
        double double2 = JavaAlgorithms.calculateTax(2.8823037615171252E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.764607523034251E-37d + "'", double2 == 5.764607523034251E-37d);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0876");
        double double2 = JavaAlgorithms.calculateTax(1.8446744073709613E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.689348814741923E-41d + "'", double2 == 3.689348814741923E-41d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0877");
        double double2 = JavaAlgorithms.calculateTax(2.582544170319346E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1650883406386924E-46d + "'", double2 == 5.1650883406386924E-46d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0878");
        double double2 = JavaAlgorithms.calculateTax(1.1529215046068508E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.305843009213702E-42d + "'", double2 == 2.305843009213702E-42d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0879");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852537E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370508E-37d + "'", double2 == 4.503599627370508E-37d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0880");
        double double2 = JavaAlgorithms.calculateTax(1.8014398509482033E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.602879701896407E-38d + "'", double2 == 3.602879701896407E-38d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0881");
        double double2 = JavaAlgorithms.calculateTax(2.2517998136852537E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370508E-37d + "'", double2 == 4.503599627370508E-37d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0882");
        double double2 = JavaAlgorithms.calculateTax(3.689348814741923E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483846E-42d + "'", double2 == 7.378697629483846E-42d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0883");
        double double2 = JavaAlgorithms.calculateTax(1.747396655419757E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4947933108395143E-37d + "'", double2 == 3.4947933108395143E-37d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0884");
        double double2 = JavaAlgorithms.calculateTax(4.368491638549392E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.736983277098785E-36d + "'", double2 == 8.736983277098785E-36d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0885");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854805E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446744073709613E-40d + "'", double2 == 1.8446744073709613E-40d);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0886");
        double double2 = JavaAlgorithms.calculateTax(4.503599627370508E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741016E-38d + "'", double2 == 9.007199254741016E-38d);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0887");
        double double2 = JavaAlgorithms.calculateTax(2.305843009213702E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427404E-43d + "'", double2 == 4.611686018427404E-43d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0888");
        double double2 = JavaAlgorithms.calculateTax(1.291272085159673E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.582544170319346E-45d + "'", double2 == 2.582544170319346E-45d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0889");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483846E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4757395258967693E-42d + "'", double2 == 1.4757395258967693E-42d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0890");
        double double2 = JavaAlgorithms.calculateTax(1.4757395258967693E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.951479051793539E-43d + "'", double2 == 2.951479051793539E-43d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0891");
        double double2 = JavaAlgorithms.calculateTax(4.503599627370508E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741016E-38d + "'", double2 == 9.007199254741016E-38d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0892");
        double double2 = JavaAlgorithms.calculateTax(4.503599627370507E-35d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.007199254741015E-36d + "'", double2 == 9.007199254741015E-36d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0893");
        double double2 = JavaAlgorithms.calculateTax(2.951479051793539E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.902958103587078E-44d + "'", double2 == 5.902958103587078E-44d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0894");
        double double2 = JavaAlgorithms.calculateTax(2.4556305710922234E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.911261142184447E-50d + "'", double2 == 4.911261142184447E-50d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0895");
        double double2 = JavaAlgorithms.calculateTax(4.911261142184447E-50d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.822522284368894E-51d + "'", double2 == 9.822522284368894E-51d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0896");
        double double2 = JavaAlgorithms.calculateTax(1.4757395258967693E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.951479051793539E-43d + "'", double2 == 2.951479051793539E-43d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0897");
        double double2 = JavaAlgorithms.calculateTax(3.4947933108395143E-37d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.989586621679029E-38d + "'", double2 == 6.989586621679029E-38d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0898");
        double double2 = JavaAlgorithms.calculateTax(4.911261142184447E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.822522284368894E-51d + "'", double2 == 9.822522284368894E-51d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0899");
        double double2 = JavaAlgorithms.calculateTax(2.951479051793539E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.902958103587078E-44d + "'", double2 == 5.902958103587078E-44d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0900");
        double double2 = JavaAlgorithms.calculateTax(5.902958103587078E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174157E-44d + "'", double2 == 1.1805916207174157E-44d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0901");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427404E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854808E-44d + "'", double2 == 9.223372036854808E-44d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0902");
        double double2 = JavaAlgorithms.calculateTax(1.5347691069326393E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.069538213865279E-47d + "'", double2 == 3.069538213865279E-47d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0903");
        double double2 = JavaAlgorithms.calculateTax(1.1529215046068508E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.305843009213702E-42d + "'", double2 == 2.305843009213702E-42d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0904");
        double double2 = JavaAlgorithms.calculateTax(3.689348814741923E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483846E-42d + "'", double2 == 7.378697629483846E-42d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0905");
        double double2 = JavaAlgorithms.calculateTax(3.4947933108395143E-37d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.989586621679029E-38d + "'", double2 == 6.989586621679029E-38d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0906");
        double double2 = JavaAlgorithms.calculateTax(2.4556305710922234E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.911261142184447E-50d + "'", double2 == 4.911261142184447E-50d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0907");
        double double2 = JavaAlgorithms.calculateTax(9.223372036854808E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8446744073709618E-44d + "'", double2 == 1.8446744073709618E-44d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0908");
        double double2 = JavaAlgorithms.calculateTax(1.1805916207174157E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348316E-45d + "'", double2 == 2.3611832414348316E-45d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0909");
        double double2 = JavaAlgorithms.calculateTax(5.1650883406386924E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0330176681277386E-46d + "'", double2 == 1.0330176681277386E-46d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0910");
        double double2 = JavaAlgorithms.calculateTax(2.582544170319346E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1650883406386924E-46d + "'", double2 == 5.1650883406386924E-46d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0911");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741016E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8014398509482034E-38d + "'", double2 == 1.8014398509482034E-38d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0912");
        double double2 = JavaAlgorithms.calculateTax(1.0330176681277386E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0660353362554774E-47d + "'", double2 == 2.0660353362554774E-47d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0913");
        double double2 = JavaAlgorithms.calculateTax(9.822522284368894E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.964504456873779E-51d + "'", double2 == 1.964504456873779E-51d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0914");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348316E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869664E-46d + "'", double2 == 4.722366482869664E-46d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0915");
        double double2 = JavaAlgorithms.calculateTax(1.747396655419757E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4947933108395143E-37d + "'", double2 == 3.4947933108395143E-37d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0916");
        double double2 = JavaAlgorithms.calculateTax(1.0330176681277386E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0660353362554774E-47d + "'", double2 == 2.0660353362554774E-47d);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0917");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483846E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4757395258967693E-42d + "'", double2 == 1.4757395258967693E-42d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0918");
        double double2 = JavaAlgorithms.calculateTax(1.4411518807585625E-35d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8823037615171252E-36d + "'", double2 == 2.8823037615171252E-36d);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0919");
        double double2 = JavaAlgorithms.calculateTax(1.8014398509482034E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.602879701896407E-39d + "'", double2 == 3.602879701896407E-39d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0920");
        double double2 = JavaAlgorithms.calculateTax(6.989586621679029E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3979173243358057E-38d + "'", double2 == 1.3979173243358057E-38d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0921");
        double double2 = JavaAlgorithms.calculateTax(1.8446744073709613E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.689348814741923E-41d + "'", double2 == 3.689348814741923E-41d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0922");
        double double2 = JavaAlgorithms.calculateTax(1.964504456873779E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.929008913747558E-52d + "'", double2 == 3.929008913747558E-52d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0923");
        double double2 = JavaAlgorithms.calculateTax(6.139076427730558E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2278152855461116E-48d + "'", double2 == 1.2278152855461116E-48d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0924");
        double double2 = JavaAlgorithms.calculateTax(1.2278152855461116E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4556305710922234E-49d + "'", double2 == 2.4556305710922234E-49d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0925");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741016E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8014398509482034E-38d + "'", double2 == 1.8014398509482034E-38d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0926");
        double double2 = JavaAlgorithms.calculateTax(1.3979173243358057E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7958346486716117E-39d + "'", double2 == 2.7958346486716117E-39d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0927");
        double double2 = JavaAlgorithms.calculateTax(2.0660353362554774E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.132070672510955E-48d + "'", double2 == 4.132070672510955E-48d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0928");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869664E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.444732965739328E-47d + "'", double2 == 9.444732965739328E-47d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0929");
        double double2 = JavaAlgorithms.calculateTax(2.7958346486716117E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.591669297343224E-40d + "'", double2 == 5.591669297343224E-40d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0930");
        double double2 = JavaAlgorithms.calculateTax(9.444732965739328E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8889465931478658E-47d + "'", double2 == 1.8889465931478658E-47d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0931");
        double double2 = JavaAlgorithms.calculateTax(6.989586621679029E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3979173243358057E-38d + "'", double2 == 1.3979173243358057E-38d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0932");
        double double2 = JavaAlgorithms.calculateTax(5.591669297343224E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1183338594686448E-40d + "'", double2 == 1.1183338594686448E-40d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0933");
        double double2 = JavaAlgorithms.calculateTax(4.611686018427404E-43d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854808E-44d + "'", double2 == 9.223372036854808E-44d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0934");
        double double2 = JavaAlgorithms.calculateTax(5.1650883406386924E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0330176681277386E-46d + "'", double2 == 1.0330176681277386E-46d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0935");
        double double2 = JavaAlgorithms.calculateTax(1.1183338594686448E-40d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2366677189372898E-41d + "'", double2 == 2.2366677189372898E-41d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0936");
        double double2 = JavaAlgorithms.calculateTax(9.444732965739328E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8889465931478658E-47d + "'", double2 == 1.8889465931478658E-47d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0937");
        double double2 = JavaAlgorithms.calculateTax(3.929008913747558E-52d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.858017827495117E-53d + "'", double2 == 7.858017827495117E-53d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0938");
        double double2 = JavaAlgorithms.calculateTax(5.591669297343224E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1183338594686448E-40d + "'", double2 == 1.1183338594686448E-40d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0939");
        double double2 = JavaAlgorithms.calculateTax(1.1805916207174157E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348316E-45d + "'", double2 == 2.3611832414348316E-45d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0940");
        double double2 = JavaAlgorithms.calculateTax(2.3611832414348316E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.722366482869664E-46d + "'", double2 == 4.722366482869664E-46d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0941");
        double double2 = JavaAlgorithms.calculateTax(4.132070672510955E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.26414134502191E-49d + "'", double2 == 8.26414134502191E-49d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0942");
        double double2 = JavaAlgorithms.calculateTax(1.3979173243358057E-38d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7958346486716117E-39d + "'", double2 == 2.7958346486716117E-39d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0943");
        double double2 = JavaAlgorithms.calculateTax(2.2366677189372898E-41d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.47333543787458E-42d + "'", double2 == 4.47333543787458E-42d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0944");
        double double2 = JavaAlgorithms.calculateTax(2.305843009213702E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.611686018427404E-43d + "'", double2 == 4.611686018427404E-43d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0945");
        double double2 = JavaAlgorithms.calculateTax(7.858017827495117E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5716035654990236E-53d + "'", double2 == 1.5716035654990236E-53d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0946");
        double double2 = JavaAlgorithms.calculateTax(1.5716035654990236E-53d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1432071309980476E-54d + "'", double2 == 3.1432071309980476E-54d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0947");
        double double2 = JavaAlgorithms.calculateTax(1.8446744073709618E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.689348814741924E-45d + "'", double2 == 3.689348814741924E-45d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0948");
        double double2 = JavaAlgorithms.calculateTax(3.689348814741924E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483848E-46d + "'", double2 == 7.378697629483848E-46d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0949");
        double double2 = JavaAlgorithms.calculateTax(1.8446744073709618E-44d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.689348814741924E-45d + "'", double2 == 3.689348814741924E-45d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0950");
        double double2 = JavaAlgorithms.calculateTax(4.47333543787458E-42d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.94667087574916E-43d + "'", double2 == 8.94667087574916E-43d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0951");
        double double2 = JavaAlgorithms.calculateTax(1.8014398509482034E-38d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.602879701896407E-39d + "'", double2 == 3.602879701896407E-39d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0952");
        double double2 = JavaAlgorithms.calculateTax(3.602879701896407E-39d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792815E-40d + "'", double2 == 7.205759403792815E-40d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0953");
        double double2 = JavaAlgorithms.calculateTax(1.5716035654990236E-53d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1432071309980476E-54d + "'", double2 == 3.1432071309980476E-54d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0954");
        double double2 = JavaAlgorithms.calculateTax(8.94667087574916E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7893341751498321E-43d + "'", double2 == 1.7893341751498321E-43d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0955");
        double double2 = JavaAlgorithms.calculateTax(1.8889465931478658E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.777893186295732E-48d + "'", double2 == 3.777893186295732E-48d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0956");
        double double2 = JavaAlgorithms.calculateTax(3.777893186295732E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591464E-49d + "'", double2 == 7.555786372591464E-49d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0957");
        double double2 = JavaAlgorithms.calculateTax(3.777893186295732E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.555786372591464E-49d + "'", double2 == 7.555786372591464E-49d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0958");
        double double2 = JavaAlgorithms.calculateTax(4.722366482869664E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.444732965739328E-47d + "'", double2 == 9.444732965739328E-47d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0959");
        double double2 = JavaAlgorithms.calculateTax(3.689348814741924E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.378697629483848E-46d + "'", double2 == 7.378697629483848E-46d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0960");
        double double2 = JavaAlgorithms.calculateTax(2.0660353362554774E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.132070672510955E-48d + "'", double2 == 4.132070672510955E-48d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0961");
        double double2 = JavaAlgorithms.calculateTax(8.26414134502191E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6528282690043822E-49d + "'", double2 == 1.6528282690043822E-49d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0962");
        double double2 = JavaAlgorithms.calculateTax(7.378697629483848E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4757395258967697E-46d + "'", double2 == 1.4757395258967697E-46d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0963");
        double double2 = JavaAlgorithms.calculateTax(1.7893341751498321E-43d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5786683502996643E-44d + "'", double2 == 3.5786683502996643E-44d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0964");
        double double2 = JavaAlgorithms.calculateTax(1.6528282690043822E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3056565380087645E-50d + "'", double2 == 3.3056565380087645E-50d);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0965");
        double double2 = JavaAlgorithms.calculateTax(4.47333543787458E-42d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.94667087574916E-43d + "'", double2 == 8.94667087574916E-43d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0966");
        double double2 = JavaAlgorithms.calculateTax(1.4757395258967697E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.95147905179354E-47d + "'", double2 == 2.95147905179354E-47d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0967");
        double double2 = JavaAlgorithms.calculateTax(1.8889465931478658E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.777893186295732E-48d + "'", double2 == 3.777893186295732E-48d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0968");
        double double2 = JavaAlgorithms.calculateTax(2.95147905179354E-47d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.90295810358708E-48d + "'", double2 == 5.90295810358708E-48d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0969");
        double double2 = JavaAlgorithms.calculateTax(8.26414134502191E-49d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6528282690043822E-49d + "'", double2 == 1.6528282690043822E-49d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0970");
        double double2 = JavaAlgorithms.calculateTax(3.1432071309980476E-54d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.2864142619960955E-55d + "'", double2 == 6.2864142619960955E-55d);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0971");
        double double2 = JavaAlgorithms.calculateTax(1.1183338594686448E-40d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2366677189372898E-41d + "'", double2 == 2.2366677189372898E-41d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0972");
        double double2 = JavaAlgorithms.calculateTax(3.602879701896407E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.205759403792815E-40d + "'", double2 == 7.205759403792815E-40d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0973");
        double double2 = JavaAlgorithms.calculateTax(3.069538213865279E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.139076427730558E-48d + "'", double2 == 6.139076427730558E-48d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0974");
        double double2 = JavaAlgorithms.calculateTax(9.007199254741015E-36d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.801439850948203E-36d + "'", double2 == 1.801439850948203E-36d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0975");
        double double2 = JavaAlgorithms.calculateTax(3.5786683502996643E-44d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.157336700599329E-45d + "'", double2 == 7.157336700599329E-45d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0976");
        double double2 = JavaAlgorithms.calculateTax(1.801439850948203E-36d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6028797018964065E-37d + "'", double2 == 3.6028797018964065E-37d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0977");
        double double2 = JavaAlgorithms.calculateTax(1.4757395258967697E-46d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.95147905179354E-47d + "'", double2 == 2.95147905179354E-47d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0978");
        double double2 = JavaAlgorithms.calculateTax(9.822522284368894E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.964504456873779E-51d + "'", double2 == 1.964504456873779E-51d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0979");
        double double2 = JavaAlgorithms.calculateTax(2.95147905179354E-47d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.90295810358708E-48d + "'", double2 == 5.90295810358708E-48d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0980");
        double double2 = JavaAlgorithms.calculateTax(3.1432071309980476E-54d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.2864142619960955E-55d + "'", double2 == 6.2864142619960955E-55d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0981");
        double double2 = JavaAlgorithms.calculateTax(3.929008913747558E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.858017827495117E-53d + "'", double2 == 7.858017827495117E-53d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0982");
        double double2 = JavaAlgorithms.calculateTax(7.157336700599329E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4314673401198658E-45d + "'", double2 == 1.4314673401198658E-45d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0983");
        double double2 = JavaAlgorithms.calculateTax(3.3056565380087645E-50d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.611313076017529E-51d + "'", double2 == 6.611313076017529E-51d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0984");
        double double2 = JavaAlgorithms.calculateTax(1.6528282690043822E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3056565380087645E-50d + "'", double2 == 3.3056565380087645E-50d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0985");
        double double2 = JavaAlgorithms.calculateTax(6.2864142619960955E-55d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2572828523992191E-55d + "'", double2 == 1.2572828523992191E-55d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0986");
        double double2 = JavaAlgorithms.calculateTax(5.90295810358708E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174161E-48d + "'", double2 == 1.1805916207174161E-48d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0987");
        double double2 = JavaAlgorithms.calculateTax(1.1805916207174161E-48d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3611832414348325E-49d + "'", double2 == 2.3611832414348325E-49d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0988");
        double double2 = JavaAlgorithms.calculateTax(6.611313076017529E-51d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3222626152035059E-51d + "'", double2 == 1.3222626152035059E-51d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0989");
        double double2 = JavaAlgorithms.calculateTax(2.7958346486716117E-39d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.591669297343224E-40d + "'", double2 == 5.591669297343224E-40d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0990");
        double double2 = JavaAlgorithms.calculateTax(5.90295810358708E-48d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174161E-48d + "'", double2 == 1.1805916207174161E-48d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0991");
        double double2 = JavaAlgorithms.calculateTax(2.2366677189372898E-41d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.47333543787458E-42d + "'", double2 == 4.47333543787458E-42d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0992");
        double double2 = JavaAlgorithms.calculateTax(1.4314673401198658E-45d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.862934680239732E-46d + "'", double2 == 2.862934680239732E-46d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0993");
        double double2 = JavaAlgorithms.calculateTax(2.862934680239732E-46d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.725869360479464E-47d + "'", double2 == 5.725869360479464E-47d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0994");
        double double2 = JavaAlgorithms.calculateTax(7.157336700599329E-45d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4314673401198658E-45d + "'", double2 == 1.4314673401198658E-45d);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0995");
        double double2 = JavaAlgorithms.calculateTax(5.6294995342131335E-33d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1258999068426267E-33d + "'", double2 == 1.1258999068426267E-33d);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0996");
        double double2 = JavaAlgorithms.calculateTax(7.555786372591464E-49d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5111572745182929E-49d + "'", double2 == 1.5111572745182929E-49d);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0997");
        double double2 = JavaAlgorithms.calculateTax(1.3222626152035059E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.644525230407012E-52d + "'", double2 == 2.644525230407012E-52d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0998");
        double double2 = JavaAlgorithms.calculateTax(6.611313076017529E-51d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3222626152035059E-51d + "'", double2 == 1.3222626152035059E-51d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test0999");
        double double2 = JavaAlgorithms.calculateTax(2.644525230407012E-52d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.289050460814024E-53d + "'", double2 == 5.289050460814024E-53d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression1.test1000");
        double double2 = JavaAlgorithms.calculateTax(1.2572828523992191E-55d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5145657047984385E-56d + "'", double2 == 2.5145657047984385E-56d);
    }
}

