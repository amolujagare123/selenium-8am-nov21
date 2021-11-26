import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverManagerDemo {

    public static void main(String[] args) {

      /*  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/

       //System.setProperty("webdriver.opera.driver","Drivers/operadriver.exe");

      /*  WebDriverManager.operadriver().setup();
        WebDriver driver = new OperaDriver();
        */
/*

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
*/

        WebDriverManager.edgedriver().setup();
        WebDriver driver =new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("http://naukri.com");






    }

}
