package Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjectSpecificationMethods;
import Pages.homepage;


public class TC_001_SignupTest extends ProjectSpecificationMethods {
   
	@BeforeTest
	public void setup ()
	{
		testName = "SignUp Test";
		testDescription = "Testing the SignUp Functionality";
		testAuthor = "Karthick";
		testCategory = "Smoke Testing";
	}
	
	@Test (priority=0)
	public void SignupTest() throws InterruptedException 
	{
        homepage obj = new homepage(driver);
        
         obj.signupclick();
        
    }

}
