package co.com.choucair.serenitydemo.cer.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class MultipleClicks implements Interaction {
	
    private Target element;
    private int iterations;

    public MultipleClicks(Target element, int iterations) {
        this.element = element;
        this.iterations = iterations;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < iterations; i++) {
            actor.attemptsTo(Click.on(element));
        }
    }

    public static MultipleClicks toElement(Target element, int iterations) {
        return Tasks.instrumented(MultipleClicks.class, element, iterations);
    }
}
