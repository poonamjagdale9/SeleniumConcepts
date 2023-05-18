import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

   public static WebDriver driver;

    public static void main(String args []) throws IOException {

        //C:\Users\jagda\Downloads\chromedriver_win32 (1)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\ChromeDriver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\jagda\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        takeScreenShot("GoogleScreenshot1");
        driver.quit();

    }
        public static void takeScreenShot(String filename) throws IOException {
        // take sreen shot and store as file
            // TakeScreenshot is a Interface available in Selenium
            // we need to typecast driver in to TakeScreenshot Interface
            // File need to import from java.io
            File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            // copy the screen short to desired location using copy file method
            // Fileutils is class
            FileHandler.copy(file, new File("C:\\Users\\jagda\\IdeaProjects\\seleniumConcepts\\src\\screenShort\\"+filename+".jpg"));


        }
   }
