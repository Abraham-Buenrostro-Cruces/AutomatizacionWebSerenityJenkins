package starter.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class LoginPage {
    public static Target INPUT_USERNAME = Target.the("input username").located(By.id("username"));
    public static Target INPUT_PASSWORD = Target.the("input password").located(By.id("password"));
    public static Target BUTTON_LOGIN = Target.the("login button").located(By.xpath("//*[@id=\"login-form\"]/button"));
}

