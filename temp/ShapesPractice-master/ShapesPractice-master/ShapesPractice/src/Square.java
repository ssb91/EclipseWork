public class Square extends Rectangle implements Perimeter {
    double sideLength;

    public Square(double sideLength){
        super(sideLength);
        this.sideLength = sideLength;
        this.area = calcArea();
    }

    @Override
    public double calcArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4* sideLength;
    }
}
