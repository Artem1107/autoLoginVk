
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Artem\\IdeaProjects\\autoLoginVk\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com");
        System.out.println("Успешно открыт сайт");

        WebElement log = driver.findElement(By.xpath("//*[@id=\"index_email\"]"));
        System.out.println("Элемент найден");
        log.click();
        System.out.println("Поле выбрано");
        log.sendKeys("89805015734", Keys.ENTER, "Simbakot1",Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Авторизция успешна");
        WebElement message = driver.findElement(By.xpath("//*[@id=\"l_msg\"]/a/span[1]"));
        message.click();
        System.out.println("Перешли в сообщения");
        WebElement search = driver.findElement(By.cssSelector("#im_dialogs_search"));
        search.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        search.sendKeys("Кирилл Майер");
        System.out.println("Ввели в строку поиска имя");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement kir = driver.findElement(By.cssSelector("#im_dialogs > li.nim-dialog.nim-conversation-search-row._im_dialog._im_dialog_381910930.nim-csr_classic > div.nim-dialog--content > div > div.nim-dialog--name > span.nim-dialog--name-w > span"));
        kir.click();
        System.out.println("Открыт диалог с Кириллом");
        WebElement inputMessage = driver.findElement(By.xpath("//div[@class='im_editable im-chat-input--text _im_text']"));
        inputMessage.click();
        inputMessage.sendKeys("Братишка я тебе автотесты принёс", Keys.ENTER);
        System.out.println("Отправлено сообщение");

    }

}
