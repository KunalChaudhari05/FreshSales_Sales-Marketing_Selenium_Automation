package testcases;

import org.testng.annotations.Test;

import com.pages.LoginPage;

import Pages.MyContactPage;
import Pages.MyContactPage;
import base.BaseTest;

public class MyContactTest extends BaseTest {
	Pages.Signup signUp;
    @Test
    public void viewMyContactsTest() throws InterruptedException {

    	
    	signUp = new Pages.Signup();
    	signUp.sing_up();
    	signUp.Login(prop.getProperty("peoplef"), prop.getProperty("peoplel"), prop.getProperty("username1"), prop.getProperty("accounts"), prop.getProperty("number"));
    	signUp.selectDomain();
		Thread.sleep(1000);
		signUp.next();
		Thread.sleep(1000);

        MyContactPage D = new MyContactPage(driver);

        D.viewMyContacts();
        
    }
}
