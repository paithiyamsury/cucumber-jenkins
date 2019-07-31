Feature: Login functionality
Descrption: Registered user login to the application by entering valid username and password

Mapping: Jhon would like to access online shopping page. He should registered
Scenario: Login with valid data
Given user opens newtours application on chrome browser
When user enters "mercury" in username and password field
And Click on Signin Button
Then verify login result as success

