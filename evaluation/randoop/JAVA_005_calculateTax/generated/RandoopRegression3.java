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
        double double2 = JavaAlgorithms.calculateTax(9.671406556917077E-57d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9342813113834157E-57d + "'", double2 == 1.9342813113834157E-57d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1502");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426932E-61d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853864E-61d + "'", double2 == 1.2379400392853864E-61d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1503");
        double double2 = JavaAlgorithms.calculateTax(2.475880078570773E-62d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.951760157141547E-63d + "'", double2 == 4.951760157141547E-63d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1504");
        double double2 = JavaAlgorithms.calculateTax(2.1599954931505004E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3199909863010014E-80d + "'", double2 == 4.3199909863010014E-80d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1505");
        double double2 = JavaAlgorithms.calculateTax(2.7729856879992653E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.545971375998531E-67d + "'", double2 == 5.545971375998531E-67d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1506");
        double double2 = JavaAlgorithms.calculateTax(3.094850098213466E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.189700196426933E-63d + "'", double2 == 6.189700196426933E-63d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1507");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311559E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462312E-78d + "'", double2 == 3.323069989462312E-78d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1508");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534861E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069722E-74d + "'", double2 == 1.0384593717069722E-74d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1509");
        double double2 = JavaAlgorithms.calculateTax(4.951760157141547E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283095E-64d + "'", double2 == 9.903520314283095E-64d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1510");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462312E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924625E-79d + "'", double2 == 6.646139978924625E-79d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1511");
        double double2 = JavaAlgorithms.calculateTax(8.873554201597651E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7747108403195305E-70d + "'", double2 == 1.7747108403195305E-70d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1512");
        double double2 = JavaAlgorithms.calculateTax(6.189700196426933E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2379400392853867E-63d + "'", double2 == 1.2379400392853867E-63d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1513");
        double double2 = JavaAlgorithms.calculateTax(2.5961484292674303E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534861E-74d + "'", double2 == 5.192296858534861E-74d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1514");
        double double2 = JavaAlgorithms.calculateTax(1.934281311383416E-59d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.868562622766832E-60d + "'", double2 == 3.868562622766832E-60d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1515");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283095E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566192E-64d + "'", double2 == 1.9807040628566192E-64d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1516");
        double double2 = JavaAlgorithms.calculateTax(2.475880078570773E-62d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.951760157141547E-63d + "'", double2 == 4.951760157141547E-63d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1517");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853867E-63d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4758800785707738E-64d + "'", double2 == 2.4758800785707738E-64d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1518");
        double double2 = JavaAlgorithms.calculateTax(3.074052705553472E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.148105411106944E-68d + "'", double2 == 6.148105411106944E-68d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1519");
        double double2 = JavaAlgorithms.calculateTax(4.4367771007988254E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.873554201597651E-70d + "'", double2 == 8.873554201597651E-70d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1520");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462312E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924625E-79d + "'", double2 == 6.646139978924625E-79d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1521");
        double double2 = JavaAlgorithms.calculateTax(1.3823971156163208E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.764794231232642E-84d + "'", double2 == 2.764794231232642E-84d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1522");
        double double2 = JavaAlgorithms.calculateTax(6.148105411106944E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2296210822213888E-68d + "'", double2 == 1.2296210822213888E-68d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1523");
        double double2 = JavaAlgorithms.calculateTax(2.764794231232642E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.529588462465284E-85d + "'", double2 == 5.529588462465284E-85d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1524");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924625E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849251E-79d + "'", double2 == 1.3292279957849251E-79d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1525");
        double double2 = JavaAlgorithms.calculateTax(8.873554201597651E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7747108403195305E-70d + "'", double2 == 1.7747108403195305E-70d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1526");
        double double2 = JavaAlgorithms.calculateTax(2.4758800785707738E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.951760157141548E-65d + "'", double2 == 4.951760157141548E-65d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1527");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655782E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311565E-81d + "'", double2 == 1.6615349947311565E-81d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1528");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311565E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462313E-82d + "'", double2 == 3.323069989462313E-82d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1529");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655782E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311565E-81d + "'", double2 == 1.6615349947311565E-81d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1530");
        double double2 = JavaAlgorithms.calculateTax(3.455992789040802E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.911985578081604E-83d + "'", double2 == 6.911985578081604E-83d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1531");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566192E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9614081257132384E-65d + "'", double2 == 3.9614081257132384E-65d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1532");
        double double2 = JavaAlgorithms.calculateTax(3.074052705553472E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.148105411106944E-68d + "'", double2 == 6.148105411106944E-68d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1533");
        double double2 = JavaAlgorithms.calculateTax(6.148105411106944E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2296210822213888E-68d + "'", double2 == 1.2296210822213888E-68d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1534");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311559E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462312E-78d + "'", double2 == 3.323069989462312E-78d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1535");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849251E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698505E-80d + "'", double2 == 2.6584559915698505E-80d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1536");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924625E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849251E-79d + "'", double2 == 1.3292279957849251E-79d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1537");
        double double2 = JavaAlgorithms.calculateTax(2.764794231232642E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.529588462465284E-85d + "'", double2 == 5.529588462465284E-85d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1538");
        double double2 = JavaAlgorithms.calculateTax(3.9614081257132384E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426478E-66d + "'", double2 == 7.922816251426478E-66d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1539");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698505E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139701E-81d + "'", double2 == 5.316911983139701E-81d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1540");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849251E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698505E-80d + "'", double2 == 2.6584559915698505E-80d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1541");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462313E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924626E-83d + "'", double2 == 6.646139978924626E-83d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1542");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311565E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462313E-82d + "'", double2 == 3.323069989462313E-82d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1543");
        double double2 = JavaAlgorithms.calculateTax(1.3823971156163208E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.764794231232642E-84d + "'", double2 == 2.764794231232642E-84d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1544");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566192E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9614081257132384E-65d + "'", double2 == 3.9614081257132384E-65d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1545");
        double double2 = JavaAlgorithms.calculateTax(6.911985578081604E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3823971156163208E-83d + "'", double2 == 1.3823971156163208E-83d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1546");
        double double2 = JavaAlgorithms.calculateTax(4.951760157141547E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283095E-64d + "'", double2 == 9.903520314283095E-64d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1547");
        double double2 = JavaAlgorithms.calculateTax(3.9614081257132384E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426478E-66d + "'", double2 == 7.922816251426478E-66d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1548");
        double double2 = JavaAlgorithms.calculateTax(1.7747108403195305E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.549421680639061E-71d + "'", double2 == 3.549421680639061E-71d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1549");
        double double2 = JavaAlgorithms.calculateTax(5.529588462465284E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1059176924930568E-85d + "'", double2 == 1.1059176924930568E-85d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1550");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283095E-64d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566192E-64d + "'", double2 == 1.9807040628566192E-64d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1551");
        double double2 = JavaAlgorithms.calculateTax(4.951760157141548E-65d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283096E-66d + "'", double2 == 9.903520314283096E-66d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1552");
        double double2 = JavaAlgorithms.calculateTax(5.529588462465284E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1059176924930568E-85d + "'", double2 == 1.1059176924930568E-85d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1553");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283096E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566194E-66d + "'", double2 == 1.9807040628566194E-66d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1554");
        double double2 = JavaAlgorithms.calculateTax(2.076918743413945E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.153837486827891E-80d + "'", double2 == 4.153837486827891E-80d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1555");
        double double2 = JavaAlgorithms.calculateTax(4.1538374868278893E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655779E-77d + "'", double2 == 8.307674973655779E-77d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1556");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698505E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139701E-81d + "'", double2 == 5.316911983139701E-81d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1557");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426478E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852957E-66d + "'", double2 == 1.5845632502852957E-66d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1558");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852957E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1691265005705917E-67d + "'", double2 == 3.1691265005705917E-67d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1559");
        double double2 = JavaAlgorithms.calculateTax(4.951760157141548E-65d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.903520314283096E-66d + "'", double2 == 9.903520314283096E-66d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1560");
        double double2 = JavaAlgorithms.calculateTax(9.903520314283096E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9807040628566194E-66d + "'", double2 == 1.9807040628566194E-66d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1561");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566194E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.961408125713239E-67d + "'", double2 == 3.961408125713239E-67d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1562");
        double double2 = JavaAlgorithms.calculateTax(1.2296210822213888E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4592421644427776E-69d + "'", double2 == 2.4592421644427776E-69d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1563");
        double double2 = JavaAlgorithms.calculateTax(3.961408125713239E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426479E-68d + "'", double2 == 7.922816251426479E-68d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1564");
        double double2 = JavaAlgorithms.calculateTax(1.1059176924930568E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.211835384986114E-86d + "'", double2 == 2.211835384986114E-86d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1565");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426479E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852959E-68d + "'", double2 == 1.5845632502852959E-68d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1566");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852959E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.169126500570592E-69d + "'", double2 == 3.169126500570592E-69d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1567");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426478E-66d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852957E-66d + "'", double2 == 1.5845632502852957E-66d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1568");
        double double2 = JavaAlgorithms.calculateTax(3.549421680639061E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.098843361278122E-72d + "'", double2 == 7.098843361278122E-72d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1569");
        double double2 = JavaAlgorithms.calculateTax(3.549421680639061E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.098843361278122E-72d + "'", double2 == 7.098843361278122E-72d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1570");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139701E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279402E-81d + "'", double2 == 1.0633823966279402E-81d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1571");
        double double2 = JavaAlgorithms.calculateTax(2.4592421644427776E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.918484328885555E-70d + "'", double2 == 4.918484328885555E-70d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1572");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279402E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1267647932558803E-82d + "'", double2 == 2.1267647932558803E-82d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1573");
        double double2 = JavaAlgorithms.calculateTax(3.1691265005705917E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.3382530011411835E-68d + "'", double2 == 6.3382530011411835E-68d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1574");
        double double2 = JavaAlgorithms.calculateTax(6.3382530011411835E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282367E-68d + "'", double2 == 1.2676506002282367E-68d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1575");
        double double2 = JavaAlgorithms.calculateTax(2.1267647932558803E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511761E-83d + "'", double2 == 4.253529586511761E-83d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1576");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139701E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279402E-81d + "'", double2 == 1.0633823966279402E-81d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1577");
        double double2 = JavaAlgorithms.calculateTax(1.1059176924930568E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.211835384986114E-86d + "'", double2 == 2.211835384986114E-86d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1578");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462313E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924626E-83d + "'", double2 == 6.646139978924626E-83d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1579");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852957E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1691265005705917E-67d + "'", double2 == 3.1691265005705917E-67d);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1580");
        double double2 = JavaAlgorithms.calculateTax(1.7747108403195305E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.549421680639061E-71d + "'", double2 == 3.549421680639061E-71d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1581");
        double double2 = JavaAlgorithms.calculateTax(2.1267647932558803E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511761E-83d + "'", double2 == 4.253529586511761E-83d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1582");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924626E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849252E-83d + "'", double2 == 1.3292279957849252E-83d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1583");
        double double2 = JavaAlgorithms.calculateTax(1.2676506002282367E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.535301200456474E-69d + "'", double2 == 2.535301200456474E-69d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1584");
        double double2 = JavaAlgorithms.calculateTax(3.169126500570592E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141184E-70d + "'", double2 == 6.338253001141184E-70d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1585");
        double double2 = JavaAlgorithms.calculateTax(4.918484328885555E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.836968657771111E-71d + "'", double2 == 9.836968657771111E-71d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1586");
        double double2 = JavaAlgorithms.calculateTax(7.098843361278122E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4197686722556246E-72d + "'", double2 == 1.4197686722556246E-72d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1587");
        double double2 = JavaAlgorithms.calculateTax(2.211835384986114E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.423670769972228E-87d + "'", double2 == 4.423670769972228E-87d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1588");
        double double2 = JavaAlgorithms.calculateTax(3.1691265005705917E-67d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.3382530011411835E-68d + "'", double2 == 6.3382530011411835E-68d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1589");
        double double2 = JavaAlgorithms.calculateTax(2.535301200456474E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.070602400912948E-70d + "'", double2 == 5.070602400912948E-70d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1590");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924626E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849252E-83d + "'", double2 == 1.3292279957849252E-83d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1591");
        double double2 = JavaAlgorithms.calculateTax(1.4197686722556246E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8395373445112495E-73d + "'", double2 == 2.8395373445112495E-73d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1592");
        double double2 = JavaAlgorithms.calculateTax(6.338253001141184E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.267650600228237E-70d + "'", double2 == 1.267650600228237E-70d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1593");
        double double2 = JavaAlgorithms.calculateTax(6.3382530011411835E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282367E-68d + "'", double2 == 1.2676506002282367E-68d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1594");
        double double2 = JavaAlgorithms.calculateTax(4.918484328885555E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.836968657771111E-71d + "'", double2 == 9.836968657771111E-71d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1595");
        double double2 = JavaAlgorithms.calculateTax(1.267650600228237E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5353012004564742E-71d + "'", double2 == 2.5353012004564742E-71d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1596");
        double double2 = JavaAlgorithms.calculateTax(1.4197686722556246E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8395373445112495E-73d + "'", double2 == 2.8395373445112495E-73d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1597");
        double double2 = JavaAlgorithms.calculateTax(1.9807040628566194E-66d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.961408125713239E-67d + "'", double2 == 3.961408125713239E-67d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1598");
        double double2 = JavaAlgorithms.calculateTax(1.267650600228237E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5353012004564742E-71d + "'", double2 == 2.5353012004564742E-71d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1599");
        double double2 = JavaAlgorithms.calculateTax(2.4758800785707738E-64d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.951760157141548E-65d + "'", double2 == 4.951760157141548E-65d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1600");
        double double2 = JavaAlgorithms.calculateTax(1.2379400392853867E-63d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4758800785707738E-64d + "'", double2 == 2.4758800785707738E-64d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1601");
        double double2 = JavaAlgorithms.calculateTax(1.5845632502852959E-68d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.169126500570592E-69d + "'", double2 == 3.169126500570592E-69d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1602");
        double double2 = JavaAlgorithms.calculateTax(7.098843361278122E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4197686722556246E-72d + "'", double2 == 1.4197686722556246E-72d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1603");
        double double2 = JavaAlgorithms.calculateTax(4.423670769972228E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.847341539944456E-88d + "'", double2 == 8.847341539944456E-88d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1604");
        double double2 = JavaAlgorithms.calculateTax(6.338253001141184E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.267650600228237E-70d + "'", double2 == 1.267650600228237E-70d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1605");
        double double2 = JavaAlgorithms.calculateTax(1.2296210822213888E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4592421644427776E-69d + "'", double2 == 2.4592421644427776E-69d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1606");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849252E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698504E-84d + "'", double2 == 2.6584559915698504E-84d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1607");
        double double2 = JavaAlgorithms.calculateTax(5.070602400912948E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825897E-70d + "'", double2 == 1.0141204801825897E-70d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1608");
        double double2 = JavaAlgorithms.calculateTax(2.211835384986114E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.423670769972228E-87d + "'", double2 == 4.423670769972228E-87d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1609");
        double double2 = JavaAlgorithms.calculateTax(8.847341539944456E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7694683079888914E-88d + "'", double2 == 1.7694683079888914E-88d);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1610");
        double double2 = JavaAlgorithms.calculateTax(1.7694683079888914E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.538936615977783E-89d + "'", double2 == 3.538936615977783E-89d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1611");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279402E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1267647932558803E-82d + "'", double2 == 2.1267647932558803E-82d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1612");
        double double2 = JavaAlgorithms.calculateTax(9.836968657771111E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9673937315542223E-71d + "'", double2 == 1.9673937315542223E-71d);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1613");
        double double2 = JavaAlgorithms.calculateTax(2.8395373445112495E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.679074689022499E-74d + "'", double2 == 5.679074689022499E-74d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1614");
        double double2 = JavaAlgorithms.calculateTax(2.5353012004564742E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.070602400912948E-72d + "'", double2 == 5.070602400912948E-72d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1615");
        double double2 = JavaAlgorithms.calculateTax(5.070602400912948E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825898E-72d + "'", double2 == 1.0141204801825898E-72d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1616");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825898E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0282409603651798E-73d + "'", double2 == 2.0282409603651798E-73d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1617");
        double double2 = JavaAlgorithms.calculateTax(1.9673937315542223E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.934787463108445E-72d + "'", double2 == 3.934787463108445E-72d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1618");
        double double2 = JavaAlgorithms.calculateTax(8.847341539944456E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7694683079888914E-88d + "'", double2 == 1.7694683079888914E-88d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1619");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698504E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139701E-85d + "'", double2 == 5.316911983139701E-85d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1620");
        double double2 = JavaAlgorithms.calculateTax(5.679074689022499E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1358149378045E-74d + "'", double2 == 1.1358149378045E-74d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1621");
        double double2 = JavaAlgorithms.calculateTax(2.0282409603651798E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.05648192073036E-74d + "'", double2 == 4.05648192073036E-74d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1622");
        double double2 = JavaAlgorithms.calculateTax(1.1358149378045E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2716298756090002E-75d + "'", double2 == 2.2716298756090002E-75d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1623");
        double double2 = JavaAlgorithms.calculateTax(3.169126500570592E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.338253001141184E-70d + "'", double2 == 6.338253001141184E-70d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1624");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849252E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698504E-84d + "'", double2 == 2.6584559915698504E-84d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1625");
        double double2 = JavaAlgorithms.calculateTax(5.070602400912948E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825898E-72d + "'", double2 == 1.0141204801825898E-72d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1626");
        double double2 = JavaAlgorithms.calculateTax(1.9673937315542223E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.934787463108445E-72d + "'", double2 == 3.934787463108445E-72d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1627");
        double double2 = JavaAlgorithms.calculateTax(2.8395373445112495E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.679074689022499E-74d + "'", double2 == 5.679074689022499E-74d);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1628");
        double double2 = JavaAlgorithms.calculateTax(5.679074689022499E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1358149378045E-74d + "'", double2 == 1.1358149378045E-74d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1629");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139701E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279403E-85d + "'", double2 == 1.0633823966279403E-85d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1630");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279403E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.126764793255881E-86d + "'", double2 == 2.126764793255881E-86d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1631");
        double double2 = JavaAlgorithms.calculateTax(2.2716298756090002E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.543259751218001E-76d + "'", double2 == 4.543259751218001E-76d);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1632");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825897E-70d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0282409603651794E-71d + "'", double2 == 2.0282409603651794E-71d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1633");
        double double2 = JavaAlgorithms.calculateTax(3.538936615977783E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0778732319555656E-90d + "'", double2 == 7.0778732319555656E-90d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1634");
        double double2 = JavaAlgorithms.calculateTax(4.423670769972228E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.847341539944456E-88d + "'", double2 == 8.847341539944456E-88d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1635");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825898E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0282409603651798E-73d + "'", double2 == 2.0282409603651798E-73d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1636");
        double double2 = JavaAlgorithms.calculateTax(2.0282409603651794E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.056481920730359E-72d + "'", double2 == 4.056481920730359E-72d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1637");
        double double2 = JavaAlgorithms.calculateTax(7.0778732319555656E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4155746463911132E-90d + "'", double2 == 1.4155746463911132E-90d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1638");
        double double2 = JavaAlgorithms.calculateTax(1.7694683079888914E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.538936615977783E-89d + "'", double2 == 3.538936615977783E-89d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1639");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511761E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023522E-84d + "'", double2 == 8.507059173023522E-84d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1640");
        double double2 = JavaAlgorithms.calculateTax(3.538936615977783E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0778732319555656E-90d + "'", double2 == 7.0778732319555656E-90d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1641");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139701E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279403E-85d + "'", double2 == 1.0633823966279403E-85d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1642");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511761E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023522E-84d + "'", double2 == 8.507059173023522E-84d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1643");
        double double2 = JavaAlgorithms.calculateTax(2.0282409603651798E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.05648192073036E-74d + "'", double2 == 4.05648192073036E-74d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1644");
        double double2 = JavaAlgorithms.calculateTax(4.543259751218001E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.086519502436003E-77d + "'", double2 == 9.086519502436003E-77d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1645");
        double double2 = JavaAlgorithms.calculateTax(2.535301200456474E-69d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.070602400912948E-70d + "'", double2 == 5.070602400912948E-70d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1646");
        double double2 = JavaAlgorithms.calculateTax(9.086519502436003E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.817303900487201E-77d + "'", double2 == 1.817303900487201E-77d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1647");
        double double2 = JavaAlgorithms.calculateTax(2.4592421644427776E-69d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.918484328885555E-70d + "'", double2 == 4.918484328885555E-70d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1648");
        double double2 = JavaAlgorithms.calculateTax(4.056481920730359E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.112963841460719E-73d + "'", double2 == 8.112963841460719E-73d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1649");
        double double2 = JavaAlgorithms.calculateTax(1.817303900487201E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.634607800974402E-78d + "'", double2 == 3.634607800974402E-78d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1650");
        double double2 = JavaAlgorithms.calculateTax(3.634607800974402E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.269215601948804E-79d + "'", double2 == 7.269215601948804E-79d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1651");
        double double2 = JavaAlgorithms.calculateTax(7.269215601948804E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4538431203897607E-79d + "'", double2 == 1.4538431203897607E-79d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1652");
        double double2 = JavaAlgorithms.calculateTax(1.2676506002282367E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.535301200456474E-69d + "'", double2 == 2.535301200456474E-69d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1653");
        double double2 = JavaAlgorithms.calculateTax(2.126764793255881E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511762E-87d + "'", double2 == 4.253529586511762E-87d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1654");
        double double2 = JavaAlgorithms.calculateTax(4.056481920730359E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.112963841460719E-73d + "'", double2 == 8.112963841460719E-73d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1655");
        double double2 = JavaAlgorithms.calculateTax(3.961408125713239E-67d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922816251426479E-68d + "'", double2 == 7.922816251426479E-68d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1656");
        double double2 = JavaAlgorithms.calculateTax(4.543259751218001E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.086519502436003E-77d + "'", double2 == 9.086519502436003E-77d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1657");
        double double2 = JavaAlgorithms.calculateTax(1.4155746463911132E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8311492927822265E-91d + "'", double2 == 2.8311492927822265E-91d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1658");
        double double2 = JavaAlgorithms.calculateTax(7.922816251426479E-68d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852959E-68d + "'", double2 == 1.5845632502852959E-68d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1659");
        double double2 = JavaAlgorithms.calculateTax(9.836968657771111E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9673937315542223E-71d + "'", double2 == 1.9673937315542223E-71d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1660");
        double double2 = JavaAlgorithms.calculateTax(4.05648192073036E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.11296384146072E-75d + "'", double2 == 8.11296384146072E-75d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1661");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279403E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.126764793255881E-86d + "'", double2 == 2.126764793255881E-86d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1662");
        double double2 = JavaAlgorithms.calculateTax(2.126764793255881E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511762E-87d + "'", double2 == 4.253529586511762E-87d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1663");
        double double2 = JavaAlgorithms.calculateTax(2.2716298756090002E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.543259751218001E-76d + "'", double2 == 4.543259751218001E-76d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1664");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511762E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023524E-88d + "'", double2 == 8.507059173023524E-88d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1665");
        double double2 = JavaAlgorithms.calculateTax(1.0141204801825897E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0282409603651794E-71d + "'", double2 == 2.0282409603651794E-71d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1666");
        double double2 = JavaAlgorithms.calculateTax(2.8311492927822265E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.662298585564453E-92d + "'", double2 == 5.662298585564453E-92d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1667");
        double double2 = JavaAlgorithms.calculateTax(2.5353012004564742E-71d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.070602400912948E-72d + "'", double2 == 5.070602400912948E-72d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1668");
        double double2 = JavaAlgorithms.calculateTax(4.05648192073036E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.11296384146072E-75d + "'", double2 == 8.11296384146072E-75d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1669");
        double double2 = JavaAlgorithms.calculateTax(1.817303900487201E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.634607800974402E-78d + "'", double2 == 3.634607800974402E-78d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1670");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023524E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.701411834604705E-88d + "'", double2 == 1.701411834604705E-88d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1671");
        double double2 = JavaAlgorithms.calculateTax(5.662298585564453E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1324597171128907E-92d + "'", double2 == 1.1324597171128907E-92d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1672");
        double double2 = JavaAlgorithms.calculateTax(2.8311492927822265E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.662298585564453E-92d + "'", double2 == 5.662298585564453E-92d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1673");
        double double2 = JavaAlgorithms.calculateTax(5.070602400912948E-70d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0141204801825897E-70d + "'", double2 == 1.0141204801825897E-70d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1674");
        double double2 = JavaAlgorithms.calculateTax(7.269215601948804E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4538431203897607E-79d + "'", double2 == 1.4538431203897607E-79d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1675");
        double double2 = JavaAlgorithms.calculateTax(8.11296384146072E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.622592768292144E-75d + "'", double2 == 1.622592768292144E-75d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1676");
        double double2 = JavaAlgorithms.calculateTax(3.934787463108445E-72d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.86957492621689E-73d + "'", double2 == 7.86957492621689E-73d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1677");
        double double2 = JavaAlgorithms.calculateTax(1.1324597171128907E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2649194342257815E-93d + "'", double2 == 2.2649194342257815E-93d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1678");
        double double2 = JavaAlgorithms.calculateTax(2.2649194342257815E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.529838868451563E-94d + "'", double2 == 4.529838868451563E-94d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1679");
        double double2 = JavaAlgorithms.calculateTax(1.1324597171128907E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2649194342257815E-93d + "'", double2 == 2.2649194342257815E-93d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1680");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698504E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139701E-85d + "'", double2 == 5.316911983139701E-85d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1681");
        double double2 = JavaAlgorithms.calculateTax(1.4155746463911132E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8311492927822265E-91d + "'", double2 == 2.8311492927822265E-91d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1682");
        double double2 = JavaAlgorithms.calculateTax(4.529838868451563E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.059677736903127E-95d + "'", double2 == 9.059677736903127E-95d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1683");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023524E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.701411834604705E-88d + "'", double2 == 1.701411834604705E-88d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1684");
        double double2 = JavaAlgorithms.calculateTax(2.0282409603651794E-71d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.056481920730359E-72d + "'", double2 == 4.056481920730359E-72d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1685");
        double double2 = JavaAlgorithms.calculateTax(1.1358149378045E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2716298756090002E-75d + "'", double2 == 2.2716298756090002E-75d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1686");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511762E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023524E-88d + "'", double2 == 8.507059173023524E-88d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1687");
        double double2 = JavaAlgorithms.calculateTax(1.701411834604705E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4028236692094105E-89d + "'", double2 == 3.4028236692094105E-89d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1688");
        double double2 = JavaAlgorithms.calculateTax(3.634607800974402E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.269215601948804E-79d + "'", double2 == 7.269215601948804E-79d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1689");
        double double2 = JavaAlgorithms.calculateTax(4.529838868451563E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.059677736903127E-95d + "'", double2 == 9.059677736903127E-95d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1690");
        double double2 = JavaAlgorithms.calculateTax(1.622592768292144E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.245185536584288E-76d + "'", double2 == 3.245185536584288E-76d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1691");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023522E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7014118346047045E-84d + "'", double2 == 1.7014118346047045E-84d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1692");
        double double2 = JavaAlgorithms.calculateTax(8.112963841460719E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.622592768292144E-73d + "'", double2 == 1.622592768292144E-73d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1693");
        double double2 = JavaAlgorithms.calculateTax(5.662298585564453E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1324597171128907E-92d + "'", double2 == 1.1324597171128907E-92d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1694");
        double double2 = JavaAlgorithms.calculateTax(3.4028236692094105E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418821E-90d + "'", double2 == 6.805647338418821E-90d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1695");
        double double2 = JavaAlgorithms.calculateTax(9.059677736903127E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8119355473806254E-95d + "'", double2 == 1.8119355473806254E-95d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1696");
        double double2 = JavaAlgorithms.calculateTax(1.8119355473806254E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.623871094761251E-96d + "'", double2 == 3.623871094761251E-96d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1697");
        double double2 = JavaAlgorithms.calculateTax(1.4538431203897607E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9076862407795216E-80d + "'", double2 == 2.9076862407795216E-80d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1698");
        double double2 = JavaAlgorithms.calculateTax(1.622592768292144E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.245185536584288E-76d + "'", double2 == 3.245185536584288E-76d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1699");
        double double2 = JavaAlgorithms.calculateTax(1.622592768292144E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.245185536584288E-74d + "'", double2 == 3.245185536584288E-74d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1700");
        double double2 = JavaAlgorithms.calculateTax(3.623871094761251E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.247742189522503E-97d + "'", double2 == 7.247742189522503E-97d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1701");
        double double2 = JavaAlgorithms.calculateTax(9.086519502436003E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.817303900487201E-77d + "'", double2 == 1.817303900487201E-77d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1702");
        double double2 = JavaAlgorithms.calculateTax(1.8119355473806254E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.623871094761251E-96d + "'", double2 == 3.623871094761251E-96d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1703");
        double double2 = JavaAlgorithms.calculateTax(8.11296384146072E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.622592768292144E-75d + "'", double2 == 1.622592768292144E-75d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1704");
        double double2 = JavaAlgorithms.calculateTax(1.7014118346047045E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4028236692094094E-85d + "'", double2 == 3.4028236692094094E-85d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1705");
        double double2 = JavaAlgorithms.calculateTax(3.245185536584288E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168576E-75d + "'", double2 == 6.490371073168576E-75d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1706");
        double double2 = JavaAlgorithms.calculateTax(7.86957492621689E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5739149852433782E-73d + "'", double2 == 1.5739149852433782E-73d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1707");
        double double2 = JavaAlgorithms.calculateTax(3.934787463108445E-72d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.86957492621689E-73d + "'", double2 == 7.86957492621689E-73d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1708");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168576E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337153E-75d + "'", double2 == 1.2980742146337153E-75d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1709");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337153E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5961484292674307E-76d + "'", double2 == 2.5961484292674307E-76d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1710");
        double double2 = JavaAlgorithms.calculateTax(2.9076862407795216E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.815372481559043E-81d + "'", double2 == 5.815372481559043E-81d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1711");
        double double2 = JavaAlgorithms.calculateTax(1.701411834604705E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4028236692094105E-89d + "'", double2 == 3.4028236692094105E-89d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1712");
        double double2 = JavaAlgorithms.calculateTax(7.247742189522503E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4495484379045008E-97d + "'", double2 == 1.4495484379045008E-97d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1713");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418821E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837642E-90d + "'", double2 == 1.3611294676837642E-90d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1714");
        double double2 = JavaAlgorithms.calculateTax(1.5739149852433782E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1478299704867564E-74d + "'", double2 == 3.1478299704867564E-74d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1715");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837642E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7222589353675287E-91d + "'", double2 == 2.7222589353675287E-91d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1716");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837642E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7222589353675287E-91d + "'", double2 == 2.7222589353675287E-91d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1717");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023522E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7014118346047045E-84d + "'", double2 == 1.7014118346047045E-84d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1718");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418821E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837642E-90d + "'", double2 == 1.3611294676837642E-90d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1719");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168576E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337153E-75d + "'", double2 == 1.2980742146337153E-75d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1720");
        double double2 = JavaAlgorithms.calculateTax(1.4495484379045008E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8990968758090016E-98d + "'", double2 == 2.8990968758090016E-98d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1721");
        double double2 = JavaAlgorithms.calculateTax(2.2649194342257815E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.529838868451563E-94d + "'", double2 == 4.529838868451563E-94d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1722");
        double double2 = JavaAlgorithms.calculateTax(7.247742189522503E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4495484379045008E-97d + "'", double2 == 1.4495484379045008E-97d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1723");
        double double2 = JavaAlgorithms.calculateTax(2.7222589353675287E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.4445178707350576E-92d + "'", double2 == 5.4445178707350576E-92d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1724");
        double double2 = JavaAlgorithms.calculateTax(1.4538431203897607E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9076862407795216E-80d + "'", double2 == 2.9076862407795216E-80d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1725");
        double double2 = JavaAlgorithms.calculateTax(3.4028236692094105E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418821E-90d + "'", double2 == 6.805647338418821E-90d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1726");
        double double2 = JavaAlgorithms.calculateTax(3.623871094761251E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.247742189522503E-97d + "'", double2 == 7.247742189522503E-97d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1727");
        double double2 = JavaAlgorithms.calculateTax(3.245185536584288E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168577E-77d + "'", double2 == 6.490371073168577E-77d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1728");
        double double2 = JavaAlgorithms.calculateTax(3.1478299704867564E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.295659940973513E-75d + "'", double2 == 6.295659940973513E-75d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1729");
        double double2 = JavaAlgorithms.calculateTax(8.112963841460719E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.622592768292144E-73d + "'", double2 == 1.622592768292144E-73d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1730");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168577E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337154E-77d + "'", double2 == 1.2980742146337154E-77d);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1731");
        double double2 = JavaAlgorithms.calculateTax(1.622592768292144E-73d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.245185536584288E-74d + "'", double2 == 3.245185536584288E-74d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1732");
        double double2 = JavaAlgorithms.calculateTax(5.815372481559043E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1630744963118086E-81d + "'", double2 == 1.1630744963118086E-81d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1733");
        double double2 = JavaAlgorithms.calculateTax(6.490371073168577E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980742146337154E-77d + "'", double2 == 1.2980742146337154E-77d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1734");
        double double2 = JavaAlgorithms.calculateTax(5.4445178707350576E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470116E-92d + "'", double2 == 1.0889035741470116E-92d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1735");
        double double2 = JavaAlgorithms.calculateTax(2.8990968758090016E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.798193751618003E-99d + "'", double2 == 5.798193751618003E-99d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1736");
        double double2 = JavaAlgorithms.calculateTax(6.295659940973513E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2591319881947028E-75d + "'", double2 == 1.2591319881947028E-75d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1737");
        double double2 = JavaAlgorithms.calculateTax(3.4028236692094094E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418819E-86d + "'", double2 == 6.805647338418819E-86d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1738");
        double double2 = JavaAlgorithms.calculateTax(1.2591319881947028E-75d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5182639763894056E-76d + "'", double2 == 2.5182639763894056E-76d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1739");
        double double2 = JavaAlgorithms.calculateTax(5.4445178707350576E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470116E-92d + "'", double2 == 1.0889035741470116E-92d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1740");
        double double2 = JavaAlgorithms.calculateTax(9.059677736903127E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8119355473806254E-95d + "'", double2 == 1.8119355473806254E-95d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1741");
        double double2 = JavaAlgorithms.calculateTax(6.295659940973513E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2591319881947028E-75d + "'", double2 == 1.2591319881947028E-75d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1742");
        double double2 = JavaAlgorithms.calculateTax(7.0778732319555656E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4155746463911132E-90d + "'", double2 == 1.4155746463911132E-90d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1743");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337154E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.596148429267431E-78d + "'", double2 == 2.596148429267431E-78d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1744");
        double double2 = JavaAlgorithms.calculateTax(2.596148429267431E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534862E-79d + "'", double2 == 5.192296858534862E-79d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1745");
        double double2 = JavaAlgorithms.calculateTax(2.5182639763894056E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.036527952778812E-77d + "'", double2 == 5.036527952778812E-77d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1746");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470116E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1778071482940233E-93d + "'", double2 == 2.1778071482940233E-93d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1747");
        double double2 = JavaAlgorithms.calculateTax(2.1778071482940233E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588047E-94d + "'", double2 == 4.355614296588047E-94d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1748");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418819E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837639E-86d + "'", double2 == 1.3611294676837639E-86d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1749");
        double double2 = JavaAlgorithms.calculateTax(1.5739149852433782E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1478299704867564E-74d + "'", double2 == 3.1478299704867564E-74d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1750");
        double double2 = JavaAlgorithms.calculateTax(3.245185536584288E-74d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168576E-75d + "'", double2 == 6.490371073168576E-75d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1751");
        double double2 = JavaAlgorithms.calculateTax(3.4028236692094094E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.805647338418819E-86d + "'", double2 == 6.805647338418819E-86d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1752");
        double double2 = JavaAlgorithms.calculateTax(2.9076862407795216E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.815372481559043E-81d + "'", double2 == 5.815372481559043E-81d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1753");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588047E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176094E-95d + "'", double2 == 8.711228593176094E-95d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1754");
        double double2 = JavaAlgorithms.calculateTax(5.798193751618003E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1596387503236007E-99d + "'", double2 == 1.1596387503236007E-99d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1755");
        double double2 = JavaAlgorithms.calculateTax(2.5961484292674307E-76d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534862E-77d + "'", double2 == 5.192296858534862E-77d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1756");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534862E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069725E-79d + "'", double2 == 1.0384593717069725E-79d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1757");
        double double2 = JavaAlgorithms.calculateTax(5.798193751618003E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1596387503236007E-99d + "'", double2 == 1.1596387503236007E-99d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1758");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069725E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0769187434139454E-80d + "'", double2 == 2.0769187434139454E-80d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1759");
        double double2 = JavaAlgorithms.calculateTax(1.4495484379045008E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8990968758090016E-98d + "'", double2 == 2.8990968758090016E-98d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1760");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069725E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0769187434139454E-80d + "'", double2 == 2.0769187434139454E-80d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1761");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534862E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069723E-77d + "'", double2 == 1.0384593717069723E-77d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1762");
        double double2 = JavaAlgorithms.calculateTax(2.7222589353675287E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.4445178707350576E-92d + "'", double2 == 5.4445178707350576E-92d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1763");
        double double2 = JavaAlgorithms.calculateTax(1.1596387503236007E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3192775006472016E-100d + "'", double2 == 2.3192775006472016E-100d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1764");
        double double2 = JavaAlgorithms.calculateTax(1.7014118346047045E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4028236692094094E-85d + "'", double2 == 3.4028236692094094E-85d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1765");
        double double2 = JavaAlgorithms.calculateTax(2.5961484292674307E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534862E-77d + "'", double2 == 5.192296858534862E-77d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1766");
        double double2 = JavaAlgorithms.calculateTax(1.1596387503236007E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3192775006472016E-100d + "'", double2 == 2.3192775006472016E-100d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1767");
        double double2 = JavaAlgorithms.calculateTax(2.3192775006472016E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.638555001294404E-101d + "'", double2 == 4.638555001294404E-101d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1768");
        double double2 = JavaAlgorithms.calculateTax(2.8990968758090016E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.798193751618003E-99d + "'", double2 == 5.798193751618003E-99d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1769");
        double double2 = JavaAlgorithms.calculateTax(4.638555001294404E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.277110002588809E-102d + "'", double2 == 9.277110002588809E-102d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1770");
        double double2 = JavaAlgorithms.calculateTax(1.2591319881947028E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5182639763894056E-76d + "'", double2 == 2.5182639763894056E-76d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1771");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534862E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069725E-79d + "'", double2 == 1.0384593717069725E-79d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1772");
        double double2 = JavaAlgorithms.calculateTax(2.596148429267431E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192296858534862E-79d + "'", double2 == 5.192296858534862E-79d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1773");
        double double2 = JavaAlgorithms.calculateTax(9.277110002588809E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8554220005177616E-102d + "'", double2 == 1.8554220005177616E-102d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1774");
        double double2 = JavaAlgorithms.calculateTax(9.277110002588809E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8554220005177616E-102d + "'", double2 == 1.8554220005177616E-102d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1775");
        double double2 = JavaAlgorithms.calculateTax(5.192296858534862E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0384593717069723E-77d + "'", double2 == 1.0384593717069723E-77d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1776");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176094E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.742245718635219E-95d + "'", double2 == 1.742245718635219E-95d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1777");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837639E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.722258935367528E-87d + "'", double2 == 2.722258935367528E-87d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1778");
        double double2 = JavaAlgorithms.calculateTax(1.8554220005177616E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7108440010355236E-103d + "'", double2 == 3.7108440010355236E-103d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1779");
        double double2 = JavaAlgorithms.calculateTax(2.3192775006472016E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.638555001294404E-101d + "'", double2 == 4.638555001294404E-101d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1780");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069723E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0769187434139448E-78d + "'", double2 == 2.0769187434139448E-78d);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1781");
        double double2 = JavaAlgorithms.calculateTax(1.1630744963118086E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3261489926236173E-82d + "'", double2 == 2.3261489926236173E-82d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1782");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470116E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1778071482940233E-93d + "'", double2 == 2.1778071482940233E-93d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1783");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337154E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.596148429267431E-78d + "'", double2 == 2.596148429267431E-78d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1784");
        double double2 = JavaAlgorithms.calculateTax(1.742245718635219E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270438E-96d + "'", double2 == 3.484491437270438E-96d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1785");
        double double2 = JavaAlgorithms.calculateTax(5.815372481559043E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1630744963118086E-81d + "'", double2 == 1.1630744963118086E-81d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1786");
        double double2 = JavaAlgorithms.calculateTax(2.3261489926236173E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6522979852472346E-83d + "'", double2 == 4.6522979852472346E-83d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1787");
        double double2 = JavaAlgorithms.calculateTax(2.3261489926236173E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6522979852472346E-83d + "'", double2 == 4.6522979852472346E-83d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1788");
        double double2 = JavaAlgorithms.calculateTax(1.1630744963118086E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3261489926236173E-82d + "'", double2 == 2.3261489926236173E-82d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1789");
        double double2 = JavaAlgorithms.calculateTax(3.1478299704867564E-74d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.295659940973513E-75d + "'", double2 == 6.295659940973513E-75d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1790");
        double double2 = JavaAlgorithms.calculateTax(1.3611294676837639E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.722258935367528E-87d + "'", double2 == 2.722258935367528E-87d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1791");
        double double2 = JavaAlgorithms.calculateTax(2.5182639763894056E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.036527952778812E-77d + "'", double2 == 5.036527952778812E-77d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1792");
        double double2 = JavaAlgorithms.calculateTax(2.0769187434139448E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.15383748682789E-79d + "'", double2 == 4.15383748682789E-79d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1793");
        double double2 = JavaAlgorithms.calculateTax(4.15383748682789E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655782E-80d + "'", double2 == 8.307674973655782E-80d);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1794");
        double double2 = JavaAlgorithms.calculateTax(1.2980742146337153E-75d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5961484292674307E-76d + "'", double2 == 2.5961484292674307E-76d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1795");
        double double2 = JavaAlgorithms.calculateTax(5.036527952778812E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0073055905557623E-77d + "'", double2 == 1.0073055905557623E-77d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1796");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270438E-96d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540876E-97d + "'", double2 == 6.968982874540876E-97d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1797");
        double double2 = JavaAlgorithms.calculateTax(4.6522979852472346E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.30459597049447E-84d + "'", double2 == 9.30459597049447E-84d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1798");
        double double2 = JavaAlgorithms.calculateTax(1.0073055905557623E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0146111811115246E-78d + "'", double2 == 2.0146111811115246E-78d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1799");
        double double2 = JavaAlgorithms.calculateTax(1.0384593717069723E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0769187434139448E-78d + "'", double2 == 2.0769187434139448E-78d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1800");
        double double2 = JavaAlgorithms.calculateTax(1.742245718635219E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270438E-96d + "'", double2 == 3.484491437270438E-96d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1801");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588047E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176094E-95d + "'", double2 == 8.711228593176094E-95d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1802");
        double double2 = JavaAlgorithms.calculateTax(2.0769187434139454E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.153837486827891E-81d + "'", double2 == 4.153837486827891E-81d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1803");
        double double2 = JavaAlgorithms.calculateTax(2.0769187434139454E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.153837486827891E-81d + "'", double2 == 4.153837486827891E-81d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1804");
        double double2 = JavaAlgorithms.calculateTax(6.805647338418819E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3611294676837639E-86d + "'", double2 == 1.3611294676837639E-86d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1805");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540876E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3937965749081754E-97d + "'", double2 == 1.3937965749081754E-97d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1806");
        double double2 = JavaAlgorithms.calculateTax(3.7108440010355236E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.421688002071047E-104d + "'", double2 == 7.421688002071047E-104d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1807");
        double double2 = JavaAlgorithms.calculateTax(2.1778071482940233E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588047E-94d + "'", double2 == 4.355614296588047E-94d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1808");
        double double2 = JavaAlgorithms.calculateTax(1.8554220005177616E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7108440010355236E-103d + "'", double2 == 3.7108440010355236E-103d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1809");
        double double2 = JavaAlgorithms.calculateTax(1.3937965749081754E-97d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.787593149816351E-98d + "'", double2 == 2.787593149816351E-98d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1810");
        double double2 = JavaAlgorithms.calculateTax(2.722258935367528E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.444517870735057E-88d + "'", double2 == 5.444517870735057E-88d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1811");
        double double2 = JavaAlgorithms.calculateTax(5.444517870735057E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470114E-88d + "'", double2 == 1.0889035741470114E-88d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1812");
        double double2 = JavaAlgorithms.calculateTax(2.787593149816351E-98d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632702E-99d + "'", double2 == 5.575186299632702E-99d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1813");
        double double2 = JavaAlgorithms.calculateTax(4.6522979852472346E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.30459597049447E-84d + "'", double2 == 9.30459597049447E-84d);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1814");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632702E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265405E-99d + "'", double2 == 1.1150372599265405E-99d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1815");
        double double2 = JavaAlgorithms.calculateTax(5.444517870735057E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0889035741470114E-88d + "'", double2 == 1.0889035741470114E-88d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1816");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176094E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.742245718635219E-95d + "'", double2 == 1.742245718635219E-95d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1817");
        double double2 = JavaAlgorithms.calculateTax(2.0146111811115246E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0292223622230496E-79d + "'", double2 == 4.0292223622230496E-79d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1818");
        double double2 = JavaAlgorithms.calculateTax(7.421688002071047E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4843376004142096E-104d + "'", double2 == 1.4843376004142096E-104d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1819");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270438E-96d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540876E-97d + "'", double2 == 6.968982874540876E-97d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1820");
        double double2 = JavaAlgorithms.calculateTax(3.7108440010355236E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.421688002071047E-104d + "'", double2 == 7.421688002071047E-104d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1821");
        double double2 = JavaAlgorithms.calculateTax(1.4843376004142096E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9686752008284195E-105d + "'", double2 == 2.9686752008284195E-105d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1822");
        double double2 = JavaAlgorithms.calculateTax(9.30459597049447E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8609191940988938E-84d + "'", double2 == 1.8609191940988938E-84d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1823");
        double double2 = JavaAlgorithms.calculateTax(7.421688002071047E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4843376004142096E-104d + "'", double2 == 1.4843376004142096E-104d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1824");
        double double2 = JavaAlgorithms.calculateTax(1.4843376004142096E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9686752008284195E-105d + "'", double2 == 2.9686752008284195E-105d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1825");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655782E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311563E-80d + "'", double2 == 1.6615349947311563E-80d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1826");
        double double2 = JavaAlgorithms.calculateTax(4.153837486827891E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655783E-82d + "'", double2 == 8.307674973655783E-82d);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1827");
        double double2 = JavaAlgorithms.calculateTax(1.8609191940988938E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.721838388197788E-85d + "'", double2 == 3.721838388197788E-85d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1828");
        double double2 = JavaAlgorithms.calculateTax(4.638555001294404E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.277110002588809E-102d + "'", double2 == 9.277110002588809E-102d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1829");
        double double2 = JavaAlgorithms.calculateTax(2.9686752008284195E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.937350401656839E-106d + "'", double2 == 5.937350401656839E-106d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1830");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265405E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2300745198530812E-100d + "'", double2 == 2.2300745198530812E-100d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1831");
        double double2 = JavaAlgorithms.calculateTax(4.0292223622230496E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.058444724446099E-80d + "'", double2 == 8.058444724446099E-80d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1832");
        double double2 = JavaAlgorithms.calculateTax(7.86957492621689E-73d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5739149852433782E-73d + "'", double2 == 1.5739149852433782E-73d);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1833");
        double double2 = JavaAlgorithms.calculateTax(8.058444724446099E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.61168894488922E-80d + "'", double2 == 1.61168894488922E-80d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1834");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470114E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1778071482940227E-89d + "'", double2 == 2.1778071482940227E-89d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1835");
        double double2 = JavaAlgorithms.calculateTax(1.0889035741470114E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1778071482940227E-89d + "'", double2 == 2.1778071482940227E-89d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1836");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655783E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311566E-82d + "'", double2 == 1.6615349947311566E-82d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1837");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311566E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462313E-83d + "'", double2 == 3.323069989462313E-83d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1838");
        double double2 = JavaAlgorithms.calculateTax(2.1778071482940227E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588046E-90d + "'", double2 == 4.355614296588046E-90d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1839");
        double double2 = JavaAlgorithms.calculateTax(4.15383748682789E-79d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655782E-80d + "'", double2 == 8.307674973655782E-80d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1840");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311563E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462313E-81d + "'", double2 == 3.323069989462313E-81d);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1841");
        double double2 = JavaAlgorithms.calculateTax(5.937350401656839E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1874700803313679E-106d + "'", double2 == 1.1874700803313679E-106d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1842");
        double double2 = JavaAlgorithms.calculateTax(3.721838388197788E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.443676776395576E-86d + "'", double2 == 7.443676776395576E-86d);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1843");
        double double2 = JavaAlgorithms.calculateTax(1.61168894488922E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.22337788977844E-81d + "'", double2 == 3.22337788977844E-81d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1844");
        double double2 = JavaAlgorithms.calculateTax(3.22337788977844E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.446755779556881E-82d + "'", double2 == 6.446755779556881E-82d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1845");
        double double2 = JavaAlgorithms.calculateTax(1.8609191940988938E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.721838388197788E-85d + "'", double2 == 3.721838388197788E-85d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1846");
        double double2 = JavaAlgorithms.calculateTax(1.1874700803313679E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.374940160662736E-107d + "'", double2 == 2.374940160662736E-107d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1847");
        double double2 = JavaAlgorithms.calculateTax(2.787593149816351E-98d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632702E-99d + "'", double2 == 5.575186299632702E-99d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1848");
        double double2 = JavaAlgorithms.calculateTax(7.443676776395576E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4887353552791152E-86d + "'", double2 == 1.4887353552791152E-86d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1849");
        double double2 = JavaAlgorithms.calculateTax(4.0292223622230496E-79d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.058444724446099E-80d + "'", double2 == 8.058444724446099E-80d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1850");
        double double2 = JavaAlgorithms.calculateTax(3.245185536584288E-76d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.490371073168577E-77d + "'", double2 == 6.490371073168577E-77d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1851");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265405E-99d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2300745198530812E-100d + "'", double2 == 2.2300745198530812E-100d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1852");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588046E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176092E-91d + "'", double2 == 8.711228593176092E-91d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1853");
        double double2 = JavaAlgorithms.calculateTax(6.446755779556881E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2893511559113762E-82d + "'", double2 == 1.2893511559113762E-82d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1854");
        double double2 = JavaAlgorithms.calculateTax(1.4887353552791152E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9774707105582307E-87d + "'", double2 == 2.9774707105582307E-87d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1855");
        double double2 = JavaAlgorithms.calculateTax(2.9774707105582307E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.954941421116462E-88d + "'", double2 == 5.954941421116462E-88d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1856");
        double double2 = JavaAlgorithms.calculateTax(2.2300745198530812E-100d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4601490397061625E-101d + "'", double2 == 4.4601490397061625E-101d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1857");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632702E-99d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265405E-99d + "'", double2 == 1.1150372599265405E-99d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1858");
        double double2 = JavaAlgorithms.calculateTax(1.3937965749081754E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.787593149816351E-98d + "'", double2 == 2.787593149816351E-98d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1859");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655783E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311566E-82d + "'", double2 == 1.6615349947311566E-82d);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1860");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462313E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924626E-84d + "'", double2 == 6.646139978924626E-84d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1861");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462313E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924626E-82d + "'", double2 == 6.646139978924626E-82d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1862");
        double double2 = JavaAlgorithms.calculateTax(1.61168894488922E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.22337788977844E-81d + "'", double2 == 3.22337788977844E-81d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1863");
        double double2 = JavaAlgorithms.calculateTax(1.2893511559113762E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5787023118227526E-83d + "'", double2 == 2.5787023118227526E-83d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1864");
        double double2 = JavaAlgorithms.calculateTax(4.4601490397061625E-101d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412326E-102d + "'", double2 == 8.920298079412326E-102d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1865");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924626E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849252E-82d + "'", double2 == 1.3292279957849252E-82d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1866");
        double double2 = JavaAlgorithms.calculateTax(2.5787023118227526E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.157404623645505E-84d + "'", double2 == 5.157404623645505E-84d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1867");
        double double2 = JavaAlgorithms.calculateTax(9.30459597049447E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8609191940988938E-84d + "'", double2 == 1.8609191940988938E-84d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1868");
        double double2 = JavaAlgorithms.calculateTax(2.2300745198530812E-100d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4601490397061625E-101d + "'", double2 == 4.4601490397061625E-101d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1869");
        double double2 = JavaAlgorithms.calculateTax(2.0769187434139448E-78d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.15383748682789E-79d + "'", double2 == 4.15383748682789E-79d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1870");
        double double2 = JavaAlgorithms.calculateTax(7.443676776395576E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4887353552791152E-86d + "'", double2 == 1.4887353552791152E-86d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1871");
        double double2 = JavaAlgorithms.calculateTax(1.1874700803313679E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.374940160662736E-107d + "'", double2 == 2.374940160662736E-107d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1872");
        double double2 = JavaAlgorithms.calculateTax(8.307674973655782E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6615349947311563E-80d + "'", double2 == 1.6615349947311563E-80d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1873");
        double double2 = JavaAlgorithms.calculateTax(3.22337788977844E-81d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.446755779556881E-82d + "'", double2 == 6.446755779556881E-82d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1874");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311566E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462313E-83d + "'", double2 == 3.323069989462313E-83d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1875");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412326E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7840596158824654E-102d + "'", double2 == 1.7840596158824654E-102d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1876");
        double double2 = JavaAlgorithms.calculateTax(4.153837486827891E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.307674973655783E-82d + "'", double2 == 8.307674973655783E-82d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1877");
        double double2 = JavaAlgorithms.calculateTax(8.058444724446099E-80d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.61168894488922E-80d + "'", double2 == 1.61168894488922E-80d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1878");
        double double2 = JavaAlgorithms.calculateTax(6.446755779556881E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2893511559113762E-82d + "'", double2 == 1.2893511559113762E-82d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1879");
        double double2 = JavaAlgorithms.calculateTax(4.355614296588046E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.711228593176092E-91d + "'", double2 == 8.711228593176092E-91d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1880");
        double double2 = JavaAlgorithms.calculateTax(1.0073055905557623E-77d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0146111811115246E-78d + "'", double2 == 2.0146111811115246E-78d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1881");
        double double2 = JavaAlgorithms.calculateTax(5.937350401656839E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1874700803313679E-106d + "'", double2 == 1.1874700803313679E-106d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1882");
        double double2 = JavaAlgorithms.calculateTax(2.374940160662736E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7498803213254724E-108d + "'", double2 == 4.7498803213254724E-108d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1883");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924626E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849252E-84d + "'", double2 == 1.3292279957849252E-84d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1884");
        double double2 = JavaAlgorithms.calculateTax(4.7498803213254724E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.499760642650945E-109d + "'", double2 == 9.499760642650945E-109d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1885");
        double double2 = JavaAlgorithms.calculateTax(2.5787023118227526E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.157404623645505E-84d + "'", double2 == 5.157404623645505E-84d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1886");
        double double2 = JavaAlgorithms.calculateTax(5.036527952778812E-77d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0073055905557623E-77d + "'", double2 == 1.0073055905557623E-77d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1887");
        double double2 = JavaAlgorithms.calculateTax(1.7840596158824654E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.568119231764931E-103d + "'", double2 == 3.568119231764931E-103d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1888");
        double double2 = JavaAlgorithms.calculateTax(2.0146111811115246E-78d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0292223622230496E-79d + "'", double2 == 4.0292223622230496E-79d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1889");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849252E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698505E-85d + "'", double2 == 2.6584559915698505E-85d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1890");
        double double2 = JavaAlgorithms.calculateTax(1.2893511559113762E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5787023118227526E-83d + "'", double2 == 2.5787023118227526E-83d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1891");
        double double2 = JavaAlgorithms.calculateTax(2.9686752008284195E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.937350401656839E-106d + "'", double2 == 5.937350401656839E-106d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1892");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176092E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7422457186352185E-91d + "'", double2 == 1.7422457186352185E-91d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1893");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462313E-81d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924626E-82d + "'", double2 == 6.646139978924626E-82d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1894");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849252E-82d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698504E-83d + "'", double2 == 2.6584559915698504E-83d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1895");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698504E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139701E-84d + "'", double2 == 5.316911983139701E-84d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1896");
        double double2 = JavaAlgorithms.calculateTax(3.323069989462313E-83d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646139978924626E-84d + "'", double2 == 6.646139978924626E-84d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1897");
        double double2 = JavaAlgorithms.calculateTax(2.9774707105582307E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.954941421116462E-88d + "'", double2 == 5.954941421116462E-88d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1898");
        double double2 = JavaAlgorithms.calculateTax(9.499760642650945E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.899952128530189E-109d + "'", double2 == 1.899952128530189E-109d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1899");
        double double2 = JavaAlgorithms.calculateTax(5.954941421116462E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1909882842232925E-88d + "'", double2 == 1.1909882842232925E-88d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1900");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540876E-97d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3937965749081754E-97d + "'", double2 == 1.3937965749081754E-97d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1901");
        double double2 = JavaAlgorithms.calculateTax(1.7422457186352185E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270437E-92d + "'", double2 == 3.484491437270437E-92d);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1902");
        double double2 = JavaAlgorithms.calculateTax(1.6615349947311563E-80d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.323069989462313E-81d + "'", double2 == 3.323069989462313E-81d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1903");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849252E-82d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698504E-83d + "'", double2 == 2.6584559915698504E-83d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1904");
        double double2 = JavaAlgorithms.calculateTax(1.7840596158824654E-102d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.568119231764931E-103d + "'", double2 == 3.568119231764931E-103d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1905");
        double double2 = JavaAlgorithms.calculateTax(1.899952128530189E-109d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7999042570603784E-110d + "'", double2 == 3.7999042570603784E-110d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1906");
        double double2 = JavaAlgorithms.calculateTax(4.4601490397061625E-101d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.920298079412326E-102d + "'", double2 == 8.920298079412326E-102d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1907");
        double double2 = JavaAlgorithms.calculateTax(3.568119231764931E-103d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.136238463529862E-104d + "'", double2 == 7.136238463529862E-104d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1908");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139701E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279402E-84d + "'", double2 == 1.0633823966279402E-84d);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1909");
        double double2 = JavaAlgorithms.calculateTax(3.7999042570603784E-110d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.599808514120757E-111d + "'", double2 == 7.599808514120757E-111d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1910");
        double double2 = JavaAlgorithms.calculateTax(6.646139978924626E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3292279957849252E-84d + "'", double2 == 1.3292279957849252E-84d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1911");
        double double2 = JavaAlgorithms.calculateTax(7.599808514120757E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5199617028241514E-111d + "'", double2 == 1.5199617028241514E-111d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1912");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698504E-83d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139701E-84d + "'", double2 == 5.316911983139701E-84d);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1913");
        double double2 = JavaAlgorithms.calculateTax(1.899952128530189E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7999042570603784E-110d + "'", double2 == 3.7999042570603784E-110d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1914");
        double double2 = JavaAlgorithms.calculateTax(1.4887353552791152E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9774707105582307E-87d + "'", double2 == 2.9774707105582307E-87d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1915");
        double double2 = JavaAlgorithms.calculateTax(1.7422457186352185E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.484491437270437E-92d + "'", double2 == 3.484491437270437E-92d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1916");
        double double2 = JavaAlgorithms.calculateTax(1.5199617028241514E-111d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.039923405648303E-112d + "'", double2 == 3.039923405648303E-112d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1917");
        double double2 = JavaAlgorithms.calculateTax(4.7498803213254724E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.499760642650945E-109d + "'", double2 == 9.499760642650945E-109d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1918");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139701E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279402E-84d + "'", double2 == 1.0633823966279402E-84d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1919");
        double double2 = JavaAlgorithms.calculateTax(7.599808514120757E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5199617028241514E-111d + "'", double2 == 1.5199617028241514E-111d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1920");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270437E-92d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540875E-93d + "'", double2 == 6.968982874540875E-93d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1921");
        double double2 = JavaAlgorithms.calculateTax(3.721838388197788E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.443676776395576E-86d + "'", double2 == 7.443676776395576E-86d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1922");
        double double2 = JavaAlgorithms.calculateTax(8.711228593176092E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7422457186352185E-91d + "'", double2 == 1.7422457186352185E-91d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1923");
        double double2 = JavaAlgorithms.calculateTax(5.157404623645505E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.031480924729101E-84d + "'", double2 == 1.031480924729101E-84d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1924");
        double double2 = JavaAlgorithms.calculateTax(1.031480924729101E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.062961849458202E-85d + "'", double2 == 2.062961849458202E-85d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1925");
        double double2 = JavaAlgorithms.calculateTax(7.136238463529862E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059726E-104d + "'", double2 == 1.4272476927059726E-104d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1926");
        double double2 = JavaAlgorithms.calculateTax(3.039923405648303E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.079846811296606E-113d + "'", double2 == 6.079846811296606E-113d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1927");
        double double2 = JavaAlgorithms.calculateTax(2.1778071482940227E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355614296588046E-90d + "'", double2 == 4.355614296588046E-90d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1928");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059726E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8544953854119453E-105d + "'", double2 == 2.8544953854119453E-105d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1929");
        double double2 = JavaAlgorithms.calculateTax(2.374940160662736E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7498803213254724E-108d + "'", double2 == 4.7498803213254724E-108d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1930");
        double double2 = JavaAlgorithms.calculateTax(5.157404623645505E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.031480924729101E-84d + "'", double2 == 1.031480924729101E-84d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1931");
        double double2 = JavaAlgorithms.calculateTax(3.039923405648303E-112d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.079846811296606E-113d + "'", double2 == 6.079846811296606E-113d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1932");
        double double2 = JavaAlgorithms.calculateTax(2.8544953854119453E-105d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823891E-106d + "'", double2 == 5.708990770823891E-106d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1933");
        double double2 = JavaAlgorithms.calculateTax(7.136238463529862E-104d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4272476927059726E-104d + "'", double2 == 1.4272476927059726E-104d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1934");
        double double2 = JavaAlgorithms.calculateTax(3.568119231764931E-103d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.136238463529862E-104d + "'", double2 == 7.136238463529862E-104d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1935");
        double double2 = JavaAlgorithms.calculateTax(5.954941421116462E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1909882842232925E-88d + "'", double2 == 1.1909882842232925E-88d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1936");
        double double2 = JavaAlgorithms.calculateTax(1.3292279957849252E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6584559915698505E-85d + "'", double2 == 2.6584559915698505E-85d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1937");
        double double2 = JavaAlgorithms.calculateTax(6.079846811296606E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2159693622593212E-113d + "'", double2 == 1.2159693622593212E-113d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1938");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279402E-84d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1267647932558807E-85d + "'", double2 == 2.1267647932558807E-85d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1939");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279402E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1267647932558807E-85d + "'", double2 == 2.1267647932558807E-85d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1940");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698505E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139702E-86d + "'", double2 == 5.316911983139702E-86d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1941");
        double double2 = JavaAlgorithms.calculateTax(1.4272476927059726E-104d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8544953854119453E-105d + "'", double2 == 2.8544953854119453E-105d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1942");
        double double2 = JavaAlgorithms.calculateTax(3.7999042570603784E-110d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.599808514120757E-111d + "'", double2 == 7.599808514120757E-111d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1943");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823891E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1417981541647784E-106d + "'", double2 == 1.1417981541647784E-106d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1944");
        double double2 = JavaAlgorithms.calculateTax(1.1909882842232925E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3819765684465853E-89d + "'", double2 == 2.3819765684465853E-89d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1945");
        double double2 = JavaAlgorithms.calculateTax(1.1909882842232925E-88d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3819765684465853E-89d + "'", double2 == 2.3819765684465853E-89d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1946");
        double double2 = JavaAlgorithms.calculateTax(2.062961849458202E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1259236989164044E-86d + "'", double2 == 4.1259236989164044E-86d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1947");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139702E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279404E-86d + "'", double2 == 1.0633823966279404E-86d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1948");
        double double2 = JavaAlgorithms.calculateTax(5.316911983139702E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633823966279404E-86d + "'", double2 == 1.0633823966279404E-86d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1949");
        double double2 = JavaAlgorithms.calculateTax(2.3819765684465853E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.763953136893171E-90d + "'", double2 == 4.763953136893171E-90d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1950");
        double double2 = JavaAlgorithms.calculateTax(6.968982874540875E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.393796574908175E-93d + "'", double2 == 1.393796574908175E-93d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1951");
        double double2 = JavaAlgorithms.calculateTax(1.2159693622593212E-113d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4319387245186425E-114d + "'", double2 == 2.4319387245186425E-114d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1952");
        double double2 = JavaAlgorithms.calculateTax(2.3819765684465853E-89d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.763953136893171E-90d + "'", double2 == 4.763953136893171E-90d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1953");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279404E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.126764793255881E-87d + "'", double2 == 2.126764793255881E-87d);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1954");
        double double2 = JavaAlgorithms.calculateTax(2.6584559915698505E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.316911983139702E-86d + "'", double2 == 5.316911983139702E-86d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1955");
        double double2 = JavaAlgorithms.calculateTax(4.763953136893171E-90d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.527906273786343E-91d + "'", double2 == 9.527906273786343E-91d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1956");
        double double2 = JavaAlgorithms.calculateTax(9.527906273786343E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9055812547572689E-91d + "'", double2 == 1.9055812547572689E-91d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1957");
        double double2 = JavaAlgorithms.calculateTax(9.527906273786343E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9055812547572689E-91d + "'", double2 == 1.9055812547572689E-91d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1958");
        double double2 = JavaAlgorithms.calculateTax(3.484491437270437E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.968982874540875E-93d + "'", double2 == 6.968982874540875E-93d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1959");
        double double2 = JavaAlgorithms.calculateTax(1.1417981541647784E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2835963083295568E-107d + "'", double2 == 2.2835963083295568E-107d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1960");
        double double2 = JavaAlgorithms.calculateTax(1.9055812547572689E-91d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.811162509514538E-92d + "'", double2 == 3.811162509514538E-92d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1961");
        double double2 = JavaAlgorithms.calculateTax(1.9055812547572689E-91d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.811162509514538E-92d + "'", double2 == 3.811162509514538E-92d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1962");
        double double2 = JavaAlgorithms.calculateTax(1.393796574908175E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.78759314981635E-94d + "'", double2 == 2.78759314981635E-94d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1963");
        double double2 = JavaAlgorithms.calculateTax(3.811162509514538E-92d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.622325019029076E-93d + "'", double2 == 7.622325019029076E-93d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1964");
        double double2 = JavaAlgorithms.calculateTax(1.1417981541647784E-106d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2835963083295568E-107d + "'", double2 == 2.2835963083295568E-107d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1965");
        double double2 = JavaAlgorithms.calculateTax(1.0633823966279404E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.126764793255881E-87d + "'", double2 == 2.126764793255881E-87d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1966");
        double double2 = JavaAlgorithms.calculateTax(1.031480924729101E-84d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.062961849458202E-85d + "'", double2 == 2.062961849458202E-85d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1967");
        double double2 = JavaAlgorithms.calculateTax(2.1267647932558807E-85d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511762E-86d + "'", double2 == 4.253529586511762E-86d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1968");
        double double2 = JavaAlgorithms.calculateTax(2.2835963083295568E-107d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.567192616659114E-108d + "'", double2 == 4.567192616659114E-108d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1969");
        double double2 = JavaAlgorithms.calculateTax(2.2835963083295568E-107d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.567192616659114E-108d + "'", double2 == 4.567192616659114E-108d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1970");
        double double2 = JavaAlgorithms.calculateTax(5.708990770823891E-106d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1417981541647784E-106d + "'", double2 == 1.1417981541647784E-106d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1971");
        double double2 = JavaAlgorithms.calculateTax(7.622325019029076E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5244650038058153E-93d + "'", double2 == 1.5244650038058153E-93d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1972");
        double double2 = JavaAlgorithms.calculateTax(2.126764793255881E-87d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511762E-88d + "'", double2 == 4.253529586511762E-88d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1973");
        double double2 = JavaAlgorithms.calculateTax(4.763953136893171E-90d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.527906273786343E-91d + "'", double2 == 9.527906273786343E-91d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1974");
        double double2 = JavaAlgorithms.calculateTax(2.1267647932558807E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.253529586511762E-86d + "'", double2 == 4.253529586511762E-86d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1975");
        double double2 = JavaAlgorithms.calculateTax(9.499760642650945E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.899952128530189E-109d + "'", double2 == 1.899952128530189E-109d);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1976");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511762E-86d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023524E-87d + "'", double2 == 8.507059173023524E-87d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1977");
        double double2 = JavaAlgorithms.calculateTax(1.5199617028241514E-111d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.039923405648303E-112d + "'", double2 == 3.039923405648303E-112d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1978");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023524E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7014118346047048E-87d + "'", double2 == 1.7014118346047048E-87d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1979");
        double double2 = JavaAlgorithms.calculateTax(4.567192616659114E-108d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318228E-109d + "'", double2 == 9.134385233318228E-109d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1980");
        double double2 = JavaAlgorithms.calculateTax(2.78759314981635E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.575186299632701E-95d + "'", double2 == 5.575186299632701E-95d);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1981");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511762E-88d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023525E-89d + "'", double2 == 8.507059173023525E-89d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1982");
        double double2 = JavaAlgorithms.calculateTax(2.8544953854119453E-105d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.708990770823891E-106d + "'", double2 == 5.708990770823891E-106d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1983");
        double double2 = JavaAlgorithms.calculateTax(1.7014118346047048E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.40282366920941E-88d + "'", double2 == 3.40282366920941E-88d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1984");
        double double2 = JavaAlgorithms.calculateTax(8.920298079412326E-102d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7840596158824654E-102d + "'", double2 == 1.7840596158824654E-102d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1985");
        double double2 = JavaAlgorithms.calculateTax(4.567192616659114E-108d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.134385233318228E-109d + "'", double2 == 9.134385233318228E-109d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1986");
        double double2 = JavaAlgorithms.calculateTax(1.2159693622593212E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4319387245186425E-114d + "'", double2 == 2.4319387245186425E-114d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1987");
        double double2 = JavaAlgorithms.calculateTax(2.722258935367528E-87d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.444517870735057E-88d + "'", double2 == 5.444517870735057E-88d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1988");
        double double2 = JavaAlgorithms.calculateTax(2.062961849458202E-85d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1259236989164044E-86d + "'", double2 == 4.1259236989164044E-86d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1989");
        double double2 = JavaAlgorithms.calculateTax(1.5244650038058153E-93d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.048930007611631E-94d + "'", double2 == 3.048930007611631E-94d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1990");
        double double2 = JavaAlgorithms.calculateTax(7.622325019029076E-93d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5244650038058153E-93d + "'", double2 == 1.5244650038058153E-93d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1991");
        double double2 = JavaAlgorithms.calculateTax(9.134385233318228E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8268770466636457E-109d + "'", double2 == 1.8268770466636457E-109d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1992");
        double double2 = JavaAlgorithms.calculateTax(6.079846811296606E-113d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2159693622593212E-113d + "'", double2 == 1.2159693622593212E-113d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1993");
        double double2 = JavaAlgorithms.calculateTax(3.048930007611631E-94d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.097860015223262E-95d + "'", double2 == 6.097860015223262E-95d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1994");
        double double2 = JavaAlgorithms.calculateTax(5.575186299632701E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1150372599265402E-95d + "'", double2 == 1.1150372599265402E-95d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1995");
        double double2 = JavaAlgorithms.calculateTax(4.253529586511762E-86d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.507059173023524E-87d + "'", double2 == 8.507059173023524E-87d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1996");
        double double2 = JavaAlgorithms.calculateTax(3.048930007611631E-94d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.097860015223262E-95d + "'", double2 == 6.097860015223262E-95d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1997");
        double double2 = JavaAlgorithms.calculateTax(8.507059173023525E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7014118346047053E-89d + "'", double2 == 1.7014118346047053E-89d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1998");
        double double2 = JavaAlgorithms.calculateTax(6.097860015223262E-95d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2195720030446525E-95d + "'", double2 == 1.2195720030446525E-95d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test1999");
        double double2 = JavaAlgorithms.calculateTax(1.7014118346047053E-89d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4028236692094105E-90d + "'", double2 == 3.4028236692094105E-90d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression3.test2000");
        double double2 = JavaAlgorithms.calculateTax(1.1150372599265402E-95d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2300745198530807E-96d + "'", double2 == 2.2300745198530807E-96d);
    }
}

