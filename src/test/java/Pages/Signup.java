package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import dev.failsafe.internal.util.Durations;



public class Signup extends BaseTest {

	// Repository of Element
	@FindBy(xpath = "/html/body/header/nav/div/div/ul/li[2]/a")
	WebElement signup;
	@FindBy(xpath = "//div[text()='Sign up with email']")
	WebElement signup_email;

	@FindBy(xpath = "//input[@name ='first-name']")
	WebElement fname;

	@FindBy(xpath = "//input[@name ='last-name']")
	WebElement lname;

	@FindBy(xpath = "//input[@name ='email']")
	WebElement email_ip;

	@FindBy(xpath = "//input[@name ='company']")
	WebElement company_ip;
	@FindBy(xpath = "//input[@name ='phone']")
	WebElement phone_ip;

	@FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
	WebElement cookie;

	@FindBy(xpath = "//input[@value='Sign up for free']")
	WebElement singup_free;

	@FindBy(xpath = "//*[@id='industry-options-container']/li[3]/label")
	WebElement selectDom;
	@FindBy(id = "industry-next-btn")
	WebElement nextBtn;
	@FindBy(xpath = "//*[@id='ember2731']/div/svg/path[1]")
	WebElement display;

	public Signup() {
		PageFactory.initElements(driver, this);
	}

	public void sing_up() throws InterruptedException {

		signup.click();

		Thread.sleep(3000);

		signup_email.click();

	}

	public void Login(String firstname, String lastname ,String email, String company,String phone ) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			fname.sendKeys(firstname);
			lname.sendKeys(lastname);
			email_ip.sendKeys(email);
			company_ip.sendKeys(company);
			phone_ip.sendKeys(phone);
			cookie.click();
			singup_free.click();
			Thread.sleep(16000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	

	public void selectDomain() {
		selectDom.click();
	}

	public void next() {
		nextBtn.click();
	}

	public void displayText() {
		display.isDisplayed();
	}

	public void cookie() throws InterruptedException {
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
	}

}
