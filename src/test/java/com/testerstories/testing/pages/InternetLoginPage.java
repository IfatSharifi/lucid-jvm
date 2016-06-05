package com.testerstories.testing.pages;

import com.testerstories.testing.config.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetLoginPage {
    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(tagName = "button")
    private WebElement login;

    @FindBy(className = "success")
    private WebElement alert;

    public InternetLoginPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void logInAs(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
    }

    public String checkAlert() {
        return alert.getText();
    }
}
