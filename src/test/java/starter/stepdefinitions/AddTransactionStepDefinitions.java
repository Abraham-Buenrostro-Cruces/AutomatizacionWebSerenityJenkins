package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.models.LoginModel;
import starter.models.TransactionModel;
import starter.tasks.addTransaction.addTransaction;
import starter.tasks.addTransaction.checkNewTransaction;
import starter.tasks.loggin.Login;
import starter.tasks.navigation.navigateTo;
import starter.util.getInfoFromTable;

import java.util.List;

public class AddTransactionStepDefinitions {
    @Given("{actor} is logged into the application")
    public void isLoggedIntoTheApplication(Actor actor, DataTable userLogin) {
        LoginModel loginModel = getInfoFromTable.getLoginCredentials(userLogin);
        actor.attemptsTo(
                navigateTo.loginPage(),
                new Login(loginModel.getUsername(), loginModel.getPassword())
        );

    }

    @When("{actor} enters  the required information for the new transaction")
    public void entersTheRequirementInformation(Actor actor, DataTable dataTransaction) {
        TransactionModel transactionModel = getInfoFromTable.getTransactionData(dataTransaction);
        actor.attemptsTo(
            addTransaction.withInfo(transactionModel.getDate(), transactionModel.getAmount(), transactionModel.getDescription())
        );
    }

    @Then("{actor} should see a new transaction in the transaction list with the correct details")
    public void shouldSeeNewTransaction(Actor actor) {
        actor.attemptsTo(
            new checkNewTransaction()
        );

    }
}
