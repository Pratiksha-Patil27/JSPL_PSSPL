package com.jspl_automation.TestComponents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jspl_automation.pageobjects.DialerLoginPage;
import com.jspl_automation.utility.BaseClass;

public class CommanFunctions extends BaseClass{
	
	DialerLoginPage dialerPage;
	
	public CommanFunctions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void CustomerEngagementMenu(String menuName)  {
		
		//click on Customer Engagemnet 
		By customerEngagementLocator=By.xpath("//div[@id=\"sidebar-menu\"]/ul/li/a/i");
		click(customerEngagementLocator);
        
		By by=By.xpath("//*[@id=\"side-menu\"]/li/ul/li");
		list(by,menuName);
//		List<WebElement> sideBarElements = driver.findElements(By.xpath("//*[@id=\"side-menu\"]/li/ul/li")); // List of
//																												// Customer
//																												// Engagement
//																												// menu
//
//		for (WebElement sideBarElement : sideBarElements) {
//			String sideBarMenu = sideBarElement.getText();
//			String expectedMenu = menuName;
//
//			if (sideBarMenu.equals(expectedMenu)) {
//				System.out.println(sideBarMenu);
//				sideBarElement.click(); // select Outbound Task Menu
//				break;
//			}
		}
 

	public void dialNextClick() 
	{
		//click on dial next button
		
		By dialNexttLocator=By.xpath("//div[@class=\"main-content\"]/div/div/header/div/div[1]/div[2]/button");
		click(dialNexttLocator);
		
																														
	}
	
	public void verifyCallsAvailability() throws InterruptedException 
	{
		try {

			//verify calls are available or not
			Thread.sleep(2000);
			WebElement nextDialTextElement = driver.findElement(By.xpath("//h4[@class=\"text-info fw-bold\"]"));			
			if (nextDialTextElement.isDisplayed()) {
				System.out.println(nextDialTextElement.getText());
				System.out.println("Calls are Not scheduled, Please schedule calls...!");
				
				By okButtonLocator=By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[3]/div/div/button");
				click(okButtonLocator);
				driver.close();
			}
		} catch (NoSuchElementException e) {
			System.out.println("Calls are Scheduled...");
		}
	
}
	
	public void verifyTaskName(String expectedTaskName) throws InterruptedException
	    {
			//String claimVerificationText="Influencer Claim Verification";
			Thread.sleep(3000);
			String actualTaskName= driver.findElement(By.xpath("//div[@class=\"page-content\"]/div/header/div/div[2]/div/button[1]")).getText();
			System.out.println(actualTaskName);
		    SoftAssert softAssert=new SoftAssert();
		    softAssert.assertEquals(actualTaskName, expectedTaskName,"Task not matched...");
		    
	     }
	
	public String getTaskNo() 
	{      
		
		By getTaskElement=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
		WaitVisibliltyOfLocated(getTaskElement);
		String taskText=getText(getTaskElement); //call getText Method from BaseClass
		//System.out.println(taskText);
		// Find the starting index of the task number
	    int startIndex = taskText.indexOf("(")+2; // +2 to skip the space and the opening parenthesis
	    // Find the ending index of the task number
	    int endIndex = taskText.indexOf(")");
	    // Extract and return the task number
	   String taskNo =taskText.substring(startIndex, endIndex).trim();
	   return taskNo;
		
	}
	
