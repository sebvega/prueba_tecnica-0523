package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetTextField implements Question<Question<String>> {

    private Target target;

    public GetTextField(Target target) {
        this.target = target;
    }

    public static GetTextField spa(Target target) {
        return new GetTextField(target);
    }

    @Override
    public Question<String> answeredBy(Actor actor) {
        return Text.of(target).asString();
    }

}
