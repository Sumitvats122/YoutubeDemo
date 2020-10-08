package youtube.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import youtube.base.Base;


public class Login extends Base {
	
	
	@FindBy(id = "sign-in-button")
	WebElement signInButton;
	
	@FindBy(id = "identifierId")
	WebElement email;
	
	@FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
	WebElement nextButton;
	
	@FindBy(name = "password")
	WebElement password ;
	
	@FindBy(xpath = "//div[@class='dG5hZc']//div[@class='qhFLie']")
	WebElement nextSubmit;
	
	
	public Login()
	{
		PageFactory.initElements(driver, this);
		
	}
			
			
	// Login
	public void userLogin() throws InterruptedException
	{
		signInButton.click();	
		System.out.println("Click on Sign in button");
		email.sendKeys("Sumit.vats@wildnettechnologies.com");
		System.out.println("Enter email");
		nextButton.click();			
		System.out.println("Click next button");
		password.sendKeys("1234567");
		System.out.println("Enter Password");
		Thread.sleep(5000);
		nextSubmit.click();
		System.out.println("Click next button");
		Thread.sleep(5000);
	}		
				
			
			
			//Search and subscribe
//			driver.findElement(By.name("search_query")).sendKeys("newslaundry");
//			driver.findElement(By.id("search-icon-legacy")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.id("subscribe-button")).click();
//			Thread.sleep(2000);
			


					

	}


