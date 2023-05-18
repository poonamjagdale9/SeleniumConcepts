import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowBasePopUp {

    // when we handle window base popup, dont click on it, instead of click we need to use send keys method
    // and we need to give file path which we want to upload in browser.
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://html.com/input-type-file/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//input[@id = 'fileupload']")).sendKeys("C:\\Users\\jagda\\Desktop\\flowers.jpg");
    }
}
