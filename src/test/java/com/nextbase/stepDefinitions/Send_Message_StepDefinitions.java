package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.utlity.BrowserUtils;
import com.nextbase.utlity.Driver;
import io.cucumber.java.en.When;

public class Send_Message_StepDefinitions {
    HomePage homePage = new HomePage();

    @When("User enter any {string} on the {string} field")
    public void user_enter_any_on_the_field(String text, String Message) {
        homePage.messageButton.click();
        Driver.getDriver().switchTo().frame(homePage.messageFrame);
        BrowserUtils.sleep(1);

        homePage.messagebody.sendKeys(text);
        Driver.getDriver().switchTo().defaultContent();
    }
}
