import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindListOfElements {

    @Test
    public void findNameOfTables() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> list = driver.findElements(By.xpath("//h5"));
        for (WebElement el : list) {
            System.out.println(el.getText());
        }
        driver.quit();

    }
}








