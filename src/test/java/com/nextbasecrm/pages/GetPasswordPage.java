package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetPasswordPage {

    public GetPasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Authorization']")
    public WebElement authorizationButton;

//    public void title_verification() {
//        String expectedInTitle = "Get Password";
//        String actualTitle = Driver.getDriver().getTitle();
//
//        if (actualTitle.equals(expectedInTitle)) {
//            System.out.println("Get Password page title verification PASSED!");
//        } else {
//            System.out.println("Get Password page title verification FAILED!");
//        }
//
//    }


}
