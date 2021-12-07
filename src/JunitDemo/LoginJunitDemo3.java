package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJunitDemo3 {

    static WebDriver driver;

    @BeforeClass // method below this annotation will run before first test method of class
    public static void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

    }

    @AfterClass // method below this annotation will run After last test method of class
    public static void closeBrowser()
    {
        driver.close();
    }

    @Test
    public void myTest1()
    {


        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
       // btnLogin.click();


        //driver.close();
    }

    @Test
    public void myTest2()
    {

        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("hhjjh");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("jhjhj");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
      //  btnLogin.click();


        //driver.close();
    }

    @Test
    public void myTest3()
    {


        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        //btnLogin.click();


        //driver.close();
    }






}
