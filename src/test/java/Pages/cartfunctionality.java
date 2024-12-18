package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationMethods;

public class cartfunctionality extends ProjectSpecificationMethods
{
	public cartfunctionality (WebDriver driver)
	{cartfunctionality.driver =driver;}
	
	@BeforeClass
	public void deleteitemfromcart()
	{
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		String actualtotal = driver.findElement(By.xpath("//h3[contains(text(), 'Total')]")).getText();
		String expectedtotal = "360";
		if(actualtotal.equalsIgnoreCase( expectedtotal ))
		   {
            System.out.println("TOTAL IS CORRECT");
		   }
		else
		 {
            System.out.println("TOTAL IS INCORRECT");
		   }
	 }
	@BeforeClass
	public void clickk()
	    {
	      driver.findElement(By.id("//button[contains(@class, 'btn btn-success')]")).click();
        }
	@BeforeClass
      public void puchasefunction()
      {
    	  boolean placeorder = driver.findElement(By.xpath("//h5[@id='orderModalLabel']")).isDisplayed(); 
    	  System.out.println("Place Order window is opened" + placeorder);
    	  
    	  driver.findElement(By.xpath("//input[contains(@id,'recipient-email')]")).sendKeys("santhosh");
    	  driver.findElement(By.xpath("//input[@id='country']")).sendKeys("india");
    	  driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
    	  driver.findElement(By.xpath("//input[@id='card']")).sendKeys("9042552409");
    	  driver.findElement(By.xpath("//input[@id='month']")).sendKeys("12");
    	  driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");
    	  driver.findElement(By.xpath("//button[text()=\"Purchase\"]")).click();
    	  
    	  String purchaseconfirmation =  driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']")).getText();
    	  String expectedtext = "Thank you for your purchase!";
  		if(purchaseconfirmation.equalsIgnoreCase( expectedtext ))
  		   {
              System.out.println("ORDER IS PLACED SUCCESSFULLY");
  		   }
  		else
  		 {
              System.out.println("ORDER IS NOT PLACED SUCCESSFULLY");
  		   }
  		
  		  driver.findElement(By.xpath("//button [text()='OK']")).click();
  		  return;
      }  
    
      }  

