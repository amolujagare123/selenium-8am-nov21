package student;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Day4Screenshot {
    @Test

    public void addCustomerTes() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File srcfile = ts.getScreenshotAs(OutputType.FILE);


        FileUtils.copyFile(srcfile, new File("D:\\screenshots\\img.jpg"));
    }




    }
