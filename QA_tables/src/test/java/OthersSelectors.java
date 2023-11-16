import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class OthersSelectors {
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
    public void locatorsTest() {
        //tagName[@attrName='attributeValue']
        //tagName[text()='text']
        //*[contains(@attrName,'partlyAttributeValue')]
        //*[contains(text(),'partlyText')]
        //*[contains(text(),'partlyText')] AND //tagName[@attrName='attributeValue']
        //*[contains(text(),'partlyText')] OR //tagName[@attrName='attributeValue']
        //h5/.. - one level up
        driver.findElement(By.cssSelector("h5"));//get by tag h5
        driver.findElement(By.cssSelector(".card-body"));//get by attribute with name class
        driver.findElement(By.cssSelector("#fixedban"));//get by attribute by id
        driver.findElement(By.cssSelector("[href='/favicon.png']")); //get by attribute by id
        driver.findElement(By.cssSelector("[href*='/favic']"));//get with * if contains value
        driver.findElement(By.cssSelector("img.banner-image[src*='ima']"));//get by tag img AND src attribute contains value ima
        driver.findElement(By.className("card-body"));
        driver.findElement(By.id("fixedban"));
        driver.findElement(By.tagName("h5"));
       // driver.findElement(By.Name(""));




    }
}
