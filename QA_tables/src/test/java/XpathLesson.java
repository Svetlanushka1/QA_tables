import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class XpathLesson {
    WebDriver driver;

    @BeforeClass
    public void preconditions() {
        driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterClass
    public void postConditions() {
        driver.quit();
    }

    @Test
    public void xpathTest() {
        WebElement textH5first = driver.findElement(By.xpath("//div/h5"));
        WebElement textH5first2 = driver.findElement(By.xpath("//*[text()='Elements']"));
        WebElement textH5first3 = driver.findElement(By.xpath("//div[@class='card-body']/h5"));
        WebElement textH5first4 = driver.findElement(By.xpath("//div[@class]/h5"));
        WebElement textH5first5 = driver.findElement(By.xpath("//h5/../h5"));
        System.out.println("start to print");
        System.out.println(textH5first.getText() + textH5first2.getText() + textH5first3.getText() + textH5first4.getText() + textH5first5.getText());
    }


    @Test
    public void xpathAdvancedTest() {
        WebElement textH5first = driver.findElement(By.xpath("//div/h5")); // D
        WebElement textH5first2 = driver.findElement(By.xpath("//*[text()='Elements']"));

        WebElement textH5first8 = driver.findElement(By.xpath("//*[contains(text(),'ement')]"));
        WebElement textH5first9 = driver.findElement(By.xpath("//*[contains(text(),'ement') and contains(text(),'El')]"));
        WebElement textH5first10 = driver.findElement(By.xpath("//*[contains(text(),'ement') or contains(text(),'El')]"));
        // and or

        WebElement textH5first3 = driver.findElement(By.xpath("//div[@class='card-body']/h5"));
        WebElement textH5first6 = driver.findElement(By.xpath("//div[contains(@class,'body')]/h5"));
        WebElement textH5first7 = driver.findElement(By.xpath("//div[starts-with(@class,'card')]/h5"));

        WebElement textH5first4 = driver.findElement(By.xpath("//div[@class]/h5"));
        WebElement textH5first5 = driver.findElement(By.xpath("//h5/../h5"));

        System.out.println("continue to print");
        System.out.println(textH5first.getText() + textH5first2.getText() + textH5first3.getText() +
                textH5first4.getText() + textH5first5.getText());
       //Assert.assertTrue(true);
        /*

//tag1[.//tag2[@attribute2=’value2’]]
the dot at the beginning of the query = the search is carried out relative to the element (tag1)

         */
    }
}

