package constants;


import static constants.TestDataGenerator.*;

public class TestData {
    public String
            firstName,
            lastName,
            email,
            gender,
            mobile,
            subjects,
            hobbies,
            picture,
            address,
            state,
            city,
            dateBirthDay,
            dateBirthMonth,
            dateBirthYear;

    public TestData() {
        this.firstName = getFirstName();
        this.lastName = getLastName();
        this.email = getEmail();
        this.gender = getGender();
        this.mobile = getNumberPhone(10);
        this.subjects = getSubject();
        this.hobbies = getHobbies();
        this.picture = getPicture();
        this.address = getAddress();
        this.state = getState();
        this.city = getCity(state);
        this.dateBirthDay = birthDay[0];
        this.dateBirthMonth = birthDay[1];
        this.dateBirthYear = birthDay[2];
    }
}
