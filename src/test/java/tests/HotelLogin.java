package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;
import pageObj.HotelLoginPageObj;
import utilities.DriverUtility;

public class HotelLogin extends Base {
	HotelLoginPageObj hotelpageObj;

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");

	}

	@Test (enabled = false) // TestNG will skip this test case
	public void loginToHotelPage() {
		hotelpageObj = new HotelLoginPageObj();
		hotelpageObj.clickonSignIn();
		logger.info("user clicked on Sign in");
		hotelpageObj.enterEmail(getUserName());
		logger.info("user entered email address");
		hotelpageObj.enterPassword(getPassword());
		logger.info("user entered password");
		hotelpageObj.clickonSignInButton();
		logger.info("user clicked on sign in button");
		DriverUtility.wait(5000);
		DriverUtility.screenShot();

	}

	@Test
	@Parameters({ "userName", "password" })
	public void loginWithParameters(String userName, String Password) {
		hotelpageObj = new HotelLoginPageObj();
		hotelpageObj.clickonSignIn();
		logger.info("user clicked on Sign in");
		hotelpageObj.enterEmail(userName);
		logger.info("user entered email address from Parameters");
		hotelpageObj.enterPassword(Password);
		logger.info("user entered password from Parameters");
		hotelpageObj.clickonSignInButton();
		logger.info("user clicked on sign in button");
		DriverUtility.wait(5000);
		DriverUtility.screenShot();

	}
	
	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser closed");

	}

}
