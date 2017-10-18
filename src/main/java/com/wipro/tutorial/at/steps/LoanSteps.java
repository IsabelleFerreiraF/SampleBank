package com.wipro.tutorial.at.steps;


import com.wipro.tutorial.at.pages.LoanPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanSteps extends AbstractSteps {
    @Autowired
    private LoanPage loanPage;

    @When("User choice account <accountNum> for loan")
    public void selectAccount(@Named("accountNum") String account){
        loanPage.selectDropdown(account);
        System.out.println("dropdown");
    }

    @When("User fill the field amount  <valueNum> to loan")
    public void fillAmount(@Named("valueNum") String value){
        loanPage.fillAmount(value);
        System.out.println("amount");
    }

    @When("User click on Get Loan button")
    public void clickDeposit(){
        loanPage.clickDeposit();
        System.out.println("deposit button");
    }

    @Then("The system show the loan message <message>")
    public void messageValid(@Named("message") String message){
        Assert.assertEquals(message,loanPage.messageValid());
        System.out.println("message");
    }
}
