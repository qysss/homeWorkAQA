package test;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public class Base {


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