package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.utlity.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EyeIcon_StepsDefinitions {
    HomePage homePage = new HomePage();
    @When("User hovers over the eye icon on the recent post under Activity Stream")
    public void user_hovers_over_the_eye_icon_on_the_recent_post_under_activity_stream() {
        BrowserUtils.hoverOver(homePage.eyeIconLatestPost);
    }


    @Then("User should see the number of users that viewed the post")
    public void userShouldSeeTheNumberOfUsersThatViewedThePost() {
        Assert.assertTrue(Integer.parseInt(homePage.eyeNumber.getText()) > -1);

    }
}
