Feature: Send message functionality
  Agile Story: As a user I should be able to send a message

  Background: Assuming user is on the home page
    Given User is logged in and on the home page
    #Begin your steps after the "GIVEN" since it is placed as a background


  @US1_TS-001_Lwin
  Scenario: User send message with "Message" tab
   When User click on "Message" tab
   Then User should be able to send "Message" on message tab



    @US1_TS_002_Maria
    Scenario: Users cancel messages
     When User clicks on "Message" tab on home page
      And User types in the "text"
      Then User clicks on "Cancel" button in a message tab on bottom



      @wip
      Scenario: Users attach link with link icon
        When User clicks on "Message" tab
        Then User enters any "<link>" in "Link" field on the prompt
        And User clicks Save button on the prompt
        And User clicks on "Send" button
        Then User should see "link" displayed on the homepage under "Activity Stream" field
