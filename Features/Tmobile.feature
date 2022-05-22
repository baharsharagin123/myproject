Feature: verify Tmobile login 
In order to verify Tmobile Log in 
as a user 
i want to go Tmobile home page and veify log in 

@Login
Scenario Outline: Title of your scenario
Given user visit Tmobile url
When user click on my account and click on log in and type valid "<email address>" and click next and type valid "<password>" and click log in 
Then user will be able to login successfully

Examples:
|email address          |password |
|baharsharagin@gmail.com|Taposh@12|
 