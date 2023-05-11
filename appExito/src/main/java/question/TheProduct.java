package question;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static userInterface.BuyPage.VALIDATE_CAR;

public class TheProduct implements Question<Boolean> {

    public static TheProduct exists() {
        return new TheProduct();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Wait.seconds(5)
        );
        String nameProduct = actor.recall("ITEM");
        System.out.println(nameProduct+"     este es el guardado");
        System.out.println(VALIDATE_CAR.of(nameProduct).resolveFor(actor).getText());
        actor.attemptsTo(
                Wait.seconds(5),
                Ensure.that(nameProduct).isEqualTo(VALIDATE_CAR.of(nameProduct).resolveFor(actor).getText())
        );
        return true;
    }
}
