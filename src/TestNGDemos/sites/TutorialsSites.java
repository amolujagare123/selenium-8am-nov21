package TestNGDemos.sites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites extends JobSites {





    @Test
    public void scriptingLogic()
    {
       driver.get("http://scriptingLogic.com");
    }

    @Test
    public void javatpoint()
    {
        driver.get("https://www.javatpoint.com/");
    }
    @Test
    public void tutorialspoint()
    {
        driver.get("https://www.tutorialspoint.com/");
    }
}
