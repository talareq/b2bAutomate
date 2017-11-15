Feature: User tests MegaMenu functionality

  Scenario: Navigate Through all the MegaMenu links.
    Given Enter valid Email address and password
    And   Click on log in button
    And   Log in as registered customer
    When  Navigate to the <TabName>
    Then  <TabName> should be displayed.

    Examples:
    |     TabName     |
    |  PowerDrillsTab |
    | AngleGrindersTab|
