package dataProviderDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {

    @Test (dataProvider = "getData")
    public void loginTest(String username,String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys(password);
        Thread.sleep(2000);
        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();

        Thread.sleep(2000);
        driver.close();
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[5][2];

        data[0][0] = "admin";
        data[0][1] = "admin";

        data[1][0] = "rerer";
        data[1][1] = "sdsds";

        data[2][0] = "amol";
        data[2][1] = "amol123";

        data[3][0] = "kishor";
        data[3][1] = "kishor123";

        data[4][0] = "srividya";
        data[4][1] = "srividya123";

        return data;

    }
}
