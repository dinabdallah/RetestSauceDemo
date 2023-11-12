package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends PageBase{

    public CartPage(WebDriver driver) {
        super(driver);
    }
    WebElement checkoutLink=driver.findElement(By.id("checkout"));
    WebElement assertoinMsg=driver.findElement(By.xpath("//span[@class='title']"));

    public void clickonCheckoutLink(){

        clickon(checkoutLink);
    }
public String assertionmeassge(){
        return assertoinMsg.getText();
}









}
