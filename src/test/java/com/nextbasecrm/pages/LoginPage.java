package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='USER_REMEMBER']")
    public WebElement rememberMeButton;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement ForgotYourPasswordButton;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;



// And user adds "<messageTitle>" to the title
// And user adds "<person>"

}
