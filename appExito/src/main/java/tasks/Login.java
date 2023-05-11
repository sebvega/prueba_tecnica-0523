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
public class Login implements Task {
    private Independent independent;

    public static Login exito(Independent independent) {
        return Tasks.instrumented(Login.class, independent);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            //    Click.on(GET_IN),
                Click.on(PUT_EMAIL),
                Click.on(PUT_EMAIL),
                TapOnScreen.on(500, 1550),
             //   Enter.theValue(independent.getEmail()).into(PUT_EMAIL),
             //   Click.on(PASSWORD),
             //   Enter.theValue(independent.getPassword()).into(PASSWORD),
                Close.keyBoard(),
                Click.on(INSIDE));


    }
}