	public void claimCustomerDetails(String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException
	{
		
		        // click on Dealer dropdown
		      By dealerDroDownLocator=By.xpath("//div[@id=\"SLID\"]/div[1]/div[1]");
		      click(dealerDroDownLocator);

				// Select dealer from dropdown
		      By delaerDroDownLocators=By.xpath("//*[@class= \" css-d7l1ni-option\"]");
				WaitVisibliltyOfLocated(delaerDroDownLocators);
				List<WebElement> dealerElements = driver.findElements(delaerDroDownLocators);
				for (WebElement dealerElement : dealerElements) {
					String dealCode = dealerElement.getText();
					if (dealCode.contains(dealerCode)) {
						dealerElement.click();
						break;
					} else {
						System.out.println("Dealer code not found ");
					}
				}

				// Enter invoice no.
				driver.findElement(By.id("INVCNO")).sendKeys(invNo);

				// Select Invoice Date
				Thread.sleep(3000);
				WebElement dateInput = driver.findElement(By.xpath("//*[@class= \"input-group\"]/input[2]"));
				dateInput.click();
				// String invoiceDateValue = "13";

				List<WebElement> invoiceDateElements = driver.findElements(By.xpath("//span[@class=\"flatpickr-day\"]"));
				for (WebElement invoiceDateElement : invoiceDateElements) {
					String invDate = invoiceDateElement.getText();
					if (invDate.equals(invoiceDate)) 
					{
						invoiceDateElement.click();
						break;
				}
				
				}

				// Enter Customer Name
				Thread.sleep(2000);
				driver.findElement(By.id("CUSTOMERNAME")).sendKeys(customerName);
				// Enter Customer Mobile No.
				Thread.sleep(2000);
				driver.findElement(By.id("CUSTOMERMOBILENO")).sendKeys(customerContact);
				// Enter Address
				Thread.sleep(2000);
				driver.findElement(By.id("CUSTOMERADDRESS")).sendKeys(customerAddress);

				// Upload File
				Thread.sleep(3000);
				WebElement uploadElement = driver.findElement(By.id("fileUploadInput"));
				uploadElement.sendKeys(filePath);
			
				}
	
	public void claimProducts(String productCodeValue, String productQty) throws InterruptedException 
	{
		     // Add Produts
		boolean productSelected = false;
		// Use explicit wait to ensure the element is clickable
		By selectProductClick = By.xpath(
				"//html/body/div[2]/div/div[1]/div/div/form/div[2]/div[3]/div/div/table/tbody/tr/td[2]/div/div/div[1]/div[2]");
		Thread.sleep(2000);
		click(selectProductClick);
 
		WebElement selectProductElement = driver.findElement(selectProductClick);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectProductElement);

		// Use Actions class to click and send keys
		Actions actions = new Actions(driver);
		actions.moveToElement(selectProductElement).click().sendKeys(productCodeValue).perform();
		try {
		
		List<WebElement> productElements = driver.findElements(By.xpath("//div[@class=\" css-qr46ko\"]/div"));
		for (WebElement productElement : productElements)
		{
			String productcode = productElement.getText();
			System.out.println(productcode);
			if (productcode.equals(productCodeValue))
			{
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", productElement);
				productSelected = true;
				break;
			
			}
		}
		}catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException caught, retrying...");
		} 

		if (productSelected) {
			System.out.println(productCodeValue + " Product is selected");
		} else {
			System.out.println("Product Code : " + productCodeValue + "  not found");
		}
		
