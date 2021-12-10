import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ScreenshotDemo {


    @Test
    public void myTest() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://twitter.com");

      //  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        Thread.sleep(3000);

        // 1. create an object reference of TakesScreenshot
        // - assign current driver to it (type cast driver to TakesScreenshot)

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using the above object reference

        File file = ts.getScreenshotAs(OutputType.FILE);


        //System.out.println(new Date());

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhssmm").format(new Date());

        String fileName = "IMG"+timeStamp+".png";
        // 3. copy this file object into a real file


        FileUtils.copyFile(file,new File("D:\\screenshots\\"+fileName));
    }

}
