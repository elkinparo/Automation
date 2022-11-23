package com.reto.questions;

import com.reto.userinterfaces.Primary;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Message implements Question <String>
{
    @Override
    public String answeredBy(Actor actor) {
        return Primary.OFERTAS.resolveFor(actor).getText();

    }
    public static Message is(){return new Message();}
    
}
