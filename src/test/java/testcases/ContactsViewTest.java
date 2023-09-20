package testcases;

import org.testng.annotations.Test;

import Pages.ContactsView;
import base.BaseTest;

public class ContactsViewTest extends BaseTest {
	Pages.Signup signUp;
    @Test
    public void switchViews() throws InterruptedException {
    	
    	signUp = new Pages.Signup();
    	signUp.sing_up();
    	signUp.Login(prop.getProperty("peoplef"), prop.getProperty("peoplel"), prop.getProperty("username1"), prop.getProperty("accounts"), prop.getProperty("number"));
    	signUp.selectDomain();
		Thread.sleep(1000);
		signUp.next();
		Thread.sleep(1000);
		
        ContactsView ViewPage = new ContactsView();
        
        ViewPage.switchToKanbanView();
        
        ViewPage.switchToTableView();

    }
}
