@BOTHLOGIN
Feature: Validate Both Users Login Fuctionality


  @BOTHONE
  Scenario: Validate First Both User Login Fuctionality
  
    Given the first both user enters login url
    When the first both user enters username and password
    			|student  |Password123 |
    			|student1 |Password1234|
    And the first both user clicks login button
    Then the first both user should validate the home page
    
    
    @BOTHTWO
  Scenario: Validate Second Both User Login Fuctionality
  
    Given the second both user enters login url
    When the second both user enters username and password
    			|username |student    |
    			|password |Password123|
    And the second both user clicks login button
    Then the second both user should validate the home page