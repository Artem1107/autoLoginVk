import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainPage {

    public void goToMessenger() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        WebElement message = driver.findElement(By.xpath("//span[text()='Мессенджер']"));
        message.click();
        System.out.println("Перешли в сообщения");
    }

    public void goToFriends(){

    }
}
