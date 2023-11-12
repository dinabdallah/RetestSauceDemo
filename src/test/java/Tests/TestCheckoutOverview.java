package Tests;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckoutOverview extends TestBase{
    CheckoutOverview CheckoutOverviewObject;
    CheckOutPage CheckoutObject;
    HomePage homePageObject;
    LoginPage loginObject;
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
    public void openthecart (){
        homePageObject.openCart();
        cartPageObject=new CartPage(driver);
        Assert.assertEquals(cartPageObject.assertionmeassge(),"Your Cart");
    }

    @Test(priority=4)
    public void openCheckoutPage(){
        cartPageObject=new CartPage(driver);
        cartPageObject.clickonCheckoutLink();
        CheckoutObject=new CheckOutPage(driver);
        Assert.assertEquals(CheckoutObject.assertionCheckout(),"Checkout: Your Information");

    }

    @Test(priority=5)
    public void CheckoutSuccessful(){
        CheckoutObject=new CheckOutPage(driver);
        CheckoutObject.checkOut("standard_user","standard_user","1234567");
    }

    @Test(priority=6)
            public void OverviewSuccessful(){
        CheckoutOverviewObject=new CheckoutOverview(driver);
        Assert.assertEquals(CheckoutOverviewObject.assertionOverview(),"Checkout: Overview");
        CheckoutOverviewObject.CheckoutOverviewccessful();
    }
}
