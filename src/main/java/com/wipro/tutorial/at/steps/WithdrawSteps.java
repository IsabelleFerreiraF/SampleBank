package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.WithdrawPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WithdrawSteps extends AbstractSteps{

    @Autowired
    private WithdrawPage withdrawPage;

    @When("User choice account <account>")
    public void selectAccount(@Named("account") String account){
        withdrawPage.selectAccount(account);
    }

    @When("User fill the field amount <value>")
    public void amount(@Named("value") String value){
        withdrawPage.fillAmount(value);
    }

    @When("User click on Withdraw button")
    public void clickWithdraw(){
        withdrawPage.clickWithdraw();
    }

    @Then("The system show the message <message>")
    public void message(@Named("message") String message){
        Assert.assertEquals(message,withdrawPage.message());
    }


}


