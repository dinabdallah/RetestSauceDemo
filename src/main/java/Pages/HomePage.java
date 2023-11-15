package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {

        super(driver);
    }
    WebElement dropdown=driver.findElement(By.className("product_sort_container"));
     Select selectoption=new Select(dropdown);

    WebElement addToCartButton=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    WebElement cartIcon=driver.findElement(By.id("shopping_cart_container"));
    WebElement productLbl=driver.findElement(By.xpath("//span[@class='title']"));

    WebElement itemName=driver.findElement(By.xpath("//div[@class='inventory_item_name ']"));
    public String assertionLoginMessages(){

        return  productLbl.getText();
    }
    public String assertionDropdown(){
        return  itemName.getText();
    }

    public void salectOneOption() {
        //sleep(2000);
        selectoption.selectByVisibleText("Name (Z to A)");
    }
    public void SelectItems(){

        clickon(addToCartButton);
    }
    public void openCart(){

        clickon(cartIcon);
    }
}
