package TestNGDemos.sites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class JobSites {

   static WebDriver driver;

    @BeforeSuite // method below this annotation will run before first test method of the class
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @AfterSuite// method below this annotation will run after last test method of the class
    public void closeBrowser()
    {
        driver.quit();
    }

    @Test
    public void naukri()
    {
       driver.get("http://naukri.com");
    }

    @Test
    public void shine()
    {
        driver.get("http://shine.com");
    }
    @Test
    public void monster()
    {
        driver.get("http://monster.com");
    }
}
