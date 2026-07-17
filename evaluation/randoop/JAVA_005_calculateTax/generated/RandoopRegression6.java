import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3001");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790653E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3803492693581308E-158d + "'", double2 == 1.3803492693581308E-158d);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3002");
        double double2 = JavaAlgorithms.calculateTax(1.5587299029312368E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1174598058624738E-139d + "'", double2 == 3.1174598058624738E-139d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3003");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036038E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072076E-142d + "'", double2 == 1.2855504354072076E-142d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3004");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036038E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072076E-142d + "'", double2 == 1.2855504354072076E-142d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3005");
        double double2 = JavaAlgorithms.calculateTax(1.6069380442590092E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2138760885180185E-139d + "'", double2 == 3.2138760885180185E-139d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3006");
        double double2 = JavaAlgorithms.calculateTax(8.22752278660613E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6455045573212261E-146d + "'", double2 == 1.6455045573212261E-146d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3007");
        double double2 = JavaAlgorithms.calculateTax(3.450873173395326E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790653E-158d + "'", double2 == 6.901746346790653E-158d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3008");
        double double2 = JavaAlgorithms.calculateTax(2.1567957333720788E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744158E-155d + "'", double2 == 4.313591466744158E-155d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3009");
        double double2 = JavaAlgorithms.calculateTax(6.234919611724948E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2469839223449896E-140d + "'", double2 == 1.2469839223449896E-140d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3010");
        double double2 = JavaAlgorithms.calculateTax(3.2138760885180185E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036037E-140d + "'", double2 == 6.427752177036037E-140d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3011");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976631E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450873173395326E-157d + "'", double2 == 3.450873173395326E-157d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3012");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6069380442590094E-140d + "'", double2 == 1.6069380442590094E-140d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3013");
        double double2 = JavaAlgorithms.calculateTax(2.812141577453264E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6242831549065284E-139d + "'", double2 == 5.6242831549065284E-139d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3014");
        double double2 = JavaAlgorithms.calculateTax(5.742252960529815E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.148450592105963E-164d + "'", double2 == 1.148450592105963E-164d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3015");
        double double2 = JavaAlgorithms.calculateTax(7.793649514656183E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5587299029312368E-138d + "'", double2 == 1.5587299029312368E-138d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3016");
        double double2 = JavaAlgorithms.calculateTax(5.6242831549065284E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1248566309813058E-139d + "'", double2 == 1.1248566309813058E-139d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3017");
        double double2 = JavaAlgorithms.calculateTax(5.021681388309403E-135d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043362776618807E-135d + "'", double2 == 1.0043362776618807E-135d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3018");
        double double2 = JavaAlgorithms.calculateTax(1.1248566309813058E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2497132619626116E-140d + "'", double2 == 2.2497132619626116E-140d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3019");
        double double2 = JavaAlgorithms.calculateTax(1.6455045573212261E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.291009114642452E-147d + "'", double2 == 3.291009114642452E-147d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3020");
        double double2 = JavaAlgorithms.calculateTax(4.0173451106475227E-137d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.034690221295046E-138d + "'", double2 == 8.034690221295046E-138d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3021");
        double double2 = JavaAlgorithms.calculateTax(1.3803492693581308E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7606985387162616E-159d + "'", double2 == 2.7606985387162616E-159d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3022");
        double double2 = JavaAlgorithms.calculateTax(6.234919611724948E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2469839223449896E-140d + "'", double2 == 1.2469839223449896E-140d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3023");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790653E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3803492693581308E-158d + "'", double2 == 1.3803492693581308E-158d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3024");
        double double2 = JavaAlgorithms.calculateTax(2.2497132619626116E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4994265239252233E-141d + "'", double2 == 4.4994265239252233E-141d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3025");
        double double2 = JavaAlgorithms.calculateTax(5.6242831549065284E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1248566309813058E-139d + "'", double2 == 1.1248566309813058E-139d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3026");
        double double2 = JavaAlgorithms.calculateTax(3.2138760885180185E-139d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.427752177036037E-140d + "'", double2 == 6.427752177036037E-140d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3027");
        double double2 = JavaAlgorithms.calculateTax(1.2469839223449896E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4939678446899793E-141d + "'", double2 == 2.4939678446899793E-141d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3028");
        double double2 = JavaAlgorithms.calculateTax(1.6069380442590092E-138d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2138760885180185E-139d + "'", double2 == 3.2138760885180185E-139d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3029");
        double double2 = JavaAlgorithms.calculateTax(1.3803492693581308E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7606985387162616E-159d + "'", double2 == 2.7606985387162616E-159d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3030");
        double double2 = JavaAlgorithms.calculateTax(1.2469839223449896E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4939678446899793E-141d + "'", double2 == 2.4939678446899793E-141d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3031");
        double double2 = JavaAlgorithms.calculateTax(2.0086725553237613E-136d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0173451106475227E-137d + "'", double2 == 4.0173451106475227E-137d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3032");
        double double2 = JavaAlgorithms.calculateTax(2.4939678446899793E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.987935689379959E-142d + "'", double2 == 4.987935689379959E-142d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3033");
        double double2 = JavaAlgorithms.calculateTax(1.148450592105963E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.296901184211926E-165d + "'", double2 == 2.296901184211926E-165d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3034");
        double double2 = JavaAlgorithms.calculateTax(2.296901184211926E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.593802368423852E-166d + "'", double2 == 4.593802368423852E-166d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3035");
        double double2 = JavaAlgorithms.calculateTax(7.03035394363316E-137d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4060707887266322E-137d + "'", double2 == 1.4060707887266322E-137d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3036");
        double double2 = JavaAlgorithms.calculateTax(4.4994265239252233E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.998853047850448E-142d + "'", double2 == 8.998853047850448E-142d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3037");
        double double2 = JavaAlgorithms.calculateTax(2.7606985387162616E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432523E-160d + "'", double2 == 5.521397077432523E-160d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3038");
        double double2 = JavaAlgorithms.calculateTax(1.148450592105963E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.296901184211926E-165d + "'", double2 == 2.296901184211926E-165d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3039");
        double double2 = JavaAlgorithms.calculateTax(2.296901184211926E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.593802368423852E-166d + "'", double2 == 4.593802368423852E-166d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3040");
        double double2 = JavaAlgorithms.calculateTax(6.582018229284905E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3164036458569811E-148d + "'", double2 == 1.3164036458569811E-148d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3041");
        double double2 = JavaAlgorithms.calculateTax(2.4939678446899793E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.987935689379959E-142d + "'", double2 == 4.987935689379959E-142d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3042");
        double double2 = JavaAlgorithms.calculateTax(6.582018229284905E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3164036458569811E-148d + "'", double2 == 1.3164036458569811E-148d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3043");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036037E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072075E-140d + "'", double2 == 1.2855504354072075E-140d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3044");
        double double2 = JavaAlgorithms.calculateTax(4.987935689379959E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.975871378759917E-143d + "'", double2 == 9.975871378759917E-143d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3045");
        double double2 = JavaAlgorithms.calculateTax(2.7606985387162616E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432523E-160d + "'", double2 == 5.521397077432523E-160d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3046");
        double double2 = JavaAlgorithms.calculateTax(1.3164036458569811E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139625E-149d + "'", double2 == 2.6328072917139625E-149d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3047");
        double double2 = JavaAlgorithms.calculateTax(8.998853047850448E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7997706095700896E-142d + "'", double2 == 1.7997706095700896E-142d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3048");
        double double2 = JavaAlgorithms.calculateTax(9.975871378759917E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9951742757519835E-143d + "'", double2 == 1.9951742757519835E-143d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3049");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072076E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5711008708144154E-143d + "'", double2 == 2.5711008708144154E-143d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3050");
        double double2 = JavaAlgorithms.calculateTax(1.7997706095700896E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5995412191401796E-143d + "'", double2 == 3.5995412191401796E-143d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3051");
        double double2 = JavaAlgorithms.calculateTax(3.5995412191401796E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.199082438280359E-144d + "'", double2 == 7.199082438280359E-144d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3052");
        double double2 = JavaAlgorithms.calculateTax(1.3164036458569811E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139625E-149d + "'", double2 == 2.6328072917139625E-149d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3053");
        double double2 = JavaAlgorithms.calculateTax(6.427752177036037E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2855504354072075E-140d + "'", double2 == 1.2855504354072075E-140d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3054");
        double double2 = JavaAlgorithms.calculateTax(2.2497132619626116E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4994265239252233E-141d + "'", double2 == 4.4994265239252233E-141d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3055");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432523E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1042794154865047E-160d + "'", double2 == 1.1042794154865047E-160d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3056");
        double double2 = JavaAlgorithms.calculateTax(9.975871378759917E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9951742757519835E-143d + "'", double2 == 1.9951742757519835E-143d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3057");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139625E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.265614583427925E-150d + "'", double2 == 5.265614583427925E-150d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3058");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072075E-140d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.571100870814415E-141d + "'", double2 == 2.571100870814415E-141d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3059");
        double double2 = JavaAlgorithms.calculateTax(1.1248566309813058E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2497132619626116E-140d + "'", double2 == 2.2497132619626116E-140d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3060");
        double double2 = JavaAlgorithms.calculateTax(4.593802368423852E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.187604736847704E-167d + "'", double2 == 9.187604736847704E-167d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3061");
        double double2 = JavaAlgorithms.calculateTax(9.187604736847704E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8375209473695407E-167d + "'", double2 == 1.8375209473695407E-167d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3062");
        double double2 = JavaAlgorithms.calculateTax(7.199082438280359E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.439816487656072E-144d + "'", double2 == 1.439816487656072E-144d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3063");
        double double2 = JavaAlgorithms.calculateTax(1.9951742757519835E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.990348551503967E-144d + "'", double2 == 3.990348551503967E-144d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3064");
        double double2 = JavaAlgorithms.calculateTax(8.998853047850448E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7997706095700896E-142d + "'", double2 == 1.7997706095700896E-142d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3065");
        double double2 = JavaAlgorithms.calculateTax(1.1042794154865047E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2085588309730097E-161d + "'", double2 == 2.2085588309730097E-161d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3066");
        double double2 = JavaAlgorithms.calculateTax(3.990348551503967E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.980697103007934E-145d + "'", double2 == 7.980697103007934E-145d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3067");
        double double2 = JavaAlgorithms.calculateTax(3.990348551503967E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.980697103007934E-145d + "'", double2 == 7.980697103007934E-145d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3068");
        double double2 = JavaAlgorithms.calculateTax(4.987935689379959E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.975871378759917E-143d + "'", double2 == 9.975871378759917E-143d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3069");
        double double2 = JavaAlgorithms.calculateTax(2.571100870814415E-141d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.14220174162883E-142d + "'", double2 == 5.14220174162883E-142d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3070");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432523E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1042794154865047E-160d + "'", double2 == 1.1042794154865047E-160d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3071");
        double double2 = JavaAlgorithms.calculateTax(5.14220174162883E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0284403483257662E-142d + "'", double2 == 1.0284403483257662E-142d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3072");
        double double2 = JavaAlgorithms.calculateTax(2.2085588309730097E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4171176619460194E-162d + "'", double2 == 4.4171176619460194E-162d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3073");
        double double2 = JavaAlgorithms.calculateTax(2.5711008708144154E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.142201741628831E-144d + "'", double2 == 5.142201741628831E-144d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3074");
        double double2 = JavaAlgorithms.calculateTax(1.8375209473695407E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6750418947390817E-168d + "'", double2 == 3.6750418947390817E-168d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3075");
        double double2 = JavaAlgorithms.calculateTax(7.980697103007934E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5961394206015868E-145d + "'", double2 == 1.5961394206015868E-145d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3076");
        double double2 = JavaAlgorithms.calculateTax(1.8375209473695407E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6750418947390817E-168d + "'", double2 == 3.6750418947390817E-168d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3077");
        double double2 = JavaAlgorithms.calculateTax(8.034690221295046E-138d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6069380442590092E-138d + "'", double2 == 1.6069380442590092E-138d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3078");
        double double2 = JavaAlgorithms.calculateTax(7.980697103007934E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5961394206015868E-145d + "'", double2 == 1.5961394206015868E-145d);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3079");
        double double2 = JavaAlgorithms.calculateTax(1.0284403483257662E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0568806966515326E-143d + "'", double2 == 2.0568806966515326E-143d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3080");
        double double2 = JavaAlgorithms.calculateTax(5.265614583427925E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0531229166855851E-150d + "'", double2 == 1.0531229166855851E-150d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3081");
        double double2 = JavaAlgorithms.calculateTax(1.0531229166855851E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1062458333711703E-151d + "'", double2 == 2.1062458333711703E-151d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3082");
        double double2 = JavaAlgorithms.calculateTax(1.5961394206015868E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1922788412031737E-146d + "'", double2 == 3.1922788412031737E-146d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3083");
        double double2 = JavaAlgorithms.calculateTax(3.1922788412031737E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.384557682406348E-147d + "'", double2 == 6.384557682406348E-147d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3084");
        double double2 = JavaAlgorithms.calculateTax(2.1062458333711703E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.21249166674234E-152d + "'", double2 == 4.21249166674234E-152d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3085");
        double double2 = JavaAlgorithms.calculateTax(2.571100870814415E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.14220174162883E-142d + "'", double2 == 5.14220174162883E-142d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3086");
        double double2 = JavaAlgorithms.calculateTax(6.384557682406348E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2769115364812698E-147d + "'", double2 == 1.2769115364812698E-147d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3087");
        double double2 = JavaAlgorithms.calculateTax(6.384557682406348E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2769115364812698E-147d + "'", double2 == 1.2769115364812698E-147d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3088");
        double double2 = JavaAlgorithms.calculateTax(1.9951742757519835E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.990348551503967E-144d + "'", double2 == 3.990348551503967E-144d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3089");
        double double2 = JavaAlgorithms.calculateTax(1.5961394206015868E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1922788412031737E-146d + "'", double2 == 3.1922788412031737E-146d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3090");
        double double2 = JavaAlgorithms.calculateTax(1.439816487656072E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.879632975312144E-145d + "'", double2 == 2.879632975312144E-145d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3091");
        double double2 = JavaAlgorithms.calculateTax(5.14220174162883E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0284403483257662E-142d + "'", double2 == 1.0284403483257662E-142d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3092");
        double double2 = JavaAlgorithms.calculateTax(3.1174598058624738E-139d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.234919611724948E-140d + "'", double2 == 6.234919611724948E-140d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3093");
        double double2 = JavaAlgorithms.calculateTax(1.2769115364812698E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5538230729625397E-148d + "'", double2 == 2.5538230729625397E-148d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3094");
        double double2 = JavaAlgorithms.calculateTax(2.5538230729625397E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.10764614592508E-149d + "'", double2 == 5.10764614592508E-149d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3095");
        double double2 = JavaAlgorithms.calculateTax(4.4994265239252233E-141d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.998853047850448E-142d + "'", double2 == 8.998853047850448E-142d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3096");
        double double2 = JavaAlgorithms.calculateTax(2.5711008708144154E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.142201741628831E-144d + "'", double2 == 5.142201741628831E-144d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3097");
        double double2 = JavaAlgorithms.calculateTax(1.0284403483257662E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0568806966515326E-143d + "'", double2 == 2.0568806966515326E-143d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3098");
        double double2 = JavaAlgorithms.calculateTax(2.1062458333711703E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.21249166674234E-152d + "'", double2 == 4.21249166674234E-152d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3099");
        double double2 = JavaAlgorithms.calculateTax(2.5538230729625397E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.10764614592508E-149d + "'", double2 == 5.10764614592508E-149d);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3100");
        double double2 = JavaAlgorithms.calculateTax(1.7997706095700896E-142d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5995412191401796E-143d + "'", double2 == 3.5995412191401796E-143d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3101");
        double double2 = JavaAlgorithms.calculateTax(4.593802368423852E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.187604736847704E-167d + "'", double2 == 9.187604736847704E-167d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3102");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139625E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.265614583427925E-150d + "'", double2 == 5.265614583427925E-150d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3103");
        double double2 = JavaAlgorithms.calculateTax(3.6750418947390817E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.350083789478164E-169d + "'", double2 == 7.350083789478164E-169d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3104");
        double double2 = JavaAlgorithms.calculateTax(2.879632975312144E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.759265950624288E-146d + "'", double2 == 5.759265950624288E-146d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3105");
        double double2 = JavaAlgorithms.calculateTax(5.10764614592508E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.021529229185016E-149d + "'", double2 == 1.021529229185016E-149d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3106");
        double double2 = JavaAlgorithms.calculateTax(4.21249166674234E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.424983333484681E-153d + "'", double2 == 8.424983333484681E-153d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3107");
        double double2 = JavaAlgorithms.calculateTax(3.1922788412031737E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.384557682406348E-147d + "'", double2 == 6.384557682406348E-147d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3108");
        double double2 = JavaAlgorithms.calculateTax(5.10764614592508E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.021529229185016E-149d + "'", double2 == 1.021529229185016E-149d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3109");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072075E-140d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.571100870814415E-141d + "'", double2 == 2.571100870814415E-141d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3110");
        double double2 = JavaAlgorithms.calculateTax(3.5995412191401796E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.199082438280359E-144d + "'", double2 == 7.199082438280359E-144d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3111");
        double double2 = JavaAlgorithms.calculateTax(8.424983333484681E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969362E-153d + "'", double2 == 1.6849966666969362E-153d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3112");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969362E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938723E-154d + "'", double2 == 3.3699933333938723E-154d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3113");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938723E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787745E-155d + "'", double2 == 6.739986666787745E-155d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3114");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969362E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938723E-154d + "'", double2 == 3.3699933333938723E-154d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3115");
        double double2 = JavaAlgorithms.calculateTax(1.1042794154865047E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2085588309730097E-161d + "'", double2 == 2.2085588309730097E-161d);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3116");
        double double2 = JavaAlgorithms.calculateTax(5.142201741628831E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0284403483257663E-144d + "'", double2 == 1.0284403483257663E-144d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3117");
        double double2 = JavaAlgorithms.calculateTax(2.0568806966515326E-143d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1137613933030653E-144d + "'", double2 == 4.1137613933030653E-144d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3118");
        double double2 = JavaAlgorithms.calculateTax(5.265614583427925E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0531229166855851E-150d + "'", double2 == 1.0531229166855851E-150d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3119");
        double double2 = JavaAlgorithms.calculateTax(7.350083789478164E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.470016757895633E-169d + "'", double2 == 1.470016757895633E-169d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3120");
        double double2 = JavaAlgorithms.calculateTax(7.350083789478164E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.470016757895633E-169d + "'", double2 == 1.470016757895633E-169d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3121");
        double double2 = JavaAlgorithms.calculateTax(8.424983333484681E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969362E-153d + "'", double2 == 1.6849966666969362E-153d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3122");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787745E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3479973333575492E-155d + "'", double2 == 1.3479973333575492E-155d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3123");
        double double2 = JavaAlgorithms.calculateTax(1.2855504354072076E-142d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5711008708144154E-143d + "'", double2 == 2.5711008708144154E-143d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3124");
        double double2 = JavaAlgorithms.calculateTax(4.1137613933030653E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.22752278660613E-145d + "'", double2 == 8.22752278660613E-145d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3125");
        double double2 = JavaAlgorithms.calculateTax(2.0568806966515326E-143d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1137613933030653E-144d + "'", double2 == 4.1137613933030653E-144d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3126");
        double double2 = JavaAlgorithms.calculateTax(5.759265950624288E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1518531901248576E-146d + "'", double2 == 1.1518531901248576E-146d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3127");
        double double2 = JavaAlgorithms.calculateTax(1.470016757895633E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9400335157912663E-170d + "'", double2 == 2.9400335157912663E-170d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3128");
        double double2 = JavaAlgorithms.calculateTax(4.21249166674234E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.424983333484681E-153d + "'", double2 == 8.424983333484681E-153d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3129");
        double double2 = JavaAlgorithms.calculateTax(1.3479973333575492E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6959946667150986E-156d + "'", double2 == 2.6959946667150986E-156d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3130");
        double double2 = JavaAlgorithms.calculateTax(1.1518531901248576E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3037063802497154E-147d + "'", double2 == 2.3037063802497154E-147d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3131");
        double double2 = JavaAlgorithms.calculateTax(4.4171176619460194E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-163d + "'", double2 == 8.83423532389204E-163d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3132");
        double double2 = JavaAlgorithms.calculateTax(2.6959946667150986E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430197E-157d + "'", double2 == 5.391989333430197E-157d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3133");
        double double2 = JavaAlgorithms.calculateTax(1.021529229185016E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.043058458370032E-150d + "'", double2 == 2.043058458370032E-150d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3134");
        double double2 = JavaAlgorithms.calculateTax(1.021529229185016E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.043058458370032E-150d + "'", double2 == 2.043058458370032E-150d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3135");
        double double2 = JavaAlgorithms.calculateTax(5.142201741628831E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0284403483257663E-144d + "'", double2 == 1.0284403483257663E-144d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3136");
        double double2 = JavaAlgorithms.calculateTax(1.470016757895633E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9400335157912663E-170d + "'", double2 == 2.9400335157912663E-170d);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3137");
        double double2 = JavaAlgorithms.calculateTax(8.22752278660613E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.645504557321226E-145d + "'", double2 == 1.645504557321226E-145d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3138");
        double double2 = JavaAlgorithms.calculateTax(2.9400335157912663E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.880067031582533E-171d + "'", double2 == 5.880067031582533E-171d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3139");
        double double2 = JavaAlgorithms.calculateTax(9.187604736847704E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8375209473695407E-167d + "'", double2 == 1.8375209473695407E-167d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3140");
        double double2 = JavaAlgorithms.calculateTax(5.759265950624288E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1518531901248576E-146d + "'", double2 == 1.1518531901248576E-146d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3141");
        double double2 = JavaAlgorithms.calculateTax(1.0284403483257663E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0568806966515326E-145d + "'", double2 == 2.0568806966515326E-145d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3142");
        double double2 = JavaAlgorithms.calculateTax(1.0531229166855851E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1062458333711703E-151d + "'", double2 == 2.1062458333711703E-151d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3143");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.766847064778408E-163d + "'", double2 == 1.766847064778408E-163d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3144");
        double double2 = JavaAlgorithms.calculateTax(1.766847064778408E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.533694129556816E-164d + "'", double2 == 3.533694129556816E-164d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3145");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938723E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787745E-155d + "'", double2 == 6.739986666787745E-155d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3146");
        double double2 = JavaAlgorithms.calculateTax(4.4171176619460194E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-163d + "'", double2 == 8.83423532389204E-163d);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3147");
        double double2 = JavaAlgorithms.calculateTax(1.645504557321226E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2910091146424522E-146d + "'", double2 == 3.2910091146424522E-146d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3148");
        double double2 = JavaAlgorithms.calculateTax(3.2910091146424522E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.582018229284904E-147d + "'", double2 == 6.582018229284904E-147d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3149");
        double double2 = JavaAlgorithms.calculateTax(1.645504557321226E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2910091146424522E-146d + "'", double2 == 3.2910091146424522E-146d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3150");
        double double2 = JavaAlgorithms.calculateTax(3.2910091146424522E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.582018229284904E-147d + "'", double2 == 6.582018229284904E-147d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3151");
        double double2 = JavaAlgorithms.calculateTax(2.9400335157912663E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.880067031582533E-171d + "'", double2 == 5.880067031582533E-171d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3152");
        double double2 = JavaAlgorithms.calculateTax(1.2769115364812698E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5538230729625397E-148d + "'", double2 == 2.5538230729625397E-148d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3153");
        double double2 = JavaAlgorithms.calculateTax(3.533694129556816E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113632E-165d + "'", double2 == 7.067388259113632E-165d);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3154");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430197E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860395E-157d + "'", double2 == 1.0783978666860395E-157d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3155");
        double double2 = JavaAlgorithms.calculateTax(5.880067031582533E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1760134063165066E-171d + "'", double2 == 1.1760134063165066E-171d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3156");
        double double2 = JavaAlgorithms.calculateTax(1.1518531901248576E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3037063802497154E-147d + "'", double2 == 2.3037063802497154E-147d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3157");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860395E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.156795733372079E-158d + "'", double2 == 2.156795733372079E-158d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3158");
        double double2 = JavaAlgorithms.calculateTax(6.582018229284904E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.316403645856981E-147d + "'", double2 == 1.316403645856981E-147d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3159");
        double double2 = JavaAlgorithms.calculateTax(2.156795733372079E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744158E-159d + "'", double2 == 4.313591466744158E-159d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3160");
        double double2 = JavaAlgorithms.calculateTax(1.1760134063165066E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3520268126330134E-172d + "'", double2 == 2.3520268126330134E-172d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3161");
        double double2 = JavaAlgorithms.calculateTax(1.3479973333575492E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6959946667150986E-156d + "'", double2 == 2.6959946667150986E-156d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3162");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430197E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860395E-157d + "'", double2 == 1.0783978666860395E-157d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3163");
        double double2 = JavaAlgorithms.calculateTax(2.0568806966515326E-145d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.113761393303065E-146d + "'", double2 == 4.113761393303065E-146d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3164");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.766847064778408E-163d + "'", double2 == 1.766847064778408E-163d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3165");
        double double2 = JavaAlgorithms.calculateTax(2.3037063802497154E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.607412760499431E-148d + "'", double2 == 4.607412760499431E-148d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3166");
        double double2 = JavaAlgorithms.calculateTax(1.1760134063165066E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3520268126330134E-172d + "'", double2 == 2.3520268126330134E-172d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3167");
        double double2 = JavaAlgorithms.calculateTax(1.0284403483257663E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0568806966515326E-145d + "'", double2 == 2.0568806966515326E-145d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3168");
        double double2 = JavaAlgorithms.calculateTax(1.316403645856981E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139622E-148d + "'", double2 == 2.6328072917139622E-148d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3169");
        double double2 = JavaAlgorithms.calculateTax(2.6959946667150986E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430197E-157d + "'", double2 == 5.391989333430197E-157d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3170");
        double double2 = JavaAlgorithms.calculateTax(3.533694129556816E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113632E-165d + "'", double2 == 7.067388259113632E-165d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3171");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860395E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.156795733372079E-158d + "'", double2 == 2.156795733372079E-158d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3172");
        double double2 = JavaAlgorithms.calculateTax(2.3520268126330134E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.704053625266027E-173d + "'", double2 == 4.704053625266027E-173d);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3173");
        double double2 = JavaAlgorithms.calculateTax(4.1137613933030653E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.22752278660613E-145d + "'", double2 == 8.22752278660613E-145d);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3174");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787745E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3479973333575492E-155d + "'", double2 == 1.3479973333575492E-155d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3175");
        double double2 = JavaAlgorithms.calculateTax(2.043058458370032E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0861169167400645E-151d + "'", double2 == 4.0861169167400645E-151d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3176");
        double double2 = JavaAlgorithms.calculateTax(2.0568806966515326E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.113761393303065E-146d + "'", double2 == 4.113761393303065E-146d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3177");
        double double2 = JavaAlgorithms.calculateTax(4.0861169167400645E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.17223383348013E-152d + "'", double2 == 8.17223383348013E-152d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3178");
        double double2 = JavaAlgorithms.calculateTax(6.582018229284904E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.316403645856981E-147d + "'", double2 == 1.316403645856981E-147d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3179");
        double double2 = JavaAlgorithms.calculateTax(1.766847064778408E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.533694129556816E-164d + "'", double2 == 3.533694129556816E-164d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3180");
        double double2 = JavaAlgorithms.calculateTax(5.880067031582533E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1760134063165066E-171d + "'", double2 == 1.1760134063165066E-171d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3181");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139622E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.265614583427925E-149d + "'", double2 == 5.265614583427925E-149d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3182");
        double double2 = JavaAlgorithms.calculateTax(4.113761393303065E-146d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.227522786606131E-147d + "'", double2 == 8.227522786606131E-147d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3183");
        double double2 = JavaAlgorithms.calculateTax(2.043058458370032E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0861169167400645E-151d + "'", double2 == 4.0861169167400645E-151d);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3184");
        double double2 = JavaAlgorithms.calculateTax(7.199082438280359E-144d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.439816487656072E-144d + "'", double2 == 1.439816487656072E-144d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3185");
        double double2 = JavaAlgorithms.calculateTax(4.607412760499431E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.214825520998862E-149d + "'", double2 == 9.214825520998862E-149d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3186");
        double double2 = JavaAlgorithms.calculateTax(8.17223383348013E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.634446766696026E-152d + "'", double2 == 1.634446766696026E-152d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3187");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139622E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.265614583427925E-149d + "'", double2 == 5.265614583427925E-149d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3188");
        double double2 = JavaAlgorithms.calculateTax(5.265614583427925E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.053122916685585E-149d + "'", double2 == 1.053122916685585E-149d);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3189");
        double double2 = JavaAlgorithms.calculateTax(8.17223383348013E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.634446766696026E-152d + "'", double2 == 1.634446766696026E-152d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3190");
        double double2 = JavaAlgorithms.calculateTax(2.2085588309730097E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4171176619460194E-162d + "'", double2 == 4.4171176619460194E-162d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3191");
        double double2 = JavaAlgorithms.calculateTax(2.3520268126330134E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.704053625266027E-173d + "'", double2 == 4.704053625266027E-173d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3192");
        double double2 = JavaAlgorithms.calculateTax(1.316403645856981E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139622E-148d + "'", double2 == 2.6328072917139622E-148d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3193");
        double double2 = JavaAlgorithms.calculateTax(2.3037063802497154E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.607412760499431E-148d + "'", double2 == 4.607412760499431E-148d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3194");
        double double2 = JavaAlgorithms.calculateTax(4.113761393303065E-146d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.227522786606131E-147d + "'", double2 == 8.227522786606131E-147d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3195");
        double double2 = JavaAlgorithms.calculateTax(1.634446766696026E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2688935333920523E-153d + "'", double2 == 3.2688935333920523E-153d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3196");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113632E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4134776518227265E-165d + "'", double2 == 1.4134776518227265E-165d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3197");
        double double2 = JavaAlgorithms.calculateTax(1.053122916685585E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1062458333711701E-150d + "'", double2 == 2.1062458333711701E-150d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3198");
        double double2 = JavaAlgorithms.calculateTax(9.214825520998862E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8429651041997725E-149d + "'", double2 == 1.8429651041997725E-149d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3199");
        double double2 = JavaAlgorithms.calculateTax(1.8429651041997725E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.685930208399545E-150d + "'", double2 == 3.685930208399545E-150d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3200");
        double double2 = JavaAlgorithms.calculateTax(4.607412760499431E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.214825520998862E-149d + "'", double2 == 9.214825520998862E-149d);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3201");
        double double2 = JavaAlgorithms.calculateTax(1.053122916685585E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1062458333711701E-150d + "'", double2 == 2.1062458333711701E-150d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3202");
        double double2 = JavaAlgorithms.calculateTax(5.265614583427925E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.053122916685585E-149d + "'", double2 == 1.053122916685585E-149d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3203");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744158E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488317E-160d + "'", double2 == 8.627182933488317E-160d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3204");
        double double2 = JavaAlgorithms.calculateTax(2.156795733372079E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744158E-159d + "'", double2 == 4.313591466744158E-159d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3205");
        double double2 = JavaAlgorithms.calculateTax(4.704053625266027E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.408107250532055E-174d + "'", double2 == 9.408107250532055E-174d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3206");
        double double2 = JavaAlgorithms.calculateTax(3.2688935333920523E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.537787066784105E-154d + "'", double2 == 6.537787066784105E-154d);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3207");
        double double2 = JavaAlgorithms.calculateTax(6.537787066784105E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3075574133568212E-154d + "'", double2 == 1.3075574133568212E-154d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3208");
        double double2 = JavaAlgorithms.calculateTax(3.2688935333920523E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.537787066784105E-154d + "'", double2 == 6.537787066784105E-154d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3209");
        double double2 = JavaAlgorithms.calculateTax(2.879632975312144E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.759265950624288E-146d + "'", double2 == 5.759265950624288E-146d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3210");
        double double2 = JavaAlgorithms.calculateTax(8.227522786606131E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.645504557321226E-147d + "'", double2 == 1.645504557321226E-147d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3211");
        double double2 = JavaAlgorithms.calculateTax(2.1062458333711701E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2124916667423406E-151d + "'", double2 == 4.2124916667423406E-151d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3212");
        double double2 = JavaAlgorithms.calculateTax(1.645504557321226E-147d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.291009114642453E-148d + "'", double2 == 3.291009114642453E-148d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3213");
        double double2 = JavaAlgorithms.calculateTax(1.645504557321226E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.291009114642453E-148d + "'", double2 == 3.291009114642453E-148d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3214");
        double double2 = JavaAlgorithms.calculateTax(4.2124916667423406E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.42498333348468E-152d + "'", double2 == 8.42498333348468E-152d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3215");
        double double2 = JavaAlgorithms.calculateTax(1.4134776518227265E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.826955303645453E-166d + "'", double2 == 2.826955303645453E-166d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3216");
        double double2 = JavaAlgorithms.calculateTax(1.634446766696026E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2688935333920523E-153d + "'", double2 == 3.2688935333920523E-153d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3217");
        double double2 = JavaAlgorithms.calculateTax(3.685930208399545E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.371860416799091E-151d + "'", double2 == 7.371860416799091E-151d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3218");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488317E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976635E-160d + "'", double2 == 1.7254365866976635E-160d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3219");
        double double2 = JavaAlgorithms.calculateTax(4.704053625266027E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.408107250532055E-174d + "'", double2 == 9.408107250532055E-174d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3220");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976635E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450873173395327E-161d + "'", double2 == 3.450873173395327E-161d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3221");
        double double2 = JavaAlgorithms.calculateTax(3.450873173395327E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790655E-162d + "'", double2 == 6.901746346790655E-162d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3222");
        double double2 = JavaAlgorithms.calculateTax(2.1062458333711701E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2124916667423406E-151d + "'", double2 == 4.2124916667423406E-151d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3223");
        double double2 = JavaAlgorithms.calculateTax(3.450873173395327E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790655E-162d + "'", double2 == 6.901746346790655E-162d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3224");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790655E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.380349269358131E-162d + "'", double2 == 1.380349269358131E-162d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3225");
        double double2 = JavaAlgorithms.calculateTax(3.291009114642453E-148d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.5820182292849055E-149d + "'", double2 == 6.5820182292849055E-149d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3226");
        double double2 = JavaAlgorithms.calculateTax(1.3075574133568212E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6151148267136424E-155d + "'", double2 == 2.6151148267136424E-155d);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3227");
        double double2 = JavaAlgorithms.calculateTax(6.5820182292849055E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3164036458569813E-149d + "'", double2 == 1.3164036458569813E-149d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3228");
        double double2 = JavaAlgorithms.calculateTax(6.537787066784105E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3075574133568212E-154d + "'", double2 == 1.3075574133568212E-154d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3229");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790655E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.380349269358131E-162d + "'", double2 == 1.380349269358131E-162d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3230");
        double double2 = JavaAlgorithms.calculateTax(1.3164036458569813E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139625E-150d + "'", double2 == 2.6328072917139625E-150d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3231");
        double double2 = JavaAlgorithms.calculateTax(8.42498333348468E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969362E-152d + "'", double2 == 1.6849966666969362E-152d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3232");
        double double2 = JavaAlgorithms.calculateTax(1.3075574133568212E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6151148267136424E-155d + "'", double2 == 2.6151148267136424E-155d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3233");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113632E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4134776518227265E-165d + "'", double2 == 1.4134776518227265E-165d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3234");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139625E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2656145834279254E-151d + "'", double2 == 5.2656145834279254E-151d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3235");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488317E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976635E-160d + "'", double2 == 1.7254365866976635E-160d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3236");
        double double2 = JavaAlgorithms.calculateTax(8.42498333348468E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969362E-152d + "'", double2 == 1.6849966666969362E-152d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3237");
        double double2 = JavaAlgorithms.calculateTax(1.8429651041997725E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.685930208399545E-150d + "'", double2 == 3.685930208399545E-150d);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3238");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969362E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938725E-153d + "'", double2 == 3.3699933333938725E-153d);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3239");
        double double2 = JavaAlgorithms.calculateTax(1.4134776518227265E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.826955303645453E-166d + "'", double2 == 2.826955303645453E-166d);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3240");
        double double2 = JavaAlgorithms.calculateTax(2.6151148267136424E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.230229653427285E-156d + "'", double2 == 5.230229653427285E-156d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3241");
        double double2 = JavaAlgorithms.calculateTax(1.3164036458569813E-149d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6328072917139625E-150d + "'", double2 == 2.6328072917139625E-150d);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3242");
        double double2 = JavaAlgorithms.calculateTax(1.380349269358131E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.760698538716262E-163d + "'", double2 == 2.760698538716262E-163d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3243");
        double double2 = JavaAlgorithms.calculateTax(4.2124916667423406E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.42498333348468E-152d + "'", double2 == 8.42498333348468E-152d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3244");
        double double2 = JavaAlgorithms.calculateTax(3.291009114642453E-148d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.5820182292849055E-149d + "'", double2 == 6.5820182292849055E-149d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3245");
        double double2 = JavaAlgorithms.calculateTax(2.826955303645453E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6539106072909065E-167d + "'", double2 == 5.6539106072909065E-167d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3246");
        double double2 = JavaAlgorithms.calculateTax(6.5820182292849055E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3164036458569813E-149d + "'", double2 == 1.3164036458569813E-149d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3247");
        double double2 = JavaAlgorithms.calculateTax(8.227522786606131E-147d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.645504557321226E-147d + "'", double2 == 1.645504557321226E-147d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3248");
        double double2 = JavaAlgorithms.calculateTax(1.380349269358131E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.760698538716262E-163d + "'", double2 == 2.760698538716262E-163d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3249");
        double double2 = JavaAlgorithms.calculateTax(5.2656145834279254E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0531229166855851E-151d + "'", double2 == 1.0531229166855851E-151d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3250");
        double double2 = JavaAlgorithms.calculateTax(9.214825520998862E-149d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8429651041997725E-149d + "'", double2 == 1.8429651041997725E-149d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3251");
        double double2 = JavaAlgorithms.calculateTax(1.0531229166855851E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.10624583337117E-152d + "'", double2 == 2.10624583337117E-152d);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3252");
        double double2 = JavaAlgorithms.calculateTax(1.0531229166855851E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.10624583337117E-152d + "'", double2 == 2.10624583337117E-152d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3253");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976635E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450873173395327E-161d + "'", double2 == 3.450873173395327E-161d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3254");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938725E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787745E-154d + "'", double2 == 6.739986666787745E-154d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3255");
        double double2 = JavaAlgorithms.calculateTax(1.439816487656072E-144d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.879632975312144E-145d + "'", double2 == 2.879632975312144E-145d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3256");
        double double2 = JavaAlgorithms.calculateTax(9.408107250532055E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8816214501064111E-174d + "'", double2 == 1.8816214501064111E-174d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3257");
        double double2 = JavaAlgorithms.calculateTax(5.230229653427285E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.046045930685457E-156d + "'", double2 == 1.046045930685457E-156d);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3258");
        double double2 = JavaAlgorithms.calculateTax(2.760698538716262E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432525E-164d + "'", double2 == 5.521397077432525E-164d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3259");
        double double2 = JavaAlgorithms.calculateTax(4.0861169167400645E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.17223383348013E-152d + "'", double2 == 8.17223383348013E-152d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3260");
        double double2 = JavaAlgorithms.calculateTax(3.6750418947390817E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.350083789478164E-169d + "'", double2 == 7.350083789478164E-169d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3261");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787745E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.347997333357549E-154d + "'", double2 == 1.347997333357549E-154d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3262");
        double double2 = JavaAlgorithms.calculateTax(5.6539106072909065E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581814E-167d + "'", double2 == 1.1307821214581814E-167d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3263");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432525E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.104279415486505E-164d + "'", double2 == 1.104279415486505E-164d);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3264");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969362E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938725E-153d + "'", double2 == 3.3699933333938725E-153d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3265");
        double double2 = JavaAlgorithms.calculateTax(3.685930208399545E-150d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.371860416799091E-151d + "'", double2 == 7.371860416799091E-151d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3266");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787745E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.347997333357549E-154d + "'", double2 == 1.347997333357549E-154d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3267");
        double double2 = JavaAlgorithms.calculateTax(2.826955303645453E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6539106072909065E-167d + "'", double2 == 5.6539106072909065E-167d);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3268");
        double double2 = JavaAlgorithms.calculateTax(7.371860416799091E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4743720833598182E-151d + "'", double2 == 1.4743720833598182E-151d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3269");
        double double2 = JavaAlgorithms.calculateTax(2.10624583337117E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2124916667423406E-153d + "'", double2 == 4.2124916667423406E-153d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3270");
        double double2 = JavaAlgorithms.calculateTax(1.8816214501064111E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.763242900212822E-175d + "'", double2 == 3.763242900212822E-175d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3271");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744158E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488317E-160d + "'", double2 == 8.627182933488317E-160d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3272");
        double double2 = JavaAlgorithms.calculateTax(4.2124916667423406E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.424983333484681E-154d + "'", double2 == 8.424983333484681E-154d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3273");
        double double2 = JavaAlgorithms.calculateTax(8.424983333484681E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969362E-154d + "'", double2 == 1.6849966666969362E-154d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3274");
        double double2 = JavaAlgorithms.calculateTax(8.424983333484681E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6849966666969362E-154d + "'", double2 == 1.6849966666969362E-154d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3275");
        double double2 = JavaAlgorithms.calculateTax(5.230229653427285E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.046045930685457E-156d + "'", double2 == 1.046045930685457E-156d);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3276");
        double double2 = JavaAlgorithms.calculateTax(1.104279415486505E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.20855883097301E-165d + "'", double2 == 2.20855883097301E-165d);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3277");
        double double2 = JavaAlgorithms.calculateTax(1.4743720833598182E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.948744166719637E-152d + "'", double2 == 2.948744166719637E-152d);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3278");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432525E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.104279415486505E-164d + "'", double2 == 1.104279415486505E-164d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3279");
        double double2 = JavaAlgorithms.calculateTax(7.371860416799091E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4743720833598182E-151d + "'", double2 == 1.4743720833598182E-151d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3280");
        double double2 = JavaAlgorithms.calculateTax(2.20855883097301E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.41711766194602E-166d + "'", double2 == 4.41711766194602E-166d);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3281");
        double double2 = JavaAlgorithms.calculateTax(2.948744166719637E-152d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.897488333439274E-153d + "'", double2 == 5.897488333439274E-153d);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3282");
        double double2 = JavaAlgorithms.calculateTax(9.408107250532055E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8816214501064111E-174d + "'", double2 == 1.8816214501064111E-174d);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3283");
        double double2 = JavaAlgorithms.calculateTax(2.10624583337117E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2124916667423406E-153d + "'", double2 == 4.2124916667423406E-153d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3284");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938725E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787745E-154d + "'", double2 == 6.739986666787745E-154d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3285");
        double double2 = JavaAlgorithms.calculateTax(5.897488333439274E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1794976666878548E-153d + "'", double2 == 1.1794976666878548E-153d);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3286");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581814E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.261564242916363E-168d + "'", double2 == 2.261564242916363E-168d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3287");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969362E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938727E-155d + "'", double2 == 3.3699933333938727E-155d);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3288");
        double double2 = JavaAlgorithms.calculateTax(1.104279415486505E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.20855883097301E-165d + "'", double2 == 2.20855883097301E-165d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3289");
        double double2 = JavaAlgorithms.calculateTax(5.2656145834279254E-151d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0531229166855851E-151d + "'", double2 == 1.0531229166855851E-151d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3290");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938727E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787746E-156d + "'", double2 == 6.739986666787746E-156d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3291");
        double double2 = JavaAlgorithms.calculateTax(1.8816214501064111E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.763242900212822E-175d + "'", double2 == 3.763242900212822E-175d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3292");
        double double2 = JavaAlgorithms.calculateTax(2.6328072917139625E-150d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2656145834279254E-151d + "'", double2 == 5.2656145834279254E-151d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3293");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787746E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3479973333575493E-156d + "'", double2 == 1.3479973333575493E-156d);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3294");
        double double2 = JavaAlgorithms.calculateTax(2.20855883097301E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.41711766194602E-166d + "'", double2 == 4.41711766194602E-166d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3295");
        double double2 = JavaAlgorithms.calculateTax(2.6151148267136424E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.230229653427285E-156d + "'", double2 == 5.230229653427285E-156d);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3296");
        double double2 = JavaAlgorithms.calculateTax(1.6849966666969362E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3699933333938727E-155d + "'", double2 == 3.3699933333938727E-155d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3297");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581814E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.261564242916363E-168d + "'", double2 == 2.261564242916363E-168d);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3298");
        double double2 = JavaAlgorithms.calculateTax(5.897488333439274E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1794976666878548E-153d + "'", double2 == 1.1794976666878548E-153d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3299");
        double double2 = JavaAlgorithms.calculateTax(1.3479973333575493E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6959946667150986E-157d + "'", double2 == 2.6959946667150986E-157d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3300");
        double double2 = JavaAlgorithms.calculateTax(2.261564242916363E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.523128485832726E-169d + "'", double2 == 4.523128485832726E-169d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3301");
        double double2 = JavaAlgorithms.calculateTax(8.22752278660613E-145d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.645504557321226E-145d + "'", double2 == 1.645504557321226E-145d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3302");
        double double2 = JavaAlgorithms.calculateTax(1.1794976666878548E-153d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3589953333757097E-154d + "'", double2 == 2.3589953333757097E-154d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3303");
        double double2 = JavaAlgorithms.calculateTax(3.3699933333938727E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.739986666787746E-156d + "'", double2 == 6.739986666787746E-156d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3304");
        double double2 = JavaAlgorithms.calculateTax(2.948744166719637E-152d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.897488333439274E-153d + "'", double2 == 5.897488333439274E-153d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3305");
        double double2 = JavaAlgorithms.calculateTax(1.3479973333575493E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6959946667150986E-157d + "'", double2 == 2.6959946667150986E-157d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3306");
        double double2 = JavaAlgorithms.calculateTax(2.261564242916363E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.523128485832726E-169d + "'", double2 == 4.523128485832726E-169d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3307");
        double double2 = JavaAlgorithms.calculateTax(3.763242900212822E-175d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.526485800425645E-176d + "'", double2 == 7.526485800425645E-176d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3308");
        double double2 = JavaAlgorithms.calculateTax(1.347997333357549E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6959946667150985E-155d + "'", double2 == 2.6959946667150985E-155d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3309");
        double double2 = JavaAlgorithms.calculateTax(2.6959946667150985E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430197E-156d + "'", double2 == 5.391989333430197E-156d);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3310");
        double double2 = JavaAlgorithms.calculateTax(4.41711766194602E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-167d + "'", double2 == 8.83423532389204E-167d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3311");
        double double2 = JavaAlgorithms.calculateTax(4.41711766194602E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-167d + "'", double2 == 8.83423532389204E-167d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3312");
        double double2 = JavaAlgorithms.calculateTax(2.6959946667150986E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430197E-158d + "'", double2 == 5.391989333430197E-158d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3313");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430197E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860395E-156d + "'", double2 == 1.0783978666860395E-156d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3314");
        double double2 = JavaAlgorithms.calculateTax(1.347997333357549E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6959946667150985E-155d + "'", double2 == 2.6959946667150985E-155d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3315");
        double double2 = JavaAlgorithms.calculateTax(5.6539106072909065E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581814E-167d + "'", double2 == 1.1307821214581814E-167d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3316");
        double double2 = JavaAlgorithms.calculateTax(2.3589953333757097E-154d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7179906667514194E-155d + "'", double2 == 4.7179906667514194E-155d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3317");
        double double2 = JavaAlgorithms.calculateTax(1.046045930685457E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.092091861370914E-157d + "'", double2 == 2.092091861370914E-157d);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3318");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.766847064778408E-167d + "'", double2 == 1.766847064778408E-167d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3319");
        double double2 = JavaAlgorithms.calculateTax(2.3589953333757097E-154d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7179906667514194E-155d + "'", double2 == 4.7179906667514194E-155d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3320");
        double double2 = JavaAlgorithms.calculateTax(2.092091861370914E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.184183722741828E-158d + "'", double2 == 4.184183722741828E-158d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3321");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430197E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860395E-158d + "'", double2 == 1.0783978666860395E-158d);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3322");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860395E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.156795733372079E-157d + "'", double2 == 2.156795733372079E-157d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3323");
        double double2 = JavaAlgorithms.calculateTax(1.4743720833598182E-151d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.948744166719637E-152d + "'", double2 == 2.948744166719637E-152d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3324");
        double double2 = JavaAlgorithms.calculateTax(3.763242900212822E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.526485800425645E-176d + "'", double2 == 7.526485800425645E-176d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3325");
        double double2 = JavaAlgorithms.calculateTax(7.526485800425645E-176d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.505297160085129E-176d + "'", double2 == 1.505297160085129E-176d);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3326");
        double double2 = JavaAlgorithms.calculateTax(4.7179906667514194E-155d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.43598133350284E-156d + "'", double2 == 9.43598133350284E-156d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3327");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430197E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860395E-156d + "'", double2 == 1.0783978666860395E-156d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3328");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.766847064778408E-167d + "'", double2 == 1.766847064778408E-167d);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3329");
        double double2 = JavaAlgorithms.calculateTax(2.156795733372079E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744158E-158d + "'", double2 == 4.313591466744158E-158d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3330");
        double double2 = JavaAlgorithms.calculateTax(9.43598133350284E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8871962667005682E-156d + "'", double2 == 1.8871962667005682E-156d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3331");
        double double2 = JavaAlgorithms.calculateTax(6.739986666787746E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3479973333575493E-156d + "'", double2 == 1.3479973333575493E-156d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3332");
        double double2 = JavaAlgorithms.calculateTax(2.6959946667150986E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430197E-158d + "'", double2 == 5.391989333430197E-158d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3333");
        double double2 = JavaAlgorithms.calculateTax(4.523128485832726E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665454E-170d + "'", double2 == 9.046256971665454E-170d);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3334");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860395E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.156795733372079E-159d + "'", double2 == 2.156795733372079E-159d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3335");
        double double2 = JavaAlgorithms.calculateTax(1.766847064778408E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5336941295568166E-168d + "'", double2 == 3.5336941295568166E-168d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3336");
        double double2 = JavaAlgorithms.calculateTax(2.092091861370914E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.184183722741828E-158d + "'", double2 == 4.184183722741828E-158d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3337");
        double double2 = JavaAlgorithms.calculateTax(4.184183722741828E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.368367445483657E-159d + "'", double2 == 8.368367445483657E-159d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3338");
        double double2 = JavaAlgorithms.calculateTax(7.526485800425645E-176d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.505297160085129E-176d + "'", double2 == 1.505297160085129E-176d);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3339");
        double double2 = JavaAlgorithms.calculateTax(3.5336941295568166E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113634E-169d + "'", double2 == 7.067388259113634E-169d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3340");
        double double2 = JavaAlgorithms.calculateTax(2.6959946667150985E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.391989333430197E-156d + "'", double2 == 5.391989333430197E-156d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3341");
        double double2 = JavaAlgorithms.calculateTax(8.368367445483657E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6736734890967315E-159d + "'", double2 == 1.6736734890967315E-159d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3342");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113634E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4134776518227268E-169d + "'", double2 == 1.4134776518227268E-169d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3343");
        double double2 = JavaAlgorithms.calculateTax(2.156795733372079E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744159E-160d + "'", double2 == 4.313591466744159E-160d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3344");
        double double2 = JavaAlgorithms.calculateTax(5.391989333430197E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0783978666860395E-158d + "'", double2 == 1.0783978666860395E-158d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3345");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744158E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488316E-159d + "'", double2 == 8.627182933488316E-159d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3346");
        double double2 = JavaAlgorithms.calculateTax(1.505297160085129E-176d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0105943201702583E-177d + "'", double2 == 3.0105943201702583E-177d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3347");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488316E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976635E-159d + "'", double2 == 1.7254365866976635E-159d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3348");
        double double2 = JavaAlgorithms.calculateTax(1.8871962667005682E-156d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7743925334011365E-157d + "'", double2 == 3.7743925334011365E-157d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3349");
        double double2 = JavaAlgorithms.calculateTax(1.8871962667005682E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7743925334011365E-157d + "'", double2 == 3.7743925334011365E-157d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3350");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665454E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330908E-170d + "'", double2 == 1.8092513943330908E-170d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3351");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744158E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488316E-159d + "'", double2 == 8.627182933488316E-159d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3352");
        double double2 = JavaAlgorithms.calculateTax(4.2124916667423406E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.424983333484681E-154d + "'", double2 == 8.424983333484681E-154d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3353");
        double double2 = JavaAlgorithms.calculateTax(1.505297160085129E-176d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0105943201702583E-177d + "'", double2 == 3.0105943201702583E-177d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3354");
        double double2 = JavaAlgorithms.calculateTax(1.1794976666878548E-153d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3589953333757097E-154d + "'", double2 == 2.3589953333757097E-154d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3355");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860395E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.156795733372079E-159d + "'", double2 == 2.156795733372079E-159d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3356");
        double double2 = JavaAlgorithms.calculateTax(3.5336941295568166E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113634E-169d + "'", double2 == 7.067388259113634E-169d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3357");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488316E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976635E-159d + "'", double2 == 1.7254365866976635E-159d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3358");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976635E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450873173395327E-160d + "'", double2 == 3.450873173395327E-160d);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3359");
        double double2 = JavaAlgorithms.calculateTax(1.0783978666860395E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.156795733372079E-157d + "'", double2 == 2.156795733372079E-157d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3360");
        double double2 = JavaAlgorithms.calculateTax(3.450873173395327E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790654E-161d + "'", double2 == 6.901746346790654E-161d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3361");
        double double2 = JavaAlgorithms.calculateTax(4.523128485832726E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665454E-170d + "'", double2 == 9.046256971665454E-170d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3362");
        double double2 = JavaAlgorithms.calculateTax(9.43598133350284E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8871962667005682E-156d + "'", double2 == 1.8871962667005682E-156d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3363");
        double double2 = JavaAlgorithms.calculateTax(2.156795733372079E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744159E-160d + "'", double2 == 4.313591466744159E-160d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3364");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790654E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.380349269358131E-161d + "'", double2 == 1.380349269358131E-161d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3365");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976635E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450873173395327E-160d + "'", double2 == 3.450873173395327E-160d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3366");
        double double2 = JavaAlgorithms.calculateTax(1.380349269358131E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.760698538716262E-162d + "'", double2 == 2.760698538716262E-162d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3367");
        double double2 = JavaAlgorithms.calculateTax(2.760698538716262E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432525E-164d + "'", double2 == 5.521397077432525E-164d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3368");
        double double2 = JavaAlgorithms.calculateTax(8.368367445483657E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6736734890967315E-159d + "'", double2 == 1.6736734890967315E-159d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3369");
        double double2 = JavaAlgorithms.calculateTax(2.156795733372079E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.313591466744158E-158d + "'", double2 == 4.313591466744158E-158d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3370");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113634E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4134776518227268E-169d + "'", double2 == 1.4134776518227268E-169d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3371");
        double double2 = JavaAlgorithms.calculateTax(1.6736734890967315E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.347346978193463E-160d + "'", double2 == 3.347346978193463E-160d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3372");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330908E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666182E-171d + "'", double2 == 3.618502788666182E-171d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3373");
        double double2 = JavaAlgorithms.calculateTax(4.7179906667514194E-155d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.43598133350284E-156d + "'", double2 == 9.43598133350284E-156d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3374");
        double double2 = JavaAlgorithms.calculateTax(4.184183722741828E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.368367445483657E-159d + "'", double2 == 8.368367445483657E-159d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3375");
        double double2 = JavaAlgorithms.calculateTax(3.7743925334011365E-157d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.548785066802273E-158d + "'", double2 == 7.548785066802273E-158d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3376");
        double double2 = JavaAlgorithms.calculateTax(2.760698538716262E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432524E-163d + "'", double2 == 5.521397077432524E-163d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3377");
        double double2 = JavaAlgorithms.calculateTax(1.6736734890967315E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.347346978193463E-160d + "'", double2 == 3.347346978193463E-160d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3378");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330908E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666182E-171d + "'", double2 == 3.618502788666182E-171d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3379");
        double double2 = JavaAlgorithms.calculateTax(1.046045930685457E-156d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.092091861370914E-157d + "'", double2 == 2.092091861370914E-157d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3380");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666182E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332365E-172d + "'", double2 == 7.237005577332365E-172d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3381");
        double double2 = JavaAlgorithms.calculateTax(7.548785066802273E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5097570133604547E-158d + "'", double2 == 1.5097570133604547E-158d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3382");
        double double2 = JavaAlgorithms.calculateTax(1.4134776518227268E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.826955303645454E-170d + "'", double2 == 2.826955303645454E-170d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3383");
        double double2 = JavaAlgorithms.calculateTax(3.0105943201702583E-177d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.021188640340517E-178d + "'", double2 == 6.021188640340517E-178d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3384");
        double double2 = JavaAlgorithms.calculateTax(3.347346978193463E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.6946939563869265E-161d + "'", double2 == 6.6946939563869265E-161d);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3385");
        double double2 = JavaAlgorithms.calculateTax(2.826955303645454E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6539106072909085E-171d + "'", double2 == 5.6539106072909085E-171d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3386");
        double double2 = JavaAlgorithms.calculateTax(1.5097570133604547E-158d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0195140267209093E-159d + "'", double2 == 3.0195140267209093E-159d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3387");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432524E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.104279415486505E-163d + "'", double2 == 1.104279415486505E-163d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3388");
        double double2 = JavaAlgorithms.calculateTax(1.4134776518227268E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.826955303645454E-170d + "'", double2 == 2.826955303645454E-170d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3389");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665454E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330908E-170d + "'", double2 == 1.8092513943330908E-170d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3390");
        double double2 = JavaAlgorithms.calculateTax(2.826955303645454E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6539106072909085E-171d + "'", double2 == 5.6539106072909085E-171d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3391");
        double double2 = JavaAlgorithms.calculateTax(3.450873173395327E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790654E-161d + "'", double2 == 6.901746346790654E-161d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3392");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790654E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.380349269358131E-161d + "'", double2 == 1.380349269358131E-161d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3393");
        double double2 = JavaAlgorithms.calculateTax(6.021188640340517E-178d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2042377280681035E-178d + "'", double2 == 1.2042377280681035E-178d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3394");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744159E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488317E-161d + "'", double2 == 8.627182933488317E-161d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3395");
        double double2 = JavaAlgorithms.calculateTax(5.6539106072909085E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581818E-171d + "'", double2 == 1.1307821214581818E-171d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3396");
        double double2 = JavaAlgorithms.calculateTax(1.380349269358131E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.760698538716262E-162d + "'", double2 == 2.760698538716262E-162d);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3397");
        double double2 = JavaAlgorithms.calculateTax(7.237005577332365E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.447401115466473E-172d + "'", double2 == 1.447401115466473E-172d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3398");
        double double2 = JavaAlgorithms.calculateTax(1.766847064778408E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5336941295568166E-168d + "'", double2 == 3.5336941295568166E-168d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3399");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581818E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2615642429163637E-172d + "'", double2 == 2.2615642429163637E-172d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3400");
        double double2 = JavaAlgorithms.calculateTax(2.760698538716262E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432524E-163d + "'", double2 == 5.521397077432524E-163d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3401");
        double double2 = JavaAlgorithms.calculateTax(6.021188640340517E-178d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2042377280681035E-178d + "'", double2 == 1.2042377280681035E-178d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3402");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488317E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976635E-161d + "'", double2 == 1.7254365866976635E-161d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3403");
        double double2 = JavaAlgorithms.calculateTax(6.6946939563869265E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3389387912773853E-161d + "'", double2 == 1.3389387912773853E-161d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3404");
        double double2 = JavaAlgorithms.calculateTax(3.7743925334011365E-157d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.548785066802273E-158d + "'", double2 == 7.548785066802273E-158d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3405");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581818E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2615642429163637E-172d + "'", double2 == 2.2615642429163637E-172d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3406");
        double double2 = JavaAlgorithms.calculateTax(2.2615642429163637E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.523128485832728E-173d + "'", double2 == 4.523128485832728E-173d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3407");
        double double2 = JavaAlgorithms.calculateTax(8.627182933488317E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7254365866976635E-161d + "'", double2 == 1.7254365866976635E-161d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3408");
        double double2 = JavaAlgorithms.calculateTax(1.5097570133604547E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0195140267209093E-159d + "'", double2 == 3.0195140267209093E-159d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3409");
        double double2 = JavaAlgorithms.calculateTax(3.347346978193463E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.6946939563869265E-161d + "'", double2 == 6.6946939563869265E-161d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3410");
        double double2 = JavaAlgorithms.calculateTax(7.548785066802273E-158d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5097570133604547E-158d + "'", double2 == 1.5097570133604547E-158d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3411");
        double double2 = JavaAlgorithms.calculateTax(3.0195140267209093E-159d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.039028053441818E-160d + "'", double2 == 6.039028053441818E-160d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3412");
        double double2 = JavaAlgorithms.calculateTax(7.237005577332365E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.447401115466473E-172d + "'", double2 == 1.447401115466473E-172d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3413");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976635E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4508731733953273E-162d + "'", double2 == 3.4508731733953273E-162d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3414");
        double double2 = JavaAlgorithms.calculateTax(4.523128485832728E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665457E-174d + "'", double2 == 9.046256971665457E-174d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3415");
        double double2 = JavaAlgorithms.calculateTax(1.447401115466473E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8948022309329463E-173d + "'", double2 == 2.8948022309329463E-173d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3416");
        double double2 = JavaAlgorithms.calculateTax(1.7254365866976635E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4508731733953273E-162d + "'", double2 == 3.4508731733953273E-162d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3417");
        double double2 = JavaAlgorithms.calculateTax(2.8948022309329463E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.789604461865893E-174d + "'", double2 == 5.789604461865893E-174d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3418");
        double double2 = JavaAlgorithms.calculateTax(1.2042377280681035E-178d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.408475456136207E-179d + "'", double2 == 2.408475456136207E-179d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3419");
        double double2 = JavaAlgorithms.calculateTax(3.4508731733953273E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790655E-163d + "'", double2 == 6.901746346790655E-163d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3420");
        double double2 = JavaAlgorithms.calculateTax(3.0195140267209093E-159d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.039028053441818E-160d + "'", double2 == 6.039028053441818E-160d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3421");
        double double2 = JavaAlgorithms.calculateTax(1.447401115466473E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8948022309329463E-173d + "'", double2 == 2.8948022309329463E-173d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3422");
        double double2 = JavaAlgorithms.calculateTax(6.6946939563869265E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3389387912773853E-161d + "'", double2 == 1.3389387912773853E-161d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3423");
        double double2 = JavaAlgorithms.calculateTax(3.0105943201702583E-177d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.021188640340517E-178d + "'", double2 == 6.021188640340517E-178d);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3424");
        double double2 = JavaAlgorithms.calculateTax(3.4508731733953273E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.901746346790655E-163d + "'", double2 == 6.901746346790655E-163d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3425");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432524E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.104279415486505E-163d + "'", double2 == 1.104279415486505E-163d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3426");
        double double2 = JavaAlgorithms.calculateTax(1.2042377280681035E-178d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.408475456136207E-179d + "'", double2 == 2.408475456136207E-179d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3427");
        double double2 = JavaAlgorithms.calculateTax(2.2615642429163637E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.523128485832728E-173d + "'", double2 == 4.523128485832728E-173d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3428");
        double double2 = JavaAlgorithms.calculateTax(1.3389387912773853E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.677877582554771E-162d + "'", double2 == 2.677877582554771E-162d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3429");
        double double2 = JavaAlgorithms.calculateTax(5.789604461865893E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1579208923731786E-174d + "'", double2 == 1.1579208923731786E-174d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3430");
        double double2 = JavaAlgorithms.calculateTax(6.039028053441818E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2078056106883638E-160d + "'", double2 == 1.2078056106883638E-160d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3431");
        double double2 = JavaAlgorithms.calculateTax(2.408475456136207E-179d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.816950912272415E-180d + "'", double2 == 4.816950912272415E-180d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3432");
        double double2 = JavaAlgorithms.calculateTax(2.8948022309329463E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.789604461865893E-174d + "'", double2 == 5.789604461865893E-174d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3433");
        double double2 = JavaAlgorithms.calculateTax(2.677877582554771E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3557551651095425E-163d + "'", double2 == 5.3557551651095425E-163d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3434");
        double double2 = JavaAlgorithms.calculateTax(1.2078056106883638E-160d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4156112213767278E-161d + "'", double2 == 2.4156112213767278E-161d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3435");
        double double2 = JavaAlgorithms.calculateTax(5.3557551651095425E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0711510330219086E-163d + "'", double2 == 1.0711510330219086E-163d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3436");
        double double2 = JavaAlgorithms.calculateTax(1.0711510330219086E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1423020660438174E-164d + "'", double2 == 2.1423020660438174E-164d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3437");
        double double2 = JavaAlgorithms.calculateTax(4.313591466744159E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.627182933488317E-161d + "'", double2 == 8.627182933488317E-161d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3438");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790655E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.380349269358131E-163d + "'", double2 == 1.380349269358131E-163d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3439");
        double double2 = JavaAlgorithms.calculateTax(6.039028053441818E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2078056106883638E-160d + "'", double2 == 1.2078056106883638E-160d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3440");
        double double2 = JavaAlgorithms.calculateTax(6.901746346790655E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.380349269358131E-163d + "'", double2 == 1.380349269358131E-163d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3441");
        double double2 = JavaAlgorithms.calculateTax(5.789604461865893E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1579208923731786E-174d + "'", double2 == 1.1579208923731786E-174d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3442");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666182E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332365E-172d + "'", double2 == 7.237005577332365E-172d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3443");
        double double2 = JavaAlgorithms.calculateTax(4.816950912272415E-180d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.633901824544831E-181d + "'", double2 == 9.633901824544831E-181d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3444");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665457E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330915E-174d + "'", double2 == 1.8092513943330915E-174d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3445");
        double double2 = JavaAlgorithms.calculateTax(9.633901824544831E-181d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9267803649089663E-181d + "'", double2 == 1.9267803649089663E-181d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3446");
        double double2 = JavaAlgorithms.calculateTax(2.4156112213767278E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.831222442753456E-162d + "'", double2 == 4.831222442753456E-162d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3447");
        double double2 = JavaAlgorithms.calculateTax(2.1423020660438174E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.284604132087635E-165d + "'", double2 == 4.284604132087635E-165d);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3448");
        double double2 = JavaAlgorithms.calculateTax(4.284604132087635E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.569208264175271E-166d + "'", double2 == 8.569208264175271E-166d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3449");
        double double2 = JavaAlgorithms.calculateTax(4.831222442753456E-162d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.662444885506911E-163d + "'", double2 == 9.662444885506911E-163d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3450");
        double double2 = JavaAlgorithms.calculateTax(1.104279415486505E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.20855883097301E-164d + "'", double2 == 2.20855883097301E-164d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3451");
        double double2 = JavaAlgorithms.calculateTax(1.104279415486505E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.20855883097301E-164d + "'", double2 == 2.20855883097301E-164d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3452");
        double double2 = JavaAlgorithms.calculateTax(2.4156112213767278E-161d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.831222442753456E-162d + "'", double2 == 4.831222442753456E-162d);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3453");
        double double2 = JavaAlgorithms.calculateTax(1.0711510330219086E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1423020660438174E-164d + "'", double2 == 2.1423020660438174E-164d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3454");
        double double2 = JavaAlgorithms.calculateTax(2.677877582554771E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3557551651095425E-163d + "'", double2 == 5.3557551651095425E-163d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3455");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665457E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330915E-174d + "'", double2 == 1.8092513943330915E-174d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3456");
        double double2 = JavaAlgorithms.calculateTax(1.1579208923731786E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3158417847463572E-175d + "'", double2 == 2.3158417847463572E-175d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3457");
        double double2 = JavaAlgorithms.calculateTax(4.831222442753456E-162d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.662444885506911E-163d + "'", double2 == 9.662444885506911E-163d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3458");
        double double2 = JavaAlgorithms.calculateTax(9.633901824544831E-181d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9267803649089663E-181d + "'", double2 == 1.9267803649089663E-181d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3459");
        double double2 = JavaAlgorithms.calculateTax(1.1579208923731786E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3158417847463572E-175d + "'", double2 == 2.3158417847463572E-175d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3460");
        double double2 = JavaAlgorithms.calculateTax(8.569208264175271E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7138416528350542E-166d + "'", double2 == 1.7138416528350542E-166d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3461");
        double double2 = JavaAlgorithms.calculateTax(9.662444885506911E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9324889771013823E-163d + "'", double2 == 1.9324889771013823E-163d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3462");
        double double2 = JavaAlgorithms.calculateTax(1.7138416528350542E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.427683305670109E-167d + "'", double2 == 3.427683305670109E-167d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3463");
        double double2 = JavaAlgorithms.calculateTax(1.9267803649089663E-181d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8535607298179327E-182d + "'", double2 == 3.8535607298179327E-182d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3464");
        double double2 = JavaAlgorithms.calculateTax(3.8535607298179327E-182d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.707121459635866E-183d + "'", double2 == 7.707121459635866E-183d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3465");
        double double2 = JavaAlgorithms.calculateTax(1.9324889771013823E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.864977954202765E-164d + "'", double2 == 3.864977954202765E-164d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3466");
        double double2 = JavaAlgorithms.calculateTax(5.6539106072909085E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581818E-171d + "'", double2 == 1.1307821214581818E-171d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3467");
        double double2 = JavaAlgorithms.calculateTax(2.3158417847463572E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.631683569492715E-176d + "'", double2 == 4.631683569492715E-176d);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3468");
        double double2 = JavaAlgorithms.calculateTax(9.662444885506911E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9324889771013823E-163d + "'", double2 == 1.9324889771013823E-163d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3469");
        double double2 = JavaAlgorithms.calculateTax(2.20855883097301E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.41711766194602E-165d + "'", double2 == 4.41711766194602E-165d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3470");
        double double2 = JavaAlgorithms.calculateTax(1.7138416528350542E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.427683305670109E-167d + "'", double2 == 3.427683305670109E-167d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3471");
        double double2 = JavaAlgorithms.calculateTax(4.41711766194602E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-166d + "'", double2 == 8.83423532389204E-166d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3472");
        double double2 = JavaAlgorithms.calculateTax(3.864977954202765E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.729955908405531E-165d + "'", double2 == 7.729955908405531E-165d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3473");
        double double2 = JavaAlgorithms.calculateTax(3.427683305670109E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.855366611340219E-168d + "'", double2 == 6.855366611340219E-168d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3474");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330915E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666183E-175d + "'", double2 == 3.618502788666183E-175d);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3475");
        double double2 = JavaAlgorithms.calculateTax(4.41711766194602E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-166d + "'", double2 == 8.83423532389204E-166d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3476");
        double double2 = JavaAlgorithms.calculateTax(7.729955908405531E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5459911816811062E-165d + "'", double2 == 1.5459911816811062E-165d);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3477");
        double double2 = JavaAlgorithms.calculateTax(1.5459911816811062E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0919823633622123E-166d + "'", double2 == 3.0919823633622123E-166d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3478");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666183E-175d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332366E-176d + "'", double2 == 7.237005577332366E-176d);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3479");
        double double2 = JavaAlgorithms.calculateTax(6.855366611340219E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3710733222680438E-168d + "'", double2 == 1.3710733222680438E-168d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3480");
        double double2 = JavaAlgorithms.calculateTax(4.284604132087635E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.569208264175271E-166d + "'", double2 == 8.569208264175271E-166d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3481");
        double double2 = JavaAlgorithms.calculateTax(1.2078056106883638E-160d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4156112213767278E-161d + "'", double2 == 2.4156112213767278E-161d);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3482");
        double double2 = JavaAlgorithms.calculateTax(1.3710733222680438E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.742146644536088E-169d + "'", double2 == 2.742146644536088E-169d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3483");
        double double2 = JavaAlgorithms.calculateTax(5.3557551651095425E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0711510330219086E-163d + "'", double2 == 1.0711510330219086E-163d);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3484");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330915E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666183E-175d + "'", double2 == 3.618502788666183E-175d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3485");
        double double2 = JavaAlgorithms.calculateTax(3.0919823633622123E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.183964726724425E-167d + "'", double2 == 6.183964726724425E-167d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3486");
        double double2 = JavaAlgorithms.calculateTax(1.380349269358131E-163d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7606985387162624E-164d + "'", double2 == 2.7606985387162624E-164d);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3487");
        double double2 = JavaAlgorithms.calculateTax(6.183964726724425E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.236792945344885E-167d + "'", double2 == 1.236792945344885E-167d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3488");
        double double2 = JavaAlgorithms.calculateTax(2.408475456136207E-179d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.816950912272415E-180d + "'", double2 == 4.816950912272415E-180d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3489");
        double double2 = JavaAlgorithms.calculateTax(7.237005577332366E-176d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4474011154664732E-176d + "'", double2 == 1.4474011154664732E-176d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3490");
        double double2 = JavaAlgorithms.calculateTax(1.9267803649089663E-181d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8535607298179327E-182d + "'", double2 == 3.8535607298179327E-182d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3491");
        double double2 = JavaAlgorithms.calculateTax(7.707121459635866E-183d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5414242919271733E-183d + "'", double2 == 1.5414242919271733E-183d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3492");
        double double2 = JavaAlgorithms.calculateTax(2.7606985387162624E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432525E-165d + "'", double2 == 5.521397077432525E-165d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3493");
        double double2 = JavaAlgorithms.calculateTax(1.5414242919271733E-183d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.082848583854347E-184d + "'", double2 == 3.082848583854347E-184d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3494");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432525E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.104279415486505E-165d + "'", double2 == 1.104279415486505E-165d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3495");
        double double2 = JavaAlgorithms.calculateTax(3.8535607298179327E-182d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.707121459635866E-183d + "'", double2 == 7.707121459635866E-183d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3496");
        double double2 = JavaAlgorithms.calculateTax(1.236792945344885E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4735858906897705E-168d + "'", double2 == 2.4735858906897705E-168d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3497");
        double double2 = JavaAlgorithms.calculateTax(7.729955908405531E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5459911816811062E-165d + "'", double2 == 1.5459911816811062E-165d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3498");
        double double2 = JavaAlgorithms.calculateTax(3.0919823633622123E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.183964726724425E-167d + "'", double2 == 6.183964726724425E-167d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3499");
        double double2 = JavaAlgorithms.calculateTax(2.3158417847463572E-175d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.631683569492715E-176d + "'", double2 == 4.631683569492715E-176d);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression6.test3500");
        double double2 = JavaAlgorithms.calculateTax(7.237005577332366E-176d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4474011154664732E-176d + "'", double2 == 1.4474011154664732E-176d);
    }
}

