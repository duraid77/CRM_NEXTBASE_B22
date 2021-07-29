Feature: Send message functionality
  Agile Story: As a user I should be able to send a message

  Scenario: Users send message with "Message" tab


    Scenario: Users cancel messages


      //TS_003_US1
      Scenario: Users attach link with link icon
        Given User is on NextBase homepage
        When  User clicks "Link" button under the "Message" tab
        Then User enters any "<link>" in "Link" field on the prompt
        And User clicks Save button on the prompt
        And User clicks Send button under "Message" tab
        Then User should see "link" displayed on the homepage under "Activity Stream" field
