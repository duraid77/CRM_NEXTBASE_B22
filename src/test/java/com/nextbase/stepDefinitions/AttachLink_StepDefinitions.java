package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.nextBasePages.LoginPage;
import com.nextbase.utlity.ConfigurationReader;
import com.nextbase.utlity.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttachLink_StepDefinitions {
    LoginPage login = new LoginPage();
    HomePage homepage = new HomePage();

    @Given("user is logged in and on the home page")
    public void user_is_logged_in_and_on_the_home_page() {
       login.loginMethod(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

   }

    @Then("User enters any {string} in {string} field on the prompt")
    public void user_enters_any_in_field_on_the_prompt(String string, String string2) {
        homepage.linkButton.click();
        String link = "https://docs.google.com/spreadsheets/d/1eVaJptBAaPNntvk53Z9ZN1tiVF_OycFJRJ71jQcKPAU/edit#gid=0";
        homepage.linkUrl.sendKeys(link);


    }
    @Then("User clicks Save button on the prompt")
    public void user_clicks_save_button_on_the_prompt() {
    homepage.saveButton.click();

    }
    @Then("User should see {string} displayed on the homepage under {string} field")
    public void user_should_see_displayed_on_the_homepage_under_field(String string, String string2) {
    // need to finish this
    }

}
