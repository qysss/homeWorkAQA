package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    private final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");
    private final SelenideElement userEmail = $("#userEmail");

    private final SelenideElement birthDate = $("#dateOfBirthInput");
    private final SelenideElement genderRadio = $("#genterWrapper");
    private final SelenideElement userNumber = $("#userNumber");
    private final SelenideElement subjectsContainer = $("#subjectsInput");
    private final SelenideElement customControlLabel = $("#hobbiesWrapper");
    private final SelenideElement uploadPicture = $("#uploadPicture");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement state = $("#state");
    private final SelenideElement city = $("#city");
    private final SelenideElement buttonSummit = $(".btn-primary");

    public RegistrationPage enterValueInFirstName(String firstNameValue) {
        firstName.setValue(firstNameValue);
        return this;
    }

    public RegistrationPage enterValueInLastName(String lastNameValue) {
        lastName.setValue(lastNameValue);
        return this;
    }

    public RegistrationPage chooseGender(String gender) {
        genderRadio.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage enterValueInUserNumber(String userNumberValue) {
        userNumber.setValue(userNumberValue);
        return this;
    }

    public RegistrationPage enterValueInUserEmail(String userEmailValue) {
        userEmail.setValue(userEmailValue);
        return this;
    }

    public RegistrationPage enterBirthDate(String day, String month, String year) {
        birthDate.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage enterValueInSubjectsContainer(String subjectsContainerValue) {
        subjectsContainer.click();
        subjectsContainer.setValue(subjectsContainerValue).pressEnter().pressTab();
        return this;
    }

    public RegistrationPage enterValueInCustomControlLabel(String hobbies) {
        customControlLabel.$(byText(hobbies)).click();
        return this;
    }

    public RegistrationPage enterValueInuploadPicture(String pathFile) {
        String roadFile = "src/test/resources/";
        uploadPicture.uploadFile(new File(roadFile + pathFile));
        return this;
    }

    public RegistrationPage enterValueIncurrentAddress(String currentAddressValue) {
        currentAddress.setValue(currentAddressValue);
        return this;
    }

    public RegistrationPage enterValueInState(String stateValue) {
        state.click();
        $("#stateCity-wrapper").$(byText(stateValue)).click();
        return this;
    }

    public RegistrationPage enterValueInCity(String cityValue) {
        city.click();
        $("[id=stateCity-wrapper]").$(byText(cityValue)).click();
        return this;
    }

    public void enterButton() {
        buttonSummit.click();
    }
}
