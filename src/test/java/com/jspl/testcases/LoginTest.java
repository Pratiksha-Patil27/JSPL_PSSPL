package com.jspl.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.jspl.base.BaseClass;
import com.jspl.listeners.MyListerners;
import com.jspl.pageobjects.DashboardPage;
import com.jspl.pageobjects.ReactLoginPage;

@Listeners(MyListerners.class)
public class LoginTest extends BaseClass {
	private ReactLoginPage loginPage;
	private DashboardPage dashboardPage;
	
	
	@BeforeClass
	public void launch() {
		launchBrowser(getProperty("browserName"));
		driver.navigate().to(getProperty("reactSite"));

	}

 @Test(priority=1,dataProvider = "invalidloginData")
  public void loginByInvalidCredentials(String username, String password) {

		SoftAssert softAssert = new SoftAssert();
		loginPage = new ReactLoginPage(driver);
		loginPage.loginToReact(username, password);
		softAssert.assertTrue(loginPage.verifyWarningMsgForInvalidUsernamePasswordDisplay(),"Warning Msg should be dispaly for Invalid credentials.");
		softAssert.assertAll();
		driver.navigate().refresh();
  }
  
  @Test(priority=2,dataProvider = "blankloginData")
  public void loginByBlankCredentials(String username, String password) {
		SoftAssert softAssert = new SoftAssert();
		loginPage = new ReactLoginPage(driver);
		loginPage.loginToReact(username, password);
		softAssert.assertTrue(loginPage.verifyWarningMsgForBlankUsernamePasswordDisplay(),"Warning Msg should be dispaly for blank credentials.");
		softAssert.assertAll();
		driver.navigate().refresh();
  }
  
	@Test(priority = 3, dataProvider = "validloginData")
	public void loginByValidCredentials(String username, String password) {
		SoftAssert softAssert = new SoftAssert();
		loginPage = new ReactLoginPage(driver);
		dashboardPage = loginPage.loginToReact(username, password);
		softAssert.assertTrue(dashboardPage.verifySuccessfullyLandingOnDashboard(),
				"User Should successfully login by Valid creadentials.");
		softAssert.assertAll();

	}

  @AfterClass
  public void closed()
  {
	driver.quit();
  }
  
  
  @DataProvider(name = "invalidloginData")
 public Object[][] invalidData() {
	return new Object[][]{
	  {"6001" ,"admin123"},
	  {"admin", "tELE@6001"},
	  {"admin", "admin123"}
	  
	 
  
  
  };
  }

  @DataProvider(name = "blankloginData")
  public Object[][] blankData() {
 	return new Object[][]{
  
	  {"","tELE@6001"},
	  {"6001",""},
	  {"",""},
	 
  };
  
    }
  
  @DataProvider(name = "validloginData")
  public Object[][] validData() {
 	return new Object[][]{
	  {"6001","tELE@6001"}
  };
  }
  
}