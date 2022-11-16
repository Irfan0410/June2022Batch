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
  
 /* Manage Address
    driver.findElementByXPath("//*[text()='Manage Addresses']").click();
    Thread.sleep(10000);
//Add Addresses
    driver.findElement(By.xpath("//*[text()='ADD ADDRESSES']")).click();
//Enter Name
    driver.findElementByXPath("//*[@name='name']").sendKeys("Irfan Kamil Shaikh.");
//Enter Mob No.
    driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9552152728");
//Enter PinCode
    driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("413716");
//Enter Address
    driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("A/P: Ambi Store, Deolali Pravara, Tal-Rahuri, Dist-Ahmednagar.");
//Enter City Name
    //driver.findElement(By.xpath("//*[@tabindex='6']")).sendKeys("Rahuri");
    
//Create Select Class
    Select sel=new Select(driver.findElement(By.xpath("//*[@name='state']")));
    sel.selectByValue("Maharashtra");
//Click On Address Type
    driver.findElement(By.xpath("//*[text()='Home']")).click();
    Thread.sleep(5000);
//Click On Save Button
    driver.findElementByXPath("(//*[@type='button'])[2]").click();
//Click On Logout Button   
    driver.findElementByXPath("//*[text()='Logout']").click();
 
   
   */

    	 
	}
}
