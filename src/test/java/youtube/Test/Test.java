package youtube.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;


import youtube.base.Base;
import youtube.pages.ChannelSubscribe;
import youtube.pages.Login;
import youtube.pages.Signup;

public class Test extends Base{
	
	public Test()
	{
		super();
	}
	
	Login login;
	Signup signup;
	ChannelSubscribe channel;
	
	
	@Parameters("browser")
	@BeforeMethod
	public void launch(String browser) throws Exception
	{
		launch_browser(browser);
		login = new Login();
		signup = new Signup();
		channel = new ChannelSubscribe();
	}
	
		
	
	@org.testng.annotations.Test(enabled = true)
	public void LoginTest() throws InterruptedException
	{
		login.userLogin();
	}
	
	@org.testng.annotations.Test(enabled = true)
	public void SignupTest() throws InterruptedException
	{
		signup.VerifySignup();
	}
	
	@org.testng.annotations.Test(enabled = true)
	public void likeOldestVideo() throws InterruptedException
	{
		channel.VerifyLikeLastVideoOfChannel();
	}
	
	
	@AfterMethod
	public void quit()
	{
		driver.close();
	}
	

}
