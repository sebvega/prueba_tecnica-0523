package tasks;

import interactions.TapOnScreen;
import interactions.Wait;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.BuyPage.*;

@AllArgsConstructor
public class Search implements Task {

    public static Search items() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SLK_CELL),
                Click.on(SLK_BUY_AND_PICK_UP),
                Click.on(SLK_CITY),
                TapOnScreen.on(255, 400),
                Click.on(SLK_STORE),
                TapOnScreen.on(350, 960),
                Click.on(BTN_TO_CONTINUE),
                Wait.seconds(3),
                Click.on(BTN_TO_CONTINUE),
                Click.on(SLK_ITEM)
                );
        actor.remember("ITEM",SAVE_ITEM.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BTN_GO_TO_CAR),
                Wait.seconds(10)
        );
    }
}