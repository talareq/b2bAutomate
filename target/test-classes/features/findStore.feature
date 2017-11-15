Feature: Find a store

#  Scenario: Find store by Zip Code
#    Given Log in to webshop
#    And Go to the find store page
#    When Input Zip Code in search field and click search button
#    Then Find stores with chosen Zip Code

#    Scenario: Find store by address
#      Given Log in to webshop
#      And Go to the find store page
#      When Input address in search field and click search button
#      Then Find stores with chosen address
#
      Scenario: Display all available stores nearby
        Given Log in to webshop
        And Go to the find store page
        When Click on find stores button
        Then Find all stores available nearby

        Scenario: Search stores without entering any data
          Given Log in to webshop
          And Go to the find store page
          When Click search button with unfilled search field
          Then Failed search