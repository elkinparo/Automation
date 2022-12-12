package com.reto.tasks;

import com.reto.models.Information;
import com.reto.userinterfaces.PersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.File;
import java.io.IOException;

public class SendPersonalInformation implements Task
{
    Information data;
    public static final String nombreArchivo = "prueba";

    public SendPersonalInformation(Information data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File Archivo = null;
        try {
            Archivo = File.createTempFile(nombreArchivo,".tmp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on(PersonalInformation.PERSONALINFORMATION),
                Enter.theValue(Archivo.getAbsolutePath()).into(PersonalInformation.IMAGE),
                Enter.theValue(data.getName()).into(PersonalInformation.NAME),
                Enter.theValue(data.getLastname()).into(PersonalInformation.LASTNAME),
                Enter.theValue(data.getDate()).into(PersonalInformation.DATE),
                Click.on(PersonalInformation.COUNTRY),
                Click.on(PersonalInformation.OPTIONCOUNTRY),
                Click.on(PersonalInformation.M),
                Click.on(PersonalInformation.SAVE)
        );
    }
    public static SendPersonalInformation format(Information data) {
        return Tasks.instrumented(SendPersonalInformation.class,data);
    }
}
