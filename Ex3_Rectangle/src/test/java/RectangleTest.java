import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void perimeter_area_Test(){
        Rectangle rectangle = new Rectangle();

        int perimeterCase1 = rectangle.perimeter(5,3);
        int expectedPerimeterCase1 = 16;
        int areaCase1 = rectangle.area(5,3);
        int expectedAreaCase1 = 15;

        int perimeterCase2 = rectangle.perimeter(8,5);
        int expectedPerimeterCase2 = 26;
        int areaCase2 = rectangle.area(8,5);
        int expectedAreaCase2 = 40;

        int perimeterCase3 = rectangle.perimeter(4,2);
        int expectedPerimeterCase3 = 12;
        int areaCase3 = rectangle.area(4,2);
        int expectedAreaCase3 = 8;

        // Case 1
        assertEquals(perimeterCase1, expectedPerimeterCase1);
        assertEquals(areaCase1, expectedAreaCase1);
        // Case 2
        assertEquals(perimeterCase2, expectedPerimeterCase2);
        assertEquals(areaCase2, expectedAreaCase2);
        // Case 3
        assertEquals(perimeterCase3, expectedPerimeterCase3);
        assertEquals(areaCase3, expectedAreaCase3);
    }

    @Test
    public void isTriangleTest(){
        Rectangle rectangle = new Rectangle();
        boolean actualValue = rectangle.isTriangle(4, 5,12);
        boolean expectedValue = false;
        assertEquals(actualValue, expectedValue);
    }
}
