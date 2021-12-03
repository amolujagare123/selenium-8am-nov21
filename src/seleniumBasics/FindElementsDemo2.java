package seleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://scriptinglogic.org");

        List<WebElement> wbList = driver.findElements(By.className("elementor-button-text")); // 4

        System.out.println(wbList.size());

        // print the text of the button --> webelement.getText()
        // how can i get the text of the first button

      /*  System.out.println(wbList.get(0).getText());
        System.out.println(wbList.get(1).getText());
        System.out.println(wbList.get(2).getText());
        System.out.println(wbList.get(3).getText());*/

        for(int i=0;i<wbList.size();i++)
            System.out.println(wbList.get(i).getText());

    }
}
