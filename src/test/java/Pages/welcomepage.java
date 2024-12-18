package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationMethods;

public class welcomepage extends ProjectSpecificationMethods
{
	public welcomepage (WebDriver driver)
	{welcomepage.driver=driver;}
	@BeforeClass
	public  productdetailspage welcomepagevalidation ()
   	 {
	
	WebElement welcomemessage = driver.findElement (By.id("nameofuser"));
	String message = welcomemessage.getText();
	{System.out.println(message+" = Hence the welcome message is Displayed");}
	
	boolean homebutton = driver.findElement(By.xpath("//a[@class='nav-link' and @href='index.html']")).isEnabled();
	{System.out.println("Is the home button is ennabled -"+homebutton);}
	
	boolean contactbutton = driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).isEnabled();
	{System.out.println("Is the contact button is ennabled -"+contactbutton);}
	
	boolean aboutbutton = driver.findElement(By.xpath("//a[contains(text(),\"About us\")]")).isEnabled();
	{System.out.println("Is the about button is ennabled -"+aboutbutton);}
	
	WebElement catogoryphone = driver.findElement (By.xpath(" //a[text()='Phones']"));
	boolean phone = catogoryphone.isDisplayed();
	{System.out.println("Is the list of mobiles is displayed" + "=" + phone);}
	
	WebElement catogorylaptop = driver.findElement (By.xpath(" //a[text()='Laptops']"));
	boolean laptop = catogorylaptop.isDisplayed();
	{System.out.println("Is the list of laptops is displayed" + "=" + laptop);}
	
	WebElement catogorymonitors= driver.findElement (By.xpath(" //a[text()='Monitors']"));
	boolean monitors = catogorymonitors.isDisplayed();
	{System.out.println("Is the list of monitors is displayed" + "=" + monitors);}
	
	
	WebElement logo = driver.findElement (By.xpath("/html/body/nav/a"));
	boolean websitelogo = logo.isDisplayed();
	{System.out.println("Is the logo is displayed correctly" +"-" +  websitelogo );}
	
	
   	 
	return new productdetailspage (driver);
   	 }
	 
  }
