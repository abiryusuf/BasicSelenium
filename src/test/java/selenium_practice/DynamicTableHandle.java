package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTableHandle {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/sql/sql_join.asp");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();//maximize the window
        driver.manage().deleteAllCookies();//delete cookies
    }

    @Test(priority = 3)
    public void tableHandle() throws AWTException {
     /*   Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
  //Grab the table
       WebElement mainTable = driver.findElement(By.xpath("//div[@class='w3-responsive']"));
       //To locate rows of table
       List<WebElement> table_row = mainTable.findElements(By.tagName("tr"));
       //print total number of row in the table
       int totalRow = table_row.size();
        System.out.println("Toatal number of row is "+table_row);
        //execute each row of the table by using for loop
       for(int row=0;row<totalRow;row++){
           //TO locate columns of that spacific row
         List<WebElement> table_column = table_row.get(row).findElements(By.tagName("td"));
        int totalColumn = table_column.size();
        for(int column=0;column<totalColumn;column++){
            //To retrieve text from that specific cell
            String cellText = table_column.get(column).getText();
            System.out.println("Cell text for test three is "+ cellText);
        }
       }
    }
    @Test(priority = 2, dependsOnMethods = "tableHandle03")
    public void tableHandle02()throws AWTException {
        WebElement mainTable = driver.findElement(By.xpath("//div[@class='w3-responsive']"));
        List<WebElement> tRow = mainTable.findElements(By.tagName("tr"));
        int rowSize = tRow.size();
        for(int row = 0; row<rowSize;row++){
            List<WebElement> tColumn = tRow.get(row).findElements(By.tagName("td"));
         int columnSize = tColumn.size();
         for(int column = 0; column<columnSize; column++){
           String cellValue  = tColumn.get(column).getText();
             System.out.println("cell value for test two is -->"+ cellValue);
         }
        }
    }
    @Test(priority = 1)
    public void tableHandle03(){
     WebElement mainTable = driver.findElement(By.xpath("//div[@class='w3-responsive']"));
     List<WebElement> tableRow = mainTable.findElements(By.tagName("tr"));
     int tableRowSize = tableRow.size();
     for(int r =0; r<tableRowSize;r++){
         List<WebElement> tableColumn = tableRow.get(r).findElements(By.tagName("td"));
       int tableColumnSize =  tableColumn.size();
       for(int c =0; c<tableColumnSize;c++){
       String cellText = tableColumn.get(c).getText();
           System.out.println("Cell Text for test one is :" + cellText);
       }
     }
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
