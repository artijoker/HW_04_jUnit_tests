package Tests;

import Shape.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void Triangle_with_sides_5_5_and_5_is_equilateral() throws NotTriangleException {
        var triangle = new Triangle(5, 5, 5);
        Assertions.assertEquals(TypeTriangle.Equilateral, triangle.GetTypeTriangle());
    }

    @Test
    void Area_of_a_triangle_with_sides_3_4_and_5_is_6() throws NotTriangleException {
        var triangle = new Triangle(3, 4, 5);
        Assertions.assertEquals(6.0, triangle.getArea());
    }

    @Test
    public void Creating_a_triangle_with_sides_0_0_and_0_throws_an_NotTriangleException() {
        Exception exception = assertThrows(NotTriangleException.class,
                () -> new Triangle(0, 0, 0));

        String expectedMessage = "Not a Triangle";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void Creating_a_triangle_with_sides_2_5_and_10_throws_an_NotTriangleException() {
        Exception exception = assertThrows(NotTriangleException.class,
                () -> new Triangle(2, 5, 10));

        String expectedMessage = "Not a Triangle";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}