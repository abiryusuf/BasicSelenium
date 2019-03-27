package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot2 {

    static WebDriver driver = null;

    public static void main(String[] args) throws IOException {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        driver.close();driver.quit();
        ScreenShot("AmazonPage");
    }
    public static void ScreenShot(String fileName) throws IOException{
        File file =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:/Users/yusuf/Desktop/Basic_Selenium_Practice/"+fileName+".jpg"));
    }

}
