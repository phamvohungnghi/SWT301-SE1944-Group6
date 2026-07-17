import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2501");
        double double2 = JavaAlgorithms.calculateTax(1.1341252705687903E-112d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2682505411375807E-113d + "'", double2 == 2.2682505411375807E-113d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2502");
        double double2 = JavaAlgorithms.calculateTax(1.044509728768354E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0890194575367082E-137d + "'", double2 == 2.0890194575367082E-137d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2503");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927247E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854494E-128d + "'", double2 == 2.4519928653854494E-128d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2504");
        double double2 = JavaAlgorithms.calculateTax(1.3095054670485008E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.619010934097002E-117d + "'", double2 == 2.619010934097002E-117d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2505");
        double double2 = JavaAlgorithms.calculateTax(1.8146004329100648E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6292008658201296E-116d + "'", double2 == 3.6292008658201296E-116d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2506");
        double double2 = JavaAlgorithms.calculateTax(2.3384026197294676E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6768052394589356E-116d + "'", double2 == 4.6768052394589356E-116d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2507");
        double double2 = JavaAlgorithms.calculateTax(9.353610478917872E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835744E-117d + "'", double2 == 1.8707220957835744E-117d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2508");
        double double2 = JavaAlgorithms.calculateTax(9.353610478917872E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835744E-117d + "'", double2 == 1.8707220957835744E-117d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2509");
        double double2 = JavaAlgorithms.calculateTax(4.1780389150734166E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.356077830146833E-139d + "'", double2 == 8.356077830146833E-139d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2510");
        double double2 = JavaAlgorithms.calculateTax(8.356077830146833E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6712155660293668E-139d + "'", double2 == 1.6712155660293668E-139d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2511");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854487E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.903985730770898E-125d + "'", double2 == 4.903985730770898E-125d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2512");
        double double2 = JavaAlgorithms.calculateTax(4.903985730770898E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.807971461541797E-126d + "'", double2 == 9.807971461541797E-126d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2513");
        double double2 = JavaAlgorithms.calculateTax(2.619010934097002E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.238021868194004E-118d + "'", double2 == 5.238021868194004E-118d);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2514");
        double double2 = JavaAlgorithms.calculateTax(2.0890194575367082E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1780389150734166E-138d + "'", double2 == 4.1780389150734166E-138d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2515");
        double double2 = JavaAlgorithms.calculateTax(5.22254864384177E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.044509728768354E-136d + "'", double2 == 1.044509728768354E-136d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2516");
        double double2 = JavaAlgorithms.calculateTax(5.238021868194004E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0476043736388009E-118d + "'", double2 == 1.0476043736388009E-118d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2517");
        double double2 = JavaAlgorithms.calculateTax(1.6712155660293668E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3424311320587336E-140d + "'", double2 == 3.3424311320587336E-140d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2518");
        double double2 = JavaAlgorithms.calculateTax(3.6537540933272915E-109d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.307508186654584E-110d + "'", double2 == 7.307508186654584E-110d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2519");
        double double2 = JavaAlgorithms.calculateTax(9.807971461541797E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9615942923083595E-126d + "'", double2 == 1.9615942923083595E-126d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2520");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835744E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567149E-118d + "'", double2 == 3.741444191567149E-118d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2521");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835744E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567149E-118d + "'", double2 == 3.741444191567149E-118d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2522");
        double double2 = JavaAlgorithms.calculateTax(3.6292008658201296E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.25840173164026E-117d + "'", double2 == 7.25840173164026E-117d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2523");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463623E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927247E-127d + "'", double2 == 1.2259964326927247E-127d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2524");
        double double2 = JavaAlgorithms.calculateTax(1.9615942923083595E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.923188584616719E-127d + "'", double2 == 3.923188584616719E-127d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2525");
        double double2 = JavaAlgorithms.calculateTax(9.807971461541797E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9615942923083595E-126d + "'", double2 == 1.9615942923083595E-126d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2526");
        double double2 = JavaAlgorithms.calculateTax(3.3424311320587336E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.684862264117467E-141d + "'", double2 == 6.684862264117467E-141d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2527");
        double double2 = JavaAlgorithms.calculateTax(7.25840173164026E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.451680346328052E-117d + "'", double2 == 1.451680346328052E-117d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2528");
        double double2 = JavaAlgorithms.calculateTax(2.619010934097002E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.238021868194004E-118d + "'", double2 == 5.238021868194004E-118d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2529");
        double double2 = JavaAlgorithms.calculateTax(4.536501082275162E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.073002164550323E-115d + "'", double2 == 9.073002164550323E-115d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2530");
        double double2 = JavaAlgorithms.calculateTax(1.451680346328052E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9033606926561043E-118d + "'", double2 == 2.9033606926561043E-118d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2531");
        double double2 = JavaAlgorithms.calculateTax(6.684862264117467E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3369724528234935E-141d + "'", double2 == 1.3369724528234935E-141d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2532");
        double double2 = JavaAlgorithms.calculateTax(6.684862264117467E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3369724528234935E-141d + "'", double2 == 1.3369724528234935E-141d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2533");
        double double2 = JavaAlgorithms.calculateTax(4.676805239458935E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.35361047891787E-115d + "'", double2 == 9.35361047891787E-115d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2534");
        double double2 = JavaAlgorithms.calculateTax(7.25840173164026E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.451680346328052E-117d + "'", double2 == 1.451680346328052E-117d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2535");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567149E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134299E-119d + "'", double2 == 7.482888383134299E-119d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2536");
        double double2 = JavaAlgorithms.calculateTax(2.9033606926561043E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.806721385312208E-119d + "'", double2 == 5.806721385312208E-119d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2537");
        double double2 = JavaAlgorithms.calculateTax(9.35361047891787E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835742E-115d + "'", double2 == 1.8707220957835742E-115d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2538");
        double double2 = JavaAlgorithms.calculateTax(5.806721385312208E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1613442770624417E-119d + "'", double2 == 1.1613442770624417E-119d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2539");
        double double2 = JavaAlgorithms.calculateTax(5.806721385312208E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1613442770624417E-119d + "'", double2 == 1.1613442770624417E-119d);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2540");
        double double2 = JavaAlgorithms.calculateTax(1.8146004329100648E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6292008658201296E-116d + "'", double2 == 3.6292008658201296E-116d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2541");
        double double2 = JavaAlgorithms.calculateTax(9.073002164550323E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8146004329100648E-115d + "'", double2 == 1.8146004329100648E-115d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2542");
        double double2 = JavaAlgorithms.calculateTax(3.064991081731811E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463623E-127d + "'", double2 == 6.129982163463623E-127d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2543");
        double double2 = JavaAlgorithms.calculateTax(3.6292008658201296E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.25840173164026E-117d + "'", double2 == 7.25840173164026E-117d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2544");
        double double2 = JavaAlgorithms.calculateTax(1.0476043736388009E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.095208747277602E-119d + "'", double2 == 2.095208747277602E-119d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2545");
        double double2 = JavaAlgorithms.calculateTax(2.9033606926561043E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.806721385312208E-119d + "'", double2 == 5.806721385312208E-119d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2546");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835742E-115d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567149E-116d + "'", double2 == 3.741444191567149E-116d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2547");
        double double2 = JavaAlgorithms.calculateTax(1.6712155660293668E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3424311320587336E-140d + "'", double2 == 3.3424311320587336E-140d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2548");
        double double2 = JavaAlgorithms.calculateTax(1.9615942923083595E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.923188584616719E-127d + "'", double2 == 3.923188584616719E-127d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2549");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567149E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134298E-117d + "'", double2 == 7.482888383134298E-117d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2550");
        double double2 = JavaAlgorithms.calculateTax(1.1613442770624417E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3226885541248835E-120d + "'", double2 == 2.3226885541248835E-120d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2551");
        double double2 = JavaAlgorithms.calculateTax(1.3095054670485008E-116d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.619010934097002E-117d + "'", double2 == 2.619010934097002E-117d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2552");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927247E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854494E-128d + "'", double2 == 2.4519928653854494E-128d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2553");
        double double2 = JavaAlgorithms.calculateTax(1.0476043736388009E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.095208747277602E-119d + "'", double2 == 2.095208747277602E-119d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2554");
        double double2 = JavaAlgorithms.calculateTax(2.095208747277602E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1904174945552044E-120d + "'", double2 == 4.1904174945552044E-120d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2555");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134299E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.49657767662686E-119d + "'", double2 == 1.49657767662686E-119d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2556");
        double double2 = JavaAlgorithms.calculateTax(1.1692013098647338E-114d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3384026197294676E-115d + "'", double2 == 2.3384026197294676E-115d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2557");
        double double2 = JavaAlgorithms.calculateTax(9.35361047891787E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8707220957835742E-115d + "'", double2 == 1.8707220957835742E-115d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2558");
        double double2 = JavaAlgorithms.calculateTax(2.095208747277602E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1904174945552044E-120d + "'", double2 == 4.1904174945552044E-120d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2559");
        double double2 = JavaAlgorithms.calculateTax(1.1613442770624417E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3226885541248835E-120d + "'", double2 == 2.3226885541248835E-120d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2560");
        double double2 = JavaAlgorithms.calculateTax(3.831238852164762E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329525E-121d + "'", double2 == 7.662477704329525E-121d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2561");
        double double2 = JavaAlgorithms.calculateTax(1.49657767662686E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99315535325372E-120d + "'", double2 == 2.99315535325372E-120d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2562");
        double double2 = JavaAlgorithms.calculateTax(1.8707220957835742E-115d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.741444191567149E-116d + "'", double2 == 3.741444191567149E-116d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2563");
        double double2 = JavaAlgorithms.calculateTax(1.49657767662686E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99315535325372E-120d + "'", double2 == 2.99315535325372E-120d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2564");
        double double2 = JavaAlgorithms.calculateTax(3.923188584616719E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.846377169233439E-128d + "'", double2 == 7.846377169233439E-128d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2565");
        double double2 = JavaAlgorithms.calculateTax(2.99315535325372E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9863107065074405E-121d + "'", double2 == 5.9863107065074405E-121d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2566");
        double double2 = JavaAlgorithms.calculateTax(7.846377169233439E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5692754338466879E-128d + "'", double2 == 1.5692754338466879E-128d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2567");
        double double2 = JavaAlgorithms.calculateTax(7.846377169233439E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5692754338466879E-128d + "'", double2 == 1.5692754338466879E-128d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2568");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854494E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.903985730770899E-129d + "'", double2 == 4.903985730770899E-129d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2569");
        double double2 = JavaAlgorithms.calculateTax(2.99315535325372E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9863107065074405E-121d + "'", double2 == 5.9863107065074405E-121d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2570");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854494E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.903985730770899E-129d + "'", double2 == 4.903985730770899E-129d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2571");
        double double2 = JavaAlgorithms.calculateTax(5.9863107065074405E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1972621413014882E-121d + "'", double2 == 1.1972621413014882E-121d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2572");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134298E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4965776766268596E-117d + "'", double2 == 1.4965776766268596E-117d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2573");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134298E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4965776766268596E-117d + "'", double2 == 1.4965776766268596E-117d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2574");
        double double2 = JavaAlgorithms.calculateTax(4.903985730770899E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.807971461541799E-130d + "'", double2 == 9.807971461541799E-130d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2575");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567149E-116d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134298E-117d + "'", double2 == 7.482888383134298E-117d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2576");
        double double2 = JavaAlgorithms.calculateTax(1.4965776766268596E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9931553532537196E-118d + "'", double2 == 2.9931553532537196E-118d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2577");
        double double2 = JavaAlgorithms.calculateTax(4.1904174945552044E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.38083498911041E-121d + "'", double2 == 8.38083498911041E-121d);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2578");
        double double2 = JavaAlgorithms.calculateTax(9.807971461541799E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.96159429230836E-130d + "'", double2 == 1.96159429230836E-130d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2579");
        double double2 = JavaAlgorithms.calculateTax(8.356077830146833E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6712155660293668E-139d + "'", double2 == 1.6712155660293668E-139d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2580");
        double double2 = JavaAlgorithms.calculateTax(1.3369724528234935E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.673944905646987E-142d + "'", double2 == 2.673944905646987E-142d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2581");
        double double2 = JavaAlgorithms.calculateTax(5.9863107065074405E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1972621413014882E-121d + "'", double2 == 1.1972621413014882E-121d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2582");
        double double2 = JavaAlgorithms.calculateTax(2.3226885541248835E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.645377108249767E-121d + "'", double2 == 4.645377108249767E-121d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2583");
        double double2 = JavaAlgorithms.calculateTax(9.807971461541799E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.96159429230836E-130d + "'", double2 == 1.96159429230836E-130d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2584");
        double double2 = JavaAlgorithms.calculateTax(2.673944905646987E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.347889811293974E-143d + "'", double2 == 5.347889811293974E-143d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2585");
        double double2 = JavaAlgorithms.calculateTax(4.645377108249767E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.290754216499536E-122d + "'", double2 == 9.290754216499536E-122d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2586");
        double double2 = JavaAlgorithms.calculateTax(4.1780389150734166E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.356077830146833E-139d + "'", double2 == 8.356077830146833E-139d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2587");
        double double2 = JavaAlgorithms.calculateTax(1.4965776766268596E-117d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9931553532537196E-118d + "'", double2 == 2.9931553532537196E-118d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2588");
        double double2 = JavaAlgorithms.calculateTax(1.5692754338466879E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.138550867693376E-129d + "'", double2 == 3.138550867693376E-129d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2589");
        double double2 = JavaAlgorithms.calculateTax(1.5692754338466879E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.138550867693376E-129d + "'", double2 == 3.138550867693376E-129d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2590");
        double double2 = JavaAlgorithms.calculateTax(3.923188584616719E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.846377169233439E-128d + "'", double2 == 7.846377169233439E-128d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2591");
        double double2 = JavaAlgorithms.calculateTax(5.347889811293974E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0695779622587949E-143d + "'", double2 == 1.0695779622587949E-143d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2592");
        double double2 = JavaAlgorithms.calculateTax(4.903985730770899E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.807971461541799E-130d + "'", double2 == 9.807971461541799E-130d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2593");
        double double2 = JavaAlgorithms.calculateTax(2.3226885541248835E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.645377108249767E-121d + "'", double2 == 4.645377108249767E-121d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2594");
        double double2 = JavaAlgorithms.calculateTax(5.238021868194004E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0476043736388009E-118d + "'", double2 == 1.0476043736388009E-118d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2595");
        double double2 = JavaAlgorithms.calculateTax(1.96159429230836E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.92318858461672E-131d + "'", double2 == 3.92318858461672E-131d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2596");
        double double2 = JavaAlgorithms.calculateTax(4.676805239458935E-114d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.35361047891787E-115d + "'", double2 == 9.35361047891787E-115d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2597");
        double double2 = JavaAlgorithms.calculateTax(3.138550867693376E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386752E-130d + "'", double2 == 6.277101735386752E-130d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2598");
        double double2 = JavaAlgorithms.calculateTax(3.138550867693376E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386752E-130d + "'", double2 == 6.277101735386752E-130d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2599");
        double double2 = JavaAlgorithms.calculateTax(2.9931553532537196E-118d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.98631070650744E-119d + "'", double2 == 5.98631070650744E-119d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2600");
        double double2 = JavaAlgorithms.calculateTax(5.347889811293974E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0695779622587949E-143d + "'", double2 == 1.0695779622587949E-143d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2601");
        double double2 = JavaAlgorithms.calculateTax(1.0695779622587949E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.13915592451759E-144d + "'", double2 == 2.13915592451759E-144d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2602");
        double double2 = JavaAlgorithms.calculateTax(1.96159429230836E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.92318858461672E-131d + "'", double2 == 3.92318858461672E-131d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2603");
        double double2 = JavaAlgorithms.calculateTax(3.92318858461672E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.846377169233441E-132d + "'", double2 == 7.846377169233441E-132d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2604");
        double double2 = JavaAlgorithms.calculateTax(4.1904174945552044E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.38083498911041E-121d + "'", double2 == 8.38083498911041E-121d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2605");
        double double2 = JavaAlgorithms.calculateTax(2.13915592451759E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.27831184903518E-145d + "'", double2 == 4.27831184903518E-145d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2606");
        double double2 = JavaAlgorithms.calculateTax(1.451680346328052E-117d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9033606926561043E-118d + "'", double2 == 2.9033606926561043E-118d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2607");
        double double2 = JavaAlgorithms.calculateTax(3.92318858461672E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.846377169233441E-132d + "'", double2 == 7.846377169233441E-132d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2608");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386752E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773505E-130d + "'", double2 == 1.2554203470773505E-130d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2609");
        double double2 = JavaAlgorithms.calculateTax(1.0695779622587949E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.13915592451759E-144d + "'", double2 == 2.13915592451759E-144d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2610");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773505E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.510840694154701E-131d + "'", double2 == 2.510840694154701E-131d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2611");
        double double2 = JavaAlgorithms.calculateTax(4.27831184903518E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.55662369807036E-146d + "'", double2 == 8.55662369807036E-146d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2612");
        double double2 = JavaAlgorithms.calculateTax(1.1972621413014882E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029766E-122d + "'", double2 == 2.3945242826029766E-122d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2613");
        double double2 = JavaAlgorithms.calculateTax(5.98631070650744E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.197262141301488E-119d + "'", double2 == 1.197262141301488E-119d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2614");
        double double2 = JavaAlgorithms.calculateTax(8.55662369807036E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.711324739614072E-146d + "'", double2 == 1.711324739614072E-146d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2615");
        double double2 = JavaAlgorithms.calculateTax(1.711324739614072E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.422649479228144E-147d + "'", double2 == 3.422649479228144E-147d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2616");
        double double2 = JavaAlgorithms.calculateTax(5.98631070650744E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.197262141301488E-119d + "'", double2 == 1.197262141301488E-119d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2617");
        double double2 = JavaAlgorithms.calculateTax(2.13915592451759E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.27831184903518E-145d + "'", double2 == 4.27831184903518E-145d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2618");
        double double2 = JavaAlgorithms.calculateTax(9.290754216499536E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8581508432999073E-122d + "'", double2 == 1.8581508432999073E-122d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2619");
        double double2 = JavaAlgorithms.calculateTax(9.290754216499536E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8581508432999073E-122d + "'", double2 == 1.8581508432999073E-122d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2620");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386752E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773505E-130d + "'", double2 == 1.2554203470773505E-130d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2621");
        double double2 = JavaAlgorithms.calculateTax(1.8581508432999073E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.716301686599815E-123d + "'", double2 == 3.716301686599815E-123d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2622");
        double double2 = JavaAlgorithms.calculateTax(2.673944905646987E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.347889811293974E-143d + "'", double2 == 5.347889811293974E-143d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2623");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029766E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205954E-123d + "'", double2 == 4.789048565205954E-123d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2624");
        double double2 = JavaAlgorithms.calculateTax(3.741444191567149E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.482888383134299E-119d + "'", double2 == 7.482888383134299E-119d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2625");
        double double2 = JavaAlgorithms.calculateTax(8.55662369807036E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.711324739614072E-146d + "'", double2 == 1.711324739614072E-146d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2626");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029766E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205954E-123d + "'", double2 == 4.789048565205954E-123d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2627");
        double double2 = JavaAlgorithms.calculateTax(3.422649479228144E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.845298958456288E-148d + "'", double2 == 6.845298958456288E-148d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2628");
        double double2 = JavaAlgorithms.calculateTax(2.510840694154701E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.021681388309402E-132d + "'", double2 == 5.021681388309402E-132d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2629");
        double double2 = JavaAlgorithms.calculateTax(1.3369724528234935E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.673944905646987E-142d + "'", double2 == 2.673944905646987E-142d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2630");
        double double2 = JavaAlgorithms.calculateTax(5.021681388309402E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618805E-132d + "'", double2 == 1.0043362776618805E-132d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2631");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205954E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411908E-124d + "'", double2 == 9.578097130411908E-124d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2632");
        double double2 = JavaAlgorithms.calculateTax(3.422649479228144E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.845298958456288E-148d + "'", double2 == 6.845298958456288E-148d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2633");
        double double2 = JavaAlgorithms.calculateTax(6.845298958456288E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3690597916912577E-148d + "'", double2 == 1.3690597916912577E-148d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2634");
        double double2 = JavaAlgorithms.calculateTax(5.021681388309402E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618805E-132d + "'", double2 == 1.0043362776618805E-132d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2635");
        double double2 = JavaAlgorithms.calculateTax(7.846377169233441E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569275433846688E-132d + "'", double2 == 1.569275433846688E-132d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2636");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411908E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9156194260823816E-124d + "'", double2 == 1.9156194260823816E-124d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2637");
        double double2 = JavaAlgorithms.calculateTax(8.38083498911041E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.676166997822082E-121d + "'", double2 == 1.676166997822082E-121d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2638");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618805E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.008672555323761E-133d + "'", double2 == 2.008672555323761E-133d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2639");
        double double2 = JavaAlgorithms.calculateTax(1.711324739614072E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.422649479228144E-147d + "'", double2 == 3.422649479228144E-147d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2640");
        double double2 = JavaAlgorithms.calculateTax(1.197262141301488E-119d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029762E-120d + "'", double2 == 2.3945242826029762E-120d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2641");
        double double2 = JavaAlgorithms.calculateTax(1.9156194260823816E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8312388521647634E-125d + "'", double2 == 3.8312388521647634E-125d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2642");
        double double2 = JavaAlgorithms.calculateTax(2.008672555323761E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0173451106475223E-134d + "'", double2 == 4.0173451106475223E-134d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2643");
        double double2 = JavaAlgorithms.calculateTax(2.9931553532537196E-118d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.98631070650744E-119d + "'", double2 == 5.98631070650744E-119d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2644");
        double double2 = JavaAlgorithms.calculateTax(8.38083498911041E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.676166997822082E-121d + "'", double2 == 1.676166997822082E-121d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2645");
        double double2 = JavaAlgorithms.calculateTax(3.3424311320587336E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.684862264117467E-141d + "'", double2 == 6.684862264117467E-141d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2646");
        double double2 = JavaAlgorithms.calculateTax(1.8581508432999073E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.716301686599815E-123d + "'", double2 == 3.716301686599815E-123d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2647");
        double double2 = JavaAlgorithms.calculateTax(4.27831184903518E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.55662369807036E-146d + "'", double2 == 8.55662369807036E-146d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2648");
        double double2 = JavaAlgorithms.calculateTax(1.197262141301488E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029762E-120d + "'", double2 == 2.3945242826029762E-120d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2649");
        double double2 = JavaAlgorithms.calculateTax(3.8312388521647634E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329527E-126d + "'", double2 == 7.662477704329527E-126d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2650");
        double double2 = JavaAlgorithms.calculateTax(1.1972621413014882E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3945242826029766E-122d + "'", double2 == 2.3945242826029766E-122d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2651");
        double double2 = JavaAlgorithms.calculateTax(4.0173451106475223E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-135d + "'", double2 == 8.034690221295046E-135d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2652");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329527E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659056E-126d + "'", double2 == 1.5324955408659056E-126d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2653");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.606938044259009E-135d + "'", double2 == 1.606938044259009E-135d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2654");
        double double2 = JavaAlgorithms.calculateTax(7.482888383134299E-119d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.49657767662686E-119d + "'", double2 == 1.49657767662686E-119d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2655");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659056E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0649910817318115E-127d + "'", double2 == 3.0649910817318115E-127d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2656");
        double double2 = JavaAlgorithms.calculateTax(1.606938044259009E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.213876088518018E-136d + "'", double2 == 3.213876088518018E-136d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2657");
        double double2 = JavaAlgorithms.calculateTax(1.676166997822082E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.352333995644164E-122d + "'", double2 == 3.352333995644164E-122d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2658");
        double double2 = JavaAlgorithms.calculateTax(3.716301686599815E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.43260337319963E-124d + "'", double2 == 7.43260337319963E-124d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2659");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659056E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0649910817318115E-127d + "'", double2 == 3.0649910817318115E-127d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2660");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618805E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.008672555323761E-133d + "'", double2 == 2.008672555323761E-133d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2661");
        double double2 = JavaAlgorithms.calculateTax(2.510840694154701E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.021681388309402E-132d + "'", double2 == 5.021681388309402E-132d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2662");
        double double2 = JavaAlgorithms.calculateTax(7.846377169233441E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569275433846688E-132d + "'", double2 == 1.569275433846688E-132d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2663");
        double double2 = JavaAlgorithms.calculateTax(1.676166997822082E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.352333995644164E-122d + "'", double2 == 3.352333995644164E-122d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2664");
        double double2 = JavaAlgorithms.calculateTax(3.213876088518018E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036036E-137d + "'", double2 == 6.427752177036036E-137d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2665");
        double double2 = JavaAlgorithms.calculateTax(1.9156194260823816E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8312388521647634E-125d + "'", double2 == 3.8312388521647634E-125d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2666");
        double double2 = JavaAlgorithms.calculateTax(3.213876088518018E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036036E-137d + "'", double2 == 6.427752177036036E-137d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2667");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029762E-120d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205953E-121d + "'", double2 == 4.789048565205953E-121d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2668");
        double double2 = JavaAlgorithms.calculateTax(7.43260337319963E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.486520674639926E-124d + "'", double2 == 1.486520674639926E-124d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2669");
        double double2 = JavaAlgorithms.calculateTax(2.008672555323761E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0173451106475223E-134d + "'", double2 == 4.0173451106475223E-134d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2670");
        double double2 = JavaAlgorithms.calculateTax(4.645377108249767E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.290754216499536E-122d + "'", double2 == 9.290754216499536E-122d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2671");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.606938044259009E-135d + "'", double2 == 1.606938044259009E-135d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2672");
        double double2 = JavaAlgorithms.calculateTax(3.352333995644164E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.704667991288328E-123d + "'", double2 == 6.704667991288328E-123d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2673");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329527E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659056E-126d + "'", double2 == 1.5324955408659056E-126d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2674");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036036E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072074E-137d + "'", double2 == 1.2855504354072074E-137d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2675");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773505E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.510840694154701E-131d + "'", double2 == 2.510840694154701E-131d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2676");
        double double2 = JavaAlgorithms.calculateTax(1.606938044259009E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.213876088518018E-136d + "'", double2 == 3.213876088518018E-136d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2677");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411908E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9156194260823816E-124d + "'", double2 == 1.9156194260823816E-124d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2678");
        double double2 = JavaAlgorithms.calculateTax(1.569275433846688E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1385508676933764E-133d + "'", double2 == 3.1385508676933764E-133d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2679");
        double double2 = JavaAlgorithms.calculateTax(6.704667991288328E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3409335982576657E-123d + "'", double2 == 1.3409335982576657E-123d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2680");
        double double2 = JavaAlgorithms.calculateTax(3.352333995644164E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.704667991288328E-123d + "'", double2 == 6.704667991288328E-123d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2681");
        double double2 = JavaAlgorithms.calculateTax(3.716301686599815E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.43260337319963E-124d + "'", double2 == 7.43260337319963E-124d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2682");
        double double2 = JavaAlgorithms.calculateTax(3.0649910817318115E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463623E-128d + "'", double2 == 6.129982163463623E-128d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2683");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205953E-121d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411906E-122d + "'", double2 == 9.578097130411906E-122d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2684");
        double double2 = JavaAlgorithms.calculateTax(3.8312388521647634E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329527E-126d + "'", double2 == 7.662477704329527E-126d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2685");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205954E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411908E-124d + "'", double2 == 9.578097130411908E-124d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2686");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036036E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072074E-137d + "'", double2 == 1.2855504354072074E-137d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2687");
        double double2 = JavaAlgorithms.calculateTax(1.3409335982576657E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.681867196515332E-124d + "'", double2 == 2.681867196515332E-124d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2688");
        double double2 = JavaAlgorithms.calculateTax(6.704667991288328E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3409335982576657E-123d + "'", double2 == 1.3409335982576657E-123d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2689");
        double double2 = JavaAlgorithms.calculateTax(2.681867196515332E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.363734393030664E-125d + "'", double2 == 5.363734393030664E-125d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2690");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072074E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5711008708144148E-138d + "'", double2 == 2.5711008708144148E-138d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2691");
        double double2 = JavaAlgorithms.calculateTax(2.3945242826029762E-120d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.789048565205953E-121d + "'", double2 == 4.789048565205953E-121d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2692");
        double double2 = JavaAlgorithms.calculateTax(2.5711008708144148E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.14220174162883E-139d + "'", double2 == 5.14220174162883E-139d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2693");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072074E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5711008708144148E-138d + "'", double2 == 2.5711008708144148E-138d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2694");
        double double2 = JavaAlgorithms.calculateTax(2.681867196515332E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.363734393030664E-125d + "'", double2 == 5.363734393030664E-125d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2695");
        double double2 = JavaAlgorithms.calculateTax(3.0649910817318115E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463623E-128d + "'", double2 == 6.129982163463623E-128d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2696");
        double double2 = JavaAlgorithms.calculateTax(4.789048565205953E-121d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.578097130411906E-122d + "'", double2 == 9.578097130411906E-122d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2697");
        double double2 = JavaAlgorithms.calculateTax(1.486520674639926E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9730413492798524E-125d + "'", double2 == 2.9730413492798524E-125d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2698");
        double double2 = JavaAlgorithms.calculateTax(5.363734393030664E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0727468786061329E-125d + "'", double2 == 1.0727468786061329E-125d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2699");
        double double2 = JavaAlgorithms.calculateTax(3.1385508676933764E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386753E-134d + "'", double2 == 6.277101735386753E-134d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2700");
        double double2 = JavaAlgorithms.calculateTax(2.9730413492798524E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.946082698559705E-126d + "'", double2 == 5.946082698559705E-126d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2701");
        double double2 = JavaAlgorithms.calculateTax(5.14220174162883E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.028440348325766E-139d + "'", double2 == 1.028440348325766E-139d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2702");
        double double2 = JavaAlgorithms.calculateTax(1.028440348325766E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.056880696651532E-140d + "'", double2 == 2.056880696651532E-140d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2703");
        double double2 = JavaAlgorithms.calculateTax(1.486520674639926E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9730413492798524E-125d + "'", double2 == 2.9730413492798524E-125d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2704");
        double double2 = JavaAlgorithms.calculateTax(2.056880696651532E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.113761393303064E-141d + "'", double2 == 4.113761393303064E-141d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2705");
        double double2 = JavaAlgorithms.calculateTax(4.113761393303064E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.22752278660613E-142d + "'", double2 == 8.22752278660613E-142d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2706");
        double double2 = JavaAlgorithms.calculateTax(5.946082698559705E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1892165397119412E-126d + "'", double2 == 1.1892165397119412E-126d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2707");
        double double2 = JavaAlgorithms.calculateTax(1.569275433846688E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1385508676933764E-133d + "'", double2 == 3.1385508676933764E-133d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2708");
        double double2 = JavaAlgorithms.calculateTax(1.1892165397119412E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3784330794238825E-127d + "'", double2 == 2.3784330794238825E-127d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2709");
        double double2 = JavaAlgorithms.calculateTax(3.1385508676933764E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386753E-134d + "'", double2 == 6.277101735386753E-134d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2710");
        double double2 = JavaAlgorithms.calculateTax(2.3784330794238825E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.756866158847766E-128d + "'", double2 == 4.756866158847766E-128d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2711");
        double double2 = JavaAlgorithms.calculateTax(2.056880696651532E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.113761393303064E-141d + "'", double2 == 4.113761393303064E-141d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2712");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463623E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927247E-128d + "'", double2 == 1.2259964326927247E-128d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2713");
        double double2 = JavaAlgorithms.calculateTax(1.3690597916912577E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7381195833825155E-149d + "'", double2 == 2.7381195833825155E-149d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2714");
        double double2 = JavaAlgorithms.calculateTax(7.43260337319963E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.486520674639926E-124d + "'", double2 == 1.486520674639926E-124d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2715");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927247E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854495E-129d + "'", double2 == 2.4519928653854495E-129d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2716");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411906E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9156194260823815E-122d + "'", double2 == 1.9156194260823815E-122d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2717");
        double double2 = JavaAlgorithms.calculateTax(1.3690597916912577E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7381195833825155E-149d + "'", double2 == 2.7381195833825155E-149d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2718");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386753E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773507E-134d + "'", double2 == 1.2554203470773507E-134d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2719");
        double double2 = JavaAlgorithms.calculateTax(2.7381195833825155E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.476239166765031E-150d + "'", double2 == 5.476239166765031E-150d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2720");
        double double2 = JavaAlgorithms.calculateTax(4.0173451106475223E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-135d + "'", double2 == 8.034690221295046E-135d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2721");
        double double2 = JavaAlgorithms.calculateTax(4.113761393303064E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.22752278660613E-142d + "'", double2 == 8.22752278660613E-142d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2722");
        double double2 = JavaAlgorithms.calculateTax(1.028440348325766E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.056880696651532E-140d + "'", double2 == 2.056880696651532E-140d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2723");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854495E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9039857307708996E-130d + "'", double2 == 4.9039857307708996E-130d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2724");
        double double2 = JavaAlgorithms.calculateTax(8.22752278660613E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.645504557321226E-142d + "'", double2 == 1.645504557321226E-142d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2725");
        double double2 = JavaAlgorithms.calculateTax(9.578097130411906E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9156194260823815E-122d + "'", double2 == 1.9156194260823815E-122d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2726");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773507E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5108406941547014E-135d + "'", double2 == 2.5108406941547014E-135d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2727");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463623E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927247E-128d + "'", double2 == 1.2259964326927247E-128d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2728");
        double double2 = JavaAlgorithms.calculateTax(5.363734393030664E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0727468786061329E-125d + "'", double2 == 1.0727468786061329E-125d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2729");
        double double2 = JavaAlgorithms.calculateTax(1.645504557321226E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2910091146424522E-143d + "'", double2 == 3.2910091146424522E-143d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2730");
        double double2 = JavaAlgorithms.calculateTax(1.9156194260823815E-122d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.831238852164763E-123d + "'", double2 == 3.831238852164763E-123d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2731");
        double double2 = JavaAlgorithms.calculateTax(1.645504557321226E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2910091146424522E-143d + "'", double2 == 3.2910091146424522E-143d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2732");
        double double2 = JavaAlgorithms.calculateTax(4.9039857307708996E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.8079714615418E-131d + "'", double2 == 9.8079714615418E-131d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2733");
        double double2 = JavaAlgorithms.calculateTax(9.8079714615418E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.96159429230836E-131d + "'", double2 == 1.96159429230836E-131d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2734");
        double double2 = JavaAlgorithms.calculateTax(9.8079714615418E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.96159429230836E-131d + "'", double2 == 1.96159429230836E-131d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2735");
        double double2 = JavaAlgorithms.calculateTax(3.2910091146424522E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.582018229284904E-144d + "'", double2 == 6.582018229284904E-144d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2736");
        double double2 = JavaAlgorithms.calculateTax(2.5108406941547014E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0216813883094035E-136d + "'", double2 == 5.0216813883094035E-136d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2737");
        double double2 = JavaAlgorithms.calculateTax(2.5108406941547014E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0216813883094035E-136d + "'", double2 == 5.0216813883094035E-136d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2738");
        double double2 = JavaAlgorithms.calculateTax(5.476239166765031E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0952478333530063E-150d + "'", double2 == 1.0952478333530063E-150d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2739");
        double double2 = JavaAlgorithms.calculateTax(3.831238852164763E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329526E-124d + "'", double2 == 7.662477704329526E-124d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2740");
        double double2 = JavaAlgorithms.calculateTax(4.756866158847766E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.513732317695532E-129d + "'", double2 == 9.513732317695532E-129d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2741");
        double double2 = JavaAlgorithms.calculateTax(5.14220174162883E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.028440348325766E-139d + "'", double2 == 1.028440348325766E-139d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2742");
        double double2 = JavaAlgorithms.calculateTax(4.9039857307708996E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.8079714615418E-131d + "'", double2 == 9.8079714615418E-131d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2743");
        double double2 = JavaAlgorithms.calculateTax(5.0216813883094035E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618807E-136d + "'", double2 == 1.0043362776618807E-136d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2744");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773507E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5108406941547014E-135d + "'", double2 == 2.5108406941547014E-135d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2745");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854495E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9039857307708996E-130d + "'", double2 == 4.9039857307708996E-130d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2746");
        double double2 = JavaAlgorithms.calculateTax(3.831238852164763E-123d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.662477704329526E-124d + "'", double2 == 7.662477704329526E-124d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2747");
        double double2 = JavaAlgorithms.calculateTax(5.0216813883094035E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618807E-136d + "'", double2 == 1.0043362776618807E-136d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2748");
        double double2 = JavaAlgorithms.calculateTax(2.9730413492798524E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.946082698559705E-126d + "'", double2 == 5.946082698559705E-126d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2749");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329526E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659054E-124d + "'", double2 == 1.5324955408659054E-124d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2750");
        double double2 = JavaAlgorithms.calculateTax(4.756866158847766E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.513732317695532E-129d + "'", double2 == 9.513732317695532E-129d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2751");
        double double2 = JavaAlgorithms.calculateTax(2.7381195833825155E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.476239166765031E-150d + "'", double2 == 5.476239166765031E-150d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2752");
        double double2 = JavaAlgorithms.calculateTax(1.96159429230836E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9231885846167203E-132d + "'", double2 == 3.9231885846167203E-132d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2753");
        double double2 = JavaAlgorithms.calculateTax(5.476239166765031E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0952478333530063E-150d + "'", double2 == 1.0952478333530063E-150d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2754");
        double double2 = JavaAlgorithms.calculateTax(6.582018229284904E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.316403645856981E-144d + "'", double2 == 1.316403645856981E-144d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2755");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386753E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773507E-134d + "'", double2 == 1.2554203470773507E-134d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2756");
        double double2 = JavaAlgorithms.calculateTax(1.316403645856981E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139618E-145d + "'", double2 == 2.6328072917139618E-145d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2757");
        double double2 = JavaAlgorithms.calculateTax(3.9231885846167203E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.84637716923344E-133d + "'", double2 == 7.84637716923344E-133d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2758");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139618E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.265614583427924E-146d + "'", double2 == 5.265614583427924E-146d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2759");
        double double2 = JavaAlgorithms.calculateTax(1.9156194260823815E-122d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.831238852164763E-123d + "'", double2 == 3.831238852164763E-123d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2760");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618807E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0086725553237613E-137d + "'", double2 == 2.0086725553237613E-137d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2761");
        double double2 = JavaAlgorithms.calculateTax(1.1892165397119412E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3784330794238825E-127d + "'", double2 == 2.3784330794238825E-127d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2762");
        double double2 = JavaAlgorithms.calculateTax(7.84637716923344E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5692754338466882E-133d + "'", double2 == 1.5692754338466882E-133d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2763");
        double double2 = JavaAlgorithms.calculateTax(5.946082698559705E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1892165397119412E-126d + "'", double2 == 1.1892165397119412E-126d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2764");
        double double2 = JavaAlgorithms.calculateTax(1.5692754338466882E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1385508676933766E-134d + "'", double2 == 3.1385508676933766E-134d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2765");
        double double2 = JavaAlgorithms.calculateTax(1.5692754338466882E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1385508676933766E-134d + "'", double2 == 3.1385508676933766E-134d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2766");
        double double2 = JavaAlgorithms.calculateTax(2.3784330794238825E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.756866158847766E-128d + "'", double2 == 4.756866158847766E-128d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2767");
        double double2 = JavaAlgorithms.calculateTax(2.0086725553237613E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.017345110647523E-138d + "'", double2 == 4.017345110647523E-138d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2768");
        double double2 = JavaAlgorithms.calculateTax(7.84637716923344E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5692754338466882E-133d + "'", double2 == 1.5692754338466882E-133d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2769");
        double double2 = JavaAlgorithms.calculateTax(7.662477704329526E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5324955408659054E-124d + "'", double2 == 1.5324955408659054E-124d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2770");
        double double2 = JavaAlgorithms.calculateTax(1.3409335982576657E-123d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.681867196515332E-124d + "'", double2 == 2.681867196515332E-124d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2771");
        double double2 = JavaAlgorithms.calculateTax(3.2910091146424522E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.582018229284904E-144d + "'", double2 == 6.582018229284904E-144d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2772");
        double double2 = JavaAlgorithms.calculateTax(6.582018229284904E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.316403645856981E-144d + "'", double2 == 1.316403645856981E-144d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2773");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659054E-124d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.064991081731811E-125d + "'", double2 == 3.064991081731811E-125d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2774");
        double double2 = JavaAlgorithms.calculateTax(3.1385508676933766E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386753E-135d + "'", double2 == 6.277101735386753E-135d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2775");
        double double2 = JavaAlgorithms.calculateTax(1.0727468786061329E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1454937572122657E-126d + "'", double2 == 2.1454937572122657E-126d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2776");
        double double2 = JavaAlgorithms.calculateTax(9.513732317695532E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9027464635391066E-129d + "'", double2 == 1.9027464635391066E-129d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2777");
        double double2 = JavaAlgorithms.calculateTax(5.265614583427924E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0531229166855848E-146d + "'", double2 == 1.0531229166855848E-146d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2778");
        double double2 = JavaAlgorithms.calculateTax(3.1385508676933766E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386753E-135d + "'", double2 == 6.277101735386753E-135d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2779");
        double double2 = JavaAlgorithms.calculateTax(1.96159429230836E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9231885846167203E-132d + "'", double2 == 3.9231885846167203E-132d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2780");
        double double2 = JavaAlgorithms.calculateTax(6.845298958456288E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3690597916912577E-148d + "'", double2 == 1.3690597916912577E-148d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2781");
        double double2 = JavaAlgorithms.calculateTax(1.316403645856981E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139618E-145d + "'", double2 == 2.6328072917139618E-145d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2782");
        double double2 = JavaAlgorithms.calculateTax(2.5711008708144148E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.14220174162883E-139d + "'", double2 == 5.14220174162883E-139d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2783");
        double double2 = JavaAlgorithms.calculateTax(1.0727468786061329E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1454937572122657E-126d + "'", double2 == 2.1454937572122657E-126d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2784");
        double double2 = JavaAlgorithms.calculateTax(1.9027464635391066E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8054929270782135E-130d + "'", double2 == 3.8054929270782135E-130d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2785");
        double double2 = JavaAlgorithms.calculateTax(2.1454937572122657E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.290987514424531E-127d + "'", double2 == 4.290987514424531E-127d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2786");
        double double2 = JavaAlgorithms.calculateTax(2.0086725553237613E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.017345110647523E-138d + "'", double2 == 4.017345110647523E-138d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2787");
        double double2 = JavaAlgorithms.calculateTax(4.290987514424531E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.581975028849062E-128d + "'", double2 == 8.581975028849062E-128d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2788");
        double double2 = JavaAlgorithms.calculateTax(1.5324955408659054E-124d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.064991081731811E-125d + "'", double2 == 3.064991081731811E-125d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2789");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618807E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0086725553237613E-137d + "'", double2 == 2.0086725553237613E-137d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2790");
        double double2 = JavaAlgorithms.calculateTax(1.0531229166855848E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1062458333711698E-147d + "'", double2 == 2.1062458333711698E-147d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2791");
        double double2 = JavaAlgorithms.calculateTax(3.8054929270782135E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.610985854156427E-131d + "'", double2 == 7.610985854156427E-131d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2792");
        double double2 = JavaAlgorithms.calculateTax(2.1062458333711698E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.21249166674234E-148d + "'", double2 == 4.21249166674234E-148d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2793");
        double double2 = JavaAlgorithms.calculateTax(1.9027464635391066E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8054929270782135E-130d + "'", double2 == 3.8054929270782135E-130d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2794");
        double double2 = JavaAlgorithms.calculateTax(1.0531229166855848E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1062458333711698E-147d + "'", double2 == 2.1062458333711698E-147d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2795");
        double double2 = JavaAlgorithms.calculateTax(4.21249166674234E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.42498333348468E-149d + "'", double2 == 8.42498333348468E-149d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2796");
        double double2 = JavaAlgorithms.calculateTax(8.42498333348468E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969361E-149d + "'", double2 == 1.6849966666969361E-149d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2797");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969361E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938724E-150d + "'", double2 == 3.3699933333938724E-150d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2798");
        double double2 = JavaAlgorithms.calculateTax(3.8054929270782135E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.610985854156427E-131d + "'", double2 == 7.610985854156427E-131d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2799");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927247E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854495E-129d + "'", double2 == 2.4519928653854495E-129d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2800");
        double double2 = JavaAlgorithms.calculateTax(2.1454937572122657E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.290987514424531E-127d + "'", double2 == 4.290987514424531E-127d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2801");
        double double2 = JavaAlgorithms.calculateTax(8.22752278660613E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.645504557321226E-142d + "'", double2 == 1.645504557321226E-142d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2802");
        double double2 = JavaAlgorithms.calculateTax(3.064991081731811E-125d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463622E-126d + "'", double2 == 6.129982163463622E-126d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2803");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463622E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927246E-126d + "'", double2 == 1.2259964326927246E-126d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2804");
        double double2 = JavaAlgorithms.calculateTax(9.513732317695532E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9027464635391066E-129d + "'", double2 == 1.9027464635391066E-129d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2805");
        double double2 = JavaAlgorithms.calculateTax(7.610985854156427E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5221971708312855E-131d + "'", double2 == 1.5221971708312855E-131d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2806");
        double double2 = JavaAlgorithms.calculateTax(4.017345110647523E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-139d + "'", double2 == 8.034690221295046E-139d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2807");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386753E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773507E-135d + "'", double2 == 1.2554203470773507E-135d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2808");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139618E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.265614583427924E-146d + "'", double2 == 5.265614583427924E-146d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2809");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927246E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854494E-127d + "'", double2 == 2.4519928653854494E-127d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2810");
        double double2 = JavaAlgorithms.calculateTax(8.581975028849062E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7163950057698126E-128d + "'", double2 == 1.7163950057698126E-128d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2811");
        double double2 = JavaAlgorithms.calculateTax(1.0952478333530063E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1904956667060128E-151d + "'", double2 == 2.1904956667060128E-151d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2812");
        double double2 = JavaAlgorithms.calculateTax(1.2259964326927246E-126d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4519928653854494E-127d + "'", double2 == 2.4519928653854494E-127d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2813");
        double double2 = JavaAlgorithms.calculateTax(7.610985854156427E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5221971708312855E-131d + "'", double2 == 1.5221971708312855E-131d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2814");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854494E-127d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.903985730770899E-128d + "'", double2 == 4.903985730770899E-128d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2815");
        double double2 = JavaAlgorithms.calculateTax(4.290987514424531E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.581975028849062E-128d + "'", double2 == 8.581975028849062E-128d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2816");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386753E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773507E-135d + "'", double2 == 1.2554203470773507E-135d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2817");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6069380442590093E-139d + "'", double2 == 1.6069380442590093E-139d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2818");
        double double2 = JavaAlgorithms.calculateTax(1.6069380442590093E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2138760885180187E-140d + "'", double2 == 3.2138760885180187E-140d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2819");
        double double2 = JavaAlgorithms.calculateTax(3.2138760885180187E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036038E-141d + "'", double2 == 6.427752177036038E-141d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2820");
        double double2 = JavaAlgorithms.calculateTax(1.6069380442590093E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2138760885180187E-140d + "'", double2 == 3.2138760885180187E-140d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2821");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6069380442590093E-139d + "'", double2 == 1.6069380442590093E-139d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2822");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773507E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5108406941547018E-136d + "'", double2 == 2.5108406941547018E-136d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2823");
        double double2 = JavaAlgorithms.calculateTax(3.064991081731811E-125d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.129982163463622E-126d + "'", double2 == 6.129982163463622E-126d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2824");
        double double2 = JavaAlgorithms.calculateTax(5.265614583427924E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0531229166855848E-146d + "'", double2 == 1.0531229166855848E-146d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2825");
        double double2 = JavaAlgorithms.calculateTax(8.42498333348468E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969361E-149d + "'", double2 == 1.6849966666969361E-149d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2826");
        double double2 = JavaAlgorithms.calculateTax(2.4519928653854494E-127d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.903985730770899E-128d + "'", double2 == 4.903985730770899E-128d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2827");
        double double2 = JavaAlgorithms.calculateTax(4.21249166674234E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.42498333348468E-149d + "'", double2 == 8.42498333348468E-149d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2828");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969361E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938724E-150d + "'", double2 == 3.3699933333938724E-150d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2829");
        double double2 = JavaAlgorithms.calculateTax(2.1062458333711698E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.21249166674234E-148d + "'", double2 == 4.21249166674234E-148d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2830");
        double double2 = JavaAlgorithms.calculateTax(3.2138760885180187E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036038E-141d + "'", double2 == 6.427752177036038E-141d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2831");
        double double2 = JavaAlgorithms.calculateTax(1.0952478333530063E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1904956667060128E-151d + "'", double2 == 2.1904956667060128E-151d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2832");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773507E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5108406941547018E-136d + "'", double2 == 2.5108406941547018E-136d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2833");
        double double2 = JavaAlgorithms.calculateTax(1.7163950057698126E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4327900115396255E-129d + "'", double2 == 3.4327900115396255E-129d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2834");
        double double2 = JavaAlgorithms.calculateTax(1.7163950057698126E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4327900115396255E-129d + "'", double2 == 3.4327900115396255E-129d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2835");
        double double2 = JavaAlgorithms.calculateTax(8.581975028849062E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7163950057698126E-128d + "'", double2 == 1.7163950057698126E-128d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2836");
        double double2 = JavaAlgorithms.calculateTax(4.903985730770899E-128d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.807971461541798E-129d + "'", double2 == 9.807971461541798E-129d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2837");
        double double2 = JavaAlgorithms.calculateTax(6.129982163463622E-126d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2259964326927246E-126d + "'", double2 == 1.2259964326927246E-126d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2838");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938724E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787745E-151d + "'", double2 == 6.739986666787745E-151d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2839");
        double double2 = JavaAlgorithms.calculateTax(2.1904956667060128E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.380991333412026E-152d + "'", double2 == 4.380991333412026E-152d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2840");
        double double2 = JavaAlgorithms.calculateTax(4.903985730770899E-128d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.807971461541798E-129d + "'", double2 == 9.807971461541798E-129d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2841");
        double double2 = JavaAlgorithms.calculateTax(9.807971461541798E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9615942923083598E-129d + "'", double2 == 1.9615942923083598E-129d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2842");
        double double2 = JavaAlgorithms.calculateTax(2.1904956667060128E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.380991333412026E-152d + "'", double2 == 4.380991333412026E-152d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2843");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787745E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.347997333357549E-151d + "'", double2 == 1.347997333357549E-151d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2844");
        double double2 = JavaAlgorithms.calculateTax(2.5108406941547018E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.021681388309403E-137d + "'", double2 == 5.021681388309403E-137d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2845");
        double double2 = JavaAlgorithms.calculateTax(1.5221971708312855E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0443943416625714E-132d + "'", double2 == 3.0443943416625714E-132d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2846");
        double double2 = JavaAlgorithms.calculateTax(3.0443943416625714E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.088788683325143E-133d + "'", double2 == 6.088788683325143E-133d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2847");
        double double2 = JavaAlgorithms.calculateTax(4.380991333412026E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.761982666824052E-153d + "'", double2 == 8.761982666824052E-153d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2848");
        double double2 = JavaAlgorithms.calculateTax(3.4327900115396255E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.8655800230792515E-130d + "'", double2 == 6.8655800230792515E-130d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2849");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036038E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072076E-141d + "'", double2 == 1.2855504354072076E-141d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2850");
        double double2 = JavaAlgorithms.calculateTax(9.807971461541798E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9615942923083598E-129d + "'", double2 == 1.9615942923083598E-129d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2851");
        double double2 = JavaAlgorithms.calculateTax(1.9615942923083598E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.92318858461672E-130d + "'", double2 == 3.92318858461672E-130d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2852");
        double double2 = JavaAlgorithms.calculateTax(5.021681388309403E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618807E-137d + "'", double2 == 1.0043362776618807E-137d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2853");
        double double2 = JavaAlgorithms.calculateTax(8.761982666824052E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7523965333648107E-153d + "'", double2 == 1.7523965333648107E-153d);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2854");
        double double2 = JavaAlgorithms.calculateTax(6.088788683325143E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2177577366650286E-133d + "'", double2 == 1.2177577366650286E-133d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2855");
        double double2 = JavaAlgorithms.calculateTax(6.8655800230792515E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3731160046158503E-130d + "'", double2 == 1.3731160046158503E-130d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2856");
        double double2 = JavaAlgorithms.calculateTax(1.2177577366650286E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4355154733300573E-134d + "'", double2 == 2.4355154733300573E-134d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2857");
        double double2 = JavaAlgorithms.calculateTax(1.347997333357549E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.695994666715098E-152d + "'", double2 == 2.695994666715098E-152d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2858");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072076E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.571100870814415E-142d + "'", double2 == 2.571100870814415E-142d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2859");
        double double2 = JavaAlgorithms.calculateTax(1.3731160046158503E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.746232009231701E-131d + "'", double2 == 2.746232009231701E-131d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2860");
        double double2 = JavaAlgorithms.calculateTax(1.5221971708312855E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0443943416625714E-132d + "'", double2 == 3.0443943416625714E-132d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2861");
        double double2 = JavaAlgorithms.calculateTax(1.347997333357549E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.695994666715098E-152d + "'", double2 == 2.695994666715098E-152d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2862");
        double double2 = JavaAlgorithms.calculateTax(2.571100870814415E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.142201741628831E-143d + "'", double2 == 5.142201741628831E-143d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2863");
        double double2 = JavaAlgorithms.calculateTax(1.3731160046158503E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.746232009231701E-131d + "'", double2 == 2.746232009231701E-131d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2864");
        double double2 = JavaAlgorithms.calculateTax(2.746232009231701E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.492464018463402E-132d + "'", double2 == 5.492464018463402E-132d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2865");
        double double2 = JavaAlgorithms.calculateTax(5.142201741628831E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0284403483257663E-143d + "'", double2 == 1.0284403483257663E-143d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2866");
        double double2 = JavaAlgorithms.calculateTax(5.142201741628831E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0284403483257663E-143d + "'", double2 == 1.0284403483257663E-143d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2867");
        double double2 = JavaAlgorithms.calculateTax(2.4355154733300573E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8710309466601146E-135d + "'", double2 == 4.8710309466601146E-135d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2868");
        double double2 = JavaAlgorithms.calculateTax(3.0443943416625714E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.088788683325143E-133d + "'", double2 == 6.088788683325143E-133d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2869");
        double double2 = JavaAlgorithms.calculateTax(5.021681388309403E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618807E-137d + "'", double2 == 1.0043362776618807E-137d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2870");
        double double2 = JavaAlgorithms.calculateTax(1.7523965333648107E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.504793066729621E-154d + "'", double2 == 3.504793066729621E-154d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2871");
        double double2 = JavaAlgorithms.calculateTax(6.8655800230792515E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3731160046158503E-130d + "'", double2 == 1.3731160046158503E-130d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2872");
        double double2 = JavaAlgorithms.calculateTax(3.504793066729621E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.009586133459243E-155d + "'", double2 == 7.009586133459243E-155d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2873");
        double double2 = JavaAlgorithms.calculateTax(2.5108406941547018E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.021681388309403E-137d + "'", double2 == 5.021681388309403E-137d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2874");
        double double2 = JavaAlgorithms.calculateTax(6.088788683325143E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2177577366650286E-133d + "'", double2 == 1.2177577366650286E-133d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2875");
        double double2 = JavaAlgorithms.calculateTax(7.009586133459243E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4019172266918486E-155d + "'", double2 == 1.4019172266918486E-155d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2876");
        double double2 = JavaAlgorithms.calculateTax(7.009586133459243E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4019172266918486E-155d + "'", double2 == 1.4019172266918486E-155d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2877");
        double double2 = JavaAlgorithms.calculateTax(3.92318858461672E-130d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.84637716923344E-131d + "'", double2 == 7.84637716923344E-131d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2878");
        double double2 = JavaAlgorithms.calculateTax(4.017345110647523E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-139d + "'", double2 == 8.034690221295046E-139d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2879");
        double double2 = JavaAlgorithms.calculateTax(5.492464018463402E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0984928036926805E-132d + "'", double2 == 1.0984928036926805E-132d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2880");
        double double2 = JavaAlgorithms.calculateTax(8.761982666824052E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7523965333648107E-153d + "'", double2 == 1.7523965333648107E-153d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2881");
        double double2 = JavaAlgorithms.calculateTax(7.84637716923344E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5692754338466881E-131d + "'", double2 == 1.5692754338466881E-131d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2882");
        double double2 = JavaAlgorithms.calculateTax(1.9615942923083598E-129d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.92318858461672E-130d + "'", double2 == 3.92318858461672E-130d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2883");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938724E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787745E-151d + "'", double2 == 6.739986666787745E-151d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2884");
        double double2 = JavaAlgorithms.calculateTax(1.4019172266918486E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8038344533836973E-156d + "'", double2 == 2.8038344533836973E-156d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2885");
        double double2 = JavaAlgorithms.calculateTax(2.8038344533836973E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.607668906767395E-157d + "'", double2 == 5.607668906767395E-157d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2886");
        double double2 = JavaAlgorithms.calculateTax(4.8710309466601146E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.74206189332023E-136d + "'", double2 == 9.74206189332023E-136d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2887");
        double double2 = JavaAlgorithms.calculateTax(9.74206189332023E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.948412378664046E-136d + "'", double2 == 1.948412378664046E-136d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2888");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072076E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.571100870814415E-142d + "'", double2 == 2.571100870814415E-142d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2889");
        double double2 = JavaAlgorithms.calculateTax(1.0284403483257663E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0568806966515326E-144d + "'", double2 == 2.0568806966515326E-144d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2890");
        double double2 = JavaAlgorithms.calculateTax(3.92318858461672E-130d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.84637716923344E-131d + "'", double2 == 7.84637716923344E-131d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2891");
        double double2 = JavaAlgorithms.calculateTax(1.948412378664046E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8968247573280917E-137d + "'", double2 == 3.8968247573280917E-137d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2892");
        double double2 = JavaAlgorithms.calculateTax(5.607668906767395E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.121533781353479E-157d + "'", double2 == 1.121533781353479E-157d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2893");
        double double2 = JavaAlgorithms.calculateTax(1.0984928036926805E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1969856073853614E-133d + "'", double2 == 2.1969856073853614E-133d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2894");
        double double2 = JavaAlgorithms.calculateTax(2.8038344533836973E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.607668906767395E-157d + "'", double2 == 5.607668906767395E-157d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2895");
        double double2 = JavaAlgorithms.calculateTax(1.0984928036926805E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1969856073853614E-133d + "'", double2 == 2.1969856073853614E-133d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2896");
        double double2 = JavaAlgorithms.calculateTax(2.1969856073853614E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.393971214770723E-134d + "'", double2 == 4.393971214770723E-134d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2897");
        double double2 = JavaAlgorithms.calculateTax(2.1969856073853614E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.393971214770723E-134d + "'", double2 == 4.393971214770723E-134d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2898");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787745E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.347997333357549E-151d + "'", double2 == 1.347997333357549E-151d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2899");
        double double2 = JavaAlgorithms.calculateTax(5.492464018463402E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0984928036926805E-132d + "'", double2 == 1.0984928036926805E-132d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2900");
        double double2 = JavaAlgorithms.calculateTax(1.0284403483257663E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0568806966515326E-144d + "'", double2 == 2.0568806966515326E-144d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2901");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618807E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0086725553237614E-138d + "'", double2 == 2.0086725553237614E-138d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2902");
        double double2 = JavaAlgorithms.calculateTax(4.393971214770723E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.787942429541447E-135d + "'", double2 == 8.787942429541447E-135d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2903");
        double double2 = JavaAlgorithms.calculateTax(2.695994666715098E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430196E-153d + "'", double2 == 5.391989333430196E-153d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2904");
        double double2 = JavaAlgorithms.calculateTax(2.571100870814415E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.142201741628831E-143d + "'", double2 == 5.142201741628831E-143d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2905");
        double double2 = JavaAlgorithms.calculateTax(5.607668906767395E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.121533781353479E-157d + "'", double2 == 1.121533781353479E-157d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2906");
        double double2 = JavaAlgorithms.calculateTax(1.5692754338466881E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.138550867693376E-132d + "'", double2 == 3.138550867693376E-132d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2907");
        double double2 = JavaAlgorithms.calculateTax(9.74206189332023E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.948412378664046E-136d + "'", double2 == 1.948412378664046E-136d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2908");
        double double2 = JavaAlgorithms.calculateTax(1.121533781353479E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.243067562706958E-158d + "'", double2 == 2.243067562706958E-158d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2909");
        double double2 = JavaAlgorithms.calculateTax(1.121533781353479E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.243067562706958E-158d + "'", double2 == 2.243067562706958E-158d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2910");
        double double2 = JavaAlgorithms.calculateTax(2.0568806966515326E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.113761393303065E-145d + "'", double2 == 4.113761393303065E-145d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2911");
        double double2 = JavaAlgorithms.calculateTax(1.7523965333648107E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.504793066729621E-154d + "'", double2 == 3.504793066729621E-154d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2912");
        double double2 = JavaAlgorithms.calculateTax(3.138550867693376E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386753E-133d + "'", double2 == 6.277101735386753E-133d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2913");
        double double2 = JavaAlgorithms.calculateTax(4.393971214770723E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.787942429541447E-135d + "'", double2 == 8.787942429541447E-135d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2914");
        double double2 = JavaAlgorithms.calculateTax(2.0086725553237614E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.017345110647523E-139d + "'", double2 == 4.017345110647523E-139d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2915");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036038E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072076E-141d + "'", double2 == 1.2855504354072076E-141d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2916");
        double double2 = JavaAlgorithms.calculateTax(4.8710309466601146E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.74206189332023E-136d + "'", double2 == 9.74206189332023E-136d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2917");
        double double2 = JavaAlgorithms.calculateTax(2.0086725553237614E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.017345110647523E-139d + "'", double2 == 4.017345110647523E-139d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2918");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430196E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860393E-153d + "'", double2 == 1.0783978666860393E-153d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2919");
        double double2 = JavaAlgorithms.calculateTax(3.4327900115396255E-129d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.8655800230792515E-130d + "'", double2 == 6.8655800230792515E-130d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2920");
        double double2 = JavaAlgorithms.calculateTax(8.787942429541447E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7575884859082897E-135d + "'", double2 == 1.7575884859082897E-135d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2921");
        double double2 = JavaAlgorithms.calculateTax(3.504793066729621E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.009586133459243E-155d + "'", double2 == 7.009586133459243E-155d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2922");
        double double2 = JavaAlgorithms.calculateTax(7.84637716923344E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5692754338466881E-131d + "'", double2 == 1.5692754338466881E-131d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2923");
        double double2 = JavaAlgorithms.calculateTax(2.243067562706958E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.486135125413916E-159d + "'", double2 == 4.486135125413916E-159d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2924");
        double double2 = JavaAlgorithms.calculateTax(3.9231885846167203E-132d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.84637716923344E-133d + "'", double2 == 7.84637716923344E-133d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2925");
        double double2 = JavaAlgorithms.calculateTax(2.695994666715098E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430196E-153d + "'", double2 == 5.391989333430196E-153d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2926");
        double double2 = JavaAlgorithms.calculateTax(4.486135125413916E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.972270250827832E-160d + "'", double2 == 8.972270250827832E-160d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2927");
        double double2 = JavaAlgorithms.calculateTax(1.2177577366650286E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4355154733300573E-134d + "'", double2 == 2.4355154733300573E-134d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2928");
        double double2 = JavaAlgorithms.calculateTax(1.7575884859082897E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5151769718165796E-136d + "'", double2 == 3.5151769718165796E-136d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2929");
        double double2 = JavaAlgorithms.calculateTax(3.138550867693376E-132d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.277101735386753E-133d + "'", double2 == 6.277101735386753E-133d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2930");
        double double2 = JavaAlgorithms.calculateTax(4.486135125413916E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.972270250827832E-160d + "'", double2 == 8.972270250827832E-160d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2931");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386753E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773506E-133d + "'", double2 == 1.2554203470773506E-133d);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2932");
        double double2 = JavaAlgorithms.calculateTax(6.277101735386753E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2554203470773506E-133d + "'", double2 == 1.2554203470773506E-133d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2933");
        double double2 = JavaAlgorithms.calculateTax(8.787942429541447E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7575884859082897E-135d + "'", double2 == 1.7575884859082897E-135d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2934");
        double double2 = JavaAlgorithms.calculateTax(2.4355154733300573E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8710309466601146E-135d + "'", double2 == 4.8710309466601146E-135d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2935");
        double double2 = JavaAlgorithms.calculateTax(1.7575884859082897E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5151769718165796E-136d + "'", double2 == 3.5151769718165796E-136d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2936");
        double double2 = JavaAlgorithms.calculateTax(2.746232009231701E-131d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.492464018463402E-132d + "'", double2 == 5.492464018463402E-132d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2937");
        double double2 = JavaAlgorithms.calculateTax(4.380991333412026E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.761982666824052E-153d + "'", double2 == 8.761982666824052E-153d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2938");
        double double2 = JavaAlgorithms.calculateTax(1.4019172266918486E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8038344533836973E-156d + "'", double2 == 2.8038344533836973E-156d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2939");
        double double2 = JavaAlgorithms.calculateTax(4.113761393303065E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.22752278660613E-146d + "'", double2 == 8.22752278660613E-146d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2940");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430196E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860393E-153d + "'", double2 == 1.0783978666860393E-153d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2941");
        double double2 = JavaAlgorithms.calculateTax(3.5151769718165796E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.03035394363316E-137d + "'", double2 == 7.03035394363316E-137d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2942");
        double double2 = JavaAlgorithms.calculateTax(8.972270250827832E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7944540501655666E-160d + "'", double2 == 1.7944540501655666E-160d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2943");
        double double2 = JavaAlgorithms.calculateTax(1.7944540501655666E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5889081003311335E-161d + "'", double2 == 3.5889081003311335E-161d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2944");
        double double2 = JavaAlgorithms.calculateTax(3.5889081003311335E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.177816200662267E-162d + "'", double2 == 7.177816200662267E-162d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2945");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860393E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1567957333720788E-154d + "'", double2 == 2.1567957333720788E-154d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2946");
        double double2 = JavaAlgorithms.calculateTax(3.8968247573280917E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.793649514656183E-138d + "'", double2 == 7.793649514656183E-138d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2947");
        double double2 = JavaAlgorithms.calculateTax(7.177816200662267E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4355632401324534E-162d + "'", double2 == 1.4355632401324534E-162d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2948");
        double double2 = JavaAlgorithms.calculateTax(2.1567957333720788E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744158E-155d + "'", double2 == 4.313591466744158E-155d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2949");
        double double2 = JavaAlgorithms.calculateTax(7.793649514656183E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5587299029312368E-138d + "'", double2 == 1.5587299029312368E-138d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2950");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744158E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488316E-156d + "'", double2 == 8.627182933488316E-156d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2951");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773506E-133d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5108406941547014E-134d + "'", double2 == 2.5108406941547014E-134d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2952");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860393E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1567957333720788E-154d + "'", double2 == 2.1567957333720788E-154d);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2953");
        double double2 = JavaAlgorithms.calculateTax(1.7944540501655666E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5889081003311335E-161d + "'", double2 == 3.5889081003311335E-161d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2954");
        double double2 = JavaAlgorithms.calculateTax(1.4355632401324534E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.871126480264907E-163d + "'", double2 == 2.871126480264907E-163d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2955");
        double double2 = JavaAlgorithms.calculateTax(2.0568806966515326E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.113761393303065E-145d + "'", double2 == 4.113761393303065E-145d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2956");
        double double2 = JavaAlgorithms.calculateTax(1.4355632401324534E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.871126480264907E-163d + "'", double2 == 2.871126480264907E-163d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2957");
        double double2 = JavaAlgorithms.calculateTax(2.5108406941547014E-134d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.021681388309403E-135d + "'", double2 == 5.021681388309403E-135d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2958");
        double double2 = JavaAlgorithms.calculateTax(2.871126480264907E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.742252960529815E-164d + "'", double2 == 5.742252960529815E-164d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2959");
        double double2 = JavaAlgorithms.calculateTax(7.03035394363316E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4060707887266322E-137d + "'", double2 == 1.4060707887266322E-137d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2960");
        double double2 = JavaAlgorithms.calculateTax(1.4060707887266322E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.812141577453264E-138d + "'", double2 == 2.812141577453264E-138d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2961");
        double double2 = JavaAlgorithms.calculateTax(5.021681388309403E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618807E-135d + "'", double2 == 1.0043362776618807E-135d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2962");
        double double2 = JavaAlgorithms.calculateTax(4.017345110647523E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-140d + "'", double2 == 8.034690221295046E-140d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2963");
        double double2 = JavaAlgorithms.calculateTax(1.948412378664046E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8968247573280917E-137d + "'", double2 == 3.8968247573280917E-137d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2964");
        double double2 = JavaAlgorithms.calculateTax(1.2554203470773506E-133d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5108406941547014E-134d + "'", double2 == 2.5108406941547014E-134d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2965");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618807E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0086725553237614E-138d + "'", double2 == 2.0086725553237614E-138d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2966");
        double double2 = JavaAlgorithms.calculateTax(1.5692754338466881E-131d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.138550867693376E-132d + "'", double2 == 3.138550867693376E-132d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2967");
        double double2 = JavaAlgorithms.calculateTax(8.22752278660613E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6455045573212261E-146d + "'", double2 == 1.6455045573212261E-146d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2968");
        double double2 = JavaAlgorithms.calculateTax(2.5108406941547014E-134d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.021681388309403E-135d + "'", double2 == 5.021681388309403E-135d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2969");
        double double2 = JavaAlgorithms.calculateTax(3.5151769718165796E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.03035394363316E-137d + "'", double2 == 7.03035394363316E-137d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2970");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618807E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0086725553237613E-136d + "'", double2 == 2.0086725553237613E-136d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2971");
        double double2 = JavaAlgorithms.calculateTax(1.5587299029312368E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1174598058624738E-139d + "'", double2 == 3.1174598058624738E-139d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2972");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744158E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488316E-156d + "'", double2 == 8.627182933488316E-156d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2973");
        double double2 = JavaAlgorithms.calculateTax(2.871126480264907E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.742252960529815E-164d + "'", double2 == 5.742252960529815E-164d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2974");
        double double2 = JavaAlgorithms.calculateTax(2.812141577453264E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6242831549065284E-139d + "'", double2 == 5.6242831549065284E-139d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2975");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488316E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976631E-156d + "'", double2 == 1.7254365866976631E-156d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2976");
        double double2 = JavaAlgorithms.calculateTax(3.1174598058624738E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.234919611724948E-140d + "'", double2 == 6.234919611724948E-140d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2977");
        double double2 = JavaAlgorithms.calculateTax(2.0086725553237613E-136d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0173451106475227E-137d + "'", double2 == 4.0173451106475227E-137d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2978");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6069380442590094E-140d + "'", double2 == 1.6069380442590094E-140d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2979");
        double double2 = JavaAlgorithms.calculateTax(1.6455045573212261E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.291009114642452E-147d + "'", double2 == 3.291009114642452E-147d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2980");
        double double2 = JavaAlgorithms.calculateTax(1.6069380442590094E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.213876088518019E-141d + "'", double2 == 3.213876088518019E-141d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2981");
        double double2 = JavaAlgorithms.calculateTax(3.213876088518019E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036038E-142d + "'", double2 == 6.427752177036038E-142d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2982");
        double double2 = JavaAlgorithms.calculateTax(2.243067562706958E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.486135125413916E-159d + "'", double2 == 4.486135125413916E-159d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2983");
        double double2 = JavaAlgorithms.calculateTax(7.177816200662267E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4355632401324534E-162d + "'", double2 == 1.4355632401324534E-162d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2984");
        double double2 = JavaAlgorithms.calculateTax(3.291009114642452E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.582018229284905E-148d + "'", double2 == 6.582018229284905E-148d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2985");
        double double2 = JavaAlgorithms.calculateTax(1.0043362776618807E-135d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0086725553237613E-136d + "'", double2 == 2.0086725553237613E-136d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2986");
        double double2 = JavaAlgorithms.calculateTax(8.972270250827832E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7944540501655666E-160d + "'", double2 == 1.7944540501655666E-160d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2987");
        double double2 = JavaAlgorithms.calculateTax(4.0173451106475227E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-138d + "'", double2 == 8.034690221295046E-138d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2988");
        double double2 = JavaAlgorithms.calculateTax(4.113761393303065E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.22752278660613E-146d + "'", double2 == 8.22752278660613E-146d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2989");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6069380442590092E-138d + "'", double2 == 1.6069380442590092E-138d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2990");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488316E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976631E-156d + "'", double2 == 1.7254365866976631E-156d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2991");
        double double2 = JavaAlgorithms.calculateTax(1.6069380442590094E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.213876088518019E-141d + "'", double2 == 3.213876088518019E-141d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2992");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976631E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450873173395326E-157d + "'", double2 == 3.450873173395326E-157d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2993");
        double double2 = JavaAlgorithms.calculateTax(4.017345110647523E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-140d + "'", double2 == 8.034690221295046E-140d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2994");
        double double2 = JavaAlgorithms.calculateTax(3.213876088518019E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036038E-142d + "'", double2 == 6.427752177036038E-142d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2995");
        double double2 = JavaAlgorithms.calculateTax(3.450873173395326E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790653E-158d + "'", double2 == 6.901746346790653E-158d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2996");
        double double2 = JavaAlgorithms.calculateTax(1.4060707887266322E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.812141577453264E-138d + "'", double2 == 2.812141577453264E-138d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2997");
        double double2 = JavaAlgorithms.calculateTax(3.8968247573280917E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.793649514656183E-138d + "'", double2 == 7.793649514656183E-138d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2998");
        double double2 = JavaAlgorithms.calculateTax(3.5889081003311335E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.177816200662267E-162d + "'", double2 == 7.177816200662267E-162d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test2999");
        double double2 = JavaAlgorithms.calculateTax(3.291009114642452E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.582018229284905E-148d + "'", double2 == 6.582018229284905E-148d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression5.test3000");
        double double2 = JavaAlgorithms.calculateTax(5.742252960529815E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.148450592105963E-164d + "'", double2 == 1.148450592105963E-164d);
    }
}

