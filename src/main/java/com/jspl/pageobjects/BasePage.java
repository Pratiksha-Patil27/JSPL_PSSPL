package com.jspl.pageobjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
    protected WebDriverWait wait;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
    
   
    
	public void click(WebElement locator) {
		
			wait.until(ExpectedConditions.elementToBeClickable(locator));

			locator.click();
	
	}
	
	public void list(List<WebElement> locator,String Text)
	{
	 List<WebElement> Allelements=locator;
	 for(WebElement element :Allelements)
	 {
		 String Value=element.getText();
		 if(Value.equals(Text))
		 {
		wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			break;
		 }
	 }
	}
	
	public void listContains(List<WebElement> locator,String Text)
	{
	 List<WebElement> Allelements=locator;
	 for(WebElement element :Allelements)
	 {
		 String Value=element.getText();
		 if(Value.contains(Text))
		 {
		wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			break;
		 }
	 }
	}
	
	public void waitVisibilityOf(WebElement locator)
	{      
	 wait.until(ExpectedConditions.visibilityOf(locator));
	}
	
	public void waitVisibilityOfList(List<WebElement> locator)
	{      
	 wait.until(ExpectedConditions.visibilityOfAllElements(locator));
	}
	
	public void waitInVisibilityOf(WebElement locator)
	{      
	 wait.until(ExpectedConditions.invisibilityOf(locator));
	}
	
	
	public void WaitVisibliltyOfLocated(By by)
	{
 
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void WaitInVisibliltyOfLocated(By by)
	{
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	
	public void mainWindowHandle() {
		Set<String> windowsID = driver.getWindowHandles();
		Iterator<String> it = windowsID.iterator();
		String mainWindowID = it.next();
		String childWindowID = it.next();
		driver.switchTo().window(mainWindowID);
}
	public void chaildWindowHandle() {
	Set<String> windowsID = driver.getWindowHandles();
	Iterator<String> it = windowsID.iterator();
	String mainWindowID = it.next();
	String childWindowID = it.next();
	driver.switchTo().window(childWindowID);
	}
	

}
