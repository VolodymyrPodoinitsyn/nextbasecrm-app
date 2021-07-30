package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.GetPasswordPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    GetPasswordPage passwordPage = new GetPasswordPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.getProperty("srmurl");
        Driver.getDriver().get(url);

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);

    }


    @When("click the log in button")
    public void click_the_log_in_button() {
        loginPage.loginButton.click();
        //BrowserUtils.sleep(3);
    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {
        String actualAccountName = activityStreamPage.accountName.getText();
        System.out.println("actualAccountName = " + actualAccountName);
        String expectedAccountName = expectedName;
        System.out.println("expectedAccountName = " + expectedAccountName);

        Assert.assertEquals("Actual account name is not as expected account name!", expectedAccountName, actualAccountName);
    }

    @When("user click Remember me on this computer")
    public void user_click_remember_me_on_this_computer() {
        loginPage.rememberMeButton.click();

    }

    @Then("user sees if Remember me button is selected")
    public void user_sees_if_remember_me_button_is_selected() {

        if (loginPage.rememberMeButton.isSelected()) {
            System.out.println("Remember me button is selected!");
        } else {
            System.out.println("Remember me button is NOT selected!");
        }

    }

    @When("user click FORGOT YOUR PASSWORD")
    public void user_click_forgot_your_password() {
        loginPage.ForgotYourPasswordButton.click();

        //BrowserUtils.sleep(3);
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = expectedTitle;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        passwordPage.authorizationButton.click();
    }



}
