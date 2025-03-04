import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
        driver.get("https://example.com/login");
        assertEquals("Login Page", driver.getTitle());
    }
}