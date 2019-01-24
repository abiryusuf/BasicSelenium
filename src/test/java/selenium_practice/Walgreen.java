package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Walgreen {
    protected WebDriver driver;

    @Before
    public void setUp() {
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
        driver.navigate().to("https://www.walgreens.com");
        //String getString = driver.getCurrentUrl();
        //System.out.println("Result for current URL is :"  + getString);

        //To navigate to an URL and It will not wait till the whole page gets loaded

        //driver.get("https://www.costco.com");
        //To open an URL and it will wait till the whole page gets loaded

        // driver.navigate().refresh();
        //To refresh the URL


        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();//maximize the window
        driver.manage().deleteAllCookies();//delete cookies
    }

    @Test
    public void inputText() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//a[text()='Sign in']"));
        element.click();
        System.out.println(element);

        //getAttribute() method will return the value of attribute
      /*  WebElement text = driver.findElement(By.id("search-field"));
        text.getAttribute("id");
        System.out.println(text);
        Thread.sleep(4000); //Static wait

        //How to Use Enter Key
        driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(Keys.ENTER);

    }*/

    }
}