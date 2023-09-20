package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class ContactsView extends BaseTest {

    public void switchToTableView() {
        driver.findElement(By.xpath("//span[contains(text(),'Table')]")).click();
//        driver.findElement(By.xpath("//body/div[17]/div[1]/div[1]/div[1]/div[1]");
    }

    public void switchToKanbanView() {
//        driver.findElement(By.xpath("//body/div[17]/div[1]/div[1]/div[2]/div[1]")).click();
    	driver.findElement(By.xpath("//span[contains(text(),'Kanban')]")).click();
    }


}
