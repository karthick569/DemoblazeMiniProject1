package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass
{   @BeforeMethod
	public void launchandloaduRL()
	{BrowserLaunch();}
	
    @AfterMethod
	public void browserClose()
	{closeBrowser();}

    @BeforeSuite
	public void ReportInitialization ()
	{
		String path = "C:\\Users\\hey\\eclipse-workspace\\MiniProject1Demoblaze\\Reports\\MiniProject1DemoblazeReport";
		ExtentSparkReporter reporterobj = new ExtentSparkReporter(path);
		reporterobj.config().setReportName("MiniProject1DemoblazeReport");
		
		extent = new ExtentReports();
		extent.attachReporter(reporterobj);
	}
    
    @BeforeClass
	public void testdetails()
	{

		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
  
    
    @AfterSuite
    public void reportClose ()
    {
    	extent.flush();
    }
}
