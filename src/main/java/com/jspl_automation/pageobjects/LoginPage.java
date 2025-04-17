package com.jspl_automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.jspl_automation.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginTo(String url,String username, String password) 
	{
		
	driver.navigate().to(url);
	WaitVisibliltyOfLocated(By.name("email"));
    driver.findElement(By.name("email")).sendKeys(username);
    WaitVisibliltyOfLocated(By.name("password"));
	driver.findElement(By.name("password")).sendKeys(password);
	WaitVisibliltyOfLocated(By.xpath("//button[@type='submit']"));
	driver.findElement(By.xpath("//button[@type=\"submit\"] ")).click();
	}
	
}
