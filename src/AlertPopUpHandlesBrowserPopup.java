import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandlesBrowserPopup {
    public static void main(String []args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.findElement(By.name("proceed")).click();   // clicking on signin btn

        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();      // Alert Api or Alert Class we just need to create object reference
        String alertText = alert.getText();
        System.out.println(alertText);

        if(alertText.equalsIgnoreCase("Please enter a valid user name")){
            System.out.println("correct alert message");
        }
        else {
            System.out.println("in correct alert message");
        }

        alert.accept();  // it will click ok on alert checkbox

        // we also have alert.dismiss(); to cancel option

       // driver.quit();

   }}

