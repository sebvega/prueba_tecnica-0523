package interactions;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

@AllArgsConstructor
public class TapOnScreen implements Interaction {
    private int x;
    private int y;


    @Step("{0} tap on Screen.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver driver = (AppiumDriver) BrowseTheWeb.as(actor).getDriver();
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.tap(PointOption.point(x, y)).perform();
    }

    public static TapOnScreen on(int x, int y) {
        return Tasks.instrumented(TapOnScreen.class, x, y);
    }
}