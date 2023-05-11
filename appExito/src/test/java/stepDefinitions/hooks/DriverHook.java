package stepDefinitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import utils.DriveManager;

public class DriverHook {
    @Before
    public static void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriveManager.start())));
        OnStage.theActorCalled("JSsanchezv");
    }

    @After
    public static void close(){
        DriveManager.stop();
    }
}
