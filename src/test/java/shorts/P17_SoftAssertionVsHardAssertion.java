package shorts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P17_SoftAssertionVsHardAssertion {
    @Test
    public void hardAssertionTest(){
        System.out.println("this is hard assertion");
        Assert.assertEquals("apple","app");
        System.out.println("after system hard assertion failed");
    }
@Test
    public void softAssertionTest(){
        System.out.println("this is soft assertion");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("apple","app");

        System.out.println("after soft assertion failed");

        softAssert.assertAll();
    }
}
