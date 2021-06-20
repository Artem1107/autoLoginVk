import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPage {

    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToMessenger() {
        WebElement message = driver.findElement(By.xpath("//span[text()='Мессенджер']"));
        message.click();
        System.out.println("Перешли в сообщения");
    }


}
