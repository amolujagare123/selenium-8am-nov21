package seleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");
        // 1. find the web element

        WebElement drpCity = driver.findElement(By.id("source_118"));

        // 2. create the object of select class

        Select selCity = new Select(drpCity);

        Thread.sleep(2000);


        // 3. select the option

        selCity.selectByVisibleText("Bangalore"); // 0

        Thread.sleep(2000);
        selCity.selectByVisibleText("Chennai"); //1

        Thread.sleep(2000);
        selCity.selectByVisibleText("Mumbai"); // 2

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();


        WebElement drpCityAdded = driver.findElement(By.id("fld_118"));
        Select selCityAdded = new Select(drpCityAdded);

        Thread.sleep(2000);
        selCityAdded.selectByVisibleText("Chennai");

        Thread.sleep(2000);
        selCityAdded.selectByVisibleText("Mumbai");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();



    }
}
