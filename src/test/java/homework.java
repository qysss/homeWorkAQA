import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.base;
import test.objects;

import static com.codeborne.selenide.Selenide.executeJavaScript;


public class homework {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    void runJavaScript() {
        base.openURL("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }

    @Test
    void fillingFieldsAndClickingOnSambit() {
        objects.enterValueInFirstName("Andrei")
                .enterValueInLastName("Papruha")
                .enterValueInUserEmail("andreipopruha@gmail.com")
                .chooseGender()
                .enterValueInUserNumber("37525252525")
                .enterValueIndateOfBirthInput()
                .enterValueInSubjectsContainer("Art")
                .enterValueInCustomControlLabel()
                .enterValueInuploadPicture()
                .enterValueIncurrentAddress("Test for qu.guru")
                .enterValueInstate("Haryana")
                .enterValueIncity("Karnal")
                .enterButton()
                /*
                 *checking that the table appeared after filling in all the fields of the form.
                 */
                .compareValue("Thanks for submitting the form");
    }
}
