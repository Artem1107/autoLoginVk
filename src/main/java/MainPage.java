import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPage {

    WebDriver driver = new ChromeDriver();

    public void login(String login, String password) {

        driver.get("https://vk.com");
        System.out.println("Успешно открыт сайт");
        WebElement log = driver.findElement(By.xpath("//input[@id='index_email']"));
        System.out.println("Элемент найден");
        log.click();
        System.out.println("Поле выбрано");
        log.sendKeys(login, Keys.ENTER, password, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Авторизция успешна");
    }


    public void goToMessenger() {
        //DriverLaunch.startDriver();

        WebElement message = driver.findElement(By.xpath("//span[text()='Мессенджер']"));
        message.click();
        System.out.println("Перешли в сообщения");
    }

    public void goToFriends(){

    }
}
