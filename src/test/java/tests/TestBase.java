package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {


    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    @BeforeAll
    public static void setupForBrowser() {
        TestBase.setUp();
        Configuration.holdBrowserOpen = false;
    }

    public static void openURL(String URL) {
        open(URL);
    }

    public static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.reopenBrowserOnFail = true;
    }

    public static void runJavaScript() {
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }
}
