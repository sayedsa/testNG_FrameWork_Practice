package testsPractice;

import org.testng.annotations.DataProvider;

public class DataClass {

	
	@DataProvider( name  = "ABC")
	public Object [][] dataSet2(){
		
		return new Object [][]
		{
			{"username", "password", "test"},
			{"username1", "password1", "test1"},
			{"username2", "password2", "test2"}
				};
				}
}
