package co.com.choucair.serenitydemo.cer.tasks;

import co.com.choucair.serenitydemo.cer.interactions.MultipleClicks;
import co.com.choucair.serenitydemo.cer.interactions.Wait;
import co.com.choucair.serenitydemo.cer.utils.Random;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.*;


@AllArgsConstructor
public class ChooseProduct implements Task {
    public static ChooseProduct inExitoCategory() {
        return Tasks.instrumented(ChooseProduct.class);
    }

    @Step("{0} list the products.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] items = Random.aleatoryNumber();
        actor.attemptsTo(
                Wait.seconds(8),
                Click.on(BTN_ADD_ITEM.of(items[0])),
                Click.on(BTN_ADD_TO_CAR),
                MultipleClicks.toElement(BTN_PLUS_ITEM.of(items[0]), Random.aleatoryItems())
        );

        actor.remember("AMOUNT_PRODUCT1", AMOUNT_ITEM.resolveFor(actor).getText());
        actor.remember("NAME_PRODUCT1", NAME_ITEM.of(items[0]).resolveFor(actor).getText());
        actor.remember("PRICE_PRODUCT1", PRICE_ITEM.of(items[0]).resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BTN_NEXT_BUY)
        );

        actor.attemptsTo(
                Wait.seconds(2),
                Click.on(BTN_ADD_ITEM.of(items[1])),
                Click.on(BTN_ADD_TO_CAR),
                MultipleClicks.toElement(BTN_PLUS_ITEM.of(items[1]), Random.aleatoryItems()),
                Click.on(BTN_NEXT_BUY)
        );
        actor.remember("NAME_PRODUCT2", AMOUNT_ITEM);
        actor.remember("PRICE_PRODUCT2", NAME_ITEM.of(items[1]));
        actor.remember("AMOUNT_PRODUCT2", PRICE_ITEM.of(items[1]));

        actor.attemptsTo(
                Wait.seconds(2),
                Click.on(BTN_ADD_ITEM.of(items[2])),
                Click.on(BTN_ADD_TO_CAR),
                MultipleClicks.toElement(BTN_PLUS_ITEM.of(items[2]), Random.aleatoryItems()),
                Click.on(BTN_NEXT_BUY)

        );
        actor.remember("NAME_PRODUCT3", AMOUNT_ITEM);
        actor.remember("PRICE_PRODUCT3", NAME_ITEM.of(items[2]));
        actor.remember("AMOUNT_PRODUCT3", PRICE_ITEM.of(items[2]));

        actor.attemptsTo(
                Wait.seconds(2),
                Click.on(BTN_ADD_ITEM.of(items[3])),
                Click.on(BTN_ADD_TO_CAR),
                MultipleClicks.toElement(BTN_PLUS_ITEM.of(items[3]), Random.aleatoryItems()),
                Click.on(BTN_NEXT_BUY)
        );
        actor.remember("NAME_PRODUCT4", AMOUNT_ITEM);
        actor.remember("PRICE_PRODUCT4", NAME_ITEM.of(items[3]));
        actor.remember("AMOUNT_PRODUCT4", PRICE_ITEM.of(items[3]));

        actor.attemptsTo(
                Wait.seconds(4),
                Click.on(BTN_ADD_ITEM.of(items[4])),
                Click.on(BTN_ADD_TO_CAR),
                MultipleClicks.toElement(BTN_PLUS_ITEM.of(items[4]), Random.aleatoryItems()),
                Click.on(BTN_NEXT_BUY)
        );
        actor.remember("NAME_PRODUCT5", AMOUNT_ITEM);
        actor.remember("PRICE_PRODUCT5", NAME_ITEM.of(items[4]));
        actor.remember("AMOUNT_PRODUCT5", PRICE_ITEM.of(items[4]));

    }

}
