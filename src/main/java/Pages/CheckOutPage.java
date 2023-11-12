package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends PageBase{

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    WebElement firstNameField=driver.findElement(By.id("first-name"));
    WebElement LastNameField=driver.findElement(By.id("last-name"));
    WebElement ZibCodeField=driver.findElement(By.id("postal-code"));
    WebElement continueButton=driver.findElement(By.id("continue"));
    WebElement assertionMsgForCheckout=driver.findElement(By.xpath("//span[@class='title']"));

    public void checkOut(String firstname,String lastname,String postalcode){
        setText(firstNameField,firstname);
        setText(LastNameField,lastname);
        setText(ZibCodeField,postalcode);
        clickon(continueButton);
    }
    public String assertionCheckout(){
        return assertionMsgForCheckout.getText();
    }
}
