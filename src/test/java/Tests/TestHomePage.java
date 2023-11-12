package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;

public class TestHomePage extends TestBase {
    LoginPage loginObject;
    @Test(priority =1)
    public void loginsuccessful(){
        loginObject=new LoginPage(driver);
        loginObject.userloginin("standard_user","secret_sauce");
        homePageObject=new HomePage(driver);
        Assert.assertEquals(homePageObject.assertionLoginMessages(),"Products");
    }
    HomePage homePageObject;


    @Test(priority=2)
    public void selectItems(){
        homePageObject=new HomePage(driver);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        homePageObject.SelectItem();
    }

    @Test(priority=3)
    public void openthecart (){
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homePageObject.openCart();
    }

}
