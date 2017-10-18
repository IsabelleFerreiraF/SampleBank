package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.CreateAccountPage2;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountSteps2 extends AbstractSteps{

    @Autowired
    private CreateAccountPage2 createAccountPage2;


    @When("User fill the customer Id with customer cpf <cpfValue>")
    public void fillCpf(@Named("cpfValue") String cpgValue){

        createAccountPage2.cpf(cpgValue);
        System.out.println("Insert cpf");
    }
    @When("User click the Create account button")
    public void createAccount(){
        createAccountPage2.createAccount();
        System.out.println("Click btn");
    }
    @Then("Show the <message>")
    public void message(@Named("message")String message){
        Assert.assertEquals(message,createAccountPage2.returnMessage());
        System.out.println("Message");
    }

}
