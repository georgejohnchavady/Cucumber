#Author: your.email@your.domain.com
@regression 
Feature: Login
  Login to my application
	@login
  Scenario Outline: Check login
    Given I launch chrome browser
    When I open home page
    Then I validate the logo present on home page
    And I enter username "<username>" and password "<password>"
    And I logout
    And close browser
    
   
  

   Examples: 
    | username| password | 
    | george  |  george |
    | paul   |     paul | 
  
  

