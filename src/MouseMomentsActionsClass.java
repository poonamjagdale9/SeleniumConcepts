import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMomentsActionsClass {

    // to perform mouse hover actions we need to create Actions class object, and import from selenium
    // and we need to pass driver reference in action class method.
    // always remember when we use Actions class we need to use build().perform();
    public static void main(String []args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

       /* Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
        //driver.findElement(By.xpath("//a[contains(text(),'Visa Services')]")).click();
        driver.findElement(By.cssSelector("#header-addons > ul > li:nth-child(7) > a")).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        if(currentUrl == "https://www.spicejet.com/VisaServices.aspx"){
            System.out.println("on Visa page");
        }
        else{
            System.out.println("on wrong page");
        } */


        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
        actions.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
        driver.findElement(By.xpath("//li[@class='hide-mobile']//ul/li//a[contains(text(),'Member Login')]")).click();
        String header =driver.findElement(By.className("heading-memberlogin")).getText();
        System.out.println(header);
        if(header.equalsIgnoreCase("SC MEMBER LOGIN")) {
            System.out.println("On correct page");
        }
        else{
            System.out.println("check the page");
        }

    }
}
