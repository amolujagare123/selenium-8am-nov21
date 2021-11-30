import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element

        WebElement multiSel = driver.findElement(By.id("multiSel"));

        // 2. create the object of select class

        Select selMulti = new Select(multiSel);

        Thread.sleep(4000);


        // 3. select the option

        selMulti.selectByVisibleText("text 1"); // 0

        Thread.sleep(4000);
        selMulti.selectByVisibleText("text 2"); //1

        Thread.sleep(4000);
        selMulti.selectByVisibleText("text 4"); // 3

       /* Thread.sleep(4000);
        selMulti.deselectByIndex(3);

        Thread.sleep(4000);
        selMulti.deselectByIndex(1);*/

        Thread.sleep(4000);
        selMulti.deselectAll();


    }
}
