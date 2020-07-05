package hooks.riddle;

import org.junit.Assert;
import org.junit.Test;

public class SUM_OF_TOWTest {
    @Test
    public void test01() {
        int A[] = {0, -1, 2, -3, 1};
        int sum = -2;
        Assert.assertEquals(true, SUM_OF_TOW.hasArrayTwoCandidates(A,sum));
    }

    @Test
    public void test02() {
        int A[] = {-8, 1, 4, 6, 10, 45};
        int sum = 16;
        Assert.assertEquals(true, SUM_OF_TOW.hasArrayTwoCandidates(A,sum));
    }


    @Test
    public void test03() {
        int A[] = {1, -2, 1, 0, 5};
        int sum = 0;
        Assert.assertEquals(false, SUM_OF_TOW.hasArrayTwoCandidates(A,sum));
    }
}