package stepDefinitions;

import enums.MsgError;
import exceptions.ExceptionError;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import question.GetTextField;
import question.TheProduct;
import tasks.Login;
import tasks.Search;
import tasks.SingUp;
import utils.ReadFiles;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static userInterface.BuyPage.VALIDATE_CAR;

public class PruebaExitoStepDefinition {
    @Given("register user {string}")
    public void registerUser(String indepenment) {
        theActorInTheSpotlight().attemptsTo(SingUp.exito(ReadFiles.readIndependent(indepenment)));
    }

    @When("login on app exito with the user register early {string}")
    public void loginOnAppExitoWithTheUserRegisterEarly(String indepenment) {
        theActorInTheSpotlight().attemptsTo(Login.exito(ReadFiles.readIndependent(indepenment)));
    }

    @When("select items for car")
    public void selectItemsForCar() {
        theActorInTheSpotlight().attemptsTo(Search.items());
    }

    @Then("validate items into car")
    public void validateItemsIntoCar() {
        theActorInTheSpotlight().should(seeThat(TheProduct.exists())
                .orComplainWith(ExceptionError.class));
    }
}



