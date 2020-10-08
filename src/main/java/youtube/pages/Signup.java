package youtube.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import youtube.base.Base;

public class Signup extends Base {
	
	@FindBy(id = "sign-in-button")
	WebElement signInButton;
	
	@FindBy(xpath = "//span[@class='NlWrkb snByac'][contains(text(),'Create account')]")
	WebElement createAccountButton;
	
	@FindBy(xpath = "//div[@class='jO7h3c'][contains(text(),'For myself')]")
	WebElement personalAccountButton;
	
	@FindBy(id = "firstName")
	WebElement firstName;
	
	@FindBy(id = "lastName")
	WebElement lastName;
	
	@FindBy(id = "username")
	WebElement usernameEmail;
	
//	@FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
//	WebElement nextButton;
	
	@FindBy(name = "Passwd")
	WebElement password ;
	
	@FindBy(name = "ConfirmPasswd")
	WebElement confirmPassword ;
	
	@FindBy(xpath = "//span[@class='RveJvd snByac'][contains(text(),'Next')]")
	WebElement nextSubmit;
	
	
	public Signup()
	{
		PageFactory.initElements(driver, this);
		
	}

		
	public void VerifySignup() throws InterruptedException
	{
		signInButton.click();
		System.out.println("Click on Sign in button");
		createAccountButton.click();
		System.out.println("Click on create account button");
		Thread.sleep(2000);
		personalAccountButton.click();
		System.out.println("Click on myself account button");
		
		
		//Sign up form
		firstName.sendKeys("Automation");
		System.out.println("Enter firstName");
		Thread.sleep(1000);
		lastName.sendKeys("Test");
		System.out.println("Enter lastName");
		Thread.sleep(1000);
		usernameEmail.sendKeys("Testautomation122@gmail.com");
		System.out.println("Enter email");
		password.sendKeys("Test@123!");
		System.out.println("Enter password");
		confirmPassword.sendKeys("Test@123!");
		System.out.println("Enter confirm password");
		nextSubmit.click();
		System.out.println("Enter next button and now verification send ");
	
	}

}
