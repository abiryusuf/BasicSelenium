package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DropDown {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test
    public void dropdown() {
        WebElement ele = driver.findElement(By.id("day"));

        Select sle = new Select(ele);

        List<WebElement> list=sle.getOptions();
        System.out.println(list.size());
	/*Set set = new HashSet();
	for(WebElement element : list) {
		set.add(element);
	}
	System.out.println(set.size());*/

        Set set = new HashSet(list);
        System.out.println(set.size());
    }

    @AfterClass
    public  void tearDown() {
        driver.close();
        driver.quit();
    }

}
