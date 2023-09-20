package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.groupAndSortPage;
import base.BaseTest;

public class GroupTest extends BaseTest{
	Pages.Signup signUp;

	@Test
	public void grouptest() throws InterruptedException {
		signUp = new Pages.Signup();
    	signUp.sing_up();
    	signUp.Login(prop.getProperty("peoplef"), prop.getProperty("peoplel"), prop.getProperty("username1"), prop.getProperty("accounts"), prop.getProperty("number"));
    	signUp.selectDomain();
		Thread.sleep(1000);
		signUp.next();
		Thread.sleep(1000);
		
		groupAndSortPage p = new groupAndSortPage(driver);
		p.group();
		
	}
	
}
