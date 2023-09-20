package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BaseTest;

public class MyContactPage extends BaseTest {

	public MyContactPage(WebDriver driver) {
        BaseTest.driver = driver;
    }
    public void viewMyContacts() {
        WebElement myContactTab = driver.findElement(By.xpath("//span[contains(text(),'My contacts')]"));
        myContactTab.click();
        
        // Wait for contacts to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
}
