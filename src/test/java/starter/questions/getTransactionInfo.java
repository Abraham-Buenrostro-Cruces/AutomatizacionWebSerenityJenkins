package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.addTransaction.addTransactionPage;

public class getTransactionInfo {
    public static Question<String> getDescription(){
        return Question.about("transaction description").answeredBy(
                actor -> BrowseTheWeb.as(actor).textContentOf(addTransactionPage.TRANSACTIONS_TABLE_XPATH)
        );
    }
}
