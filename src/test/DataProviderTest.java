import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class DataProviderTest {
    public static List<String> getTestData() {
        return Arrays.asList("User1", "User2", "User3");
    }

    @Test
    public void testData() {
        for (String user : getTestData()) {
            System.out.println("Testing login for: " + user);
        }
    }
}