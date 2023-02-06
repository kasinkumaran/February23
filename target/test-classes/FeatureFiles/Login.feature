@What
Feature: Validate the login functionality of fb
Scenario: Validate the login functionality with invalid username and password
Given Launching chrome and loading url
When Type invalid username and password
And Click login button
Then Navigate to incorrect credential page
