package net.onlinenotepad.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import questions.ErrorMessage;
import utils.MyWebDriverFactory;

import static net.onlinenotepad.stepdefinitions.stepDefs.UserWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static task.Credentials.intoCredentials;
import static task.DoLogin.doLogin;
import static task.PrivacyPolicy.acceptPolicy;

public class StepDefinitions {

    @Given("the user has entered their username and password")
    public void userHasEnteredUsernameAndPassword() {
        UserWeb.can(BrowseTheWeb.with(MyWebDriverFactory.web().onPage()));
        UserWeb.attemptsTo(intoCredentials("luiscarlosmarca@gmail.com","Sr Qa Automations"));
    }

    @Given("the user has selected the privacy policy checkbox")
    public void userHasSelectedPrivacyPolicyCheckbox() {
       UserWeb.attemptsTo(acceptPolicy());
    }

    @Given("the user has initially selected the privacy policy checkbox")
    public void userHasinitiallySelectedPrivacyPolicyCheckbox() {
       UserWeb.attemptsTo(acceptPolicy());
    }

    @Given("the user has not selected the privacy policy checkbox")
    public void userHasNotSelectedPrivacyPolicyCheckbox() {
        // Unselect privacy policy checkbox logic here
    }

    @When("the user do login")
    public void userClicksOnLoginButton() {
        UserWeb.attemptsTo(doLogin());
    }

    @When("the user unchecks the privacy policy checkbox")
    public void userUnchecksPrivacyPolicyCheckbox() {
        UserWeb.attemptsTo(acceptPolicy());
    }

    @Then("the system should allow the user to access successfully")
    public void systemShouldAllowUserAccessSuccessfully() {
        // Verify successful access logic here
    }

    @Then("the system should not allow the user to access")
    public void systemShouldNotAllowUserAccess() {
        // Verify denied access logic here
    }

    @Then("an error message indicating the requirement of accepting the privacy policy should be displayed")
    public void errorMessageIndicatingPrivacyPolicyRequirementShouldBeDisplayed() {
        UserWeb.should(
                seeThat(ErrorMessage.indicatingRequirementOfAcceptingPrivacyPolicy(), equalTo("Debe aceptar las politicas de privacidad"))
        );
    }
}
