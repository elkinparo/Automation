package com.reto.tasks;

import com.reto.models.PrimaryModel;
import com.reto.userinterfaces.Loggin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SendLoggin implements Task
{
   PrimaryModel data;

   public SendLoggin(PrimaryModel data){this.data=data;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getLOGIN()).into(Loggin.USER),
                Enter.theValue(data.getPASWORD()).into(Loggin.PASWORD),
                Click.on(Loggin.GET_INTO));

    }

    public static SendLoggin format(PrimaryModel data)
    {
       return Tasks.instrumented(SendLoggin.class,data);
    }
}
