package lt.bit.oop.day4.interfeices;

class TransparentShape implements IShape {

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}