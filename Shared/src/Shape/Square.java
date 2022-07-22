package Shape;

import org.junit.jupiter.params.aggregator.ArgumentAccessException;

public class Square implements Shape{
    private final double _side;

    public Square(double side) throws IllegalArgumentException{
        if (side <= 0)
            throw new  IllegalArgumentException("Side square cannot be negative or equal to zero");
        _side = side;
    }

    @Override
    public double getArea() {
        return _side * _side;
    }
}
