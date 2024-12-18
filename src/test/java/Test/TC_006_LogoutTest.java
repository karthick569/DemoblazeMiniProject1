package Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjectSpecificationMethods;
import Pages.homepage;

public class TC_006_LogoutTest extends ProjectSpecificationMethods {
     @BeforeTest
	 public void setup()
	   {
		   testName = "LogOut Test";
		   testDescription = "Testing logout from application is correctly done";
		   testAuthor = "Karthick";
		   testCategory  = "Acessibility Testing";
		   
	   }
	@Test  
	public void LogoutTest() 
	{
		homepage obj = new homepage (driver);
		
         obj.logout();
	}

}
