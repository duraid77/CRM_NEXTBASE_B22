Feature: Create poll functionality
  Agile Story: As a user I should be able to create a poll

  Background: Assuming user is on the home page
    Given User is logged in and on the home page
    #Begin your steps after the "GIVEN" since it is placed as a background

  @Berk
  Scenario: Users get error message "The message title is not specified"
    When User clicks on "Poll" tab
    And User fills out the "Question" box
    And User clicks on "Send" button
    Then User should see "The message title is not specified"

  @Inthira
  Scenario: Users are able to cancel creating a poll
    When User clicks on "Poll" tab
    Then User fills out the "Question" box
    And User clicks on "Cancel" button in poll tab

    Then User should not see Question box on the page


    @duraid
    Scenario: Users create a poll with Q/A
      When User clicks on "Poll" tab
      And User write a "message"
      And User fills out the "Question" box
      And User fills out the "Answer1" box
      And User fills out the "Answer2" box
      And User clicks on "Send" button
      Then poll should be visible in Activity Stream


