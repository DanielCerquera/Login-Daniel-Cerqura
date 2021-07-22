package co.com.choucair.daniellogin.stepdefinitions;

import co.com.choucair.daniellogin.tasks.Login;
import co.com.choucair.daniellogin.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Daniel wants to learn automation at the login in Utest$")
    public void thanDanielWantsToLearnAutomationAtTheLoginInUtest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), (Login.OnThePage()));
    }
}
