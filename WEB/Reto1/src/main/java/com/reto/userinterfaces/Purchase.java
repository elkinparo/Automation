package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Purchase {
    public static final Target ASK = Target.the("ASK")
            .located(By.xpath("//*[text()='Aceite de Girasol']//following::button"));
    public static final Target CONFIRMORDER = Target.the("CONFIRMORDER")
            .located(By.xpath("//button[@id='order-confirm']"));
    public static final Target CONFIRMATIONMESSAGE = Target.the("CONFIRMATIONMESSAGE")
            .located(By.xpath("//*[contains(text(),'Tu pedido ha sido confirmado, " +
                    "te mantendremos informado ante nuevas novedades')]"));
    public static final Target CLOSE = Target.the("CLOSE")
            .located(By.xpath("//*[contains(text(),'Tu pedido ha sido confirmado, " +
                    "te mantendremos informado ante nuevas novedades')]//preceding::span[1]"));
    public static final Target MYORDERS = Target.the("MYORDERS")
            .located(By.xpath("//*[text()='Mis pedidos']"));
    public static final Target ORDERS = Target.the("ORDERS")
            .located(By.xpath("//*[text()='Pedidos']"));
    public static final Target CUPON = Target.the("CUPON")
            .located(By.id("welcome-coupon"));
    public static final Target CUPONCODE = Target.the("CUPONCODE")
            .located(By.xpath("//*[@class='coupon-code']"));
    public static final Target CUPONCLOSE = Target.the("CUPONCLOSE")
            .located(By.xpath("//*[contains(text(),'Copia este código y úsalo " +
                    "para disfrutar de un descuento por única vez')]//preceding::span[2]"));

    public static final Target CUPONINPUT = Target.the("CUPONINPUT")
            .located(By.xpath("//input[@id='coupon']"));

    public static final Target BEGINING = Target.the("BEGINING")
            .located(By.xpath("//*[contains(text(),'Inicio')]"));


}
