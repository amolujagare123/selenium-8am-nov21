import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumNavigateDemo {


    public static void main(String[] args) {


       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        driver.navigate().to("http://gmail.com");

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();




    }
}
