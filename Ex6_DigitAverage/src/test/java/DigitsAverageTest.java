import org.example.DigitsAverage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitsAverageTest {
    @Test
    public void getDigitsAverage(){
        double actualValue = DigitsAverage.getDigitsAverage(4678);
        double expectedValue = 6.25;
        assertEquals(expectedValue, actualValue);
    }
}
