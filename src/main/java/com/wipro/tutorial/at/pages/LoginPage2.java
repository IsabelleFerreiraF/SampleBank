package com.wipro.tutorial.at.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Value;


import com.wipro.tutorial.at.configuration.pageobjects.PageObject;

@PageObject
public class LoginPage2 extends AbstractPage  {

    @Value("${app.url}")
    String URL;

    @FindBy(how = How.ID, using = "username")
    WebElement userInput;

    @FindBy(how = How.ID, using = "password")
    WebElement passwordInput;

    @FindBy(how = How.CLASS_NAME, using = "sb-button")
    WebElement loginButton;

    public void navigateTo() {
        LOG.info("Navigating user to page: " + URL);
        webDriverProvider.get().get(URL);
    }

    public LoginPage2 username (String username) {
        LOG.info("Username: " + username);

        userInput.sendKeys(username);

        return this;
    }

    public LoginPage2 password (String password) {
        LOG.info("Password: " + password);

        passwordInput.clear();
        passwordInput.sendKeys(password);

        return this;
    }

    public LoginPage2 clickLoginButton() {
        loginButton.click();
        LOG.info("Clicked on Login button.");
        return this;
    }
}
