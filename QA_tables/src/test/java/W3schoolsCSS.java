import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class W3schoolsCSS {
    WebDriver driver;

    @BeforeClass
    public void preconditions() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterClass
    public void postConditions() {
        driver.quit();
    }

    @Test
    public void w3schoolsCss_tablesTest() {
        List<WebElement> listTr = driver.findElements(By.cssSelector("table#customers tbody tr"));
        System.out.println("listTr.size() = " + listTr.size());
        WebElement firstChild = driver.findElement(By.cssSelector("table#customers tbody tr:first-child"));
        WebElement firstChildTr = driver.findElement(By.cssSelector("table#customers tbody tr:first-child th"));

        System.out.println(firstChild.getText());

        WebElement thirdChild = driver.findElement(By.cssSelector("table#customers tbody tr:nth-child(2)"));
        System.out.println(thirdChild.getText());


    }
    @Test
    public void w3schoolsXPath_tablesTest() {
        ////table[@id='customers']
        List<WebElement> listTr = driver.findElements(By.xpath("//table[@id='customers']/tbody//tr"));
        System.out.println("listTr.size() = " + listTr.size());
      //  WebElement firstChild = driver.findElement(By.xpath("table#customers tbody tr:first-child"));
        WebElement firstChildTr = driver.findElement(By.xpath("//table[@id='customers']/tbody//tr[2]"));

        System.out.println(firstChildTr.getText());

        WebElement thirdChild = driver.findElement(By.xpath("//table[@id='customers']/tbody//tr[3]"));
        System.out.println(thirdChild.getText());


    }
}
