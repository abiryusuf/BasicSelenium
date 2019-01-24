package selenium_practice;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BarCodeHandle {
    protected WebDriver driver;

    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
        driver.navigate().to("https://barcode.tec-it.com/en/Code128?data=Bangladesh%20Is%20My%20Mother%20Land");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();//maximize the window
        driver.manage().deleteAllCookies();//delete cookies
    }
    @Test
    public void barCodeHandle() throws IOException, NotFoundException {
        String barCodeFileURL =  driver.findElement(By.tagName("img")).getAttribute("src");
        System.out.println("Bar Code URL is "+ barCodeFileURL);

        URL urlOfImage = new URL(barCodeFileURL);
        BufferedImage bufferedImage = ImageIO.read(urlOfImage);
        LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
        Result result = new MultiFormatReader().decode(binaryBitmap);
        String text = result.getText();
        System.out.println(" Bar Code Text Is -->"+text);

        Assert.assertEquals(text,"Bangladesh Is My Mother Land");



    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }


/*    WebDriverWait webDriverWait = new WebDriverWait(driver,10);

    Alert alert = webDriverWait.until(expectedConditions.alertIsPresent());*/

}
