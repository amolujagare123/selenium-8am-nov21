import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///D:/amol.html");

        // click on selenium checkbox & selenium radio button
        // if cucumber is selected then untick it

        // for checkbox  selenium

        driver.findElement(By.id("check1")).click();
        driver.findElement(By.id("rad1")).click();

        WebElement checkCucumber = driver.findElement(By.id("check2"));

        // isSelected() -> returns true is your checkbox / radio is selected
        // false if it is not selected

        checkCucumber.click(); // cucumber is unticked


     if(checkCucumber.isSelected()) // cucumber is not selected / so dont click
            checkCucumber.click();


    }
}
