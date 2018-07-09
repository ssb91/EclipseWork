package Models;

public class Calculator {

public static String operations(double a, double b, double c) {

if ( a == b + c | b == a - c | c == a - b ) {return "a = b + c, b = a - c, c = a - b"; }
if ( a == b - c | b == a + c | c == b - a ) {return "a = b - c, b = a + c, c = b - a"; }
if ( a == c - b | b == c - a | c == a + b ) {return "a = c - b, b = c - a, c = a + b"; }
if ( a == b*c | b == a/c | c == a/b ) {return "a = b*c, b = a/c, c = a/b"; }
if ( a == b/c | b == a*c | c == b/a ) {return "a = b/c, b = a*c, c = b/a"; }
if ( a == c/b | b == c/a | c == a*b ) {return "a = c/b, b = c/a, c = a*b"; } 
else {return "No relation.";}
  
}

public static void main(String[] args) {

System.out.println(operations(2, 2, 2));

}

}