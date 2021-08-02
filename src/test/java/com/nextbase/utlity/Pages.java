package com.nextbase.utlity;

import com.nextbase.nextBasePages.HomePage;
import com.nextbase.nextBasePages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;


    public LoginPage loginPage(){
        if (loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }


}
