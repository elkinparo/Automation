package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Primary {
    private Primary(){}

    public static final Target USER = Target.the("USER").
            located(By.id("username"));
    public static final Target PASWORD = Target.the("PASWORD")
            .located(By.id("password"));
    public static final Target GET_INTO = Target.the("GET_INTO")
            .located(By.xpath("//button[@class='button success block login-box-form-submit']"));
    public static final Target OFERTAS = Target.the("OFERTAS")
            .located(By.xpath("//h1[@class='app-title']"));
}
