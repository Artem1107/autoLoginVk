import org.openqa.selenium.*;

import java.time.Duration;
import java.util.logging.Logger;

public class AuthorizationPage {
    private WebDriver driver;
    private static final Logger logger = Logger.getLogger("AuthorizationPage");

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;

    }

    public void login(String login, String password) {

        driver.get("https://vk.com");
        logger.info("Успешно открыт сайт");
        WebElement log = driver.findElement(By.xpath("//input[@id='index_email']"));
        logger.info("Элемент найден");
        log.click();
        logger.info("Поле выбрано");
        log.sendKeys(login, Keys.ENTER, password, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Авторизция успешна");

    }
}

