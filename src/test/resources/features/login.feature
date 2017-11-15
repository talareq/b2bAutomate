Feature: Login to webshop

  Scenario: Input valid data and log in to webshop
    Given I am on login page
   Given Enter valid Email address and password
   When Click on log in button
   Then Log in as registered customer
    Then Navigate to the powerDrillsTab

  Scenario: Leave unfilled data and try to log in
    Given I am on login page
    Given Do not fill Email address and password
    When Click on log in button
    Then Failed log in and appriopriate comment

  Scenario: Input valid email address with wrong password and try to log in to webshop
    Given I am on login page
    Given Enter valid Email address and wrong password
    When Click on log in button
    Then Failed log in and appriopriate comment
