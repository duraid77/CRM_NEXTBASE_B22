package com.nextbase.nextBasePages;

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
    //TODO IF YOU HAVE MORE ELEMENT RELATED TO THIS PAGE PLACE THEM BEFORE THE METHODS BELOW






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
}
