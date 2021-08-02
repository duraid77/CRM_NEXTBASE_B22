package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.nextBasePages.LoginPage;
import com.nextbase.utlity.ConfigurationReader;
import com.nextbase.utlity.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CancelMessage_StepDefinitions {
    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();
  //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("User clicks on {string} tab on home page")
    public void user_clicks_on_tab_on_home_page(String string) {

        homePage.tabClicker(string);
    }
    @When("User types in the {string}")
    public void user_types_in_the(String message) throws InterruptedException {
        Driver.getDriver().switchTo().frame(homePage.messageFrame);
        message = ConfigurationReader.getProperty("textMessage");
        homePage.messageBody.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();
        Thread.sleep(3000);
       }

    @Then("User clicks on {string} button in a message tab on bottom")
    public void userClicksOnButtonInAMessageTabOnBottom(String arg0) throws InterruptedException {
        homePage.buttonClicker(arg0);
        Thread.sleep(3000);
    }
}
