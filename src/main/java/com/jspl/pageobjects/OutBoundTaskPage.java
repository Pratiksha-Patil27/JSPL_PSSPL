package com.jspl.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutBoundTaskPage extends BasePage {

	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div/header/div/div[1]/div[2]/button")
	private WebElement dialNextButton;

	@FindBy(xpath = "//h4[@class=\"text-info fw-bold\"]")
	private WebElement nextDialText;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div[3]/div/div/button")
	private WebElement nextDialTextOkButton;
	
	@FindBy(xpath="//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a")
	private List<WebElement> outboundPageTaskNoColumn;
	
	@FindBy(xpath="//div[text()=\"There are no records to display\"]")
	private WebElement outboundTaskPageNoRecordsLable;
	
	@FindBy(id="search")
	private WebElement outboundTaskpageSearchFilter;
	
	@FindBy(xpath="//div[@id=\"row-0\"]/div/a")
	private WebElement outboundTaskPageTaskNo;
	
	@FindBy(xpath="//label[text()=\"Task Activity - \"]")
	private WebElement outboundTaskPageTaskActivityLable;
	
	@FindBy(xpath="//button[@Class=\"waves-effect btn btn-link p-0\"]")
	private WebElement outboundTaskPageTaskActivityCrossIcon;
	
	@FindBy(xpath="//*[@id=\"page-topbar\"]/div/div[2]/div[2]/button/div/i")
	private WebElement dateFilterIcon;
	
	@FindBy(xpath="//span[text()=\"Filter\"]")
	private WebElement dateFilterLable;
	
	@FindBy(xpath="//button[@class=\"btn-close\"]")
	private WebElement datefilterCrossIcon;
	
	
	
	public OutBoundTaskPage(WebDriver driver) {
		super(driver);

	}
	
	

	public boolean verifyOutboundTaskPageDisplay() {
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf(dialNextButton);
			displayStatus = dialNextButton.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}

		return displayStatus;
	}

	public OutboundTelecallingPage clickOnDialNextButton() {
		click(dialNextButton);
		return new OutboundTelecallingPage(driver);
	}

	public WebElement nextDialText()
	{
		return nextDialText;
	}
	
	
	public boolean verifyCallsAvailabilityDisplay() throws InterruptedException 
	{
		boolean dispalyStatus=true;
		try {
			Thread.sleep(2000);		
			if (nextDialText.isDisplayed()) {
				System.out.println("Calls are Not scheduled, Please schedule calls...!");
				click(nextDialTextOkButton);
				dispalyStatus=false;
				//driver.close();
			}
		} catch (NoSuchElementException e) {
			System.out.println("Calls are Scheduled...");
		}
		return dispalyStatus;
}
	
	public String getOutboundPageTaskStatus(String DashtaskNo)
	{
		String taskStatus=null;
		By element=By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div/div/a");
		WaitVisibliltyOfLocated(element);
		List<WebElement> taskNoElements=outboundPageTaskNoColumn;
		for(int i=1; i<=taskNoElements.size();i++)
		 {  
			WebElement taskNoElement=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div/a"));
			waitVisibilityOf(taskNoElement);
			String taskNo=taskNoElement.getText();
			
			if(taskNo.equals(DashtaskNo))
			{
				System.out.println("Dashboard Task No :" +DashtaskNo);
				//get task Status from dashboard
				taskStatus=driver.findElement(By.xpath("//div[@class=\"sc-hHEhDq ixLfOj rdt_TableBody\"]/div["+i+"]/div[8]/div")).getText();
				break;
			}
			
		 }
		return taskStatus;
	
	}
	
	public boolean verifyOutboundPageNoRecordsLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf( outboundTaskPageNoRecordsLable);
			displayStatus =  outboundTaskPageNoRecordsLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void enterTextInOutboundtaskPageSerachFilter(String text)
	{
		waitVisibilityOf(outboundTaskpageSearchFilter);
		outboundTaskpageSearchFilter.sendKeys(text);
	}
	
	public void clickOnOutboundTaskPageTaskNo()
	{
		waitVisibilityOf(outboundTaskPageTaskNo);
		click(outboundTaskPageTaskNo);
	}
	
	public boolean verifyOutboundPageTaskAcivityLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf( outboundTaskPageTaskActivityLable);
			displayStatus =  outboundTaskPageTaskActivityLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnOutboundTaskPageTaskActivityCrossIcon()
	{
		waitVisibilityOf(outboundTaskPageTaskActivityCrossIcon);
		click(outboundTaskPageTaskActivityCrossIcon);
	}
	
	public void clickOnOutboundTaskPageDateFilterIcon()
	{
		waitVisibilityOf(dateFilterIcon);
		click(dateFilterIcon);
	}
	
	public boolean verifyOutbundTaskPageDateFilterLableDisplay()
	{
		boolean displayStatus = false;
		
		try {
			waitVisibilityOf( dateFilterLable);
			displayStatus =  dateFilterLable.isDisplayed();
		} catch (Throwable e) {
			displayStatus = false;
		}
		return displayStatus;
	}
	
	public void clickOnOutboundTaskPageDatefilterCrossIcon()
	{
		waitVisibilityOf(datefilterCrossIcon);
		click(datefilterCrossIcon);
	}
}
