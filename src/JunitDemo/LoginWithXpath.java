package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithXpath {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
        driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

        driver.close();

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();

        driver1.manage().window().maximize();

        driver1.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername1 = driver1.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername1.sendKeys("admin");

        WebElement txtPassword1 = driver1.findElement(By.xpath("//*[@type='password']"));
        txtPassword1.sendKeys("admin");

        WebElement btnLogin1 = driver1.findElement(By.xpath("//*[@type='submit']"));
        btnLogin1.click();
        driver1.findElement(By.xpath("//a[text()='Add Customer']")).click();

        driver1.close();


        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();

        driver2.manage().window().maximize();

        driver2.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername2 = driver2.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername1.sendKeys("admin");

        WebElement txtPassword2 = driver2.findElement(By.xpath("//*[@type='password']"));
        txtPassword1.sendKeys("admin");

        WebElement btnLogin2 = driver2.findElement(By.xpath("//*[@type='submit']"));
        btnLogin2.click();
        driver2.findElement(By.xpath("//a[text()='Add Customer']")).click();

        driver2.close();
    }
}
