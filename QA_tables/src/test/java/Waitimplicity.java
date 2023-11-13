import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Waitimplicity {
    WebDriver driver;
    @BeforeClass
    public void preConditions(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("start driver");
    }

 /*   @Test
    public void xpathTest() {
       WebElement textH5first = driver.findElement(By.xpath("//div/h5"));
        WebElement textH5Text = driver.findElement(By.xpath("////*[text()='Elements']"));
        WebElement textH5AtributAndValue = driver.findElement(By.xpath("//div[@class ='card-body']/h5"));
        WebElement textH5withoutValue = driver.findElement(By.xpath("//div[@class]/h5"));
        WebElement textH5downUpp = driver.findElement(By.xpath("//h5/../h5"));
        System.out.println("textH5first.getText()" + textH5Text.getText()
                +textH5AtributAndValue.getText() + textH5withoutValue.getText()
                + textH5withoutValue.getText()+ textH5downUpp.getText());

    }*/
    @Test
    public void xpathTest2() {
        WebElement textH5first = driver.findElement(By.xpath("//div/h5"));
        WebElement textH5first2 = driver.findElement(By.xpath("//*[text()='Elements']"));
        WebElement textH5first3 = driver.findElement(By.xpath("//div[@class='card-body']/h5"));
        WebElement textH5first4 = driver.findElement(By.xpath("//div[@class]/h5"));
        WebElement textH5first5 = driver.findElement(By.xpath("//h5/../h5"));
        System.out.println(textH5first.getText() + textH5first2.getText() + textH5first3.getText() +
                textH5first4.getText() + textH5first5.getText());


    }
    @Test
    public void xpathTestContains() {
        WebElement textH5first = driver.findElement(By.xpath("//div/h5")); // D
        WebElement textH5first2 = driver.findElement(By.xpath("//*[contains(text(),'ment']"));

        WebElement textH5first3 = driver.findElement(By.xpath("//div[contains@class='body']/h5"));
        WebElement textH5first4 = driver.findElement(By.xpath("//div[starts-with@class,'card']/h5"));
        WebElement textH5first5 = driver.findElement(By.xpath("//h5/../h5"));
        System.out.println(textH5first.getText() + textH5first2.getText() + textH5first3.getText() +
                textH5first4.getText() + textH5first5.getText());


    }
    @AfterClass
    public void postConditions(){
       driver.quit();
    }
}