	// Enter product Qty
		Thread.sleep(3000);
		driver.findElement(By.name("CLAIMITEMS[0].QTY")).sendKeys(productQty);
				

				
	}
	
	public void callActionButton(String actionButtonValue) {
		
		
	
		List<WebElement> callElements = driver
				.findElements(By.xpath("//div[@class=\"page-content\"]/div/header/div/div[2]/div/button"));
		for (WebElement callElement : callElements) {
			String actionButton = callElement.getText();
			if (actionButton.equals(actionButtonValue)) {
				System.out.println(actionButton);
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
				wait.until(ExpectedConditions.elementToBeClickable(callElement));
				callElement.click();
				break;
			}
	
		}

	}
	
	public void transactionButtons(String transactionButtonValue)
	{
		List<WebElement> transactionElements = driver.findElements(By.xpath("//div[@class=\"btn-group\"]/div/button"));
		for (WebElement transactionElement : transactionElements) {
			String transactionButton = transactionElement.getText();
			if (transactionButton.equals(transactionButtonValue)) {
				System.out.println(transactionButton);
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
				wait.until(ExpectedConditions.elementToBeClickable(transactionElement));
				transactionElement.click();
				break;
			}
		}
		
	}
	
	
	
	
	
	public void selectRescheduleStatus(String statusValue) throws InterruptedException  {
		
		// click on Scheduled Status
		By scheduleStatusLocator =By.xpath("//div[@class=\" css-1wy0on6\"]");	
		WaitInVisibliltyOfLocated(scheduleStatusLocator);
		click(scheduleStatusLocator);
		 Thread.sleep(2000);
		//List<WebElement> statusDropdownElements = driver.findElements(By.xpath("//div[@id=\"react-select-2-listbox\"]/div/div"));
		 List<WebElement> statusDropdownElements = driver.findElements(By.xpath("//div[@class=\" css-1nmdiq5-menu\"]/div/div"));
		 
		for (WebElement statusDropdownElement : statusDropdownElements) {
			
			String statusDropdown = statusDropdownElement.getText();
			//System.out.println(statusDropdown);
			if (statusDropdown.equals(statusValue)) {
				System.out.println(statusDropdown);
				Thread.sleep(2000);
				statusDropdownElement.click();
				break;
			} 
			}

}
	
	public void enterRescheduleRemark(String remark)
	{
		
   WebElement remarkElement = driver.findElement(By.id("ESCALATIONREMARK"));
	remarkElement.sendKeys(remark);

	}

	public void clickRescheduleSubmitBreak()  {
		
		// click on Submit & Break button
		By submitBreakButtonLocator =By.xpath("//button[text()=\"Submit&Break\"]");		
		click(submitBreakButtonLocator);
		
		
		 By successLocators=By.id("swal2-title");
			WaitVisibliltyOfLocated(successLocators);
			WebElement successElement=driver.findElement(successLocators);
		if (successElement.isDisplayed()) {
			By okButtonLocator=By.xpath("//button[text()=\"OK\"]");
			WaitVisibliltyOfLocated(okButtonLocator);
			click(okButtonLocator);
		}

	}

	public void clickrescheduleSubmit() {
		
		// click on Submit button
				By submitButtonLocator =By.xpath("//button[text()=\"Submit\"]");		
				click(submitButtonLocator);
		       WaitVisibliltyOfLocated(By.id("swal2-title"));
		      WebElement successElement = driver.findElement(By.id("swal2-title"));
		       if (successElement.isDisplayed()) {
			WaitVisibliltyOfLocated(By.xpath("//button[text()=\"OK\"]"));
			driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();

		}

	}

	  public void clickRescheduleCancel() {
		driver.findElement(By.xpath("//button[text()=\"Cancel\"]")).click(); // click on cancel button
	}
	  
	  public void checkErrorToast() throws InterruptedException
	  { 
		  dialerPage=new DialerLoginPage(driver);
	  
		  By toastErrorElement=By.xpath("//div[@class=\"Toastify\"]/div/div/div[1]/div[2]");
		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(toastErrorElement));
			 String toastErrorMsg=driver.findElement(toastErrorElement).getText();
			
			   System.out.println(toastErrorMsg);
			   wait.until(ExpectedConditions.invisibilityOfElementLocated(toastErrorElement)); 
				 if(toastErrorMsg.contains("ERROR: agent_user is not paused - "))
				 {
					 Thread.sleep(3000);
				   callActionButton("Back");
				  
				  //Switch to dialer window
				   chaildWindowHandle();
					driver.navigate().refresh();
					dialerPage.agentLoginController();
					mainWindowHandle();
					dialNextClick();
					
	
					 }
					 
					 else
					 {
						 System.out.println("Call Connected :"+toastErrorMsg);
					 }
					 
					 

				 
				 
				 }
	  
	  
	  	
	  	
	  public void checkErrorToastForInflVef() throws InterruptedException
	  { 
		  dialerPage=new DialerLoginPage(driver);
	  	
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
					click(popUpCrossLocator);
				 callActionButton("Back");
				  
				  //Switch to dialer window
				   chaildWindowHandle();
					driver.navigate().refresh();
					dialerPage.agentLoginController();
					mainWindowHandle();
					dialNextClick();
				 }
	  }
	  
	  public String getTaskTypeFromApplication() throws InterruptedException {
			
	    	try
	    	{ 
	    		
	    		By dialNexttLocator=By.xpath("//div[@class=\"main-content\"]/div/div/header/div/div[1]/div[2]/button");
	    		WebElement dialNextElement =driver.findElement(dialNexttLocator);
	    		if(dialNextElement.isDisplayed())
	    		{
	    		click(dialNexttLocator);
	    		verifyCallsAvailability();
	    		}
		       
	    	}catch(Exception e)
	    	{
	    		
	    	}
	    	Thread.sleep(2000);
	    	
	         return driver.findElement(By.xpath("//div[@class=\"page-content\"]/div/header/div/div[2]/div/button[1]")).getText();
	    	
	      }
	  
	  
	  public void enterInfluncerVerificationData(String yearsInBuss, String noOfMasons, String currentSitesNo,
              String sitesPerYear, String brandUsed, String mostPreferredBrand, String status) throws InterruptedException
	  {
		  By yearsInBussElement=By.id("YEARSINBIZ");
	         sendkeys(yearsInBussElement,yearsInBuss);
	 
	        By noOfMasonsElement =By.id("NOOFMASONS");
	        sendkeys(noOfMasonsElement,noOfMasons);
	 
	        By currentNoSitesElement =By.id("CURRENTSITESNO");
	        sendkeys(currentNoSitesElement,currentSitesNo);
	 
	        By noOfSiteYearElement = By.id("SITESPERYEAR");
	        sendkeys(noOfSiteYearElement,sitesPerYear);
	        
	        By brandUsedFieldLocator=By.xpath("//div[@class='py-1 row']/div[1]/div/div/div[1]");
	        WaitVisibliltyOfLocated(brandUsedFieldLocator);
	       click(brandUsedFieldLocator);
	      
	       try
	       {
	    	   Thread.sleep(3000);
	        List<WebElement> brandUsedDropdownElements = driver
	                .findElements(By.xpath("//div[@class=' css-1nmdiq5-menu']/div/div"));
	        for (WebElement brandUsedDropdownElement : brandUsedDropdownElements) {
	            String brandUsedDropdownValue = brandUsedDropdownElement.getText();
	            if (brandUsedDropdownValue.equals(brandUsed)) {
	            	System.out.println("Brand Used Selected DropDown Value : "+ brandUsedDropdownValue);
	            	Thread.sleep(3000);
	                brandUsedDropdownElement.click();
	                break;
	            }
	        }
	       }catch(StaleElementReferenceException e)
	       {
	            System.out.println("StaleElementReferenceException caught: " + e.getMessage());
	    	   
	       }
	        
	 
	        By mostPreffFieldLocator=By.xpath("//div[@class='py-1 row']/div[2]/div/div/div[1]");
	        WaitVisibliltyOfLocated(mostPreffFieldLocator);
	       click(mostPreffFieldLocator);
	       
	       try
	       {Thread.sleep(3000);
	        List<WebElement> mostPreBrandDropdownElements = driver
	                .findElements(By.xpath("//div[@class=' css-1nmdiq5-menu']/div/div"));
	        for (WebElement mostPreBrandDropdownElement : mostPreBrandDropdownElements) {
	            String mostPreBrandDropdownValue = mostPreBrandDropdownElement.getText();
	            if (mostPreBrandDropdownValue.equals(mostPreferredBrand)) {
	            	System.out.println("Most Preff Brand Selected DropDown Value : "+ mostPreBrandDropdownValue);
	            	Thread.sleep(3000);
	                mostPreBrandDropdownElement.click();
	                break;
	            }                
		      }
	       }catch(StaleElementReferenceException e)
	       {
	            System.out.println("StaleElementReferenceException caught: " + e.getMessage());
	    	   
	       }
	       
	        By statusFieldLocator=By.xpath("//div[@class='py-1 row']/div[3]/div/div/div[1]");
	        WaitVisibliltyOfLocated(statusFieldLocator);
	        click(statusFieldLocator);
	        
	        try
	        {Thread.sleep(3000);
	        List<WebElement> statusDropdownElements = driver
	                .findElements(By.xpath("//div[@class=' css-1nmdiq5-menu']/div/div"));
	        for (WebElement statusDropdownElement : statusDropdownElements) {
	            String statusDropdownValue = statusDropdownElement.getText();
	            if (statusDropdownValue.equals(status)) {
	            	System.out.println("Most Preff Brand Selected DropDown Value : "+ statusDropdownValue);
	            	Thread.sleep(3000);
	            	statusDropdownElement.click();
	                break;
	            }                
		      }
	        }catch(StaleElementReferenceException e)
		       {
		            System.out.println("StaleElementReferenceException caught: " + e.getMessage());
		    	   
		       }
	  }
	
}


