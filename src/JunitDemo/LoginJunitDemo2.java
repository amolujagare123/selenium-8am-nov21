package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJunitDemo2 {

    WebDriver driver;

    @Before // method below this annotation will run before every test method
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

    }

    @After // method below this annotation will run After every test method

    public void closeBrowser()
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
     //   btnLogin.click();


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
     //   btnLogin.click();

        //driver.close();
    }






}
