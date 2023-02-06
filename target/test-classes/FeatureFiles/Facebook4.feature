
Feature: To check invalid username and valid password
	Background:
					Given Open the browser and load the facebook url

Scenario:	 By entering invalid username and valid password, then clicking login
When Enter the invalid username and valid password
And Click the login button
Then Navigate to invalid password page

Scenario:	 By entering valid username and invalid password, then clicking login
When Enter the valid username and invalid password
And Click the login button
Then Navigate to invalid password page

@Whale
Scenario:	 By entering invalid username and valid password, then clicking login
When Enter the valid username and give the password as space
And Click the login button
Then Navigate to invalid password page

@Stingray
Scenario Outline:	 By enterin invalid username and valid password, then clicking login
When Enter the valid username "<Name>" and valid password "<Psword>"
And Click the login button
Then Navigate to home page

Examples:
|Name|Psword|
|Greens@gmail.com|14501bcabb|
|Kumaran@gmail.com|14503bcabb|
|06kumaran@gmail.com|14506bcabb|



