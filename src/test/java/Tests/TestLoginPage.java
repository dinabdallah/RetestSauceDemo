package Tests;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TestLoginPage extends TestBase{
    LoginPage loginObject;

    @Test(priority =1)
    public void loginsuccessful(){

        loginObject=new LoginPage(driver);
        loginObject.userloginin("standard_user","secret_sauce");
    }
}
