public class Circle extends Shape implements Perimeter{
    double radius;
    public Circle(double radius){
        this.radius = radius;
        this.area = calcArea();
    }

    @Override
    public double calcArea() {
        return Math.PI * (radius *radius);
    }


    @Override
    public double getPerimeter() {
        return (2* radius)*Math.PI;
    }
}
