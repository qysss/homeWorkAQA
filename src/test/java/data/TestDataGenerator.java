package data;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class TestDataGenerator {
     Faker faker = new Faker();
     Random random = new Random();

     SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
    public  String[] birthDay = dateFormat.format(faker.date().birthday()).split(" ");

    public  String getFirstName() {
        return faker.name().firstName();
    }

    public  String getLastName() {
        return faker.name().lastName();
    }

    public  String getEmail() {
        return faker.internet().emailAddress("kaseya.com");
    }

    public  String getNumberPhone(int length) {
        return faker.phoneNumber().subscriberNumber(length);
    }

    public  String getAddress() {
        return faker.address().fullAddress();
    }

    public  String getGender() {
        String[] arrayGenders = {
                "Male",
                "Female",
                "Other"
        };
        return arrayGenders[random.nextInt(arrayGenders.length)];
    }

    public  String getSubject() {
        String[] arraySubjects = {
                "Maths",
                "Accounting",
                "Arts",
                "Social Studies",
                "History",
                "Economics",
                "Biology",
                "Computer Science",
                "English",
                "Chemistry",
                "Physics",
                "Commerce",
                "Hindi",
                "Civics"
        };
        return arraySubjects[random.nextInt(arraySubjects.length)];
    }

    public  String getHobbies() {
        String[] arrayHobbies = {
                "Sports",
                "Reading",
                "Music"
        };
        return arrayHobbies[random.nextInt(arrayHobbies.length)];
    }

    public  String getPicture() {
        String[] arrayPicture = {
                "test1.jpeg",
                "test2.jpeg"
        };
        return arrayPicture[random.nextInt(arrayPicture.length)];
    }

    public  String getState() {
        String[] arrayStates = {
                "NCR",
                "Uttar Pradesh",
                "Haryana",
                "Rajasthan"
        };
        return arrayStates[random.nextInt(arrayStates.length)];
    }

    public  String getCity(String key) {
        Map<String, String[]> mapStateCity = new HashMap<>();
        mapStateCity.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        mapStateCity.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        mapStateCity.put("Haryana", new String[]{"Karnal", "Panipat"});
        mapStateCity.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

        String[] arrayCities = mapStateCity.get(key);
        return arrayCities[random.nextInt(arrayCities.length)];
    }

}
