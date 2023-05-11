package co.com.choucair.serenitydemo.cer.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.LBL_TITLE_PRODUCT;
import static co.com.choucair.serenitydemo.cer.utils.Random.replaceSimbol;
import static co.com.choucair.serenitydemo.cer.utils.Random.replaceUnit;

public class TheProduct implements Question<Boolean> {

    public static TheProduct exists() {
        return new TheProduct();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nameProduct1 = actor.recall("NAME_PRODUCT1");
        String priceProduct1 = replaceSimbol(actor.recall("PRICE_PRODUCT1"));
        String amountProduct1 = replaceUnit(actor.recall("AMOUNT_PRODUCT1"));
        String nameProduct2 = actor.recall("NAME_PRODUCT2");
        String priceProduct2 = replaceSimbol(actor.recall("PRICE_PRODUCT2"));
        String amountProduct2 = replaceUnit(actor.recall("AMOUNT_PRODUCT2"));
        String nameProduct3 = actor.recall("NAME_PRODUCT3");
        String priceProduct3 = replaceSimbol(actor.recall("PRICE_PRODUCT3"));
        String amountProduct3 = replaceUnit(actor.recall("AMOUNT_PRODUCT3"));
        String nameProduct4 = actor.recall("NAME_PRODUCT4");
        String priceProduct4 = replaceSimbol(actor.recall("PRICE_PRODUCT4"));
        String amountProduct4 = replaceUnit(actor.recall("AMOUNT_PRODUCT4"));
        String nameProduct5 = actor.recall("NAME_PRODUCT5");
        String priceProduct5 = replaceSimbol(actor.recall("PRICE_PRODUCT5"));
        String amountProduct5 = replaceUnit(actor.recall("AMOUNT_PRODUCT5"));

        //   String total = String.valueOf(Integer.parseInt(amountProduct1) * Integer.parseInt(priceProduct1) + Integer.parseInt(amountProduct2) * Integer.parseInt(priceProduct2)
        //           + Integer.parseInt(amountProduct3) * Integer.parseInt(priceProduct3)
        //           + Integer.parseInt(amountProduct4) * Integer.parseInt(priceProduct4)
        //           + Integer.parseInt(amountProduct5) * Integer.parseInt(priceProduct5));

        actor.attemptsTo(
                Ensure.that(nameProduct1).isEqualTo(LBL_TITLE_PRODUCT.of(nameProduct1).resolveFor(actor).getText()),
                Ensure.that(nameProduct2).isEqualTo(LBL_TITLE_PRODUCT.of(nameProduct2).resolveFor(actor).getText()),
                Ensure.that(nameProduct3).isEqualTo(LBL_TITLE_PRODUCT.of(nameProduct3).resolveFor(actor).getText()),
                Ensure.that(nameProduct4).isEqualTo(LBL_TITLE_PRODUCT.of(nameProduct4).resolveFor(actor).getText()),
                Ensure.that(nameProduct5).isEqualTo(LBL_TITLE_PRODUCT.of(nameProduct5).resolveFor(actor).getText())
        );

        actor.attemptsTo(
                Ensure.that(amountProduct1).isEqualTo(LBL_TITLE_PRODUCT.of(amountProduct1).resolveFor(actor).getText()),
                Ensure.that(amountProduct2).isEqualTo(LBL_TITLE_PRODUCT.of(amountProduct2).resolveFor(actor).getText()),
                Ensure.that(amountProduct3).isEqualTo(LBL_TITLE_PRODUCT.of(amountProduct3).resolveFor(actor).getText()),
                Ensure.that(amountProduct4).isEqualTo(LBL_TITLE_PRODUCT.of(amountProduct4).resolveFor(actor).getText()),
                Ensure.that(amountProduct5).isEqualTo(LBL_TITLE_PRODUCT.of(amountProduct5).resolveFor(actor).getText())
        );
        System.out.println(priceProduct1);
        actor.attemptsTo(
                //     Ensure.that(total).containsIgnoringCase(replaceSimbol(LBL_TITLE_PRODUCTA.resolveFor(actor).getText())),
                //     Ensure.that(total).containsIgnoringCase()

        );

        return true;
    }
}
