package com.reto.stepdefinitions;

import com.reto.tasks.SendLoggin;
import com.reto.tasks.SendPurchaseWithCupon;
import com.reto.tasks.SendPurchaseWithoutCupon;
import com.reto.utils.Generate;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class Purchase2StepDefinitions {
    @Then(": check the offers page and make a purchase without a coupon")
    public void checkTheOffersPageAndMakeAPurchaseWithoutACoupon() {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPurchaseWithoutCupon.thepage());

    }
    @Then(": check the offers page and make a purchase with coupon")
    public void checkTheOffersPageAndMakeAPurchaseWithCoupon() {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPurchaseWithCupon.thepage2());

    }
}
