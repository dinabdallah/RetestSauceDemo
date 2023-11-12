package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview extends PageBase{

    public CheckoutOverview(WebDriver driver) {
        super(driver);
    }
    WebElement finishButton=driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
    WebElement assertionOverviewMsg=driver.findElement(By.xpath("//span[@class='title']"));
    public String assertionOverview(){
        return assertionOverviewMsg.getText();
    }

    public void CheckoutOverviewccessful(){
    clickon(finishButton);
}

}
