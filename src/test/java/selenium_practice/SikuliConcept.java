package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


import java.util.concurrent.TimeUnit;

public class SikuliConcept {
    protected WebDriver driver;
    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        driver= new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void learnSikuli() throws FindFailed {
        Screen screen = new Screen();
        Pattern imgPat = new Pattern("/src/test/java/selenium_practice/ScreenShot01.png");
        screen.wait(imgPat,2000);
        screen.click();
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
