import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

//According to w3c frames are no longer to use, some old applications have frame
// to check frame go to view page source and find frame
// hoe to handle frame
// not necessary drag and drop box will be in frame only in this example page they have frame
// TO MOVE TO FRAME WE NEED TO USE     driver.switchTo().frame(0)
// FOR DRAG AND DROP WE NEED TO USE ACTIONS CLASS
public class DragAndDropConcept {
    public static void main(String args []){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (1(83.0.41))\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);       //TO MOVE TO FRAME WE NEED TO USE ONLY IF FRAME IS AVAILABLE IN WEBPAGE

        Actions actions = new Actions(driver);

      //  actions.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")))
          //      .moveToElement(driver.findElement(By.xpath("//div[@id = 'droppable']"))).release().build().perform();


        // BY INBUILT METHOD
        actions.dragAndDrop(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")),
                driver.findElement(By.xpath("//div[@id = 'droppable']"))).release().build().perform();



    }
}

