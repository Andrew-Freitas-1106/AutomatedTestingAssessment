package com.qa.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "txtUsername")
    WebElement username;

    @FindBy(id = "txtPassword")
    WebElement password;

    @FindBy(id = "btnLogin")
    WebElement loginButton;

    public void logIn(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
    }

    public void clickLogIn(){
        loginButton.click();
    }
}
