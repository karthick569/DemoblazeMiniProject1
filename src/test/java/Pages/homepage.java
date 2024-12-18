package Pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Base.ProjectSpecificationMethods;


public class homepage extends ProjectSpecificationMethods
{
public homepage (WebDriver driver)
{
 homepage.driver = driver;
}
@BeforeClass
public void signupclick () throws InterruptedException
{
 WebElement signinbutton= driver.findElement(By.xpath("//a[@id='signin2']"));
 Actions mouse = new Actions(driver);
 mouse.click(signinbutton).perform();
driver.findElement(By.id("sign-username")).sendKeys ("karthickkrish009911");
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys ("krish");
driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
Thread.sleep(10000);
Alert alert = driver.switchTo().alert();
String msg = alert.getText();
System.out.println(msg);
alert.accept();
}

@BeforeClass
public welcomepage loginclick() throws InterruptedException
{
	driver.findElement(By.id("login2")).click();
	driver.findElement(By.id("loginusername")).sendKeys ("karthickkrish009911");
	driver.findElement(By.id("loginpassword")).sendKeys ("krish");
	driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
	
	Thread.sleep(10000);
	WebElement welcomemsg = driver.findElement(By.xpath("//a[@id='nameofuser']"));
	String wlmmsg = welcomemsg.getText();
	System.out.println(wlmmsg);
	
	return new welcomepage(driver);
}
@AfterClass
public void logout()
{
	WebElement loginbutton =driver.findElement(By.id("login2"));
	WebElement logoutbutton = driver.findElement(By.xpath("//*[@id=\"logout2\"]"));
	logoutbutton.click();
    if (loginbutton==logoutbutton)
    {System.out.println("Webpage loggedout Successfully");}
    else
    {System.out.println("Webpage loggout is Failure ");}	
    
}}
