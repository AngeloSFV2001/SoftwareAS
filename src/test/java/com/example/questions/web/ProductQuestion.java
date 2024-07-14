package com.example.questions.web;

import com.example.userinterfaces.pages.CartPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.questions.Visibility;

public class ProductQuestion {
    public static Question<String> tituloProduct(){
        return actor -> TextContent.of(CartPage.NAME_PRODUCT).answeredBy(actor);
    }
    public static Question<String> tituloProduct2(){
        return actor -> TextContent.of(CartPage.NAME_PRODUCT2).answeredBy(actor);
    }

    public static Question<String> priceProduct1(){
        return actor -> TextContent.of(CartPage.PRICE_PRODUCT).answeredBy(actor);
    }
    public static Question<String> priceProduct2(){
        return actor -> TextContent.of(CartPage.PRICE_PRODUCT2).answeredBy(actor);
    }
    public static Question<String> totalPriceProducts(){
        return actor -> TextContent.of(CartPage.TOTAL_PRICE).answeredBy(actor);
    }
}
