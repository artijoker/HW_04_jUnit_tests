package Tests;

import Shape.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void The_area_of_a_square_with_side_5_is_25() {
        var square = new Square(5);
        Assertions.assertEquals(25, square.getArea());
    }

    @Test
    public void Creating_a_square_with_a_negative_side_value_throws_an_IllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Square(-5));

        String expectedMessage = "Side square cannot be negative or equal to zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}