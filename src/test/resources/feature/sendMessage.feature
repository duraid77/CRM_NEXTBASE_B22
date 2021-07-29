Feature: Send message functionality
  Agile Story: As a user I should be able to send a message

  Background: Assuming user is on the home page
    Given User is logged in and on the home page
    #Begin your steps after the "GIVEN" since it is placed as a background

  Scenario: Users send message with "Message" tab


    Scenario: Users cancel messages


      //TS_003_US1
      @wip
      Scenario: Users attach link with link icon
        When User clicks on "Message" tab
        Then User enters any "<link>" in "Link" field on the prompt
        And User clicks Save button on the prompt
        And User clicks on "Send" button
        Then User should see "link" displayed on the homepage under "Activity Stream" field
