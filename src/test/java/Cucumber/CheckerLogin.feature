@CHECKERLOGIN
Feature: Validate Checker Users Login Fuctionality


  @CHECKERONE
  Scenario: Validate First Checker User Login Fuctionality
  
    Given the first checker user enters login url
    When the first checker user enters username and password
    			|student|Password123|
    And the first checker user clicks login button
    Then the first checker user should validate the home page
    
    
    @CHECKERTWO
  Scenario: Validate Second Checker User Login Fuctionality
  
    Given the second checker user enters login url
    When the second checker user enters username and password
    			|username|password   |
    			|student |Password123|
    And the second checker user clicks login button
    Then the second checker user should validate the home page