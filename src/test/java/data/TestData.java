package data;


public class TestData {
    TestDataGenerator testDataGenerator = new TestDataGenerator();
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
        this.firstName = testDataGenerator.getFirstName();
        this.lastName = testDataGenerator.getLastName();
        this.email = testDataGenerator.getEmail();
        this.gender = testDataGenerator.getGender();
        this.mobile = testDataGenerator.getNumberPhone(10);
        this.subjects = testDataGenerator.getSubject();
        this.hobbies = testDataGenerator.getHobbies();
        this.picture = testDataGenerator.getPicture();
        this.address = testDataGenerator.getAddress();
        this.state = testDataGenerator.getState();
        this.city = testDataGenerator.getCity(state);
        this.dateBirthDay = testDataGenerator.birthDay[0];
        this.dateBirthMonth = testDataGenerator.birthDay[1];
        this.dateBirthYear = testDataGenerator.birthDay[2];
    }
}
