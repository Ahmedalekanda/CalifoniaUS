Feature: Loggin 



@TC
Scenario: User can successfully login and check order history
Given Open Application "<URL>"
Then Click on Signin Button
Then Enter User Email Password and Click Signin Icon
Then Verify User in the Profile Page
Then Check user in order details Page
Then Finally Verify user successfully enters order history page 