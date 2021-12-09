package TestNGDemos.sites;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class JobSites extends  OpenCloseBrowser{



    @Test
    public void naukri()
    {
       driver.get("http://naukri.com");
        Assert.assertEquals(true,false,"Manual fail");
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
