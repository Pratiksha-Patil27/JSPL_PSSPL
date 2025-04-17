package com.jspl.base;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jspl.OutboundTaskTest.TaskTypeManager;

public class BaseClass {
	protected ExtentReports extent;
    protected ExtentTest test;
    public WebDriver driver;
    private static final Set<String> countedTests = Collections.synchronizedSet(new HashSet<>()); // Shared across all tests
    private static Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resource\\data.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
	
   
	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			// Create ChromeOptions object
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addExtensions(new File("D:\\Pratiksha\\Downloads\\Cross-Domain-CORS-Chrome-Web-Store.crx"));
			chromeOptions.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(chromeOptions);
			
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addExtensions(new File("D:\\Pratiksha\\Downloads\\Cross-Domain-CORS-Chrome-Web-Store.crx"));
			edgeOptions.setAcceptInsecureCerts(true);
			driver = new EdgeDriver(edgeOptions);
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
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
	
	// Get Data from JSON file
	public List<HashMap<String, String>> getJsonDataToMapSingle(String filePath) {

		List<HashMap<String, String>> data = null;
		try {
			// Read JSON to string
			String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

			// String to HashMap using Jackson Databind
			ObjectMapper mapper = new ObjectMapper();
			data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	// Get Data from JSON file (Handle both Single and Multiple Objects)
	public List<HashMap<String, String>> getJsonDataToMap(String filePath) {
		List<HashMap<String, String>> data = null;
		try {

			String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

			// Create an ObjectMapper for Jackson Databind
			ObjectMapper mapper = new ObjectMapper();

			// Check if the content is an array (check the first character if it's '[')
			if (jsonContent.trim().startsWith("[")) {
				// If it's an array, deserialize into a List<HashMap<String, String>>
				data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
				});

			} else {

				// If it's a single object, wrap it in a list
				HashMap<String, String> singleObject = mapper.readValue(jsonContent, HashMap.class);
				data = List.of(singleObject); // Wrap the single object into a list

			}

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
	 
	
	 public static String takeScreenshot(String testName, WebDriver driver) {
	        File sourceScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File destinationScreenshotFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+ testName+ "_" + System.currentTimeMillis()  +".png");
	        try {
	            FileUtils.copyFile(sourceScreenshotFile, destinationScreenshotFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return destinationScreenshotFile.getAbsolutePath();
	    }
	 
		public void logTestMethod(WebDriver driver, ExtentTest methodTest, TaskTypeManager manager, String testName,
				Runnable testMethod) throws IOException {
			try {
				testMethod.run(); // Execute the lambda expression (test logic)
				methodTest.pass(testName + " executed successfully");
				// Increment count only if the test hasn't been counted yet
				if (!countedTests.contains(testName)) {
					manager.incrementPassedCount();
					countedTests.add(testName); // Mark the test as counted
					// System.out.println("Test added to countedTests: " + testName);

				}
			} catch (AssertionError ae) {
				String screenshotPath = takeScreenshot(testName, driver);
				methodTest.fail("Assertion error: " + ae.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				if (!countedTests.contains(testName)) {
					manager.incrementFailedCount();
					countedTests.add(testName); // Mark the test as counted
					// System.out.println("Test added to countedTests: " + testName);
				}
			} catch (Exception e) {
				String screenshotPath = takeScreenshot(testName, driver);
				methodTest.fail("Exception: " + e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				if (!countedTests.contains(testName)) {
					manager.incrementFailedCount();
					countedTests.add(testName); // Mark the test as counted
					// System.out.println("Test added to countedTests: " + testName);
				}
			}
		}
	
}
