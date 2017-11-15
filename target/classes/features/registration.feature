Feature: Register as a new customer to webshop

  Scenario: Input valid data and register in webshop

    Given I am on login page
    And Enter New Customer registration through log in page
    And Fill all mandatory data
    When Click on register button
    Then Successful registration as a new customer

  Scenario: Input valid data and register in webshop
    Given I am on login page
    And Enter New Customer registration through log in page
    And Fill all mandatory and optional data
    When Click on register button
    Then Successful registration as a new customer

  Scenario: Input not all data and register in webshop
    Given I am on login page
    And Enter New Customer registration through log in page
    And Leave at least one mandatory section unfilled
    When Click on register button
    Then Redirect to registration page with highlightened unfilled/invalid sections
