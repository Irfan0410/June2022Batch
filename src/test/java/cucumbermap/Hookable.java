package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 
{
	 @Before
	  public void before(Scenario scenario) throws UnknownHostException
	  {
		 System.out.println("-----------------------------Scenario Start------------------------");
		  HTMLReportGenerator.TestSuiteStart("E:\\Report\\flipkart.html", "Flipkart");
		  HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus()); 
		  
		  
	  }
	
	
	  @After
	  public void after(Scenario scenario)
	  {
		  System.out.println("-----------------------------Scenario End------------------------");
		  
		  HTMLReportGenerator.TestCaseEnd();
		  HTMLReportGenerator.TestSuiteEnd();
		 
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
