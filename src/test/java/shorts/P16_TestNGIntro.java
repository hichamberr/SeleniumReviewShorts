package shorts;

import org.testng.Assert;
import org.testng.annotations.*;

public class P16_TestNGIntro {

        @Test
                public void testTwoPlusFive(){
            Assert.assertEquals(5,2+3);
        }

        @Test
    public void testApple(){
            Assert.assertEquals("apple","apple");
        }
        @BeforeMethod
        public void setUpMethod(){
            System.out.println("Before method is running");
        }

        @AfterMethod
        public void tearDownMethod(){
            System.out.println("after method is running");
        }

        @BeforeClass
    public void setUpClassMethod(){
            System.out.println("Before class is running");
        }

        @AfterClass
    public void tearDownClass(){
            System.out.println("after class is running");
        }
}
