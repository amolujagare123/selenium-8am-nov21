package student;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gurulogin
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/v4");

        WebElement txtUserName = driver.findElement(By.name("uid"));
        txtUserName.sendKeys("mngr366103");

        WebElement txtPwd = driver.findElement(By.name("password"));
        txtPwd.sendKeys("sYrehup");

        WebElement lgnbutton = driver.findElement(By.name("btnLogin"));
        lgnbutton.click();


    }

}
