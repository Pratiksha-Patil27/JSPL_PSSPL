package com.jspl.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class DialerLoginPage extends BasePage{
	public DialerLoginPage(WebDriver driver)
	{
		
			super(driver);
		
	}	

	public void phoneLogin(String url,String phoneLogin, String phonePass) throws InterruptedException {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[text()=\"Agent Login\"]")).click(); // click on Agent Login
//		String expectedResult = "phone login";
//		String actualResult = driver.findElement(By.className("sh_text_white")).getText();
//		System.out.println(actualResult);
//		Assert.assertEquals(actualResult, expectedResult, "Not Land on Phone Login page...!");
//		System.out.println("Successfully Landing on Phone Login Page");
		driver.findElement(By.name("phone_login")).sendKeys(phoneLogin);
		driver.findElement(By.name("phone_pass")).sendKeys(phonePass);
		driver.findElement(By.id("login_sub")).click();
	}

	public void campaignLogin(String userLogin, String userPass) throws InterruptedException {

		try {
			String expectedResult = "Campaign Login";
			String actualresult = driver.findElement(By.className("sh_text_white")).getText();
			System.out.println(actualresult);
			Assert.assertEquals(actualresult, expectedResult, "Not Land on Campaign Login page...!");
			System.out.println("Successfully Landing On Compaign Login Page");
			driver.findElement(By.name("VD_login")).sendKeys(userLogin);
			driver.findElement(By.name("VD_pass")).sendKeys(userPass);
			Thread.sleep(3000);
			driver.findElement(By.id("VD_campaign")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("VD_campaign")).click();

			Thread.sleep(3000);
			WebElement compaignDropDownElement = driver.findElement(By.xpath("//*[@id=\"VD_campaign\"]"));
			Select select = new Select(compaignDropDownElement);
			select.selectByIndex(1);
			Thread.sleep(3000);
			driver.findElement(By.id("login_sub")).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException caught, retrying...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void agentLoginController() {
		WebElement anotherliveAgentLogin = driver
				.findElement(By.xpath("//span[@id=\"DeactivateDOlDSessioNSpan\"]/table/tbody/tr/td/font"));

		WebElement outboundActivationElement = driver
				.findElement(By.xpath("//font[text()=\"CLOSER INBOUND GROUP SELECTION\"]")); // get element to verify
																								// successfuly navigate
																								// to agent screen or
																								// not

		if (anotherliveAgentLogin.isDisplayed()) {
			System.out.println(anotherliveAgentLogin.getText());
			driver.findElement(By.xpath("//a[text()=\"OK\"]")).click(); // click on "ok" button for navigate to dialer
																		// screen
			driver.findElement(By.xpath("//*[@id=\"CloserSelectBox\"]/table/tbody/tr/td/font[2]/a[2]")).click();// click
																												// on
																												// submit
																												// button
			System.out.println("Successfully navogate to VICI Dailer...");

			ifAgentLoggedOut(); // call method if seession logged out
		}

		else if (outboundActivationElement.isDisplayed()) {
			System.out.println(outboundActivationElement.getText());

			driver.findElement(By.xpath("//*[@id=\"CloserSelectBox\"]/table/tbody/tr/td/font[2]/a[2]")).click(); // click
																													// on
																													// submit
																													// button

			System.out.println("Successfully navigate to VICC Dailer...");

			ifAgentLoggedOut(); // call method if seession logged out
		}

	}

	public void ifAgentLoggedOut() {
		WebElement sessionLoggedOutElement = driver
				.findElement(By.xpath("//span[@id=\"NoneInSessionBox\"]/table/tbody/tr/td/font"));
		if (sessionLoggedOutElement.isDisplayed()) {
			driver.findElement(By.id("NoneInSessionLink")).click();
		}

	}

	public void checkErrorToast() throws InterruptedException
	  { 
		OutboundTelecallingPage telePage = new OutboundTelecallingPage(driver);
		OutBoundTaskPage outboundPage =new OutBoundTaskPage(driver);
	     By toastErrorElement=By.xpath("//div[@class=\"Toastify\"]/div/div/div[1]/div[2]");
		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(toastErrorElement));
			 String toastErrorMsg=driver.findElement(toastErrorElement).getText();
			
			   System.out.println(toastErrorMsg);
			   wait.until(ExpectedConditions.invisibilityOfElementLocated(toastErrorElement)); 
				 if(toastErrorMsg.contains("ERROR: agent_user is not paused - "))
				 {
					 Thread.sleep(3000);
					 telePage.clickOnCallActionButton("Back");
				  
				  //Switch to dialer window
				   chaildWindowHandle();
					driver.navigate().refresh();
					agentLoginController();
					mainWindowHandle();
					outboundPage.clickOnDialNextButton();
					 }
					 
					 else
					 {
						 System.out.println("Call Connected :"+toastErrorMsg);
					 }				 
				 }
	  
	    	
	  public void checkErrorToastForInflVef() throws InterruptedException
	  { 
		  OutboundTelecallingPage telePage = new OutboundTelecallingPage(driver);
		  OutBoundTaskPage outboundPage =new OutBoundTaskPage(driver);
		  By toastElement=By.xpath("//div[@class=\"Toastify\"]/div/div/div[1]/div[2]");
		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(toastElement));
			 String toastErrorMsg=driver.findElement(toastElement).getText();
			
			   System.out.println(toastErrorMsg);
			   wait.until(ExpectedConditions.invisibilityOfElementLocated(toastElement)); 
				 if(toastErrorMsg.contains("ERROR: agent_user is not paused - "))
				 {
					 Thread.sleep(3000);
					 By popUpCrossLocator=By.xpath("//button[@class=\"btn btn-link p-0  btn btn-btn-link\"]/i");
					WaitVisibliltyOfLocated(popUpCrossLocator);
					driver.findElement(popUpCrossLocator).click();
					telePage.clickOnCallActionButton("Back");
				  
				  //Switch to dialer window
				   chaildWindowHandle();
					driver.navigate().refresh();
					agentLoginController();
					mainWindowHandle();
					outboundPage.clickOnDialNextButton();
				 }
	  }
	
	
}
