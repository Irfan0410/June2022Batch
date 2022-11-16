package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAddresses 
{
	@When("^user click on Manage Addresses$")
	public void Manage_Addresses() throws Throwable
	{
		Thread.sleep(5000);
		Object[]input9=new Object[1];
        input9[0]="//*[text()='Manage Addresses']";
        Hashtable<String, Object> output9= SeleniumOperations.clickOnElement(input9);
        HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^user click on Manage Addresses$" , output9.get("MESSAGE").toString());
	}

	@When("^user click on Add Address$")
	public void Add_Address() throws Throwable
	{
		Object[]input10=new Object[1];
        input10[0]="//*[text()='ADD ADDRESSES']";
        Hashtable<String, Object> output10= SeleniumOperations.clickOnElement(input10);
        HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user click on Add Address$" , output10.get("MESSAGE").toString());
	}

	@When("^user send \"([^\"]*)\" as name$")
	public void Name(String name) throws Throwable
	{
		Object[]input11=new Object[2];
        input11[0]="//*[@name='name']";
        input11[1]=name;
        Hashtable<String, Object> output11= SeleniumOperations.sendText(input11);
        HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user send \"([^\"]*)\" as name$" , output11.get("MESSAGE").toString());
	}

	@When("^user send \"([^\"]*)\" as mobile number$")
	public void Number(String mobNo) throws Throwable
	{
		Object[]input12=new Object[2];
        input12[0]="//*[@name='phone']";
        input12[1]=mobNo;
        Hashtable<String, Object> output12= SeleniumOperations.sendText(input12);
        HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^user send \"([^\"]*)\" as mobile number$" , output12.get("MESSAGE").toString());
	}

	@When("^user send \"([^\"]*)\" as pinCode$")
	public void PinCode(String pinCode) throws Throwable
	{
		Object[]input13=new Object[2];
        input13[0]="//*[@name='pincode']";
        input13[1]=pinCode;
        Hashtable<String, Object> output13= SeleniumOperations.sendText(input13);
        HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "^user send \"([^\"]*)\" as pinCode$" , output13.get("MESSAGE").toString());
	}

	@When ("^user send \"(.*)\" as addressline1$")
	public void Addressline1(String address1) throws Throwable
	{
		Thread.sleep(5000);
		Object[]input14=new Object[2];
        input14[0]="//*[@name='addressLine1']";
        input14[1]=address1;
        Hashtable<String, Object> output14= SeleniumOperations.sendText(input14);
        HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(), "^user send \"(.*)\" as addressline1$" , output14.get("MESSAGE").toString());
	}

	@When ("^user send \"(.*)\" as addressline2$")
	public void Addressline2(String address2) throws Throwable
	{
		Thread.sleep(5000);
		Object[]input15=new Object[2];
        input15[0]="//*[@tabindex='4']";
        input15[1]=address2;
        Hashtable<String, Object> output15= SeleniumOperations.sendText(input15);
        HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(), "^user send \"(.*)\" as addressline2$" , output15.get("MESSAGE").toString());
	}         

	@When("^user click on save button$")
	public void save_button() throws Throwable
	{
		Thread.sleep(5000);
		Object[]input16=new Object[1];
        input16[0]="(//*[@type='button'])[2]";
        Hashtable<String, Object> output16= SeleniumOperations.clickOnElement(input16);
        HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(), "^user click on save button$" , output16.get("MESSAGE").toString());
	}

	@Then("^Application Shows Address Added successfully$")
	public void Added_successfully() throws Throwable
	{ 
		Thread.sleep(5000);
		Object[]input17=new Object[2];
        input17[0]="//*[@class='_3q7S5O']";
        input17[1]="Manage Addresses";
        Hashtable<String, Object> output17= SeleniumOperations.validation(input17);
        HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(), "^Application Shows Address Added successfully$" , output17.get("MESSAGE").toString());
	}


	
	
	
	
	
}
