import java.util.ArrayList;

public class ShapeHandler {
   private ArrayList<Shape> shapes;


   public void addToShapes(Shape s){
       shapes.add(s);
   }
   public ArrayList<Shape> printAllInShapes(){
       return shapes;
   }

    public ShapeHandler(){
        Square sq = new Square(10);
        Rectangle re = new Rectangle(10.0,11.0);
        Circle ci = new Circle(5.5);
        shapes = new ArrayList<>();
        shapes.add(sq);
        shapes.add(re);
        shapes.add(ci);
    }
}
