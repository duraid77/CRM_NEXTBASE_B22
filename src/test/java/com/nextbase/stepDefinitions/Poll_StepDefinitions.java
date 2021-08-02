package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.nextBasePages.LoginPage;
import com.nextbase.utlity.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Poll_StepDefinitions {


    LoginPage login = new LoginPage();
    HomePage homePge = new HomePage();

    @Given("User is logged in and on the home page")
    public void user_is_logged_in_and_on_the_home_page() {
        login.loginMethod(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }
    @When("User clicks on {string} tab")
    public void user_click_on_tab(String string) {
        homePge.tabClicker(string);
    }

    @When("User fills out the {string} box")
    public void user_fills_out_the_box(String string) {
        string = ConfigurationReader.getProperty("pollQuestion") ;
        homePge.questionBox.sendKeys(string);
    }
    @When("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
        homePge.buttonClicker(string);

    }
    @Then("User should see {string}")
    public void user_should_see(String string) {
        homePge.messageVerification(string);
    }

    @When("User fills out the Answer1 box")
    public void user_fills_out_the_answer1_box() {
       homePge.pollAnswer1.sendKeys(ConfigurationReader.getProperty("pollAnswer1"));
    }
    @When("User fills out the Answer2 box")
    public void user_fills_out_the_answer2_box() {
        homePge.pollAnswer2.sendKeys(ConfigurationReader.getProperty("pollAnswer2"));
    }

    @Then("poll should be visible in Activity Stream")
    public void poll_should_be_visible_in_activity_stream() {
        String expectedPollText = ConfigurationReader.getProperty("pollQuestion");
        String actualPollText = homePge.pollTextCreated.getText();
        Assert.assertEquals(actualPollText,expectedPollText);
    }




}
