@FIX10-256
Feature: Login Functionality feature

  User Story :
  As a user, I should be able to log in so that I can land on homepage.

  Accounts are: PosManager, SalesManager, Recep

  @FIX10-288 @wip @test
  Scenario Outline:
    Given User opens a browser and go to login page
    When User enters a valid SalesManager "<username>" into username box
    And User enters a valid SalesManager "<password>" into password box
    And User clicks the login button
    Then User lands on the home page ans sees "Odoo" on the title.

    Examples: login values we are going to be using in this scenario is as below
      | username                 | password     |
      | salesmanager15@info.com  | salesmanager |
      | salesmanager20@info.com  | salesmanager |
      | salesmanager25@info.com  | salesmanager |
      | salesmanager30@info.com  | salesmanager |
      | salesmanager100@info.com | salesmanager |
      | salesmanager105@info.com | salesmanager |

  @FIX10-309 @wip
  Scenario Outline:
    Given User opens a browser and go to login page
    When User enters a valid PosManager "<username>" into username box
    And User enters a valid PosManager "<password>" into password box
    And User clicks the login button
    Then User lands on the home page ans sees "Odoo" on the title.
    Examples: login values we are going to be using in this scenario is as below
      | username               | password   |
      | posmanager15@info.com  | posmanager |
      | posmanager20@info.com  | posmanager |
      | posmanager25@info.com  | posmanager |
      | posmanager30@info.com  | posmanager |
      | posmanager100@info.com | posmanager |
      | posmanager105@info.com | posmanager |

  @FIX10-312 @wip
  Scenario Outline:
    Given User opens a browser and go to login page
    When User enters a invalid  "<username>" into username box
    And User enters a invalid  "<password>" into password box
    And User clicks the login button
    Then User can see "Wrong login/password" message on the page
    Examples: login values we are going to be using in this scenario is as below
      | username                | password     |
      | info15@info.com         | info         |
      | info20@info.com         | salesmanager |
      | salesmanager25@info.com | info         |
      | info20@info.com         | posmanager   |
      | posmanager25@info.com   | info         |

  @FIX10-313 @wip
  Scenario:
    Given User opens a browser and go to login page
    When User doesn't enter "" into username box
    And User doesn't enter "" into password box
    And User clicks the login button
    Then User can see "Lütfen bu alanı doldurun." message.

  @FIX10-315 @wip
  Scenario:
    Given User opens a browser and go to login page
    When User writes "something" into password box
    Then user should see the password in bullet signs

  @FIX10-314 @wip
  Scenario:
    Given User opens a browser and go to login page
    When User enters a valid PosManager "posmanager15@info.com" into username box
    And User enters a valid PosManager "posmanager" into password box
    And User hit ‘Enter’ key of the keyboard is working correctly on the login page.
    Then User lands on the home page ans sees "Odoo" on the title.
