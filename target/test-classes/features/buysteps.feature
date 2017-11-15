Feature: Buy steps

Scenario: I search for the screwdriver and buy the first one
Given I am on login page
Given Enter valid Email address and password
When Click on log in button
Then Log in as registered customer
When I search for "screwdriver"
Then I select the first one on the list
When I add the item to cart and checkout
Then I view the cart content and checkout