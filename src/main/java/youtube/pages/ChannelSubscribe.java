package youtube.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import youtube.base.Base;

public class ChannelSubscribe extends Base {
	
	@FindBy(name = "search_query")
	WebElement searchBox;
	
	@FindBy(id = "search-icon-legacy")
	WebElement searchButton;
	
	@FindBy(xpath = "//div[@id='content-section']//div[@id='avatar-section']")
	WebElement channelProfileImg;
	
	@FindBy(xpath = "//app-header/div[@id='contentContainer']/app-toolbar[1]/div[1]/div[1]/paper-tabs[1]/div[1]/div[1]/paper-tab[2]/div[1]")
	WebElement videoButton;
	
	@FindBy(id = "icon-label")
	WebElement SortByButton;
	
	@FindBy(xpath = "//div[contains(text(),'Date added (oldest)')]")
	WebElement dateOldestFilterButton;
	
//	@FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
//	WebElement nextButton;
	
	@FindBy(xpath = "//ytd-grid-video-renderer[1]//div[1]//ytd-thumbnail[1]//a[1]//yt-img-shadow[1]//img[1]\r\n" + 
			"")
	WebElement oldestVideoThumbnail ;
	
	@FindBy(xpath = "//div[@id='info']//ytd-toggle-button-renderer[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")
	WebElement likeButton ;
	
	@FindBy(xpath = "//span[@class='RveJvd snByac'][contains(text(),'Next')]")
	WebElement nextSubmit;
	
	
	public ChannelSubscribe()
	{
		PageFactory.initElements(driver, this);
		
	}

		
	public void VerifyLikeLastVideoOfChannel() throws InterruptedException
	{
		searchBox.sendKeys("newslaundry");
		searchButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Search button");
		
		channelProfileImg.click();
		System.out.println("Click on Channel Image");
		Thread.sleep(2000);

		videoButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Channel Video button");
		
		
		SortByButton.click();
		Thread.sleep(1000);
		System.out.println("Click on Channel Sortby button");
		
		dateOldestFilterButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Channel Sortby older button");
		
		oldestVideoThumbnail.click();
		Thread.sleep(2000);
		System.out.println("Click on oldest video");
		
		likeButton.click();
		System.out.println("Click on video like button and signup popup displayed");
		Thread.sleep(2000);

	}

}
