public class Rectangle extends Shape implements Perimeter {
   private double length;
   private double width;

   public Rectangle(double width, double length){
       this.length = length;
       this.width = width;
       this.area = this.calcArea();
   }
   public Rectangle(double length){
       this.length = length;
       this.width = length;
       this.area = this.calcArea();
   }


    @Override
    public double calcArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    @Override
    public String toString() {
        return "Width: " + width + " Length: " + length;
    }
}
