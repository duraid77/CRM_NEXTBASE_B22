package com.nextbase.stepDefinitions;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.utlity.BrowserUtils;
import com.nextbase.utlity.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    @When("users click comment button for any post")
    public void users_click_comment_button_for_any_post() {
         homePage.commentBtn.click();

    }
    @When("users able to write a comment to any post")
    public void users_able_to_write_a_comment_to_any_post() {

        BrowserUtils.sleep(2);
        WebElement iframe = Driver.getDriver().findElement(By.cssSelector(".bx-editor-iframe"));
        Driver.getDriver().switchTo().frame(iframe);
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("testing");
        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("users can sent the comment to the post")
    public void users_can_sent_the_comment_to_the_post() {
        homePage.sendBtn.click();

        WebElement word = Driver.getDriver().findElement(By.xpath("//*[.='testing']"));
        Assert.assertTrue(word.isDisplayed());



    }

}
