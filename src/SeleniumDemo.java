import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumDemo {


    public static void main(String[] args) {


       /* System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

        // firefox
      /*  System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // upcasting*/

       /* System.setProperty("webdriver.opera.driver","Drivers/operadriver.exe");
        WebDriver driver = new OperaDriver();*/

        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();


        driver.manage().window().maximize();
        driver.get("http://naukri.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        //driver.close(); // closes the current window

        driver.quit(); // closes all the windows opened by the driver


    }
}
