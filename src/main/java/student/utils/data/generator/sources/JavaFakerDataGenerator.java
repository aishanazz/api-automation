package student.utils.data.generator.sources;


import com.github.javafaker.Faker;
import student.utils.data.generator.DummyDataGenerator;

public class JavaFakerDataGenerator implements DummyDataGenerator {

    @Override
    public String getRandomName() {
        return "APT " + Faker.instance().name().name();
    }

    @Override
    public String getRandomPhoneNumber(int phoneNumberLength) {
        return "99" + Faker.instance().number().digits(8);
    }

    @Override
    public String getCountryCode() {
        // Currently, hardcoding the country code.
        return "+91";
    }

    @Override
    public int getRandomIntInBetween(int min, int max) {
        return Faker.instance().number().numberBetween(min, max);
    }

    @Override
    public String getRandomEmail() {
        return "api_testing" + Faker.instance().internet().safeEmailAddress();
    }

    @Override
    public String getRandomMobileOtp(int otpLength) {
        return Faker.instance().number().digits(otpLength);
    }
}
