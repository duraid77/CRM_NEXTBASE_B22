Feature: Send message functionality
  Agile Story: As a user I should be able to send a message

  Background: Assuming user is on the home page
    Given user is logged in and on the home page



    Scenario: User can not send message
    When User click on "Message" tab
    And User not fills out the message box
    And User clicks on "Send" button
    Then User should see "The message title is not specified" text