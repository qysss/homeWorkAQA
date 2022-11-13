package test;

import static com.codeborne.selenide.Selenide.open;

public class base {


    public static void openURL(String URL) {
        open(URL);
    }
}