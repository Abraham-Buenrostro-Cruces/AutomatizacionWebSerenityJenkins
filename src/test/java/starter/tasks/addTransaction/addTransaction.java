package starter.tasks.addTransaction;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.addTransaction.addTransactionPage;

public class addTransaction {
    public static Performable withInfo(String date, String amount, String description){
        return Task.where("{0} adds a new transaction",
                Click.on(addTransactionPage.BUTTON_ADD_TRANSACTION),
                Enter.theValue(date).into(addTransactionPage.INPUT_DATE),
                Enter.theValue(amount).into(addTransactionPage.INPUT_AMOUNT),
                Enter.theValue(description).into(addTransactionPage.INPUT_DESCRIPTION),
                Click.on(addTransactionPage.BUTTON_SUBMIT_TRANSACTION)
                );
    }
}
