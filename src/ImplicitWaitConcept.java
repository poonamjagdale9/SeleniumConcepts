import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConcept {

    //  both are global wait
    //implicitly wait is dynamic wait, implicitly wait is of all web elements available on the page
    // its nt compulsory in page load all elments will be loaded so we need to give implicit time and its dynamic, if elements available in 2sec rest time will be ignored.
    // when page is very heavy, with lot of images and content it take time to load all the contend. specially E-commerce site
    //Pageload timeout page wait for 40 second and its dynamic, if page loads within 10 sec rest 30 seconds will be ignored
    // Thread.sleep is hard wait, is static wait, scrip get pause for given time,

    public static void main(String [] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();  // initialise driver , lounch chrome
        driver.get("https://www.ebay.co.uk");   // open webpage

        driver.manage().window().maximize();    // maximise window
        driver.manage().deleteAllCookies();     // delet all cookies

        // dynamic waits
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // page wait for 40 second and its dynamic, if page loads within 10 sec rest 30 seconds will be ignored
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



    }
}
