package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.HomePage;
import com.wipro.tutorial.at.pages.LoginPage2;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LoginSteps2 extends AbstractSteps{

    @Autowired
    private LoginPage2 loginPage;

    @Autowired
    private HomePage homePage;

    @Given("User is on login in the system")
    public void navigateToLogin(){loginPage.navigateTo();}

    @When("I fill the field user $username")
    public void fillUser(@Named("username") String user){
        loginPage.username(user);
        System.out.println("user:"+user);
    }

    @When("I fill the field password $password")
    public void fillPassword(@Named("password") String password){
        loginPage.password(password);
        System.out.println("password:"+password);
    }

    @When("I click on the login button")
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @Then("The user should be valid")
    public void valid(@Named("username") String username){
        Assert.assertEquals(username, homePage.getUsernameText());
    }

}
