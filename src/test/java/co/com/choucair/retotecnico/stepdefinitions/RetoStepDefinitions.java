package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.RegisterUserData;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.InsertDateUser;
import co.com.choucair.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class RetoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that mauricio wants register in platform uTest$")
    public void thatMauricioWantsRegisterInPlatformUTest() {
        OnStage.theActorCalled("Mauricio").wasAbleTo(OpenUp.thePage());
    }

    @When("^i go to registration form$")
    public void iGoToRegistrationForm(List<RegisterUserData> registerUserData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(InsertDateUser.the(
                registerUserData.get(0).getStrName(),
                registerUserData.get(0).getStrLastName(),
                registerUserData.get(0).getStrEmail(),
                registerUserData.get(0).getStrCity(),
                registerUserData.get(0).getStrCode(),
                registerUserData.get(0).getStrPassword(),
                registerUserData.get(0).getStrConfirmPassword()));

    }

    @Then("^I check the log$")
    public void iCheckTheLog(List<RegisterUserData> registerUserData) throws Exception {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(
                registerUserData.get(0).getStrEndRegister())));

    }
}