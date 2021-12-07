package CSSSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector(".blue"));
        btnLogin.click();

        WebElement lnkAddCustomer = driver.findElement(By.cssSelector("a[href='add_customer.php']"));
        lnkAddCustomer.click();

        WebElement txtName = driver.findElement(By.cssSelector("#name"));

        txtName.sendKeys("Anjali123");

        WebElement txtAddress = driver.findElement(By.cssSelector("[name=address]"));
        txtAddress.sendKeys("xyz");

        WebElement txtCon1 = driver.findElement(By.cssSelector("[name=contact1]"));
        txtCon1.sendKeys("787878");

        WebElement txtCon2 = driver.findElement(By.cssSelector("[name=contact2]"));
        txtCon2.sendKeys("787878");

        WebElement txtAdd = driver.findElement(By.cssSelector(".blue"));
        txtAdd.click();
    }
}
