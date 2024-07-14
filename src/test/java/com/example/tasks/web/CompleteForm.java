package com.example.tasks.web;

import com.example.userinterfaces.pages.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteForm implements Task {
    private final String userName;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;

    public CompleteForm(String userName, String country, String city, String card, String month, String year) {
        this.userName = userName;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    public static Performable withDates(String userName, String country, String city, String card, String month, String year) {
        return instrumented(CompleteForm.class, userName, country, city,card, month, year);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.PLACE_ORDER_BUTTON),
                Enter.theValue(userName).into(CartPage.USERNAME_INPUT),
                Enter.theValue(country).into(CartPage.COUNTRY_INPUT),
                Enter.theValue(city).into(CartPage.CITY_INPUT),
                Enter.theValue(card).into(CartPage.CARDCREDIT_INPUT),
                Enter.theValue(month).into(CartPage.MONTH_INPUT),
                Enter.theValue(year).into(CartPage.YEAR_INPUT),
                Click.on(CartPage.PURCHASE_BUTTON)
        );
    }
}
