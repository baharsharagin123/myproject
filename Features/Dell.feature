Feature: verify Dell login
In order to verify Dell login 
as a user 
i want to verify login

@Dell
Scenario Outline:
Given user visit Dell homepage
When user click on sign in and type valid "<email address>" and "<password>" and click on sign in
Then user will be sign in successfully

Examples:
|email address  |password|
|bahar@gmail.com|123456  |