package com.reto.stepdefinitions;

import com.reto.questions.Message;
import com.reto.tasks.SendLoggin;
import com.reto.utils.Generate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class LogginStepDefinitions {

    @Managed
    WebDriver driver;

    @Given(": actor opens browser")
    public void actorOpensBrowser() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Elkin").whoCan(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://automation-wappi.vercel.app/login"));
    }

    @When(": I send the username and password")
    public void iSendTheUsernameAndPassword() {
        OnStage.theActorInTheSpotlight().attemptsTo(SendLoggin.format(Generate.dataPrimary()));
    }

    @Then(": see the offers page {string}")
    public void seeTheOffersPage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Message.is(), Matchers.equalTo(message)));
    }


}
