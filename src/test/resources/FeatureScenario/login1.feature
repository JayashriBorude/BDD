Feature: login functionality
  I want to use this template for my feature file

  Scenario: user login with correct credentials
    Given lauch browser and url
    When User entered correct login id
    When User entered correct password
    And User clicked on login button
    Then user able to login

    Scenario: user login with wrong credentials
 		Given lauch browser and url
    When User entered incorrect login id
    When User entered incorrect password
    And User clicked on login button
    Then user unable to login page & throw error massage
    
    Scenario: user login with correct login id & wrong password
 		Given lauch browser and url
    When User entered incorrect login id
    When User entered incorrect password
    And User clicked on login button
    Then user unable to login page & throw error massage
    
    Scenario: user login with wrong login id & correct password
 		Given lauch browser and url
    When User entered incorrect login id
    When User entered incorrect password
    And User clicked on login button
    Then user unable to login page & throw error massage
    
    Scenario: user login with 
 		Given lauch browser and url
    When User entered incorrect login credential
    When User entered incorrect password
    And User clicked on login button
    Then user unable to login page & throw error massage
    
    