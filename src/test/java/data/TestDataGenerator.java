package data;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class TestDataGenerator {
    static Faker faker = new Faker();
    static Random random = new Random();

    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
    public static String[] birthDay = dateFormat.format(faker.date().birthday()).split(" ");

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress("kaseya.com");
    }

    public static String getNumberPhone(int length) {
        return faker.phoneNumber().subscriberNumber(length);
    }

    public static String getAddress() {
        return faker.address().fullAddress();
    }

    public static String getGender() {
        String[] arrayGenders = {
                "Male",
                "Female",
                "Other"
        };
        return arrayGenders[random.nextInt(arrayGenders.length)];
    }

    public static String getSubject() {
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

    public static String getHobbies() {
        String[] arrayHobbies = {
                "Sports",
                "Reading",
                "Music"
        };
        return arrayHobbies[random.nextInt(arrayHobbies.length)];
    }

    public static String getPicture() {
        String[] arrayPicture = {
                "test1.jpeg",
                "test2.jpeg"
        };
        return arrayPicture[random.nextInt(arrayPicture.length)];
    }

    public static String getState() {
        String[] arrayStates = {
                "NCR",
                "Uttar Pradesh",
                "Haryana",
                "Rajasthan"
        };
        return arrayStates[random.nextInt(arrayStates.length)];
    }

    public static String getCity(String key) {
        Map<String, String[]> mapStateCity = new HashMap<>();
        mapStateCity.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        mapStateCity.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        mapStateCity.put("Haryana", new String[]{"Karnal", "Panipat"});
        mapStateCity.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

        String[] arrayCities = mapStateCity.get(key);
        return arrayCities[random.nextInt(arrayCities.length)];
    }

}
