package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
//browserLaunch
	           public static void browserLaunch(Object[]inputParameters)
	           { 
	        	  try{
	        	   String bName=(String) inputParameters[0];
	        	   String webDriverExePath=(String) inputParameters[1];
	         if(bName.equalsIgnoreCase("Chrome"))
	        	 {	
	        	// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	   System.setProperty("webdriver.chrome.driver", webDriverExePath);
	        	   driver=new ChromeDriver();
	        	   driver.manage().window().maximize();
	        	 }
	         else if(bName.equalsIgnoreCase("Firefox"))
	        	 {
	        	// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        		 System.setProperty("webdriver.gecko.driver", webDriverExePath);
		        	   driver=new FirefoxDriver();
		        	   driver.manage().window().maximize();
	        	 }
	        	  }
	        	  catch(Exception e)
	        	  {
	        		  System.out.println(e);
	        	  }
	           }
//openApplication           
	           public static void openApplication(Object[]inputParameters)
	           {
	        	   try{
	        		  // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	   String strgUrl=(String)inputParameters[0];
	        	   driver.get(strgUrl);
	        	   }catch(Exception e)
	           {
	        	   System.out.println(e);
	           }
	        	   }
	           
//clickOnElement 
	           public static void clickOnElement(Object[]inputParameters)
	           {
	        try{
	        	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	   String Locator=(String) inputParameters[0];
	        	   driver.findElement(By.xpath(Locator)).click();     
	        	}
	       catch(Exception e)
	        	   {
	        	      System.out.println(e);
	        	   }
	           }
	           
//mouseOver
	           public static void mouseOverAction(Object[]inputParameters)
	           {
	        	   try{
	        		//   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	   String Locator=(String) inputParameters[0];
	        	   Actions act=new Actions(driver);
	            	
	        	    WebElement mouseover=driver.findElement(By.xpath(Locator));
	        	    
	        	    act.moveToElement(mouseover).build().perform();
	        }catch(Exception e)
	        	   {
	        	   System.out.println(e);
	        	   }
	           }
//sendKeys
	           public static void sendText(Object[]inputParameters)
	           {try{
	        	   String locator=(String) inputParameters[0];
	        	   String sendText=(String) inputParameters[1];
	        //	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	   driver.findElement(By.xpath(locator)).sendKeys(sendText);
	           }catch(Exception e)
	           {
	        	   System.out.println(e);
	           }
	           }
//Validation
	           public static void validation(Object[]inputParameters)
	           {
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
	           }
	           
	      

}
