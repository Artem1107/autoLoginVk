
import org.openqa.selenium.*;


import java.time.Duration;
import java.util.logging.Logger;

public class MessengerPage {
    private static final Logger logger = Logger.getLogger("MessengerPage");
    private WebDriver driver;

    public MessengerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void findUser(String userName) {
        try {
            WebElement search = driver.findElement(By.xpath("//input[@id='im_dialogs_search']"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            search.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            search.sendKeys(userName);
            logger.info("Ввели в строку поиска имя");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            WebElement user = driver.findElement(By.xpath("//span[@class='_im_dialog_link']"));
            user.click();
            logger.info("Открыт диалог");
        } catch (NoSuchElementException e) {
            System.out.println("Не понимаю почему это говно падает");
        }


    }

    public void writeMessage(String message) {
try {
    WebElement inputMessage = driver.findElement(By.xpath("//div[@class='im_editable im-chat-input--text _im_text']"));
    inputMessage.click();
    inputMessage.sendKeys(message, Keys.ENTER);
    logger.info("Сообщение отправлено");
}catch (NoSuchElementException e) {
    System.out.println("Не понимаю почему это говно падает");
}

    }
}
