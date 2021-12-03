package seleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();

        WebElement txtName = driver.findElement(By.id("name"));

        txtName.sendKeys("Anjali");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtCon1 = driver.findElement(By.name("contact1"));
        txtCon1.sendKeys("787878");

        WebElement txtCon2 = driver.findElement(By.name("contact2"));
        txtCon2.sendKeys("787878");

        WebElement txtAdd = driver.findElement(By.name("Submit"));
        txtAdd.click();
    }
}
