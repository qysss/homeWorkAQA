package tests;

import constants.TestData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationFormTest extends TestBase {


    @BeforeEach
    public void OpenAndDeleteBannerFromFooter() {
        TestBase.openURL("https://demoqa.com/automation-practice-form");
        TestBase.runJavaScript();
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
                .enterButton();
    }

    @Test
    void checkingAppearanceRegistrationForm() {
        registrationResultsModal
                .verifyModalAppears();
    }
asd
    @Test
    void checkingValuesInRegistrationForm() {
        registrationResultsModal
                .verifyResult("Student Name", TestData.getFirstName() + " " + TestData.getLastName())
                .verifyResult("Student Email", TestData.getEmail())
                .verifyResult("Gender", TestData.getGender())
                .verifyResult("Mobile", TestData.getNumberPhone())
                .verifyResult("Date of Birth", "09 February,1996")
                .verifyResult("Subjects", TestData.getSubjects())
                .verifyResult("Hobbies", TestData.getHobbies())
                .verifyResult("Picture", "forHomeWork.jpeg")
                .verifyResult("Address", TestData.getAddress())
                .verifyResult("State and City", TestData.getState() + " " + TestData.getCity());
    }
}