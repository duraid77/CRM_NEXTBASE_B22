Feature: Create poll functionality
  Agile Story: As a user I should be able to create a poll

  Background: Assuming user is on the home page
    Given user is logged in and on the home page
    #Begin your steps after the "GIVEN" since it is placed as a background


  Scenario: Users create a poll with Q/A

  Scenario: Users get error message "The message title is not specified"
    When User click on "POLL" tab
    And User fills out the "Question" box
    And User clicks on "Send" button
    Then User should see "The message title is not specified"

  Scenario: Users check "allow multiple choice" while creating a poll

  Scenario: Users are able to cancel creating a poll
