package com.example.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target NAME_PRODUCT = Target.the("Nombre producto 1").locatedBy("(//tr[@class=\"success\"]/td[2])[1]");
    public static final Target NAME_PRODUCT2 = Target.the("Nombre producto 1").locatedBy("(//tr[@class=\"success\"]/td[2])[2]");

    public static final Target PRICE_PRODUCT = Target.the("Precio producto 1").locatedBy("(//tr[@class=\"success\"]/td[3])[1]");
    public static final Target PRICE_PRODUCT2 = Target.the("Precio producto 2").locatedBy("(//tr[@class=\"success\"]/td[3])[2]");
    public static final Target TOTAL_PRICE = Target.the("Precio total").locatedBy("#totalp");

    public static final Target USERNAME_INPUT = Target.the("Campo usuario").located(By.id("name"));
    public static final Target COUNTRY_INPUT = Target.the("Campo pais").located(By.id("country"));
    public static final Target CITY_INPUT = Target.the("Campo ciudad").located(By.id("city"));
    public static final Target CARDCREDIT_INPUT = Target.the("Campo tarjeta de credito").located(By.id("card"));
    public static final Target MONTH_INPUT = Target.the("Campo mes").located(By.id("month"));
    public static final Target YEAR_INPUT = Target.the("Campo año").located(By.id("year"));

    public static final Target PLACE_ORDER_BUTTON = Target.the("Boton de hacer pedido").locatedBy("//button[@class=\"btn btn-success\"]");
    public static final Target PURCHASE_BUTTON = Target.the("Boton de adquirir").locatedBy("//button[@onclick=\"purchaseOrder()\"]");
    public static final Target CONFIRM_BUTTON = Target.the("Boton de confirmacion de compra").locatedBy("//button[@class=\"confirm btn btn-lg btn-primary\"]");

}
