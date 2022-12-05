package com.reto.tasks;

import com.reto.userinterfaces.Purchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SendPurchaseWithCupon implements Task {
    String code;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Purchase.CUPON));
        WaitUntil.the(Purchase.CUPONCODE,WebElementStateMatchers.isVisible());
        code = Text.of(Purchase.CUPONCODE).answeredBy(actor);
        actor.attemptsTo(
                Click.on(Purchase.CUPONCLOSE),
                Click.on(Purchase.BEGINING),
                Click.on(Purchase.ASK),
                Enter.theValue(code).into(Purchase.CUPONINPUT),
                Click.on(Purchase.CONFIRMORDER),
                WaitUntil.the(Purchase.CONFIRMATIONMESSAGE, WebElementStateMatchers.isVisible()),
                Click.on(Purchase.CLOSE),
                Click.on(Purchase.MYORDERS),
                WaitUntil.the(Purchase.ORDERS, WebElementStateMatchers.isVisible())
        );
    }
    public static SendPurchaseWithCupon thepage2() {
        return Tasks.instrumented(SendPurchaseWithCupon.class);
    }
}
