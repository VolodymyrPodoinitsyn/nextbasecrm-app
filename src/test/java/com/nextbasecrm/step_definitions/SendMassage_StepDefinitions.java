package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SendMassage_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("user is on activity stream page")
    public void user_is_on_activity_stream_page() {

    }
    @When("user click {string} tab")
    public void user_click_tab(String string) {
        activityStreamPage.messageButton.click();

        BrowserUtils.sleep(3);
    }

    @When("user adds text {string}")
    public void user_adds_text(String text) {
        Driver.getDriver().switchTo().frame(0);//"bx-editor-iframe"
        activityStreamPage.textBox.sendKeys(text);
        Driver.getDriver().switchTo().defaultContent();

    }

    @When("user click Send button")
    public void user_click_button() {
        activityStreamPage.sendButton.click();
    }

    @Then("user should see the message from the {string}")
    public void user_should_see_the_message_from_the(String expectedPostUserName) {
        String actualPostUserName = activityStreamPage.postUserName.getText();
        Assert.assertEquals("Post username is not as expected!", expectedPostUserName, actualPostUserName);
    }


    @When("user click Cancel button")
    public void userClickCancelButton() {
        activityStreamPage.cancelButton.click();
    }

    @Then("user should see the massage {string}")
    public void user_should_see_the_massage(String expectedMassageText) {
        String actualMassageText = activityStreamPage.massageText.getText();
        Assert.assertEquals("Massage not canceled!", expectedMassageText, actualMassageText);
    }

    @When("user click {string} button")
    public void user_click_button(String link) {
        activityStreamPage.linkButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user adds {string}  in the link text box")
    public void user_adds_in_the_link_text_box(String text) {
        activityStreamPage.linkTextBox.sendKeys(text);
        BrowserUtils.sleep(2);
    }

    @When("user adds {string} in the link url box")
    public void user_adds_in_the_link_url_box(String url) {
        activityStreamPage.linkURLBox.sendKeys(url);
        BrowserUtils.sleep(2);
    }

    @When("user click Save button")
    public void user_click_save_button() {
        activityStreamPage.linkSaveButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should see {string} text")
    public void user_should_see_text(String expectedText) {
        Driver.getDriver().switchTo().frame(0);
        String actualText =  activityStreamPage.textBox.getText();
        Assert.assertEquals("Post username is not as expected!", expectedText, actualText);
        Driver.getDriver().switchTo().defaultContent();
    }

}
