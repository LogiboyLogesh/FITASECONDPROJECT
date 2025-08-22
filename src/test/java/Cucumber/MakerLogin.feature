@MAKERLOGIN
Feature: Validate Maker Users Login Fuctionality


  @MAKERONE
  Scenario: Validate First Maker User Login Fuctionality
  
    Given the first maker user enters login url
    When the first maker user enters username and password
    And the first maker user clicks login button
    Then the first maker user should validate the home page
    
    
    @MAKERTWO
  Scenario: Validate Second Maker User Login Fuctionality
  
    Given the second maker user enters login url
    When the second maker user enters "student" username and "Password123" password
    And the second maker user clicks login button
    Then the second maker user should validate the home page