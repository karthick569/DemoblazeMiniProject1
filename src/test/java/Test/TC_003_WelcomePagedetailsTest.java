package Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjectSpecificationMethods;
import Pages.welcomepage;

public class TC_003_WelcomePagedetailsTest extends ProjectSpecificationMethods{
    @BeforeTest
	public void setup()
   {
	   testName = "WelcomePage Test";
	   testDescription = "Testing the option available in welcome page";
	   testAuthor = "Karthick";
	   testCategory  = "Acessibility Testing";
	   
   }
	
	
	@Test  (priority=2)
	public void  WelcomepageTest() 
	{
		welcomepage obj = new welcomepage(driver);
       
        obj.welcomepagevalidation();
	}

}
