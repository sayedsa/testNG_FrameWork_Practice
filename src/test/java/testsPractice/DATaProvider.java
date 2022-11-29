package testsPractice;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(utilities.TestNGListeners.class)
//@Listeners(utilities.TestNGConcepts.class)
public class DATaProvider {

	WebDriver driver;


	@Test (enabled = true,dataProvider = "dataSet") 
	public void  test(String userName, String password) {
		
		System.out.println(userName + "==== "+ password);
		WebDriverManager.chromedriver().setup();
		String title = driver.getTitle();
		
		String expectedTitle = "Tek School Hotel website";
		// hard Assertion
		Assert.assertEquals(title, expectedTitle);
		
		System.out.println(driver.getTitle());
		
	}
	
@DataProvider
 public Object [][] dataSet(){
	 
	 Object [][] dataSet = new Object [3][2];
	 
	 dataSet [0][0]= "user1";
	 dataSet [0][1]= "pass1";
	 
	 dataSet[1][0]= "user2";
	 dataSet [1][1]= "pass2";
	 
	 dataSet [2][0]= "user3";
	 dataSet[2][1]= "pass3";
	 
	 return dataSet;
	 
	 
	 
	 // Data Externalization:  using -- dataProviderClass is used to call data from other classes. or we can say we bring data from external class
 }
	@Test(dataProvider = "ABC", dataProviderClass = DataClass.class, enabled = false)
	public void  test2( String userName, String password, String test) {
		
		
		System.out.println(userName + "............"+ password+ "............."+ test);
		
		
	}
	
	}
 