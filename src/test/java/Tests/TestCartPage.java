package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

//import java.util.concurrent.TimeUnit;

public class TestCartPage extends TestBase{
    LoginPage loginObject;
    HomePage homePageObject;
    CartPage cartPageObject;
    @Test(priority =1)
    public void loginsuccessful(){
        loginObject=new LoginPage(driver);
        loginObject.userloginin("standard_user","secret_sauce");
        homePageObject=new HomePage(driver);
        Assert.assertEquals(homePageObject.assertionLoginMessages(),"Products");
    }

    @Test(priority=2)
    public void selectItems(){
        homePageObject=new HomePage(driver);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        homePageObject.SelectItem();
    }

    @Test(priority=3)
    public void openthecart ()  {
        homePageObject.openCart();
        cartPageObject=new CartPage(driver);
        Assert.assertEquals(cartPageObject.assertionmeassge(),"Your Cart");
    }

    @Test(priority=4)
    public void openCheckoutPage(){
    cartPageObject=new CartPage(driver);
    cartPageObject.clickonCheckoutLink();
}

}
