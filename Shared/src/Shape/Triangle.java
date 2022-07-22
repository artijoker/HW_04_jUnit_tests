package Shape;

public class Triangle implements Shape {

    private final double _sideA;
    private final double _sideB;
    private final double _sideC;
    private final TypeTriangle _type;

    public Triangle(double sideA, double sideB, double sideC) throws NotTriangleException {
        if(sideA<=0 || sideB<=0 || sideC<=0)
            throw new NotTriangleException();
        else if(sideA>=(sideB+sideC) || sideC>=(sideB+sideA) || sideB>=(sideA+sideC))
            throw new NotTriangleException();
        else if (sideA == sideB && sideB == sideC)
            _type = TypeTriangle.Equilateral;
        else if (((sideA * sideA) + (sideB * sideB)) == (sideC * sideC)
                || ((sideA * sideA) + (sideC * sideC)) == (sideB * sideB)
                || ((sideC * sideC) + (sideB * sideB)) == (sideA * sideA))
            _type = TypeTriangle.Right;

        else if (sideA != sideB && sideB != sideC && sideC != sideA)
            _type = TypeTriangle.Scalene;

        else if (sideA == sideB || sideC == sideA || sideC == sideB)
            _type = TypeTriangle.Isosceles;
        else
            throw new NotTriangleException();

        _sideA = sideA;
        _sideB = sideB;
        _sideC = sideC;
    }

    public TypeTriangle GetTypeTriangle() {
        return _type;
    }

    @Override
    public double getArea() {
        double p = (_sideA + _sideB + _sideC) / 2;
        return Math.sqrt(p * (p - _sideA) * (p - _sideB) * (p - _sideC));
    }

}
