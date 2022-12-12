package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformation {
    public static final Target IMAGE = Target.the("IMAGE").located(By.xpath("//input[@id='image']"));
    public static final Target PERSONALINFORMATION = Target.the("PERSONALINFORMATION").located(By.xpath("//*[text()='Información personal']"));
    public static final Target NAME = Target.the("NAME").located(By.xpath("//input[@id='name']"));
    public static final Target LASTNAME = Target.the("LASTNAME").located(By.xpath("//input[@id='lastName']"));
    public static final Target DATE = Target.the("DATE").located(By.xpath("//input[@id='bornDate']"));
    public static final Target COUNTRY = Target.the("COUNTRY").located(By.xpath("//*[@id='country']"));
    public static final Target OPTIONCOUNTRY = Target.the("OPTIONCOUNTRY").located(By.xpath("//*[contains(text(),'Colombia')]"));
    public static final Target M = Target.the("M").located(By.xpath("//input[@id='M']"));
    public static final Target SAVE = Target.the("SAVE").located(By.xpath("//button[@id='save-profile']"));
    public static final Target MESSAGE = Target.the("MESAGGE").located(By.xpath("//p[@class='confirmation-modal-info']"));
}
