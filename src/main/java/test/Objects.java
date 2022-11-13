package test;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Objects extends Base {
    private static final SelenideElement firstName = $("#firstName");
    private static final SelenideElement lastName = $("#lastName");
    private static final SelenideElement userEmail = $("#userEmail");
    private static final SelenideElement genderRadio = $("#genterWrapper");
    private static final SelenideElement userNumber = $("#userNumber");
    private static final SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    private static final SelenideElement subjectsContainer = $("#subjectsInput");
    private static final SelenideElement customControlLabel = $("#hobbiesWrapper");
    private static final SelenideElement uploadPicture = $("#uploadPicture");
    private static final SelenideElement currentAddress = $("#currentAddress");
    private static final SelenideElement state = $("#state");
    private static final SelenideElement city = $("#city");
    private static final SelenideElement modalСontent = $(".modal-content");
    private static final SelenideElement buttonSummit = $(".btn-primary");

    public static Objects enterValueInFirstName(String firstNameValue) {
        firstName.setValue(firstNameValue);
        return null;
    }

    public static Objects enterValueInLastName(String lastNameValue) {
        lastName.setValue(lastNameValue);
        return null;
    }

    public static Objects chooseGender(String gender) {
        genderRadio.$(byText(gender)).click();
        return null;
    }

    public static Objects enterValueInUserNumber(String userNumberValue) {
        userNumber.setValue(userNumberValue);
        return null;
    }

    public static Objects enterValueInUserEmail(String userEmailValue) {
        userEmail.setValue(userEmailValue);
        return null;
    }

    public static Objects enterValueIndateOfBirthInput() {
        dateOfBirthInput.click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1996");
        $x("//div[.='9']").click();
        return null;
    }

    public static Objects enterValueInSubjectsContainer(String subjectsContainerValue) {
        subjectsContainer.click();
        subjectsContainer.setValue(subjectsContainerValue).pressEnter().pressTab();
        return null;
    }

    public static Objects enterValueInCustomControlLabel(String hobbies) {
        customControlLabel.$(byText(hobbies)).click();;
        return null;
    }

    public static Objects enterValueInuploadPicture() {
        uploadPicture.uploadFile(new File("src/test/resources/forHomeWork.jpeg"));
        return null;
    }

    public static Objects enterValueIncurrentAddress(String currentAddressValue) {
        currentAddress.setValue(currentAddressValue);
        return null;
    }

    public static Objects enterValueInstate(String stateValue) {
        state.click();
        $("#stateCity-wrapper").$(byText(stateValue)).click();
        return null;
    }

    public static Objects enterValueIncity(String cityValue) {
        city.click();
        $("[id=stateCity-wrapper]").$(byText(cityValue)).click();
        return null;
    }

    public static Objects enterButton() {
        buttonSummit.click();
        return null;
    }

    public static Objects checkingTableHasAppeared(String value) {
        modalСontent.shouldHave(text(value));
        return null;
    }

    public static Objects compareValue() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive tr:nth-child(1)>td:nth-child(2)").shouldHave(text(Variables.getFirsName() + " " + Variables.getLastName()));
        $(".table-responsive tr:nth-child(2)>td:nth-child(2)").shouldHave(text(Variables.getEmail()));
        $(".table-responsive tr:nth-child(3)>td:nth-child(2)").shouldHave(text(Variables.getGender()));
        $(".table-responsive tr:nth-child(4)>td:nth-child(2)").shouldHave(text(Variables.getNumberPhone()));
        $(".table-responsive tr:nth-child(6)>td:nth-child(2)").shouldHave(text(Variables.getSubjects()));
        $(".table-responsive tr:nth-child(7)>td:nth-child(2)").shouldHave(text(Variables.getHobbies()));
        $(".table-responsive tr:nth-child(9)>td:nth-child(2)").shouldHave(text(Variables.getAddress()));
        $(".table-responsive tr:nth-child(10)>td:nth-child(2)").shouldHave(text(Variables.getState() + " " + Variables.getCity()));
        return null;
    }




}
