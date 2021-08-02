package com.nextbase.nextBasePages;

import com.nextbase.utlity.ConfigurationReader;
import com.nextbase.utlity.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollButton;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")

    public WebElement sendButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessage;

    @FindBy(xpath = "((//div[@id='log_internal_container'])//span[@class='feed-content-view-cnt-wrap']/..)[1]")
    public WebElement eyeIconLatestPost;
    @FindBy(xpath = "((//div[@id='log_internal_container'])//span[@class='feed-content-view-cnt-wrap']/..)[1]//span//span")
    public WebElement eyeNumber;


    @FindBy(xpath = "//span[.='Views']//span")
    public WebElement viewers;

    @FindBy(id= "bx-b-link-blogPostForm")
     public WebElement linkButton;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkUrl;

    @FindBy(xpath = "(//a[.='Like'])[1]")
    public WebElement likeButton;

    @FindBy(xpath = "//span[@class='feed-post-emoji-icon-item  feed-post-emoji-icon-like feed-post-emoji-icon-item-1']")
    public WebElement likeVerification;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement pollCancelButton;

    @FindBy(xpath = "//span[.='Message']//span")
    public WebElement messageButton;

    //TODO IF YOU HAVE MORE ELEMENT RELATED TO THIS PAGE PLACE THEM BEFORE THE METHODS BELOW

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement pollAnswer1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement pollAnswer2;

    @FindBy(xpath = "//div[@class='bx-vote-question-title']")
    public WebElement pollTextCreated;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageFrame;

    @FindBy(xpath= "//body")
    public WebElement messageBody;





    public void linkVerification (String actual, String expected) {


    }

    //=======================================================================================


    public void tabClicker(String tabName){
        Driver.getDriver().findElement(By.xpath("//span[.='"+tabName +"']")).click();
    }
    public void buttonClicker(String buttonName){
        if (buttonName.toLowerCase().equals("send")){
            sendButton.click();
        }else if(buttonName.toLowerCase().equals("cancel")){
            cancelButton.click();
        }
    }
    public void messageVerification(String message){
        System.out.println(errorMessage.getText());
        Assert.assertEquals("Message verification failed",message, errorMessage.getText());
    }

    public void fillingForm(String str){
        switch(str){
            case "Question":
                questionBox.sendKeys(ConfigurationReader.getProperty("pollQuestion"));
                break;
            case "Answer1":
                pollAnswer1.sendKeys(ConfigurationReader.getProperty("pollAnswer1"));
                break;
            case "Answer2":
                pollAnswer2.sendKeys(ConfigurationReader.getProperty("pollAnswer2"));
                break;
        }
    }
}
