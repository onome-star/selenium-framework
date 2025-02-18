@AccountManagement
Feature: Account Management
  @CreateAccount
  Scenario Outline: Create an account using a valid email
    Given I am on create an account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And I click on create an account
    Then My account page is displayed

    Examples:
      |firstname|lastname|email                 |password|confirmpassword|
      |logan    |brand   |loganbrand23@gmail.com|Logan@21|Logan@21       |

  @DuplicateAccount
  Scenario Outline: Create an account - duplicate account creation not allowed
    Given I am on create an account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And I click on create an account
    Then Error message should be displayed that account already exists

    Examples:
      |firstname|lastname|email                 |password|confirmpassword|
      | logan   |brand   |loganbrand23@gmail.com|Logan@21| Logan@21      |

  @SignIn
  Scenario Outline: Account Login - Registered customer to login with their username and password
    Given I am on signin account page
    When I enter "<email>" "<password>"
    And I click on login account
    Then My account page is displayed

    Examples:
      |email                 |password|
      |loganbrand23@gmail.com|Logan@21|

    @SignIn-UnregisteredCustomer
  Scenario Outline: Account Login - Customer not registered should encounter an error
      Given I am on signin account page
      When I enter "<email>" "<password>"
      And I click on login account
      Then Error message is displayed that account is not registered

      Examples:
        |email                 |password|
        |loganbrand24@gmail.com|Logan@21|