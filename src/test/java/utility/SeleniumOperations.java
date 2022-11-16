package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;



public class SeleniumOperations 
{
	public static WebDriver driver=null;
	
	public static ConfigReader config;
//browserLaunch
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	           public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	           { 
	        	  try{
	        	   String bName=(String) inputParameters[0];
	        	    
	         if(bName.equalsIgnoreCase("Chrome"))
	        	 {	
	        	 
	               config=new ConfigReader();
	        	
	        	   System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
	        	   driver=new ChromeDriver();
	        	   driver.manage().window().maximize();
	        	 }
	         else if(bName.equalsIgnoreCase("Firefox"))
	        	 {
	        	
	        		 System.setProperty("webdriver.gecko.driver",config.getDriverPathFF());
		        	   driver=new FirefoxDriver();
		        	   driver.manage().window().maximize();
	        	 }
	         outputParameters.put("STATUS", "Pass");
	         outputParameters.put("MESSAGE", "Method used:browserLaunch , Input Given: " + inputParameters[0].toString());
	        	  }
	        	  catch(Exception e)
	        	  {
	        		  outputParameters.put("STATUS", "Fail");
	     	          outputParameters.put("MESSAGE", "Method used:browserLaunch , Input Given: " + inputParameters[0].toString());
	        	  }
	        	  return outputParameters;
	           }
//openApplication           
	           public static Hashtable<String,Object> openApplication()
	           {
	        	   try{
	        		   
	        		
	        	   driver.get(config.getApplicationUrl());
	        	   
	        	   outputParameters.put("STATUS", "Pass");
	  	           outputParameters.put("MESSAGE", "Method used:openApplication ,Input Given: " + config.getApplicationUrl().toString());
	        	   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	        	   }
	        	   catch(Exception e)
	           {
	        	   outputParameters.put("STATUS", "Fail");
	        	   outputParameters.put("MESSAGE", "Method used:openApplication ,Input Given: " + config.getApplicationUrl().toString());
	           }
	        	   return outputParameters;
	           }
	           
//clickOnElement 
	           public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	           {
	        try{
	        	driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	        	   String Locator=(String) inputParameters[0];
	        	   driver.findElement(By.xpath(Locator)).click();
	        	   
	        	   outputParameters.put("STATUS", "Pass");
	  	           outputParameters.put("MESSAGE", "Method used:clickOnElement , Input Given: " + inputParameters[0].toString()); 
	        	}
	       catch(Exception e)
	        	   {
	    	         outputParameters.put("STATUS", "Fail");
     	             outputParameters.put("MESSAGE", "Method used:clickOnElement , Input Given: " + inputParameters[0].toString());
	        	   }
	        return outputParameters;
	           }
	           
//mouseOver
	           public static Hashtable<String,Object> mouseOverAction(Object[]inputParameters)
	           {
	        	   try{
	        		//   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	   String Locator=(String) inputParameters[0];
	        	   Actions act=new Actions(driver);
	            	
	        	    WebElement mouseover=driver.findElement(By.xpath(Locator));
	        	    
	        	    act.moveToElement(mouseover).build().perform();
	        	    
	        	    outputParameters.put("STATUS", "Pass");
		  	        outputParameters.put("MESSAGE", "Method used:mouseOverAction , Input Given: " + inputParameters[0].toString()); 
	        }
	        	   catch(Exception e)
	        	   {
	        		   outputParameters.put("STATUS", "Fail");
	     	           outputParameters.put("MESSAGE", "Method used:mouseOverAction , Input Given: " + inputParameters[0].toString());
	        	   }
	        	   return outputParameters;
	           }
//sendKeys
	           public static Hashtable<String,Object> sendText(Object[]inputParameters)
	           {
	         try{
	        	   String locator=(String) inputParameters[0];
	        	   String sendText=(String) inputParameters[1];
	        	   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	        	   driver.findElement(By.xpath(locator)).sendKeys(sendText);
	        	   
	        	   outputParameters.put("STATUS", "Pass");
		  	       outputParameters.put("MESSAGE", "Method used:sendText , Input Given: " + inputParameters[0].toString()); 
	           }
	           catch(Exception e)
	           {
	        	   outputParameters.put("STATUS", "Fail");
     	           outputParameters.put("MESSAGE", "Method used:sendText , Input Given: " + inputParameters[0].toString());
	           }
	           return outputParameters;
	           }
//Validation
	           public static Hashtable<String,Object> validation(Object[]inputParameters)
	           {
	        try{	 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);  
	        
	        	   String xpath=(String) inputParameters[0];                               
	        	   String givenText=(String) inputParameters[1];                           
	       
	        	   String findedText=driver.findElement(By.xpath(xpath)).getText();
	        if(findedText.equalsIgnoreCase(givenText))
	        {
	        	System.out.println("Test Case Pass");
	        }
	        else
	        {
	        	System.out.println("Test Case Fail");
	        }
	           outputParameters.put("STATUS", "Pass");
	  	       outputParameters.put("MESSAGE", "Method used:validation , Input Given: " + inputParameters[1].toString()); 
	        }
	        catch(Exception e)
	        {
	           outputParameters.put("STATUS", "Fail");
  	           outputParameters.put("MESSAGE", "Method used:validation , Input Given: " + inputParameters[1].toString());

	        }
			return outputParameters;
	           }
	           
	      

}
