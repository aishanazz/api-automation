package student.utils.data.generator;

import student.utils.data.generator.sources.JavaFakerDataGenerator;

public interface DummyDataGenerator {
    String getRandomName();

    String getRandomEmail();

    String getRandomPhoneNumber(int phoneNumberLength);

    String getCountryCode();

    int getRandomIntInBetween(int min, int max);

    String getRandomMobileOtp(int otpLength);


    /**
     * Random data generator.
     * @return DummyDataGenerator
     */
    static DummyDataGenerator getInstance() {
        return new JavaFakerDataGenerator();
    }
}
