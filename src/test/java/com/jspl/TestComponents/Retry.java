package com.jspl.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	private int count=0;
	private int maxTry=0;
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxTry)
		{
			count++;
			return true;
		}
		return false;
	}

}
