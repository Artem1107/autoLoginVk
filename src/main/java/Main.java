
import com.sun.xml.internal.ws.resources.SenderMessages;
import org.junit.*;

public class Main {

    @Test
    public void logIn() {
        AuthorizationPage authorization = new AuthorizationPage();
        authorization.login("89537493689", "qwerty12asd");
    }


    @Test  // TODO пока не работает, разобраться как не вылогиниваться.
    public void sendMessage() {
        MainPage mainPage = new MainPage();
        mainPage.goToMessenger();
        MessengerPage messenger = new MessengerPage();
        messenger.findUser("Артём Аллександрович");
        messenger.writeMessage("Автосообщение");
    }

    @Test
    public void sendMessage2() {
        SendMessage send = new SendMessage();
        send.sendMessage("89537493689", "qwerty12asd", "Артём Аллександрович", "Автосообщение");
    }

}









