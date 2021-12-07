package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestNG {

    @Test
    public void myTest1()
    {
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

        //driver.close();
    }

    @Test
    public void myTest2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("hhjjh");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("jhjhj");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();

        //driver.close();
    }

    @Test
    public void myTest3()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();

        //driver.close();
    }




}
