Feature: Manage Addresses functionality
	
Background: User cancelled initial Login window
Given User provide browser name as "Chrome" and exe location  
Given user enter url as 
Given user cancel initial Login window
When user navigate on Login tab
When user click on MyProfile
When user enter "9552152728" as username
When user enter "Irfan@786" as password
When user click on Login button
	
	
@RegressionTest
Scenario: Manage Addresses with all data
When user click on Manage Addresses
When user click on Add Address
When user send "Irfan Shaikh" as name
When user send "9552152728" as mobile number
When user send "413716" as pinCode
When user send "Ambi store" as addressline1
When user send "Rahuri" as addressline2
When user click on save button
Then Application Shows Address Added successfully

