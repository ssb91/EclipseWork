import java.util.ArrayList;
import java.util.Scanner;

public class ShapesMain {

    public static void main(String[] args) {



        ShapeHandler sh = new ShapeHandler();


        for (Shape s : sh.printAllInShapes()){
            System.out.println(s);
        }
        Circle c = new Circle(14);
        sh.addToShapes(c);
        for (Shape s : sh.printAllInShapes()){
            System.out.println(s);
        }

//
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        double num = Double.parseDouble(input);


//        System.out.println(sq.area);
//        System.out.println(re.area);
//        System.out.println(ci.area);

//        for(Shape s : shapes){

//            if (s instanceof Rectangle){
//                Rectangle r = (Rectangle)s;
//                System.out.println(r);
//            }

//            System.out.println(s);
//        }
    }
}
