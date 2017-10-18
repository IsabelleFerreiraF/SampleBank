package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepositSteps extends AbstractSteps{

    @Autowired
    private DepositPage depositPage;

    @When("User select account $account")
    public void selecAccount(@Named("account") String account){
        depositPage.selectDropdown(account);
        System.out.println("dropdown");
    }

    @When("User fill the amount $value")
    public void fillAmount(@Named("value") String value){
        depositPage.fillAmount(value);
        System.out.println("amount");
    }

    @When("User click on Deposit button")
    public void clickDeposit(){
        depositPage.clickDeposit();
        System.out.println("deposit button");
    }

    @Then("Show the message $message")
    public void messageValid(@Named("message") String message){
           Assert.assertEquals(message,depositPage.messageValid());
        System.out.println("message");
    }
}
