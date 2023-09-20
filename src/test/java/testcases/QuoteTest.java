package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.Quotes;
import Pages.groupAndSortPage;
import base.BaseTest;

public class QuoteTest extends BaseTest{
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
		
		Quotes p = new Quotes(driver);
		
		p.dealbtn();
		p.fillquote();
		p.savebtn1();
		Thread.sleep(1000);
		
		p.selectall();
		Thread.sleep(1000);
		p.editcolmn();
		Thread.sleep(1000);
	}
	
	
}
