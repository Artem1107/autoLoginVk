import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverLaunch {
    public static void startDriver() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver_win32/chromedriver.exe");
        }
    public static void waiting (int sec) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }


}
