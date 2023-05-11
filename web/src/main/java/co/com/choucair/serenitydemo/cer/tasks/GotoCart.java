package co.com.choucair.serenitydemo.cer.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.BTN_CART;

@AllArgsConstructor

public class GotoCart implements Task {

    public static GotoCart container() {
        return Tasks.instrumented(GotoCart.class);
    }
    @Step("{0} go to pay")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART)
        );
    }
}
