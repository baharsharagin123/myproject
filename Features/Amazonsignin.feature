Feature:Amazon sign up
In order to  create account in amazon homepage
as a user 
I want to type and click continue and sign up Amazon

@Account
Scenario Outline:
Given user visit amazon  sign in homepage
When user type "<name>" and valid "<email address>" and  type valid "<password>" and retype  "<password>" and click continue

Then user will be able to signin sucessfully

Examples:
|name					|email address		 |password|password|					

|sharaginBahar|sharagin@gmail.com|Taposh@12|Taposh@12|

