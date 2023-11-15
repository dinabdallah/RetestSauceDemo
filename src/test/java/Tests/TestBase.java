package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

//import java.util.concurrent.TimeUnit;

public class TestBase {

public WebDriver driver;

@BeforeClass
@Parameters({"browser"})

    public void setupdriver(@Optional("chrome") String browserName){

    if(browserName.equalsIgnoreCase("chrome")){
        driver=new ChromeDriver();}
    else if (browserName.equalsIgnoreCase("firefox")) {
        driver=new FirefoxDriver();}
    else if(browserName.equalsIgnoreCase("internetExplorer")){
        driver=new InternetExplorerDriver();
    }
    driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.get("https://www.saucedemo.com/");
}

@AfterSuite
    public void closedriver(){
    driver.quit();
}

}
