package com.jspl_automation.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public static ExtentReports getReportObject()

	{
		       // tow main classes for generate Reports 1. ExtentReports, 2. ExtentSparkReporter
				//Create  object of ExtentSparkReporter -this class  expect a path were you want to create a report - its reponsible to create a report
				//Generate file path  (user.dir- its automatically get project location)
				String path=System.getProperty("user.dir")+"\\reports\\JSPL Results.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				//Give Title name
				reporter.config().setDocumentTitle("JSPL");
				//Give report name
				reporter.config().setReportName("JSPL Regression Testing");
		      //Creat object ExtentReports class - it a main class- Its Responsible to drive all reporting test execution
				ExtentReports extent =new ExtentReports();
		        extent = new ExtentReports();
				extent.attachReporter(reporter);
				
				extent.setSystemInfo("Company Name", "Prowess Selling Skills Pvt.Ltd");
				extent.setSystemInfo("Project Name", "JSPL Telecalling");
				extent.setSystemInfo("Automation Tester Name", "Pratiksha Patil");
				
				return extent;
			}

	}

