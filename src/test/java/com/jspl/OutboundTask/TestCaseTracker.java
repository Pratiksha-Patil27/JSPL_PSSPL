package com.jspl.OutboundTask;

import java.util.HashSet;
import java.util.Set;



public class TestCaseTracker {
	private static Set<String> executedTestCases = new HashSet<>();  //creat object to store excuted test cases
  
	//to check task is already execute or not
	    public static boolean isExecuted(String testCase) {
	        return executedTestCases.contains(testCase);
	    }

	    //after execute testcase add in object 
	    public static void markAsExecuted(String testCase) {
	        executedTestCases.add(testCase);
	    }
	    
	 // Method to print executed test cases
	    public static void printExecutedTestCases() {
	        System.out.println("Executed Test Cases:");
	        for (String testCase : executedTestCases) {
	            System.out.println(testCase);
	        }
	}
}


  
  

