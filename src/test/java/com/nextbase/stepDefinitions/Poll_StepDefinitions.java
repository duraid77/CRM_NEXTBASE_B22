package com.nextbase.stepDefinitions;

import com.github.javafaker.Faker;
import com.nextbase.nextBasePages.HomePage;
import com.nextbase.nextBasePages.LoginPage;
import com.nextbase.utlity.BrowserUtils;
import com.nextbase.utlity.ConfigurationReader;
import com.nextbase.utlity.Driver;
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
    public void user_fills_out_the_box(String inputbox) {
        homePge.fillingForm(inputbox);

    }

    @When("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
        homePge.buttonClicker(string);

    }
    @Then("User should see {string}")
    public void user_should_see(String string) {
        homePge.messageVerification(string);
    }


    @Then("poll should be visible in Activity Stream")
    public void poll_should_be_visible_in_activity_stream() {
        String expectedPollText = ConfigurationReader.getProperty("pollQuestion");
        BrowserUtils.sleep(2);
        String actualPollText = homePge.pollTextCreated.getText();
        Assert.assertEquals(actualPollText,expectedPollText);
    }

    @When("User write a {string}")
    public void user_write_a(String message) {

        Driver.getDriver().switchTo().frame(homePge.messageFrame);
        message = ConfigurationReader.getProperty("pollMessage");
        homePge.messageBody.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();
    }





}
