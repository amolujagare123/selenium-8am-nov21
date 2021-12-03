package xpathDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableDemo1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");

      //  driver.findElement(By.xpath("//tr[td[text()='Galaxy']]/td/a/img[@title='edit']")).click();

        String name ="Fabiana";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//img[@title='edit']")).click();
    }
}
