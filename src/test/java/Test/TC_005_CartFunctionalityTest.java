package Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjectSpecificationMethods;
import Pages.cartfunctionality;

public class TC_005_CartFunctionalityTest extends ProjectSpecificationMethods {
     @BeforeTest
	 public void setup()
	   {
		   testName = "CartFunctionality Test";
		   testDescription = "Testing the product is added in the cart";
		   testAuthor = "Karthick";
		   testCategory  = "Acessibility Testing";
		   
	   }
	
	
	@Test  (priority=4)
	public void CartfunctionalityTest()
	{
		cartfunctionality obj = new cartfunctionality(driver);
        
        obj.deleteitemfromcart();
        obj.clickk();
        obj.puchasefunction();
	}

}
