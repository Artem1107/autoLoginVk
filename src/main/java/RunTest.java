


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class RunTest {
    private WebDriver driver;
    private static final Logger logger = Logger.getLogger("RunTest");

    @Before
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        logger.info("Браузер запустился");
    }

    @After
    public void stopDriver() {
        driver.close();
    }

    @Test
    public void logIn() {
        AuthorizationPage authorization = new AuthorizationPage(driver);
        authorization.login("89537493689", "qwerty12asd");
    }

    @Test
    public void logOut() {
        AuthorizationPage authorization = new AuthorizationPage(driver);
        authorization.login("89537493689", "qwerty12asd");
        MainPage mainPage = new MainPage(driver);
        mainPage.logOut();
    }

    @Test
    public void sendMessage() {
        AuthorizationPage log = new AuthorizationPage(driver);
        log.login("89537493689", "qwerty12asd");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToMessenger();
        MessengerPage messenger = new MessengerPage(driver);
        messenger.findUser("Артём Александрович");
        messenger.writeMessage("Автосообщение");
    }


}











