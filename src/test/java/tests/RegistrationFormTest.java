package tests;

import constants.TestData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.RegistrationResultsModal;


public class RegistrationFormTest extends TestBase {
    TestData testData = new TestData();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    @BeforeEach
    public void openAndDeleteBannerFromFooter() {
        TestBase.openURL("https://demoqa.com/automation-practice-form");
        TestBase.runJavaScript();
        registrationPage
                .enterValueInFirstName(testData.firstName)
                .enterValueInLastName(testData.lastName)
                .enterValueInUserEmail(testData.email)
                .enterBirthDate(testData.dateBirthDay, testData.dateBirthMonth, testData.dateBirthYear)
                .chooseGender(testData.gender)
                .enterValueInUserNumber(testData.mobile)
                .enterValueInSubjectsContainer(testData.subjects)
                .enterValueInCustomControlLabel(testData.hobbies)
                .enterValueInuploadPicture(testData.picture)
                .enterValueIncurrentAddress(testData.address)
                .enterValueInState(testData.state)
                .enterValueInCity(testData.city)
                .enterButton();
    }

    @Test
    void checkingAppearanceRegistrationForm() {
        registrationResultsModal
                .verifyModalAppears();
    }

    @Test
    void checkingValuesInRegistrationForm() {
        registrationResultsModal
                .verifyResult("Student Name", testData.firstName + " " + testData.lastName)
                .verifyResult("Student Email", testData.email)
                .verifyResult("Gender", testData.gender)
                .verifyResult("Mobile", testData.mobile)
                .verifyResult("Date of Birth", testData.dateBirthDay + " " + testData.dateBirthMonth + "," + testData.dateBirthYear)
                .verifyResult("Subjects", testData.subjects)
                .verifyResult("Hobbies", testData.hobbies)
                .verifyResult("Picture", testData.picture)
                .verifyResult("Address", testData.address)
                .verifyResult("State and City", testData.state + " " + testData.city);
    }
}