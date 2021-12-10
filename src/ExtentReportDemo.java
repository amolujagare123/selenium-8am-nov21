import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static Util.ScreenShot.takingScreenshot;

public class ExtentReportDemo {

    ExtentReports extent;

    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Report");
        reporter.config().setDocumentTitle("Stock Management System");

        extent.setSystemInfo("Project Name","Stock Management");
        extent.setSystemInfo("Testers Name","Sudhir");
        extent.setSystemInfo("Developers Name","Anjali");
        extent.setSystemInfo("Project Dead line","31-Dec-2021");
    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }


    @Test
    public void myTest1() throws IOException {
        ExtentTest test = extent.createTest("valid Login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("window is maximized");

        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("admin");

        test.info("username is set");


        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("admin");
        test.info("password is set");


        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
        test.info("login button is clicked");

        String expected = "https://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual,expected,"incorrect page");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takingScreenshot(driver));
        }


        driver.close();

    }

    @Test
    public void myTest2() throws IOException {
        ExtentTest test = extent.createTest("invalid Login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("window is maximized");

        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("fhhhhfh");

        test.info("username is set");


        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("hfh");
        test.info("password is set");


        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
        test.info("login button is clicked");

        String expected = "https://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual,expected,"incorrect page");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takingScreenshot(driver));
        }

        driver.close();

    }

    @Test
    public void myTest3() throws IOException {
        ExtentTest test = extent.createTest("Blank Login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("window is maximized");

        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//*[@id='login-username']"));
        txtUsername.sendKeys("");

        test.info("username is not set");


        WebElement txtPassword = driver.findElement(By.xpath("//*[@type='password']"));
        txtPassword.sendKeys("");
        test.info("password is not set");


        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
        test.info("login button is clicked");

        String expected = "https://stock.scriptinglogic.net/";
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual,expected,"incorrect page");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takingScreenshot(driver));

        }


        driver.close();

    }
}
