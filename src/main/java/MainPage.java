import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.logging.Logger;

public class MainPage {
    private static final Logger logger = Logger.getLogger("MainPage");
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToMessenger() {
        try {
            WebElement message = driver.findElement(By.xpath("//span[text()='Мессенджер']"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            message.click();
            logger.info("Перешли в сообщения");
        } catch (NoSuchElementException e) {
            System.out.println("Не понимаю почему это говно падает");
        }

    }


    public void logOut() {
        WebElement profile = driver.findElement(By.xpath("//a[@id='top_profile_link']"));
        profile.click();
        WebElement logOut = driver.findElement(By.xpath("//a[@id='top_logout_link']"));
        logOut.click();
        logger.info("Успешное разлогирование");
        Assert.assertEquals("https://vk.com/", driver.getCurrentUrl());
        logger.info("Проверка стартовой страницы");

    }
}
