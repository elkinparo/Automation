package com.reto.stepdefinitions;

import com.reto.tasks.SendPurchase;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class PurchaseStepDefinitions {


    @Then(": check the offers page and make a purchase {string} coupon")
    public void checkTheOffersPageAndMakeAPurchaseCoupon(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPurchase.format(option));
    }
}


