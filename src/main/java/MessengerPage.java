import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MessengerPage {

    WebDriver driver = new ChromeDriver();

    public void findUser(String userName) {



        WebElement search = driver.findElement(By.xpath("//input[@id='im_dialogs_search']"));
        search.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        search.sendKeys(userName);
        System.out.println("Ввели в строку поиска имя");
        DriverLaunch.waiting(2);;
        WebElement art = driver.findElement(By.linkText(userName));
        art.click();
        System.out.println("Открыт диалог");

    }

    public void writeMessage(String message) {

       driver.getPageSource();
        WebElement inputMessage = driver.findElement(By.xpath("//div[@class='im_editable im-chat-input--text _im_text']"));
        inputMessage.click();
        inputMessage.sendKeys(message, Keys.ENTER);
        System.out.println("Отправлено сообщение");
    }
}