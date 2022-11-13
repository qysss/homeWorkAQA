import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.Base;
import test.Objects;
import test.Variables;

public class HomeWork {
    //String FirstName =

    @BeforeAll
    public static void setupForBrowser() {
        Base.setUp();
        Configuration.holdBrowserOpen = true;
    }

    @BeforeEach
    public void OpenAndDeleteBannerFromFooter() {
        Base.openURL("https://demoqa.com/automation-practice-form");
        Base.runJavaScript();
    }

    @Test
    void CheckingForDataEntryAndComparingThemInTable() {
        Objects.enterValueInFirstName(Variables.getFirsName())
                .enterValueInLastName(Variables.getLastName())
                .enterValueInUserEmail(Variables.getEmail())
                .chooseGender(Variables.getGender())
                .enterValueInUserNumber(Variables.getNumberPhone())
                .enterValueIndateOfBirthInput()
                .enterValueInSubjectsContainer(Variables.getSubjects())
                .enterValueInCustomControlLabel(Variables.getHobbies())
                .enterValueInuploadPicture()
                .enterValueIncurrentAddress(Variables.getAddress())
                .enterValueInstate(Variables.getState())
                .enterValueIncity(Variables.getCity())
                .enterButton()
                /*
                 *checking that the table appeared after filling in all the fields of the form.
                 */
                .checkingTableHasAppeared("Thanks for submitting the form")
                /*
                 *Checking that the data matches the entered data
                 */
                .compareValue();

    }

}

