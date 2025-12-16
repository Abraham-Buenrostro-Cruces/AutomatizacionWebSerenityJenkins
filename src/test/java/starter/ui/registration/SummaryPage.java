package starter.ui.registration;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {
    public static Target LABEL_NAME = Target.the("label name")
            .locatedBy("//*[@id=\"summary-details\"]/p[1]");
    public static Target LABEL_LAST_NAME = Target.the("Last Name element")
            .locatedBy("//*[@id=\"summary-details\"]/p[2]");
    public static Target LABEL_AGE = Target.the("Label Age")
            .locatedBy("//*[@id=\"summary-details\"]/p[3]");
}
