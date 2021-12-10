package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {

   public static String takingScreenshot(WebDriver driver) throws IOException {
        // 1. create an object reference of TakesScreenshot
        // - assign current driver to it (type cast driver to TakesScreenshot)

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs using the above object reference

        File file = ts.getScreenshotAs(OutputType.FILE);


        //System.out.println(new Date());

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhssmm").format(new Date());

        String fileName = "IMG"+timeStamp+".png";
        // 3. copy this file object into a real file


        FileUtils.copyFile(file,new File("Report\\screenshots\\"+fileName));

        return fileName;
    }
}
