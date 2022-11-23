package com.reto.tasks;

import com.reto.models.PrimaryModel;
import com.reto.userinterfaces.Primary;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SendPrimary implements Task
{
   PrimaryModel data;

   public SendPrimary (PrimaryModel data){this.data=data;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getLOGIN()).into(Primary.USER),
                Enter.theValue(data.getPASWORD()).into(Primary.PASWORD),
                Click.on(Primary.GET_INTO));
    }

    public static SendPrimary format(PrimaryModel data)
    {
       return Tasks.instrumented(SendPrimary.class,data);
    }
}
