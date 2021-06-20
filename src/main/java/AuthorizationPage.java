import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class AuthorizationPage {

    public void login(String login, String password) {
        DriverLaunch.startDriver();
        //System.setProperty("webdriver.chrome.driver", "./chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
}

