package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {

        super(driver);
    }
     WebElement addToCartButton=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    WebElement cartIcon=driver.findElement(By.id("shopping_cart_container"));
    private WebElement productLbl=driver.findElement(By.xpath("//span[@class='title']"));

    public String assertionLoginMessages(){
        return  productLbl.getText();
    }
    public void SelectItem(){

        clickon(addToCartButton);
    }
    public void openCart(){

        clickon(cartIcon);
    }

}
