package tests;

import com.codeborne.selenide.Configuration;
import constants.TestData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeWork extends TestBase {


    @BeforeAll
    public static void setupForBrowser() {
        TestBase.setUp();
        Configuration.holdBrowserOpen = true;
    }

    @BeforeEach
    public void OpenAndDeleteBannerFromFooter() {
        TestBase.openURL("https://demoqa.com/automation-practice-form");
        TestBase.runJavaScript();
    }

    @Test
    void CheckingForDataEntryAndComparingThemInTable() {
        registrationPage
                .enterValueInFirstName(TestData.getFirstName())
                .enterValueInLastName(TestData.getLastName())
                .enterValueInUserEmail(TestData.getEmail())
                .chooseGender(TestData.getGender())
                .enterValueInUserNumber(TestData.getNumberPhone())
                .enterValueIndateOfBirthInput()
                .enterValueInSubjectsContainer(TestData.getSubjects())
                .enterValueInCustomControlLabel(TestData.getHobbies())
                .enterValueInuploadPicture()
                .enterValueIncurrentAddress(TestData.getAddress())
                .enterValueInstate(TestData.getState())
                .enterValueIncity(TestData.getCity())
                .enterButton()

                .checkingTableHasAppeared("Thanks for submitting the form")

                .compareValue();

    }
}

