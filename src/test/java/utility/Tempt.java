package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt 
{
     public static void main(String[] args) throws InterruptedException
     {
		
    	 
    	 //Launch browser
     	System.setProperty("webdriver.chrome.driver", "E:\\Automation software\\chromedriver.exe");
     	
     	ChromeDriver driver=new ChromeDriver();
     	
     	driver.manage().window().maximize();
     	
     	 //Open Application
     	driver.get("http://www.flipkart.com");
     	
     	//Cancel Login Window
     driver.findElementByXPath("//button[@class='_2KpZ6l _2doB4z']").click();
     // mous over on login	
     	Actions act=new Actions(driver);
     	
    WebElement mouseover=driver.findElementByXPath("//*[@class='_1_3w1N']");
    
    act.moveToElement(mouseover).build().perform();
   
   WebElement abc= driver.findElement(By.xpath("(//*[@class='_2kxeIr _1pY_1Z'])[1]"));
   
   act.moveToElement(abc).build().perform();
  
   Thread.sleep(2000);
    abc.sendKeys(Keys.ENTER);
       
    //click on my profile
    Thread.sleep(5000);
    
    //Enter Username
    driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9552152728");
    
    //Enter Password
    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Irfan@786");
    
    //Click Login
    driver.findElement(By.xpath("(//*[text()='Login'])[3]")).click();
  
   
 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //"//*[@class='_2IX_2- VJZDxU']"
   
   
   
   /* driver.findElementByXPath("//*[text()='Manage Addresses']").click();
   
   driver.findElementByXPath("//*[text()='ADD ADDRESSES']").click();
   
   driver.findElementByXPath("//*[@name='name']").sendKeys("Irfan Kmail Shaikh.");
   
   driver.findElementByXPath("//*[@name='phone']").sendKeys("9552152728");
   
   driver.findElementByXPath("//*[@name='pincode']").sendKeys("413716");
   
   driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[4]").sendKeys("Deolali Pravara");
   
   driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("A/P: Deolali Pravara, Tal- Rahuri, Dist- Ahmednagar.");
   
   driver.findElementByXPath("//*[@tabindex='6']").sendKeys("Ahmednagar");
   
   Select sel=new Select(driver.findElementByXPath("//*[@name='state']"));
   
   sel.selectByValue("Maharashtra");
   
   driver.findElementByXPath("//*[text()='Home']").click();        */
    	 
    	 
    	 
	}
}
