package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;

public class TestHomePage extends TestBase {
    LoginPage loginObject;
    HomePage homePageObject;

    @Test(priority =1)
    public void loginsuccessful(){
        loginObject=new LoginPage(driver);
        loginObject.userloginin("standard_user","secret_sauce");
        homePageObject=new HomePage(driver);
        Assert.assertEquals(homePageObject.assertionLoginMessages(),"Products");
    }
    @Test(priority=2)
        public void selectoptionfromDropdown(){
        homePageObject=new HomePage(driver);
        homePageObject.salectOneOption();
    }
    @Test(priority=3)
    public void selectItems(){
        homePageObject=new HomePage(driver);
        Assert.assertEquals(homePageObject.assertionDropdown(),"Test.allTheThings() T-Shirt (Red)");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePageObject.SelectItems();
    }
    @Test(priority=4)
    public void openthecart (){

        homePageObject.openCart();
    }
}
