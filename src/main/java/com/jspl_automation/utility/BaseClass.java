package com.jspl_automation.utility;

import java.io.File;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



public class BaseClass  {
	
	protected ExtentReports extent;
    protected ExtentTest test;
    protected WebDriver driver;
	
 	
	
	public void launchBrowser(String browser)
	{         
		switch(browser)
		{
		case "chrome":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			
			driver=new EdgeDriver();	
			break;
		case "firefox":
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		break;
		}

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
	
	
	public void enterText(By by,String text )
	{   
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
		driver.findElement(by).sendKeys(text);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void click(By by)
	{
		try
		{
		    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
		    driver.findElement(by).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void list(By by,String Text)
	{
	 List<WebElement> Allelements=driver.findElements(by);
	 for(WebElement element :Allelements)
	 {
		 String Value=element.getText();
		 if(Value.equals(Text))
		 {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			break;
		 }
	 }
	}
	
	public void listContains(By by,String Text)
	{
	 List<WebElement> Allelements=driver.findElements(by);
	 for(WebElement element :Allelements)
	 {
		 String Value=element.getText();
		 if(Value.contains(Text))
		 {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			break;
		 }
	 }
	}
	
	
	
	public ChromeOptions setChromeOption()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("incognito");
		//option.setHeadless(true);
		option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-clocking"));
		Map<String,String> pref=new HashMap<>();
		pref.put("download.default.directory","D:\\");
		option.setExperimentalOption("prefs", pref);
		option.setAcceptInsecureCerts(true);
		return option;
	}
	public void waitElementToBeClickable(By by)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	public void WaitVisibliltyOf(By by)
	{
 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
	}
	public void WaitVisibliltyOfLocated(By by)
	{
 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void WaitInVisibliltyOfLocated(By by)
	{
 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	public void sendkeys(By by, String text)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).sendKeys(text);
		
	}
	public String getText(By by)
	{      
		//By getTaskNoElement=By.xpath("//*[@id=\"TelecallingInfoDiv\"]/div/div/a/div/div[3]/marquee/span");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
		String text=driver.findElement(by).getText();
		return text;
		
	}
	
	//Get Data from JSON file
	public List<HashMap<String, String>> getJsonDataToMap(String filePath)  {
	   
	
		List<HashMap<String, String>> data = null;
        try {
            // Read JSON to string
            String jsonContent = FileUtils.readFileToString(new File(filePath),
                    StandardCharsets.UTF_8);

            // String to HashMap using Jackson Databind
            ObjectMapper mapper = new ObjectMapper();
            data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
	}
	
	
	//to provide data from json to Dataprovider
	 public Object[][] readJsonData(String jsonFilePath)
	 {
	      // call method to read json file
			List<HashMap<String, String>> data = getJsonDataToMap(jsonFilePath);

			// Create Object[][] array with the size of the list to  give count of data from json
		    Object[][] dataArray = new Object[data.size()][1];
		    for (int j = 0; j < data.size(); j++) {
		        dataArray[j][0] = data.get(j);
		    }

		    return dataArray;
	
	 }
	 
	 //For taking Screenshot
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"//reports//"+ testCaseName +".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//"+ testCaseName +".png";
	}
	
	//Also For Taking ScreenShot (new)
	 public String takeScreenshot(String methodName,WebDriver driver ) {
	        String filePath = System.getProperty("user.dir") + "/reports/" + methodName + "_" + System.currentTimeMillis() + ".png";
	        try {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File source = ts.getScreenshotAs(OutputType.FILE);
	            File destination = new File(filePath);
	            FileUtils.copyFile(source, destination);
	           
	        } catch (IOException e) {
	           
	            filePath = "Failed to capture screenshot: " + e.getMessage();
	        }
	        return filePath;
	    }
	 
	 public  void logTestMethod(WebDriver driver,ExtentTest methodTest, String methodName, Runnable testMethod) throws IOException {
		    try {
		        testMethod.run();  // Execute the lambda expression (test logic)
		        methodTest.pass(methodName + " executed successfully");
		        
		    } catch (AssertionError ae) {
		        String screenshotPath = takeScreenshot(methodName, driver);
		        methodTest.fail("Assertion error: " + ae.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(methodName, driver);
		        methodTest.fail("Exception: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    
		}
	 
	 @BeforeSuite
	    public void setUp() {
	        
	        String path=System.getProperty("user.dir")+"\\reports\\JSPL_OutBoundTask.html";
	        ExtentSparkReporter spark = new ExtentSparkReporter(path);
	       
	        //Give Title name
	        spark.config().setDocumentTitle("JSPL Outbound Task ");
			//Give report name
	        spark.config().setReportName("JSPL Outbound Task Results");
	        extent = new ExtentReports();
			extent.attachReporter(spark);
			
			extent.setSystemInfo("Company Name", "Prowess Selling Skills Pvt.Ltd");
			extent.setSystemInfo("Project Name", "JSPL Telecalling");
			extent.setSystemInfo("Automation Tester Name", "Pratiksha Patil");
			
	    }
	 
	 @AfterSuite
	    public void tearDown() {
	        extent.flush();
	    }
	
	
	
	
	
	
	
	
	
}
	
	

