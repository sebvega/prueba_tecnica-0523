package co.com.choucair.serenitydemo.cer.stepdefinitions;


import co.com.choucair.serenitydemo.cer.exceptions.ExceptionError;
import co.com.choucair.serenitydemo.cer.questions.GetText;
import co.com.choucair.serenitydemo.cer.questions.TheProduct;
import co.com.choucair.serenitydemo.cer.tasks.*;
import co.com.choucair.serenitydemo.cer.utils.MsgError;
import co.com.choucair.serenitydemo.cer.utils.ReadFiles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.serenitydemo.cer.userinterfaces.HomePage.LBL_TITLE_PRODUCT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
public class DemoModulesStepDefinition {
    @Given("{string} logs in Exito")
    public void logsInExito(String category) {
        theActorInTheSpotlight().attemptsTo(
                Login.serenityDemo(ReadFiles.readCategory(category))
        );
    }

    @When("selects category and sub-category")
    public void selectsCategoryAndSubCategory() {
        theActorInTheSpotlight().attemptsTo(
                ChooseProduct.inExitoCategory(),
                GotoCart.container()

        );
    }

    @Then("searches the product values and should see the product values are the same")
    public void searchesTheProductValuesAndShouldSeeTheProductValuesAreTheSame() {
        theActorInTheSpotlight().should(seeThat(TheProduct.exists())
                .orComplainWith(ExceptionError.class));

    }

}
