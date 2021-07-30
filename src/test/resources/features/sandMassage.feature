
Feature: NextBaseSRM send massage functionality
  User Story:
  As a user, I should be able to send message.

  Background: Assuming user is on the activity stream page
    Given user is on activity stream page
    When user click "Message" tab

  Scenario: Send a message
    And user adds text "Hello everyone!"
    And user click Send button
    Then user should see the message from the "helpdesk19@cybertekschool.com"
#Have a nice day!

  @wip
  Scenario: Cancel a message
    And user adds text "Hello everyone!!!"
    And user click Cancel button
    Then user should see the massage "Send message …"



  Scenario: Attach a link
    And user click "Link" button
    And user adds "Cucumber Documentation"  in the link text box
    And user adds "https://cucumber.io/docs/cucumber/" in the link url box
    And user click Save button
    Then user should see "Cucumber Documentation" text


