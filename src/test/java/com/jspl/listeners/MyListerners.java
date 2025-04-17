package com.jspl.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.jspl.base.BaseClass;
import com.jspl.utilities.ExtentReporterNG;


public class MyListerners extends BaseClass implements ITestListener {

	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getExtentReport();

	@Override
	public void onTestStart(ITestResult result) {
		// Called when a test starts
		String testName = result.getName();
		test = extent.createTest(testName);
		test.log(Status.INFO, testName + " execution strarted");

		// test= extent.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// Called when a test passes
		String testName = result.getName();
		test.log(Status.PASS, testName + " got successfully executed");

	}

	 @Override
	    public void onTestFailure(ITestResult result) {
	        // Called when a test fails
	        String testName = result.getName();
	        test.log(Status.FAIL, testName + " got failed");

	        WebDriver driver = null;
	        try {
	            // Directly access the 'driver' field from the test class instance
	            driver = ((BaseClass) result.getInstance()).driver;

	            // Ensure driver is not null before proceeding
	            if (driver != null) {
	                test.addScreenCaptureFromPath(takeScreenshot(testName, driver), testName);
	                test.log(Status.INFO,result.getThrowable());
	            } else {
	                test.log(Status.WARNING, "WebDriver is null for the test: " + testName);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            test.log(Status.FAIL, "Failed to access WebDriver or take screenshot for test: " + testName);
	        }
	    }


	
	@Override
	public void onTestSkipped(ITestResult result) {
		// Called when a test is skipped
		String testName = result.getName();
		test.log(Status.SKIP, testName + " got skipped");
		 test.log(Status.INFO,result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) {
		// Called after all tests have finished
		extent.flush();
		
		//After closed browser directly open report
		File eReportFile=new File(System.getProperty("user.dir")+"\\ExtentReports\\JSPLReport.html");
		try {
			Desktop.getDesktop().browse(eReportFile.toURI());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
