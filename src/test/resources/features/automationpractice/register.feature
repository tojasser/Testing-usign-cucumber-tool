Feature: Registration
  As a new user
  I want to register with automationpractice.com
  So that I can shop till I drop

  Scenario: Register successfully
    Given I am on the homepage
    When I sign in
    And enter an email address to create an account
    And I fill in the registration form
    And I am registered and logged in
    Then I sign out



  Scenario: Log in with valid credentials
  Given I am on the homepage
  When I sign in
  And Enter email address and passowrd
  Then I log in

  

  #Scenario: Submit empty registration form
    #Given I am on the homepage
    #When I sign in
    #And enter an email address to create an account
    #And try to create account without filling in the form
    #Then I will get an error

