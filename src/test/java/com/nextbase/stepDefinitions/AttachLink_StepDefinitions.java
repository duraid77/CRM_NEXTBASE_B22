package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.nextBasePages.LoginPage;
import com.nextbase.utlity.BrowserUtils;
import com.nextbase.utlity.ConfigurationReader;
import com.nextbase.utlity.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AttachLink_StepDefinitions {
HomePage homepage = new HomePage();

    @Then("User enters any {string} in {string} field on the prompt")
    public void user_enters_any_in_field_on_the_prompt(String string, String string2) {
        homepage.linkButton.click();
        String link = "www.amazon.com";
        homepage.linkUrl.sendKeys(link);


    }

    @Then("User clicks Save button on the prompt")
    public void user_clicks_save_button_on_the_prompt() {
        homepage.saveButton.click();

    }

    @Then("User should see {string} displayed on the homepage under {string} field")
    public void user_should_see_displayed_on_the_homepage_under_field(String string, String string2) {
       //NEEDS WORK -> homepage.sendLink("amazon");
        // HELP
    }
}
