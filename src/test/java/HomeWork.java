import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.Base;
import test.Objects;


public class HomeWork {

    @BeforeAll
    public static void setupForBrowser(){
        Base.setUp();
    }


    @BeforeEach
    public void deleteBannerFromFuter(){
        Base.runJavaScript();
    }


    @Test
    void fillingFieldsAndClickingOnSambit() {
        Objects.enterValueInFirstName("Andrei")
                .enterValueInLastName("Papruha")
                .enterValueInUserEmail("andreipopruha@gmail.com")
                .chooseGender("Male")
                .enterValueInUserNumber("37525252525")
                .enterValueIndateOfBirthInput()
                .enterValueInSubjectsContainer("Art")
                .enterValueInCustomControlLabel("Sports")
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
