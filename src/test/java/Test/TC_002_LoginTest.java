package Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.homepage;

public class TC_002_LoginTest extends ProjectSpecificationMethods {
    @BeforeTest
	public void setup()
   {
	testName = "Login Test";
	testDescription = "Testing the login functionality";
	testAuthor = "Karthick";
	testCategory = "Smoke Testing";
   }
	
	@Test  (priority=1)
	public void LoginTest() throws InterruptedException 
	{
		homepage obj = new homepage(driver);
       
        obj.loginclick();

	}

}
