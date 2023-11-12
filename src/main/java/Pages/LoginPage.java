package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //web elements
private WebElement usernameFeild=driver.findElement(By.id("user-name"));
private  WebElement passwordField=driver.findElement(By.id("password"));
private  WebElement loginButton=driver.findElement(By.id("login-button"));

    //methods
    public void userloginin(String username,String password){

         setText(usernameFeild,username);
         setText(passwordField,password);
         clickon(loginButton);

    }
}
