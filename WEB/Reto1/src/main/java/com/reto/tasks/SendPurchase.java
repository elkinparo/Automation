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

public class SendPurchase implements Task {

    String option;
    String code;

    public SendPurchase(String option) {
        this.option = option;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (option.equals("with"))
        {
            actor.attemptsTo(
                    Click.on(Purchase.CUPON));
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
                    WaitUntil.the(Purchase.ORDERS, WebElementStateMatchers.isVisible()));

        }
        else
        {
            actor.attemptsTo(
                    Click.on(Purchase.ASK),
                    Click.on(Purchase.CONFIRMORDER),
                    WaitUntil.the(Purchase.CONFIRMATIONMESSAGE, WebElementStateMatchers.isVisible()),
                    Click.on(Purchase.CLOSE),
                    Click.on(Purchase.MYORDERS),
                    WaitUntil.the(Purchase.ORDERS, WebElementStateMatchers.isVisible())
            );
        }
    }

    public static SendPurchase format(String option) {
        return Tasks.instrumented(SendPurchase.class, option);
    }
}
