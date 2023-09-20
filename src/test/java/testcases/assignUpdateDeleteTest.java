package testcases;

import org.testng.annotations.Test;
import Pages.assignUpdateDeletePage;
import Pages.LoginPage;
import Pages.Signup;
import base.BaseTest;

public class assignUpdateDeleteTest extends BaseTest {
	Pages.Signup signUp;

	@Test
	public void quotetest() throws InterruptedException {
		signUp = new Pages.Signup();
    	signUp.sing_up();
    	signUp.Login(prop.getProperty("peoplef"), prop.getProperty("peoplel"), prop.getProperty("username1"), prop.getProperty("accounts"), prop.getProperty("number"));
    	signUp.selectDomain();
		Thread.sleep(1000);
		signUp.next();
		Thread.sleep(1000);
		
		assignUpdateDeletePage d = new assignUpdateDeletePage();
		d.dealbtn2();
		d.selectone();
		d.Assignto();
		d.selectone();
		d.Updateto();
		d.selectone();
		d.delete();
	}
}
