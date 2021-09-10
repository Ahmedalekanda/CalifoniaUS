Feature: Home page 




@TC
Scenario: Successfully verify search result
Given Open Application "<URL>"
Then Enter Shirts in search box 
Then Click on Search Icon
Then Search for specific product
Then Verify Specific product displayed
Then selected item add to cart
Then move forward to next step 
Then customer verifies his shopping cart summary
Then proceed to check out