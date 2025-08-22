@ADMINLOGIN
Feature: Validate Admin Users Login Fuctionality


Background:

Given the admin users verify background steps


@ADMINONE @ADMINFIRST
  Scenario Outline: Validate First Admin User Login Fuctionality
  
    Given the first admin user enters login url
    When the first admin user enters "<username>" username and "<password>" password
    And the first admin user clicks login button
    Then the first admin user should validate the home page
    
    Examples:
			|username|password   |
    	|student |Password123|
    	|student |Password123|
    	
    	
@ADMINTWO @ADMINSECOND
  Scenario Outline: Validate Second Admin User Login Fuctionality
  
    Given the second admin user enters login url
    When the second admin user enters "<username>" username and "<password>" password
    And the second admin user clicks login button
    Then the second admin user should validate the home page
    
    Examples:
			|username|password   |
    	|student |Password123|
    	|student |Password123|