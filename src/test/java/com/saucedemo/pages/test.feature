Feature: Click on radio button
  User wants to click on radio button

  Scenario: Simple scenario to click on radio button
    Given I navigate to sauce demo web site
    When I enter user name and password
    And I click on the login button
    Then I sort the product from high to low
    Then I add the cheapest product to basket
    Then I add the second costliest product to basket
    Then I open the basket
    Then I click on checkout button
    Then I enter contact details
    Then I click on continue button
    Then I click on finish button 
    And I close the browser