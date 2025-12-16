package starter.ui.addTransaction;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class addTransactionPage {

    public static Target BUTTON_ADD_TRANSACTION = Target.the("add transaction button").locatedBy("/html/body/div[1]/button");
    public static Target INPUT_DATE = Target.the("input date").locatedBy("//*[@id=\"date\"]");
    public static Target INPUT_AMOUNT = Target.the("input amount").locatedBy("//*[@id=\"amount\"]");
    public static Target INPUT_DESCRIPTION = Target.the("input description").locatedBy("//*[@id=\"description\"]");
    public static Target BUTTON_SUBMIT_TRANSACTION = Target.the("submit transaction button").locatedBy("//*[@id=\"transaction-form\"]/button");
    public static Target TRANSACTIONS_TABLE = Target.the("transactions table").locatedBy("//tbody[@id='transactions-list']");

    public static String TRANSACTIONS_TABLE_XPATH = "//tbody[@id='transactions-list']";
}
