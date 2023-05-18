import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindelementsConcept {
    public static void main(String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (85.0)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        driver.get("https://www.ebay.co.uk/");

        // get the count of links on the page
        // get the text of each link on the page

        //List<WebElement> ele = driver.findElements(By.xpath("//a"));
        List<WebElement> ele = driver.findElements(By.tagName("a"));
        int numOfLinks = ele.size();
        System.out.println(numOfLinks);
        for(int i=0; i<ele.size(); i++){
            String listOfText = ele.get(i).getText();
            System.out.println(listOfText);
        }

        List<WebElement> list_input = driver.findElements(By.tagName("input"));
        int numOfInputfields = list_input.size();
        System.out.println("number od input fields are : "+numOfInputfields);

        Thread.sleep(2000);
        driver.quit();
    }
}
