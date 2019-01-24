package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RadioButtonHandling {
    WebDriver driver;
    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");


        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();//maximize the window
        driver.manage().deleteAllCookies();//delete cookies
    }
    @Test
    public void radioButton() throws InterruptedException {
      WebElement rButton = driver.findElement(By.xpath("//input[@id='u_0_a']"));
      Thread.sleep(2000);
     Boolean radio =  rButton.isDisplayed();
        System.out.println(radio);
        rButton.click();

    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
