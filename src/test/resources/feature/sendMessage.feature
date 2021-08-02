Feature: Send message functionality
  Agile Story: As a user I should be able to send a message

  Background: Assuming user is on the home page
    Given user is logged in and on the home page
    #Begin your steps after the "GIVEN" since it is placed as a background


  @US1_TS-001_Lwin
  Scenario: User send message with "Message" tab
   When User click on "Message" tab
   Then User should be able to send "Message" on message tab




  Scenario: Users cancel messages

  //TS_003_US1

  Scenario: Users attach link with link icon
    When  User clicks "Link" button under the "Message" tab
    Then User enters any "<link>" in "Link" field on the prompt
    And User clicks Save button on the prompt
    And User clicks Send button under "Message" tab
    Then User should see "link" displayed on the homepage under "Activity Stream" field


  @TS_004_Rasim
  Scenario: User can not send message
    When User click on "Message" tab
    And User not fills out the message box
    And User clicks on "Send" button
    Then User should see "The message title is not specified"
