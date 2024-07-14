package com.example.tasks.web;

import com.example.userinterfaces.pages.HomePage;
import com.example.userinterfaces.pages.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class SelectProduct implements Task {

    @Override
    @Step("{0} selecciona producto")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.PRODUCTNAME_INPUT),
                Click.on(ProductPage.ADD_BUTTON),
                NavigateTo.demoblazePage(),
                Click.on(HomePage.PRODUCTNAME_INPUT),
                Click.on(ProductPage.ADD_BUTTON),
                NavigateTo.demoblazePage()
        );
    }
}
