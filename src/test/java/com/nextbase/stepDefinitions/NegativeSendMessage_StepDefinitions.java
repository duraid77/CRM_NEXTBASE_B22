package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.utlity.BrowserUtils;
import io.cucumber.java.en.Then;

public class NegativeSendMessage_StepDefinitions {
    HomePage homePage = new HomePage();

    @Then("User write {string} on message box")
    public void user_write_on_message_box(String text) {
        homePage.messageFrame.click();
        homePage.messageFrame.sendKeys(text);

    }


}
