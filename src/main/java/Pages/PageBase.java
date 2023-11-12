package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
protected WebDriver driver;
public PageBase(WebDriver driver){
    this.driver=driver;
}
public static void clickon (WebElement element){
    element.click();
}

public static void setText(WebElement textelement,String value){
    textelement.sendKeys(value);
}
}
