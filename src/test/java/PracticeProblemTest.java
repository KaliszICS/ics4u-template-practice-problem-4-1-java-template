import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {
    @Test
    @DisplayName("Test getLength method")
    void getLengthTest() {
        try {
            Class<?> rectangleClass = Class.forName("Rectangle");
            Method method = rectangleClass.getDeclaredMethod("getLength");
            Object rectangle = createRectangle(5, 3);
            assertEquals(5.0, (double)method.invoke(rectangle));
        } catch (ClassNotFoundException e) {
            fail("Rectangle class does not exist");
        } catch (NoSuchMethodException e) {
            fail("getLength method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e.getMessage());
        }
    }


}
