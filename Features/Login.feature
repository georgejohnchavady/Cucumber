#Author: your.email@your.domain.com
@regression
Feature: Login
  Login to my application

  Scenario: Logo presence on home page
    Given I launch chrome browser
    When I open home page
    Then I validate the logo present on home page
    And close browser

