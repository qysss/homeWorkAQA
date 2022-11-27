package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    public static void setupForBrowser() {
        TestBase.setUp();
        Configuration.holdBrowserOpen = true;
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
