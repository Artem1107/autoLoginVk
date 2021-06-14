import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class SendMessage {
    public void sendMessage(String login, String password, String userName, String MessageText) {
        System.setProperty("webdriver.chrome.driver", "./chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com");
        System.out.println("Успешно открыт сайт");
        WebElement log = driver.findElement(By.xpath("//input[@id='index_email']"));
        System.out.println("Элемент найден");
        log.click();
        System.out.println("Поле выбрано");
        log.sendKeys("89537493689", Keys.ENTER, "qwerty12asd",Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Авторизция успешна");
        WebElement message = driver.findElement(By.xpath("//span[text()='Мессенджер']"));
        message.click();
        System.out.println("Перешли в сообщения");
        WebElement search = driver.findElement(By.xpath("//input[@id='im_dialogs_search']"));
        search.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        search.sendKeys("Артём Александрович");
        System.out.println("Ввели в строку поиска имя");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement art = driver.findElement(By.xpath("//span[text()= 'Артём Александрович']"));
        art.click();
        System.out.println("Открыт диалог");
        WebElement inputMessage = driver.findElement(By.xpath("//div[@class='im_editable im-chat-input--text _im_text']"));
        inputMessage.click();
        inputMessage.sendKeys("Автосообщение", Keys.ENTER);
        System.out.println("Отправлено сообщение");
    }
}
