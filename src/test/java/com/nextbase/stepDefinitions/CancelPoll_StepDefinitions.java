package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.nextBasePages.LoginPage;
import com.nextbase.utlity.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CancelPoll_StepDefinitions {
    //LoginPage login = new LoginPage();
    HomePage homepage = new HomePage();

    @Then("User clicks on {string} button in poll tab")
    public void user_clicks_on_button_in_poll_tab(String string) {
        string = " send Test message";
        homepage.questionBox.sendKeys(string);
        homepage.pollCancelButton.click();

    }
    @Then("User should not see Question box on the page")
    public void user_should_see_blue_color_tab_move_back_to_message_button() {
//        String actual = homepage.messageButton.getText();
//        String expected = "Message";
//        Assert.assertTrue(expected.equals(actual));

//        WebElement switchLabel = Driver.getDriver().findElement(By.cssSelector("span[class='feed-add-post-form-link feed-add-post-form-link-active']"));
//        String colorRGB = ((JavascriptExecutor)Driver.getDriver()).executeScript("return window.getComputedStyle(arguments[0], '::after').getPropertyValue('background-color');",switchLabel).toString();


        Assert.assertFalse(homepage.questionBox.isDisplayed());

    }
}
