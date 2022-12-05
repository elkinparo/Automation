package com.reto.tasks;

import com.reto.userinterfaces.Purchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SendPurchaseWithoutCupon implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Purchase.ASK),
                Click.on(Purchase.CONFIRMORDER),
                WaitUntil.the(Purchase.CONFIRMATIONMESSAGE, WebElementStateMatchers.isVisible()),
                Click.on(Purchase.CLOSE),
                Click.on(Purchase.MYORDERS),
                WaitUntil.the(Purchase.ORDERS, WebElementStateMatchers.isVisible())
        );
    }
    public static SendPurchaseWithoutCupon thepage() {
        return Tasks.instrumented(SendPurchaseWithoutCupon.class);
    }
}
