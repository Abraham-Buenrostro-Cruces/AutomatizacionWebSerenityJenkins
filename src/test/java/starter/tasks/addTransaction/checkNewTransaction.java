package starter.tasks.addTransaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import starter.questions.getTransactionInfo;
import starter.ui.addTransaction.addTransactionPage;

public class checkNewTransaction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(getTransactionInfo.getDescription()).contains("description of transaction"),
                Ensure.that(addTransactionPage.TRANSACTIONS_TABLE)
                        .text().contains("500")
        );
    }
}
