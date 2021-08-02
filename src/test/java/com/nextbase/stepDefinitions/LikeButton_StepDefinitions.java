package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.utlity.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LikeButton_StepDefinitions {
    HomePage homePage = new HomePage();

    @When("user clicks on like button")
    public void user_clicks_on_like_button() {
        homePage.likeButton.click();
    }

    @Then("user can see like sign")
    public void userCanSeeLikeSign() {
        Assert.assertTrue(homePage.likeButton.isDisplayed());
    }
}
