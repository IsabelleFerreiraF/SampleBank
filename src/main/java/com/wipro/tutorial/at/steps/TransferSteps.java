package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.TransferPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TransferSteps extends AbstractSteps{

    @Autowired
    private TransferPage transferPage;

    @When("User choice account <accountFrom> from transfer")
    public void accountFromTransfer(@Named("accountTo") String accountTo){
        transferPage.selectDropdowTo(accountTo);
    }

    @When("User choice account <accountTo> to transfer")
    public void accountToTransfer(@Named("accountFrom") String accountFrom){
        transferPage.selectDropdowFrom(accountFrom);
    }

    @When("User fill the field ammount to transfer <value>")
    public void fillAmmountTransfer(@Named("value") String value){
        transferPage.fillAmomunt(value);
    }

    @When("User click on the transfer button")
    public void clickTransfer(){
        transferPage.clickTransfer();
    }

    @Then("The system show the message about the transfer <message>")
    public void messageTranfer(@Named("message") String message){
        Assert.assertEquals(message,transferPage.messageValid());
    }


}
