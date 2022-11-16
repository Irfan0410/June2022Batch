Feature: Login functionality
	
	Background: User cancelled initial Login window
	Given User provide browser name as "Chrome" and exe location  
	Given user enter url as 
	Given user cancel initial Login window
	
	@SmokeTest
	Scenario: Login functionality with valid credentials
	When user navigate on Login tab
	When user click on MyProfile
	When user enter "9552152728" as username
	When user enter "Irfan@786" as password
	When user click on Login button
	Then Application shows user profile to user