import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Xpath {

   /* public static void main(String []args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gifts");
        driver.findElement(By.className("nav-input")).click();
    }*/

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.freecrm.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")).click();
                //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Poonam");
        // if we are using name we need to use = sign, if we are using contains we need to use ,

        // Xpath using atribute
        // "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"
        //input[@type='submit'];

        // Xpath using text() function, with text we can not use @ cos its a function
        // //a[text()='pricing']
        //button[@type='button' and @ class='zxy']
        // //span[contains(text(),' sign up')]


    }

}
