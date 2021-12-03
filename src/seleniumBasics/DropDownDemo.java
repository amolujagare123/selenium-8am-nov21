package seleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element
        WebElement drpSel = driver.findElement(By.id("seltext"));

        // 2. create the object of select class
        Select sel = new Select(drpSel);

        Thread.sleep(4000);


        // 3. select the option

        //sel.selectByVisibleText("text 3");
        //sel.selectByIndex(3); // text 4

        sel.selectByValue("v13"); // text 5

    }
}
