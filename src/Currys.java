import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Currys {
    public static void main(String []args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (85.0)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

        driver.get("https://www.currys.co.uk/gbuk/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

       // driver.switchTo().frame("destination_publishing_iframe_dsgretaillimited_0");

       // Actions actions = new Actions(driver);
       // actions.click().build().perform();



        //driver.switchTo().frame("//*[@id=\"destination_publishing_iframe_dsgretaillimited_0\"]").close();
        //driver.findElement(By.id("onetrust-accept-btn-handler")).click();


        /*Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.dismiss();*/

        driver.findElement(By.xpath("//input[@name='search-field']")).sendKeys("fridge");
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();



    }
}
