package com.jspl.TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.jspl_automation.resources.ExtentReporterNG;
import com.jspl_automation.utility.BaseClass;

public class Listeners extends BaseClass implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent =ExtentReporterNG.getReportObject();
	
	@Override
    public void onTestStart(ITestResult result) {
        // Called when a test starts
		test= extent.createTest(result.getMethod().getMethodName());
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Called when a test passes
    	test.log(Status.PASS, "Test Passed");
       
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Called when a test fails
    	//to give error
       test.fail(result.getThrowable());
       
       try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	   } catch (Exception e) {
		
		e.printStackTrace();
	   } 
       
       //To capture Screenshot
       String filePath=null;
       try {
		filePath=getScreenshot(result.getMethod().getMethodName(), driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Called when a test is skipped
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not commonly used
    }

    @Override
    public void onStart(ITestContext context) {
        // Called before any tests start
        System.out.println("Test Suite Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Called after all tests have finished
      extent.flush();
    }
	
	

	   

}
