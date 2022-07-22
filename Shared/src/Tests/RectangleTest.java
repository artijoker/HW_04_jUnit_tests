package Tests;

import Shape.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void The_area_of_a_rectangle_with_sides_6_and_3_is_18() {
        var rectangle = new Rectangle(6,3);
        Assertions.assertEquals(18, rectangle.getArea());
    }

    @Test
    public void Creating_a_rectangle_with_sides_0_and_0_throws_an_IllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Rectangle(0, 0));

        String expectedMessage = "Side rectangle cannot be negative or equal to zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}