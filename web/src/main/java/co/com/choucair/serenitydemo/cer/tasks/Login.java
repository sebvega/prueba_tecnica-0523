package co.com.choucair.serenitydemo.cer.tasks;

import co.com.choucair.serenitydemo.cer.models.Category;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.serenitydemo.cer.userinterfaces.StartPage.*;

@AllArgsConstructor
public class Login implements Task {

    private Category category;

    public static Login serenityDemo(Category category) {
        return Tasks.instrumented(Login.class, category);
    }

    @Step("{0} select category")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MENU),
                MoveMouse.to(BTN_CATEGORY.of(category.getName())),
                Click.on(BTN_CATEGORY.of(category.getName())),
                Click.on(BTN_SUBCATEGORY.of(category.getSubName()))

        );
    }
}
