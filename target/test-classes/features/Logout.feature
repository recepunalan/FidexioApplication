@FIX10-243
Feature: Logout Functionality feature

  User Story :
  As a user, I should be able to log out.
  Accounts are: PosManager, SalesManager

  Background:
  Given User is on the login page.
    And The user enters the salesmanager username "salesmanager15@info.com" and password "salesmanager"

  @FIX10-319 @wip
  Scenario:
    When User sees his-her username button "SalesManager" on the top right-hand corner.
    And User clicks his-her username button.
    And User clicks logout button.
    Then user is on the login page "Login".

  @FIX10-320 @wip
  Scenario:
    When User sees his-her username button "SalesManager" on the top right-hand corner.
    And User clicks his-her username button.
    And User clicks logout button.
    And user is on the login page "Login".
    And user click the  step back button on the top left-hand corner.
    Then User sees "Your Odoo session expired." message on the page.




