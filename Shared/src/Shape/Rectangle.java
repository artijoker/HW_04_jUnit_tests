package Shape;

public class Rectangle implements Shape{

    private final double _sideA;
    private final double _sideB;

    public Rectangle(double sideA, double sideB) throws IllegalArgumentException {
        if (sideA <= 0 || sideB <= 0)
            throw new  IllegalArgumentException("Side rectangle cannot be negative or equal to zero");
        _sideA = sideA;
        _sideB = sideB;
    }

    @Override
    public double getArea() {
        return _sideA * _sideB;
    }
}
