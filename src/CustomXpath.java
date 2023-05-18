import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CustomXpath {
    public static void main(String[]args) throws InterruptedException {
        System.out.println("DHAN NIRANKAR JI");
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (85.0)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.ebay.co.uk/");

        //Xpath always starts with // double slash
        /* //id
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("cooker");*/

        /* //name
        driver.findElement(By.xpath("//input[@name = '_nkw']")).sendKeys("gift"); */

        // contains() // when we use contains() we should not use = sign use ,
       // driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("cooker");

        //when the locater value is dynamic, every time value is getting change
        /*
        id= test_123
        id= test_456
        id= test_789
         */
        // use contains()
        //driver.findElement(By.xpath("//input[contains(@id,'gh-')]")).sendKeys("happy");

        // we have one more method to handle dynamic id, starts-with()
        //driver.findElement(By.xpath("//input[starts-with(@id,'gh-')]")).sendKeys("happy");

        // we have one more ends-with() for dynamic id, when the id is changing from start and end is constant.
        //driver.findElement(By.xpath("//input[ends-with(@id,'ac')]")).sendKeys("happy");   doesnt work

        // Xpath for links,
        // all links start with "a tag"  // not working
        //driver.findElement(By.xpath("//a[contains(text(),'Sell']")).click();


        Thread.sleep(2000);
        driver.quit();


    }
}
