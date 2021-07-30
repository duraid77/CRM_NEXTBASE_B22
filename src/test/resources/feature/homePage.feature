@wip
  #US-3
Feature: Homepage functionality
  Agile Story: As a user I should be able to see posts from homepage

  Background: Assuming user is on the home page
    Given User is logged in and on the home page
    #Begin your steps after the "GIVEN" since it is placed as a background

  @TS_001 @US3 #TS_001-Aziz
  Scenario: Users should see the number of users that viewed the post
    When User hovers over the eye icon on the recent post under Activity Stream
    Then User should see the number of users that viewed the post

  @TS_002 @US3 #TS_002-Chrissy
  Scenario: Users click "Like" button for any post
    When user clicks on like button
    Then user can see account name under the like sign

  Scenario: Users can write a comment to a post


  Scenario: Users are able to follow a post by clicking "Follow" button