package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationMethods;

public class productdetailspage extends ProjectSpecificationMethods
{
	public productdetailspage  (WebDriver driver)
	{productdetailspage.driver=driver;}
	@BeforeClass
	public cartfunctionality productdetailsvalidation() throws InterruptedException
	{
		WebElement productclick = driver.findElement (By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
		productclick.click();
   
  String mobilename = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2")).getText();
  String expectedmobilename = "Samsung galaxy s6";
  
  if (mobilename.equalsIgnoreCase(expectedmobilename))
  {  System.out.println("The product name is displayed correctly"); }
  else
  {  System.out.println("The product name is displayed wrongly"); }
  
  String mobileprice =  driver.findElement(By.xpath("//h3[@class='price-container']")).getText();
  String expectedmobileprice = "$360 *includes tax";
  
  if (mobileprice.equalsIgnoreCase(expectedmobileprice))
  {  System.out.println("The mobile price is displayed correctly"); }
  else
  {  System.out.println("The mobile price  is displayed wrongly"); }
  
  driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']")).click();
  
  Thread.sleep(10000);
  Alert alert = driver.switchTo().alert();
  System.out.println(alert.getText());
  alert.accept();
  
  return new cartfunctionality (driver);
	}
  
  
}
