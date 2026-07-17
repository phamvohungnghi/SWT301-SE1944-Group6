import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegression7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3501");
        double double2 = JavaAlgorithms.calculateTax(4.631683569492715E-176d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.26336713898543E-177d + "'", double2 == 9.26336713898543E-177d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3502");
        double double2 = JavaAlgorithms.calculateTax(3.082848583854347E-184d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.165697167708694E-185d + "'", double2 == 6.165697167708694E-185d);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3503");
        double double2 = JavaAlgorithms.calculateTax(4.523128485832728E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665457E-174d + "'", double2 == 9.046256971665457E-174d);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3504");
        double double2 = JavaAlgorithms.calculateTax(1.5414242919271733E-183d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.082848583854347E-184d + "'", double2 == 3.082848583854347E-184d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3505");
        double double2 = JavaAlgorithms.calculateTax(6.183964726724425E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.236792945344885E-167d + "'", double2 == 1.236792945344885E-167d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3506");
        double double2 = JavaAlgorithms.calculateTax(9.26336713898543E-177d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.852673427797086E-177d + "'", double2 == 1.852673427797086E-177d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3507");
        double double2 = JavaAlgorithms.calculateTax(3.082848583854347E-184d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.165697167708694E-185d + "'", double2 == 6.165697167708694E-185d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3508");
        double double2 = JavaAlgorithms.calculateTax(6.855366611340219E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3710733222680438E-168d + "'", double2 == 1.3710733222680438E-168d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3509");
        double double2 = JavaAlgorithms.calculateTax(5.521397077432525E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.104279415486505E-165d + "'", double2 == 1.104279415486505E-165d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3510");
        double double2 = JavaAlgorithms.calculateTax(9.26336713898543E-177d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.852673427797086E-177d + "'", double2 == 1.852673427797086E-177d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3511");
        double double2 = JavaAlgorithms.calculateTax(6.165697167708694E-185d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2331394335417389E-185d + "'", double2 == 1.2331394335417389E-185d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3512");
        double double2 = JavaAlgorithms.calculateTax(3.864977954202765E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.729955908405531E-165d + "'", double2 == 7.729955908405531E-165d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3513");
        double double2 = JavaAlgorithms.calculateTax(2.1423020660438174E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.284604132087635E-165d + "'", double2 == 4.284604132087635E-165d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3514");
        double double2 = JavaAlgorithms.calculateTax(1.236792945344885E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4735858906897705E-168d + "'", double2 == 2.4735858906897705E-168d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3515");
        double double2 = JavaAlgorithms.calculateTax(1.2331394335417389E-185d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.466278867083478E-186d + "'", double2 == 2.466278867083478E-186d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3516");
        double double2 = JavaAlgorithms.calculateTax(4.816950912272415E-180d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.633901824544831E-181d + "'", double2 == 9.633901824544831E-181d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3517");
        double double2 = JavaAlgorithms.calculateTax(2.7606985387162624E-164d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.521397077432525E-165d + "'", double2 == 5.521397077432525E-165d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3518");
        double double2 = JavaAlgorithms.calculateTax(1.104279415486505E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.20855883097301E-166d + "'", double2 == 2.20855883097301E-166d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3519");
        double double2 = JavaAlgorithms.calculateTax(1.4474011154664732E-176d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8948022309329467E-177d + "'", double2 == 2.8948022309329467E-177d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3520");
        double double2 = JavaAlgorithms.calculateTax(7.707121459635866E-183d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5414242919271733E-183d + "'", double2 == 1.5414242919271733E-183d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3521");
        double double2 = JavaAlgorithms.calculateTax(2.8948022309329467E-177d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.789604461865894E-178d + "'", double2 == 5.789604461865894E-178d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3522");
        double double2 = JavaAlgorithms.calculateTax(3.427683305670109E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.855366611340219E-168d + "'", double2 == 6.855366611340219E-168d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3523");
        double double2 = JavaAlgorithms.calculateTax(5.789604461865894E-178d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1579208923731788E-178d + "'", double2 == 1.1579208923731788E-178d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3524");
        double double2 = JavaAlgorithms.calculateTax(1.5459911816811062E-165d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0919823633622123E-166d + "'", double2 == 3.0919823633622123E-166d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3525");
        double double2 = JavaAlgorithms.calculateTax(2.466278867083478E-186d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.932557734166956E-187d + "'", double2 == 4.932557734166956E-187d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3526");
        double double2 = JavaAlgorithms.calculateTax(1.4474011154664732E-176d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8948022309329467E-177d + "'", double2 == 2.8948022309329467E-177d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3527");
        double double2 = JavaAlgorithms.calculateTax(4.932557734166956E-187d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.865115468333912E-188d + "'", double2 == 9.865115468333912E-188d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3528");
        double double2 = JavaAlgorithms.calculateTax(2.20855883097301E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.41711766194602E-167d + "'", double2 == 4.41711766194602E-167d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3529");
        double double2 = JavaAlgorithms.calculateTax(4.41711766194602E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-168d + "'", double2 == 8.83423532389204E-168d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3530");
        double double2 = JavaAlgorithms.calculateTax(2.20855883097301E-164d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.41711766194602E-165d + "'", double2 == 4.41711766194602E-165d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3531");
        double double2 = JavaAlgorithms.calculateTax(2.742146644536088E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.484293289072176E-170d + "'", double2 == 5.484293289072176E-170d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3532");
        double double2 = JavaAlgorithms.calculateTax(1.2331394335417389E-185d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.466278867083478E-186d + "'", double2 == 2.466278867083478E-186d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3533");
        double double2 = JavaAlgorithms.calculateTax(9.865115468333912E-188d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9730230936667824E-188d + "'", double2 == 1.9730230936667824E-188d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3534");
        double double2 = JavaAlgorithms.calculateTax(4.932557734166956E-187d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.865115468333912E-188d + "'", double2 == 9.865115468333912E-188d);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3535");
        double double2 = JavaAlgorithms.calculateTax(5.484293289072176E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0968586578144353E-170d + "'", double2 == 1.0968586578144353E-170d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3536");
        double double2 = JavaAlgorithms.calculateTax(1.9730230936667824E-188d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.946046187333565E-189d + "'", double2 == 3.946046187333565E-189d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3537");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7668470647784083E-168d + "'", double2 == 1.7668470647784083E-168d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3538");
        double double2 = JavaAlgorithms.calculateTax(1.9324889771013823E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.864977954202765E-164d + "'", double2 == 3.864977954202765E-164d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3539");
        double double2 = JavaAlgorithms.calculateTax(1.7668470647784083E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.533694129556817E-169d + "'", double2 == 3.533694129556817E-169d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3540");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666183E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332366E-176d + "'", double2 == 7.237005577332366E-176d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3541");
        double double2 = JavaAlgorithms.calculateTax(9.865115468333912E-188d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9730230936667824E-188d + "'", double2 == 1.9730230936667824E-188d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3542");
        double double2 = JavaAlgorithms.calculateTax(1.104279415486505E-165d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.20855883097301E-166d + "'", double2 == 2.20855883097301E-166d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3543");
        double double2 = JavaAlgorithms.calculateTax(2.20855883097301E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.41711766194602E-167d + "'", double2 == 4.41711766194602E-167d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3544");
        double double2 = JavaAlgorithms.calculateTax(1.0968586578144353E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1937173156288705E-171d + "'", double2 == 2.1937173156288705E-171d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3545");
        double double2 = JavaAlgorithms.calculateTax(4.631683569492715E-176d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.26336713898543E-177d + "'", double2 == 9.26336713898543E-177d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3546");
        double double2 = JavaAlgorithms.calculateTax(1.852673427797086E-177d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7053468555941724E-178d + "'", double2 == 3.7053468555941724E-178d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3547");
        double double2 = JavaAlgorithms.calculateTax(1.7668470647784083E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.533694129556817E-169d + "'", double2 == 3.533694129556817E-169d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3548");
        double double2 = JavaAlgorithms.calculateTax(1.0968586578144353E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1937173156288705E-171d + "'", double2 == 2.1937173156288705E-171d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3549");
        double double2 = JavaAlgorithms.calculateTax(1.1579208923731788E-178d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3158417847463578E-179d + "'", double2 == 2.3158417847463578E-179d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3550");
        double double2 = JavaAlgorithms.calculateTax(8.569208264175271E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7138416528350542E-166d + "'", double2 == 1.7138416528350542E-166d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3551");
        double double2 = JavaAlgorithms.calculateTax(1.3710733222680438E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.742146644536088E-169d + "'", double2 == 2.742146644536088E-169d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3552");
        double double2 = JavaAlgorithms.calculateTax(1.1579208923731788E-178d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3158417847463578E-179d + "'", double2 == 2.3158417847463578E-179d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3553");
        double double2 = JavaAlgorithms.calculateTax(2.3158417847463578E-179d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.631683569492716E-180d + "'", double2 == 4.631683569492716E-180d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3554");
        double double2 = JavaAlgorithms.calculateTax(3.533694129556817E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113634E-170d + "'", double2 == 7.067388259113634E-170d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3555");
        double double2 = JavaAlgorithms.calculateTax(3.946046187333565E-189d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.89209237466713E-190d + "'", double2 == 7.89209237466713E-190d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3556");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113634E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.413477651822727E-170d + "'", double2 == 1.413477651822727E-170d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3557");
        double double2 = JavaAlgorithms.calculateTax(3.7053468555941724E-178d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.410693711188346E-179d + "'", double2 == 7.410693711188346E-179d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3558");
        double double2 = JavaAlgorithms.calculateTax(7.410693711188346E-179d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4821387422376693E-179d + "'", double2 == 1.4821387422376693E-179d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3559");
        double double2 = JavaAlgorithms.calculateTax(2.1937173156288705E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3874346312577415E-172d + "'", double2 == 4.3874346312577415E-172d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3560");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.766847064778408E-166d + "'", double2 == 1.766847064778408E-166d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3561");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.766847064778408E-166d + "'", double2 == 1.766847064778408E-166d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3562");
        double double2 = JavaAlgorithms.calculateTax(3.7053468555941724E-178d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.410693711188346E-179d + "'", double2 == 7.410693711188346E-179d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3563");
        double double2 = JavaAlgorithms.calculateTax(3.533694129556817E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113634E-170d + "'", double2 == 7.067388259113634E-170d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3564");
        double double2 = JavaAlgorithms.calculateTax(4.631683569492716E-180d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.263367138985433E-181d + "'", double2 == 9.263367138985433E-181d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3565");
        double double2 = JavaAlgorithms.calculateTax(2.4735858906897705E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.947171781379541E-169d + "'", double2 == 4.947171781379541E-169d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3566");
        double double2 = JavaAlgorithms.calculateTax(1.4821387422376693E-179d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.964277484475339E-180d + "'", double2 == 2.964277484475339E-180d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3567");
        double double2 = JavaAlgorithms.calculateTax(4.41711766194602E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.83423532389204E-168d + "'", double2 == 8.83423532389204E-168d);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3568");
        double double2 = JavaAlgorithms.calculateTax(2.4735858906897705E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.947171781379541E-169d + "'", double2 == 4.947171781379541E-169d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3569");
        double double2 = JavaAlgorithms.calculateTax(9.263367138985433E-181d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8526734277970868E-181d + "'", double2 == 1.8526734277970868E-181d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3570");
        double double2 = JavaAlgorithms.calculateTax(1.413477651822727E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8269553036454543E-171d + "'", double2 == 2.8269553036454543E-171d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3571");
        double double2 = JavaAlgorithms.calculateTax(4.631683569492716E-180d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.263367138985433E-181d + "'", double2 == 9.263367138985433E-181d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3572");
        double double2 = JavaAlgorithms.calculateTax(5.789604461865894E-178d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1579208923731788E-178d + "'", double2 == 1.1579208923731788E-178d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3573");
        double double2 = JavaAlgorithms.calculateTax(1.4821387422376693E-179d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.964277484475339E-180d + "'", double2 == 2.964277484475339E-180d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3574");
        double double2 = JavaAlgorithms.calculateTax(7.410693711188346E-179d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4821387422376693E-179d + "'", double2 == 1.4821387422376693E-179d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3575");
        double double2 = JavaAlgorithms.calculateTax(1.8526734277970868E-181d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7053468555941736E-182d + "'", double2 == 3.7053468555941736E-182d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3576");
        double double2 = JavaAlgorithms.calculateTax(1.413477651822727E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8269553036454543E-171d + "'", double2 == 2.8269553036454543E-171d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3577");
        double double2 = JavaAlgorithms.calculateTax(2.8269553036454543E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.653910607290909E-172d + "'", double2 == 5.653910607290909E-172d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3578");
        double double2 = JavaAlgorithms.calculateTax(2.466278867083478E-186d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.932557734166956E-187d + "'", double2 == 4.932557734166956E-187d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3579");
        double double2 = JavaAlgorithms.calculateTax(2.1937173156288705E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3874346312577415E-172d + "'", double2 == 4.3874346312577415E-172d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3580");
        double double2 = JavaAlgorithms.calculateTax(1.766847064778408E-166d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.533694129556816E-167d + "'", double2 == 3.533694129556816E-167d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3581");
        double double2 = JavaAlgorithms.calculateTax(2.8269553036454543E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.653910607290909E-172d + "'", double2 == 5.653910607290909E-172d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3582");
        double double2 = JavaAlgorithms.calculateTax(5.653910607290909E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581819E-172d + "'", double2 == 1.1307821214581819E-172d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3583");
        double double2 = JavaAlgorithms.calculateTax(4.3874346312577415E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.774869262515483E-173d + "'", double2 == 8.774869262515483E-173d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3584");
        double double2 = JavaAlgorithms.calculateTax(2.964277484475339E-180d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.928554968950678E-181d + "'", double2 == 5.928554968950678E-181d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3585");
        double double2 = JavaAlgorithms.calculateTax(7.89209237466713E-190d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.578418474933426E-190d + "'", double2 == 1.578418474933426E-190d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3586");
        double double2 = JavaAlgorithms.calculateTax(4.947171781379541E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.894343562759083E-170d + "'", double2 == 9.894343562759083E-170d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3587");
        double double2 = JavaAlgorithms.calculateTax(3.7053468555941736E-182d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.410693711188348E-183d + "'", double2 == 7.410693711188348E-183d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3588");
        double double2 = JavaAlgorithms.calculateTax(3.533694129556816E-167d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113633E-168d + "'", double2 == 7.067388259113633E-168d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3589");
        double double2 = JavaAlgorithms.calculateTax(4.3874346312577415E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.774869262515483E-173d + "'", double2 == 8.774869262515483E-173d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3590");
        double double2 = JavaAlgorithms.calculateTax(3.533694129556816E-167d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067388259113633E-168d + "'", double2 == 7.067388259113633E-168d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3591");
        double double2 = JavaAlgorithms.calculateTax(7.410693711188348E-183d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4821387422376697E-183d + "'", double2 == 1.4821387422376697E-183d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3592");
        double double2 = JavaAlgorithms.calculateTax(1.380349269358131E-163d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7606985387162624E-164d + "'", double2 == 2.7606985387162624E-164d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3593");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113634E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.413477651822727E-170d + "'", double2 == 1.413477651822727E-170d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3594");
        double double2 = JavaAlgorithms.calculateTax(9.894343562759083E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9788687125518165E-170d + "'", double2 == 1.9788687125518165E-170d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3595");
        double double2 = JavaAlgorithms.calculateTax(3.7053468555941736E-182d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.410693711188348E-183d + "'", double2 == 7.410693711188348E-183d);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3596");
        double double2 = JavaAlgorithms.calculateTax(1.3389387912773853E-161d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.677877582554771E-162d + "'", double2 == 2.677877582554771E-162d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3597");
        double double2 = JavaAlgorithms.calculateTax(1.8526734277970868E-181d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7053468555941736E-182d + "'", double2 == 3.7053468555941736E-182d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3598");
        double double2 = JavaAlgorithms.calculateTax(2.8948022309329467E-177d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.789604461865894E-178d + "'", double2 == 5.789604461865894E-178d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3599");
        double double2 = JavaAlgorithms.calculateTax(9.894343562759083E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9788687125518165E-170d + "'", double2 == 1.9788687125518165E-170d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3600");
        double double2 = JavaAlgorithms.calculateTax(3.946046187333565E-189d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.89209237466713E-190d + "'", double2 == 7.89209237466713E-190d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3601");
        double double2 = JavaAlgorithms.calculateTax(5.484293289072176E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0968586578144353E-170d + "'", double2 == 1.0968586578144353E-170d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3602");
        double double2 = JavaAlgorithms.calculateTax(5.928554968950678E-181d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1857109937901356E-181d + "'", double2 == 1.1857109937901356E-181d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3603");
        double double2 = JavaAlgorithms.calculateTax(7.89209237466713E-190d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.578418474933426E-190d + "'", double2 == 1.578418474933426E-190d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3604");
        double double2 = JavaAlgorithms.calculateTax(1.766847064778408E-166d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.533694129556816E-167d + "'", double2 == 3.533694129556816E-167d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3605");
        double double2 = JavaAlgorithms.calculateTax(9.263367138985433E-181d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8526734277970868E-181d + "'", double2 == 1.8526734277970868E-181d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3606");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113633E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4134776518227267E-168d + "'", double2 == 1.4134776518227267E-168d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3607");
        double double2 = JavaAlgorithms.calculateTax(1.1857109937901356E-181d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3714219875802715E-182d + "'", double2 == 2.3714219875802715E-182d);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3608");
        double double2 = JavaAlgorithms.calculateTax(1.9788687125518165E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.957737425103633E-171d + "'", double2 == 3.957737425103633E-171d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3609");
        double double2 = JavaAlgorithms.calculateTax(2.742146644536088E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.484293289072176E-170d + "'", double2 == 5.484293289072176E-170d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3610");
        double double2 = JavaAlgorithms.calculateTax(1.578418474933426E-190d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.156836949866852E-191d + "'", double2 == 3.156836949866852E-191d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3611");
        double double2 = JavaAlgorithms.calculateTax(1.4134776518227267E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8269553036454537E-169d + "'", double2 == 2.8269553036454537E-169d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3612");
        double double2 = JavaAlgorithms.calculateTax(1.578418474933426E-190d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.156836949866852E-191d + "'", double2 == 3.156836949866852E-191d);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3613");
        double double2 = JavaAlgorithms.calculateTax(2.8269553036454537E-169d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.653910607290908E-170d + "'", double2 == 5.653910607290908E-170d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3614");
        double double2 = JavaAlgorithms.calculateTax(8.83423532389204E-168d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7668470647784083E-168d + "'", double2 == 1.7668470647784083E-168d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3615");
        double double2 = JavaAlgorithms.calculateTax(7.410693711188348E-183d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4821387422376697E-183d + "'", double2 == 1.4821387422376697E-183d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3616");
        double double2 = JavaAlgorithms.calculateTax(3.156836949866852E-191d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.313673899733704E-192d + "'", double2 == 6.313673899733704E-192d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3617");
        double double2 = JavaAlgorithms.calculateTax(6.313673899733704E-192d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.262734779946741E-192d + "'", double2 == 1.262734779946741E-192d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3618");
        double double2 = JavaAlgorithms.calculateTax(6.313673899733704E-192d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.262734779946741E-192d + "'", double2 == 1.262734779946741E-192d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3619");
        double double2 = JavaAlgorithms.calculateTax(2.3714219875802715E-182d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.742843975160543E-183d + "'", double2 == 4.742843975160543E-183d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3620");
        double double2 = JavaAlgorithms.calculateTax(1.4821387422376697E-183d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9642774844753396E-184d + "'", double2 == 2.9642774844753396E-184d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3621");
        double double2 = JavaAlgorithms.calculateTax(3.156836949866852E-191d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.313673899733704E-192d + "'", double2 == 6.313673899733704E-192d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3622");
        double double2 = JavaAlgorithms.calculateTax(5.653910607290908E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581817E-170d + "'", double2 == 1.1307821214581817E-170d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3623");
        double double2 = JavaAlgorithms.calculateTax(2.3714219875802715E-182d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.742843975160543E-183d + "'", double2 == 4.742843975160543E-183d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3624");
        double double2 = JavaAlgorithms.calculateTax(4.742843975160543E-183d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.485687950321087E-184d + "'", double2 == 9.485687950321087E-184d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3625");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581819E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.261564242916364E-173d + "'", double2 == 2.261564242916364E-173d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3626");
        double double2 = JavaAlgorithms.calculateTax(1.1857109937901356E-181d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3714219875802715E-182d + "'", double2 == 2.3714219875802715E-182d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3627");
        double double2 = JavaAlgorithms.calculateTax(2.8269553036454537E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.653910607290908E-170d + "'", double2 == 5.653910607290908E-170d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3628");
        double double2 = JavaAlgorithms.calculateTax(4.947171781379541E-169d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.894343562759083E-170d + "'", double2 == 9.894343562759083E-170d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3629");
        double double2 = JavaAlgorithms.calculateTax(2.3158417847463578E-179d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.631683569492716E-180d + "'", double2 == 4.631683569492716E-180d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3630");
        double double2 = JavaAlgorithms.calculateTax(1.9730230936667824E-188d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.946046187333565E-189d + "'", double2 == 3.946046187333565E-189d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3631");
        double double2 = JavaAlgorithms.calculateTax(1.4134776518227267E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8269553036454537E-169d + "'", double2 == 2.8269553036454537E-169d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3632");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581819E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.261564242916364E-173d + "'", double2 == 2.261564242916364E-173d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3633");
        double double2 = JavaAlgorithms.calculateTax(1.262734779946741E-192d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.525469559893482E-193d + "'", double2 == 2.525469559893482E-193d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3634");
        double double2 = JavaAlgorithms.calculateTax(1.4821387422376697E-183d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9642774844753396E-184d + "'", double2 == 2.9642774844753396E-184d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3635");
        double double2 = JavaAlgorithms.calculateTax(9.485687950321087E-184d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8971375900642175E-184d + "'", double2 == 1.8971375900642175E-184d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3636");
        double double2 = JavaAlgorithms.calculateTax(1.8971375900642175E-184d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.794275180128435E-185d + "'", double2 == 3.794275180128435E-185d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3637");
        double double2 = JavaAlgorithms.calculateTax(2.525469559893482E-193d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0509391197869647E-194d + "'", double2 == 5.0509391197869647E-194d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3638");
        double double2 = JavaAlgorithms.calculateTax(9.485687950321087E-184d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8971375900642175E-184d + "'", double2 == 1.8971375900642175E-184d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3639");
        double double2 = JavaAlgorithms.calculateTax(4.742843975160543E-183d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.485687950321087E-184d + "'", double2 == 9.485687950321087E-184d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3640");
        double double2 = JavaAlgorithms.calculateTax(1.852673427797086E-177d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7053468555941724E-178d + "'", double2 == 3.7053468555941724E-178d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3641");
        double double2 = JavaAlgorithms.calculateTax(2.9642774844753396E-184d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.92855496895068E-185d + "'", double2 == 5.92855496895068E-185d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3642");
        double double2 = JavaAlgorithms.calculateTax(5.653910607290909E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581819E-172d + "'", double2 == 1.1307821214581819E-172d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3643");
        double double2 = JavaAlgorithms.calculateTax(8.774869262515483E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7549738525030968E-173d + "'", double2 == 1.7549738525030968E-173d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3644");
        double double2 = JavaAlgorithms.calculateTax(5.92855496895068E-185d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.185710993790136E-185d + "'", double2 == 1.185710993790136E-185d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3645");
        double double2 = JavaAlgorithms.calculateTax(2.525469559893482E-193d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0509391197869647E-194d + "'", double2 == 5.0509391197869647E-194d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3646");
        double double2 = JavaAlgorithms.calculateTax(1.7549738525030968E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.509947705006194E-174d + "'", double2 == 3.509947705006194E-174d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3647");
        double double2 = JavaAlgorithms.calculateTax(8.774869262515483E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7549738525030968E-173d + "'", double2 == 1.7549738525030968E-173d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3648");
        double double2 = JavaAlgorithms.calculateTax(3.957737425103633E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.915474850207267E-172d + "'", double2 == 7.915474850207267E-172d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3649");
        double double2 = JavaAlgorithms.calculateTax(3.509947705006194E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.019895410012388E-175d + "'", double2 == 7.019895410012388E-175d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3650");
        double double2 = JavaAlgorithms.calculateTax(2.964277484475339E-180d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.928554968950678E-181d + "'", double2 == 5.928554968950678E-181d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3651");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581817E-170d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2615642429163635E-171d + "'", double2 == 2.2615642429163635E-171d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3652");
        double double2 = JavaAlgorithms.calculateTax(2.2615642429163635E-171d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5231284858327275E-172d + "'", double2 == 4.5231284858327275E-172d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3653");
        double double2 = JavaAlgorithms.calculateTax(4.5231284858327275E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665456E-173d + "'", double2 == 9.046256971665456E-173d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3654");
        double double2 = JavaAlgorithms.calculateTax(2.2615642429163635E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5231284858327275E-172d + "'", double2 == 4.5231284858327275E-172d);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3655");
        double double2 = JavaAlgorithms.calculateTax(7.915474850207267E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5830949700414536E-172d + "'", double2 == 1.5830949700414536E-172d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3656");
        double double2 = JavaAlgorithms.calculateTax(5.928554968950678E-181d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1857109937901356E-181d + "'", double2 == 1.1857109937901356E-181d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3657");
        double double2 = JavaAlgorithms.calculateTax(2.9642774844753396E-184d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.92855496895068E-185d + "'", double2 == 5.92855496895068E-185d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3658");
        double double2 = JavaAlgorithms.calculateTax(1.185710993790136E-185d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.371421987580272E-186d + "'", double2 == 2.371421987580272E-186d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3659");
        double double2 = JavaAlgorithms.calculateTax(1.185710993790136E-185d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.371421987580272E-186d + "'", double2 == 2.371421987580272E-186d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3660");
        double double2 = JavaAlgorithms.calculateTax(5.0509391197869647E-194d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.010187823957393E-194d + "'", double2 == 1.010187823957393E-194d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3661");
        double double2 = JavaAlgorithms.calculateTax(5.0509391197869647E-194d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.010187823957393E-194d + "'", double2 == 1.010187823957393E-194d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3662");
        double double2 = JavaAlgorithms.calculateTax(3.794275180128435E-185d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.58855036025687E-186d + "'", double2 == 7.58855036025687E-186d);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3663");
        double double2 = JavaAlgorithms.calculateTax(5.653910607290908E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1307821214581817E-170d + "'", double2 == 1.1307821214581817E-170d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3664");
        double double2 = JavaAlgorithms.calculateTax(1.010187823957393E-194d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.020375647914786E-195d + "'", double2 == 2.020375647914786E-195d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3665");
        double double2 = JavaAlgorithms.calculateTax(1.8971375900642175E-184d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.794275180128435E-185d + "'", double2 == 3.794275180128435E-185d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3666");
        double double2 = JavaAlgorithms.calculateTax(7.067388259113633E-168d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4134776518227267E-168d + "'", double2 == 1.4134776518227267E-168d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3667");
        double double2 = JavaAlgorithms.calculateTax(1.1307821214581817E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2615642429163635E-171d + "'", double2 == 2.2615642429163635E-171d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3668");
        double double2 = JavaAlgorithms.calculateTax(1.7549738525030968E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.509947705006194E-174d + "'", double2 == 3.509947705006194E-174d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3669");
        double double2 = JavaAlgorithms.calculateTax(1.010187823957393E-194d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.020375647914786E-195d + "'", double2 == 2.020375647914786E-195d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3670");
        double double2 = JavaAlgorithms.calculateTax(7.019895410012388E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4039790820024777E-175d + "'", double2 == 1.4039790820024777E-175d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3671");
        double double2 = JavaAlgorithms.calculateTax(2.020375647914786E-195d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.040751295829572E-196d + "'", double2 == 4.040751295829572E-196d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3672");
        double double2 = JavaAlgorithms.calculateTax(7.58855036025687E-186d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.517710072051374E-186d + "'", double2 == 1.517710072051374E-186d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3673");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665456E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330914E-173d + "'", double2 == 1.8092513943330914E-173d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3674");
        double double2 = JavaAlgorithms.calculateTax(4.040751295829572E-196d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.081502591659145E-197d + "'", double2 == 8.081502591659145E-197d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3675");
        double double2 = JavaAlgorithms.calculateTax(7.915474850207267E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5830949700414536E-172d + "'", double2 == 1.5830949700414536E-172d);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3676");
        double double2 = JavaAlgorithms.calculateTax(7.58855036025687E-186d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.517710072051374E-186d + "'", double2 == 1.517710072051374E-186d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3677");
        double double2 = JavaAlgorithms.calculateTax(4.040751295829572E-196d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.081502591659145E-197d + "'", double2 == 8.081502591659145E-197d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3678");
        double double2 = JavaAlgorithms.calculateTax(8.081502591659145E-197d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6163005183318292E-197d + "'", double2 == 1.6163005183318292E-197d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3679");
        double double2 = JavaAlgorithms.calculateTax(1.262734779946741E-192d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.525469559893482E-193d + "'", double2 == 2.525469559893482E-193d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3680");
        double double2 = JavaAlgorithms.calculateTax(3.957737425103633E-171d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.915474850207267E-172d + "'", double2 == 7.915474850207267E-172d);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3681");
        double double2 = JavaAlgorithms.calculateTax(2.261564242916364E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.523128485832728E-174d + "'", double2 == 4.523128485832728E-174d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3682");
        double double2 = JavaAlgorithms.calculateTax(1.5830949700414536E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1661899400829073E-173d + "'", double2 == 3.1661899400829073E-173d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3683");
        double double2 = JavaAlgorithms.calculateTax(4.523128485832728E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665457E-175d + "'", double2 == 9.046256971665457E-175d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3684");
        double double2 = JavaAlgorithms.calculateTax(1.6163005183318292E-197d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2326010366636585E-198d + "'", double2 == 3.2326010366636585E-198d);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3685");
        double double2 = JavaAlgorithms.calculateTax(1.4039790820024777E-175d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8079581640049555E-176d + "'", double2 == 2.8079581640049555E-176d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3686");
        double double2 = JavaAlgorithms.calculateTax(1.9788687125518165E-170d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.957737425103633E-171d + "'", double2 == 3.957737425103633E-171d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3687");
        double double2 = JavaAlgorithms.calculateTax(3.509947705006194E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.019895410012388E-175d + "'", double2 == 7.019895410012388E-175d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3688");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330914E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666183E-174d + "'", double2 == 3.618502788666183E-174d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3689");
        double double2 = JavaAlgorithms.calculateTax(8.081502591659145E-197d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6163005183318292E-197d + "'", double2 == 1.6163005183318292E-197d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3690");
        double double2 = JavaAlgorithms.calculateTax(2.371421987580272E-186d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.742843975160544E-187d + "'", double2 == 4.742843975160544E-187d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3691");
        double double2 = JavaAlgorithms.calculateTax(3.794275180128435E-185d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.58855036025687E-186d + "'", double2 == 7.58855036025687E-186d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3692");
        double double2 = JavaAlgorithms.calculateTax(1.6163005183318292E-197d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2326010366636585E-198d + "'", double2 == 3.2326010366636585E-198d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3693");
        double double2 = JavaAlgorithms.calculateTax(5.92855496895068E-185d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.185710993790136E-185d + "'", double2 == 1.185710993790136E-185d);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3694");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665456E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330914E-173d + "'", double2 == 1.8092513943330914E-173d);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3695");
        double double2 = JavaAlgorithms.calculateTax(2.8079581640049555E-176d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.615916328009912E-177d + "'", double2 == 5.615916328009912E-177d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3696");
        double double2 = JavaAlgorithms.calculateTax(4.742843975160544E-187d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.485687950321088E-188d + "'", double2 == 9.485687950321088E-188d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3697");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665457E-175d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330915E-175d + "'", double2 == 1.8092513943330915E-175d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3698");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666183E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332366E-175d + "'", double2 == 7.237005577332366E-175d);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3699");
        double double2 = JavaAlgorithms.calculateTax(2.020375647914786E-195d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.040751295829572E-196d + "'", double2 == 4.040751295829572E-196d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3700");
        double double2 = JavaAlgorithms.calculateTax(1.4039790820024777E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8079581640049555E-176d + "'", double2 == 2.8079581640049555E-176d);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3701");
        double double2 = JavaAlgorithms.calculateTax(3.2326010366636585E-198d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.465202073327318E-199d + "'", double2 == 6.465202073327318E-199d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3702");
        double double2 = JavaAlgorithms.calculateTax(4.5231284858327275E-172d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665456E-173d + "'", double2 == 9.046256971665456E-173d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3703");
        double double2 = JavaAlgorithms.calculateTax(4.523128485832728E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.046256971665457E-175d + "'", double2 == 9.046256971665457E-175d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3704");
        double double2 = JavaAlgorithms.calculateTax(2.8079581640049555E-176d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.615916328009912E-177d + "'", double2 == 5.615916328009912E-177d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3705");
        double double2 = JavaAlgorithms.calculateTax(9.046256971665457E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8092513943330915E-175d + "'", double2 == 1.8092513943330915E-175d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3706");
        double double2 = JavaAlgorithms.calculateTax(1.517710072051374E-186d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0354201441027485E-187d + "'", double2 == 3.0354201441027485E-187d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3707");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330914E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666183E-174d + "'", double2 == 3.618502788666183E-174d);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3708");
        double double2 = JavaAlgorithms.calculateTax(1.5830949700414536E-172d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1661899400829073E-173d + "'", double2 == 3.1661899400829073E-173d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3709");
        double double2 = JavaAlgorithms.calculateTax(3.0354201441027485E-187d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.070840288205497E-188d + "'", double2 == 6.070840288205497E-188d);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3710");
        double double2 = JavaAlgorithms.calculateTax(6.070840288205497E-188d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2141680576410994E-188d + "'", double2 == 1.2141680576410994E-188d);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3711");
        double double2 = JavaAlgorithms.calculateTax(3.0354201441027485E-187d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.070840288205497E-188d + "'", double2 == 6.070840288205497E-188d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3712");
        double double2 = JavaAlgorithms.calculateTax(5.615916328009912E-177d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1231832656019825E-177d + "'", double2 == 1.1231832656019825E-177d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3713");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666183E-174d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332366E-175d + "'", double2 == 7.237005577332366E-175d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3714");
        double double2 = JavaAlgorithms.calculateTax(3.2326010366636585E-198d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.465202073327318E-199d + "'", double2 == 6.465202073327318E-199d);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3715");
        double double2 = JavaAlgorithms.calculateTax(1.2141680576410994E-188d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.428336115282199E-189d + "'", double2 == 2.428336115282199E-189d);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3716");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330915E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666183E-176d + "'", double2 == 3.618502788666183E-176d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3717");
        double double2 = JavaAlgorithms.calculateTax(3.1661899400829073E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.332379880165815E-174d + "'", double2 == 6.332379880165815E-174d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3718");
        double double2 = JavaAlgorithms.calculateTax(2.428336115282199E-189d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.856672230564398E-190d + "'", double2 == 4.856672230564398E-190d);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3719");
        double double2 = JavaAlgorithms.calculateTax(2.371421987580272E-186d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.742843975160544E-187d + "'", double2 == 4.742843975160544E-187d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3720");
        double double2 = JavaAlgorithms.calculateTax(9.485687950321088E-188d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8971375900642178E-188d + "'", double2 == 1.8971375900642178E-188d);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3721");
        double double2 = JavaAlgorithms.calculateTax(2.261564242916364E-173d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.523128485832728E-174d + "'", double2 == 4.523128485832728E-174d);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3722");
        double double2 = JavaAlgorithms.calculateTax(1.8092513943330915E-175d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.618502788666183E-176d + "'", double2 == 3.618502788666183E-176d);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3723");
        double double2 = JavaAlgorithms.calculateTax(2.428336115282199E-189d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.856672230564398E-190d + "'", double2 == 4.856672230564398E-190d);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3724");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666183E-176d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332366E-177d + "'", double2 == 7.237005577332366E-177d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3725");
        double double2 = JavaAlgorithms.calculateTax(1.8971375900642178E-188d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7942751801284355E-189d + "'", double2 == 3.7942751801284355E-189d);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3726");
        double double2 = JavaAlgorithms.calculateTax(5.615916328009912E-177d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1231832656019825E-177d + "'", double2 == 1.1231832656019825E-177d);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3727");
        double double2 = JavaAlgorithms.calculateTax(3.1661899400829073E-173d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.332379880165815E-174d + "'", double2 == 6.332379880165815E-174d);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3728");
        double double2 = JavaAlgorithms.calculateTax(6.332379880165815E-174d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2664759760331631E-174d + "'", double2 == 1.2664759760331631E-174d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3729");
        double double2 = JavaAlgorithms.calculateTax(3.618502788666183E-176d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.237005577332366E-177d + "'", double2 == 7.237005577332366E-177d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3730");
        double double2 = JavaAlgorithms.calculateTax(6.465202073327318E-199d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2930404146654636E-199d + "'", double2 == 1.2930404146654636E-199d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3731");
        double double2 = JavaAlgorithms.calculateTax(1.2930404146654636E-199d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5860808293309273E-200d + "'", double2 == 2.5860808293309273E-200d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3732");
        double double2 = JavaAlgorithms.calculateTax(1.1231832656019825E-177d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.246366531203965E-178d + "'", double2 == 2.246366531203965E-178d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3733");
        double double2 = JavaAlgorithms.calculateTax(6.070840288205497E-188d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2141680576410994E-188d + "'", double2 == 1.2141680576410994E-188d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3734");
        double double2 = JavaAlgorithms.calculateTax(2.5860808293309273E-200d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.172161658661855E-201d + "'", double2 == 5.172161658661855E-201d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3735");
        double double2 = JavaAlgorithms.calculateTax(6.465202073327318E-199d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2930404146654636E-199d + "'", double2 == 1.2930404146654636E-199d);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3736");
        double double2 = JavaAlgorithms.calculateTax(7.237005577332366E-177d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4474011154664734E-177d + "'", double2 == 1.4474011154664734E-177d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3737");
        double double2 = JavaAlgorithms.calculateTax(7.237005577332366E-175d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4474011154664732E-175d + "'", double2 == 1.4474011154664732E-175d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3738");
        double double2 = JavaAlgorithms.calculateTax(1.517710072051374E-186d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0354201441027485E-187d + "'", double2 == 3.0354201441027485E-187d);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegression7.test3739");
        double double2 = JavaAlgorithms.calculateTax(1.4474011154664732E-175d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8948022309329465E-176d + "'", double2 == 2.8948022309329465E-176d);
    }
}

