import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsConcept {

   // public static WebDriver driver;  //  very imp line always write at class level

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
         //WebDriver new ChromeDriver(); // ChromeDriver is a class
        WebDriver driver = new ChromeDriver();

        driver.get("https://reg.ebay.co.uk/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.co.uk%2F");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("firstname")).sendKeys("Hardev");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Singh");
        driver.findElement(By.id("email")).sendKeys("hardevsingh@gmail.com");
        driver.findElement(By.id("PASSWORD")).sendKeys("tuhinirankar");
        boolean flag =driver.findElement(By.id("ppaFormSbtBtn")).isDisplayed();
        System.out.println(flag);
        driver.findElement(By.linkText("Create a business account")).click();
        String url =driver.getCurrentUrl();
        System.out.println(url);
    }
}
