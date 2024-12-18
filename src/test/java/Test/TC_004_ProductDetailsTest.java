package Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.ProjectSpecificationMethods;
import Pages.productdetailspage;

public class TC_004_ProductDetailsTest extends ProjectSpecificationMethods {
	@BeforeTest
	 public void setup()
	   {
		   testName = "ProductDetails Test";
		   testDescription = "Testing the products in app";
		   testAuthor = "Karthick";
		   testCategory  = "Acessibility Testing";
		   
	   }
		
    @Test  (priority=3)
	public void ProductdetailsTest() throws InterruptedException
	{
		productdetailspage obj = new productdetailspage(driver);
        
        obj.productdetailsvalidation();
	}

}
