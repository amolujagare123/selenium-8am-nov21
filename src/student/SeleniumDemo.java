package student;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {
    public static void main(String[] args){
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();


        driver.manage().window().maximize();
        driver.get("http://facebook.com");
    }
}
