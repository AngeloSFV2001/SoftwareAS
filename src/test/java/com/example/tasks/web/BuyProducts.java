package com.example.tasks.web;

import com.example.userinterfaces.pages.CartPage;
import com.example.userinterfaces.pages.HomePage;
import com.example.userinterfaces.pages.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyProducts implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.CART_BUTTON)
        );
    }

}
