
Feature: Login NextBaseSRM feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts,
  should be able to choose Remember me on this computer option and should have access to Forgot you password link page.
  Accounts are: helpdesk, marketing, hr

  Background: Assuming user is on the login page
    Given user on the login page

  Scenario: Remember me option verification
    When user click Remember me on this computer
    Then user sees if Remember me button is selected

  Scenario: Forgot you password link verification
    When user click FORGOT YOUR PASSWORD
    Then user sees "Get Password" in the title

  @login @helpdeskParam
  Scenario: Login to the app
    And user enters "helpdesk19@cybertekschool.com" and "UserUser"
    And click the log in button
    Then account holder name should be "helpdesk19@cybertekschool.com"


  @all_accounts
  Scenario Outline: Login to the app
    And user enters "<username>" and "<password>"
    And user click Remember me on this computer
    And click the log in button
    Then account holder name should be "<username>"
#TEST DATA
    @helpdesk
    Examples:
      | username                      | password |
      | helpdesk19@cybertekschool.com | UserUser |
      | helpdesk20@cybertekschool.com | UserUser |

    @marketing
     Examples:
       | username                       | password |
       | marketing19@cybertekschool.com | UserUser |
       | marketing20@cybertekschool.com | UserUser |

    @hr
     Examples:
       | username                | password |
       | hr19@cybertekschool.com | UserUser |
       | hr20@cybertekschool.com | UserUser |





