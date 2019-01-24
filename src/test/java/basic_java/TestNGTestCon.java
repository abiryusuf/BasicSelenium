package basic_java;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGTestCon {
    WebDriver driver;
    @BeforeMethod
    public void setUP(){
        //System.setProperty("webdriver.chrome.driver", "/Users/ShiftStudent/Desktop");
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com");
    }


    @Test
    public void test01(){
        String title =	driver.getTitle();
        System.out.println(title);

    }
    @AfterMethod
    public void tearDown(){
        //driver.close();
        //driver.quit();

    }

}
