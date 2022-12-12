package com.reto.stepdefinitions;

import com.reto.tasks.SendPersonalInformation;
import com.reto.utils.Generate;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class PersonalInformationStepDefinitions
{
    @Then(": see the image with the message Tu información se guardó correctamente")
    public void seeTheImageWithTheMessageTuInformaciónSeGuardóCorrectamente()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(SendPersonalInformation.format(Generate.dataInformation()));
    }
}
