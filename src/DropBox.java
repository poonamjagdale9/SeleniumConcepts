import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();

        Select select = new Select(driver.findElement(By.id("day")));
        select.selectByVisibleText("6");

        Select select1 = new Select(driver.findElement(By.id("month")));
        select1.selectByVisibleText("Apr");

        Select select2 = new Select(driver.findElement(By.id("year")));
        select2.selectByVisibleText("1983");

    }
}
