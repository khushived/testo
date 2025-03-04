import java.util.Random;

public class TestDataGenerator {
    public static String generateRandomEmail() {
        return "user" + new Random().nextInt(1000) + "@test.com";
    }
}