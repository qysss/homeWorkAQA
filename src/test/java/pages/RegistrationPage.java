package pages;

import com.codeborne.selenide.SelenideElement;
import constants.TestData;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {
    private final SelenideElement firstName = $("#firstName");
   private final SelenideElement lastName = $("#lastName");
   private final SelenideElement userEmail = $("#userEmail");
   private final SelenideElement genderRadio = $("#genterWrapper");
   private final SelenideElement userNumber = $("#userNumber");
   private final SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
   private final SelenideElement subjectsContainer = $("#subjectsInput");
   private final SelenideElement customControlLabel = $("#hobbiesWrapper");
   private final SelenideElement uploadPicture = $("#uploadPicture");
   private final SelenideElement currentAddress = $("#currentAddress");
   private final SelenideElement state = $("#state");
   private final SelenideElement city = $("#city");
   private final SelenideElement modalContent = $(".modal-content");
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

    public RegistrationPage enterValueIndateOfBirthInput() {
        dateOfBirthInput.click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1996");
        $x("//div[.='9']").click();
        return this;
    }

    public RegistrationPage enterValueInSubjectsContainer(String subjectsContainerValue) {
        subjectsContainer.click();
        subjectsContainer.setValue(subjectsContainerValue).pressEnter().pressTab();
        return this;
    }

    public RegistrationPage enterValueInCustomControlLabel(String hobbies) {
        customControlLabel.$(byText(hobbies)).click();
        ;
        return this;
    }

    public RegistrationPage enterValueInuploadPicture() {
        uploadPicture.uploadFile(new File("src/test/resources/forHomeWork.jpeg"));
        return this;
    }

    public RegistrationPage enterValueIncurrentAddress(String currentAddressValue) {
        currentAddress.setValue(currentAddressValue);
        return this;
    }

    public RegistrationPage enterValueInstate(String stateValue) {
        state.click();
        $("#stateCity-wrapper").$(byText(stateValue)).click();
        return this;
    }

    public RegistrationPage enterValueIncity(String cityValue) {
        city.click();
        $("[id=stateCity-wrapper]").$(byText(cityValue)).click();
        return this;
    }

    public RegistrationPage enterButton() {
        buttonSummit.click();
        return this;
    }

    public RegistrationPage checkingTableHasAppeared(String value) {
        modalContent.shouldHave(text(value));
        return this;
    }

    public RegistrationPage compareValue() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive tr:nth-child(1)>td:nth-child(2)").shouldHave(text(TestData.getFirstName() + " " + TestData.getLastName()));
        $(".table-responsive tr:nth-child(2)>td:nth-child(2)").shouldHave(text(TestData.getEmail()));
        $(".table-responsive tr:nth-child(3)>td:nth-child(2)").shouldHave(text(TestData.getGender()));
        $(".table-responsive tr:nth-child(4)>td:nth-child(2)").shouldHave(text(TestData.getNumberPhone()));
        $(".table-responsive tr:nth-child(6)>td:nth-child(2)").shouldHave(text(TestData.getSubjects()));
        $(".table-responsive tr:nth-child(7)>td:nth-child(2)").shouldHave(text(TestData.getHobbies()));
        $(".table-responsive tr:nth-child(9)>td:nth-child(2)").shouldHave(text(TestData.getAddress()));
        $(".table-responsive tr:nth-child(10)>td:nth-child(2)").shouldHave(text(TestData.getState() + " " + TestData.getCity()));
        return this;
    }


}
