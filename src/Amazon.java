import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String []args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gifts");
        driver.findElement(By.className("nav-input")).click();
    }
}
