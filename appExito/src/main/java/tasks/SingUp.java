package tasks;

import interactions.Close;
import interactions.TapOnScreen;
import lombok.AllArgsConstructor;
import models.Independent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userInterface.ExitoPage.*;

@AllArgsConstructor
public class SingUp implements Task {
    private Independent independent;

    public static SingUp exito(Independent independent) {
        return Tasks.instrumented(SingUp.class, independent);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SING_UP),
                Click.on(INPUT_NAME),
                Enter.theValue(independent.getFirstName()).into(INPUT_NAME),
                Click.on(INPUT_LAST_NAME),
                Enter.theValue(independent.getLastName()).into(INPUT_LAST_NAME),
                Click.on(INPUT_ID),
                Enter.theValue(independent.getId()).into(INPUT_ID),
                Close.keyBoard(),
                Click.on(CLK_YEAR),
                TapOnScreen.on(115, 1809),
                Click.on(CLK_MONTH),
                TapOnScreen.on(512, 1334),
                Click.on(CLK_DAY),
                TapOnScreen.on(830, 1334),
                Click.on(INPUT_CELLPHONE),
                Enter.theValue(independent.getCellphone()).into(INPUT_CELLPHONE),
                Click.on(INPUT_EMAIL),
                Enter.theValue(independent.getEmail()).into(INPUT_EMAIL),
                Close.keyBoard(),
                TapOnScreen.on(115, 1700),
                TapOnScreen.on(105, 1730),
                Click.on(BTN_CONTINUE),


              //  Click.on(BACK),
              //  Click.on(BACK),
                Click.on(CLK_ACCEPT)

        );
    }
}
