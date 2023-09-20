package testcases;

import org.testng.annotations.Test;
import base.BaseTest;
import Pages.AddContactPage;


public class AddContactTest extends BaseTest {
	Pages.Signup signUp;
    @Test
	public void addcontactest() throws InterruptedException {

    	
    	AddContactPage ad = new AddContactPage();
    	signUp = new Pages.Signup();
    	signUp.sing_up();
    	signUp.Login(prop.getProperty("peoplef"), prop.getProperty("peoplel"), prop.getProperty("username1"), prop.getProperty("accounts"), prop.getProperty("number"));
    	signUp.selectDomain();
		Thread.sleep(1000);
		signUp.next();
		Thread.sleep(1000);
		ad.addcontactbtn();
    	ad.fillform();
    	ad.save();
    	
    }
	
	
}
